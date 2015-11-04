package vn.vietnamlab.nguyentuananh.sudungthuvien;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    PullToRefreshListView pullToRefreshView;
    private TrackAdapter mAdapter;

    // Toolbar
    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private ListView mLvDrawerMenu;
    private DrawerMenuItemAdapter mDrawerMenuAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mtoolbar
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mLvDrawerMenu = (ListView) findViewById(R.id.lv_drawer_menu);

        List<DrawerMenuItem> menuItems = generateDrawerMenuItems();
        mDrawerMenuAdapter = new DrawerMenuItemAdapter(getApplicationContext(), menuItems);
        mLvDrawerMenu.setAdapter(mDrawerMenuAdapter);

        mLvDrawerMenu.setOnItemClickListener(this);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.app_name, R.string.app_name) {
            public void onDrawerClosed(View view) {
                invalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView) {
                invalidateOptionsMenu();
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        setSupportActionBar(mToolbar);
         getSupportActionBar().setDisplayShowHomeEnabled(true);

        //PullToRefresh
        pullToRefreshView = (PullToRefreshListView) findViewById(R.id.pull_to_refresh_listview);
        pullToRefreshView.setOnRefreshListener(new OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                new GetDataTask().execute();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                setFragment(0, BikeFragment.class);
                break;
            case 1:
                //setFragment(1, BusFragment.class);
                break;
            case 2:
                //setFragment(2, CarFragment.class);
                break;
            case 3:
                mDrawerLayout.closeDrawer(mLvDrawerMenu);
                mLvDrawerMenu.invalidateViews();
                break;
            case 4:
                mDrawerLayout.closeDrawer(mLvDrawerMenu);
                mLvDrawerMenu.invalidateViews();
                break;
            case 5:
                mDrawerLayout.closeDrawer(mLvDrawerMenu);
                mLvDrawerMenu.invalidateViews();
                break;
        }
    }

    public void setFragment(int position, Class<? extends Fragment> fragmentClass) {
        try {
            Fragment fragment = fragmentClass.newInstance();
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame_container, fragment, fragmentClass.getSimpleName());
            fragmentTransaction.commit();

            mLvDrawerMenu.setItemChecked(position, true);
            mDrawerLayout.closeDrawer(mLvDrawerMenu);
            mLvDrawerMenu.invalidateViews();
        }
        catch (Exception ex){
            Log.e("setFragment", ex.getMessage());
        }
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(mLvDrawerMenu)) {
            mDrawerLayout.closeDrawer(mLvDrawerMenu);
        } else {
            super.onBackPressed();
        }
    }

    /**
     * When using the ActionBarDrawerToggle, you must call it during
     * onPostCreate() and onConfigurationChanged()...
     */
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggls
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    private List<DrawerMenuItem> generateDrawerMenuItems() {
        String[] itemsText = getResources().getStringArray(R.array.nav_drawer_items);
        TypedArray itemsIcon = getResources().obtainTypedArray(R.array.nav_drawer_icons);
        List<DrawerMenuItem> result = new ArrayList<DrawerMenuItem>();
        for (int i = 0; i < itemsText.length; i++) {
            DrawerMenuItem item = new DrawerMenuItem();
            item.setText(itemsText[i]);
            item.setIcon(itemsIcon.getResourceId(i, -1));
            result.add(item);
        }
        return result;
    }

    private class GetDataTask extends AsyncTask<Void, Void, String[]> {
        private ArrayList<TrackObject> mListNewTrackObjects ;
        @Override
        protected String[] doInBackground(Void... params) {
            //Download data json from url
            StringBuilder mStringBuilder = new StringBuilder();
            String strResponse = null;

            mStringBuilder.append("http://api.soundcloud.com/");
            mStringBuilder.append("tracks");
            mStringBuilder.append(".json");
            mStringBuilder.append("?client_id=4257a69ec80f003d3078b4f1917b642b");
            mStringBuilder.append(String.format("&q=%1$s", "pop"));
            mStringBuilder.append(String.format("&offset=%1$s&limit=%2$s", String.valueOf(0), String.valueOf(100)));

            String url = mStringBuilder.toString();

            //download with url
            InputStream data = null;
            try {
                URL e = new URL(url);
                HttpURLConnection conn = (HttpURLConnection)e.openConnection();
                conn.setReadTimeout(10000);
                conn.setConnectTimeout(15000);
                conn.setRequestMethod("GET");
                conn.setDoInput(true);
                conn.setUseCaches(false);
                conn.connect();
                int response = conn.getResponseCode();
                if(response == 200) {
                    data = conn.getInputStream();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            //convert with data to String
            try {
                BufferedReader e = new BufferedReader(new InputStreamReader(data));
                StringBuilder sb = new StringBuilder();
                String line = null;

                while((line = e.readLine()) != null) {
                    sb.append(line);
                }
                data.close();
                strResponse = sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }

            Log.d("strResponse", strResponse.toString());
            if(strResponse != null) {
                mListNewTrackObjects = TrackerObjectsParser.pareTrackObjects(strResponse);
            }

            Log.d("anhtbok ", "tbok" + mListNewTrackObjects);
            return new String[0];
        }

        @Override
        protected void onPostExecute(String[] result) {
            pullToRefreshView.onRefreshComplete();
            Log.d("mListNewTrackObjects", "a" + mListNewTrackObjects);
            mAdapter = new TrackAdapter(MainActivity.this, mListNewTrackObjects);
            pullToRefreshView.setAdapter(mAdapter);
            super.onPostExecute(result);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
