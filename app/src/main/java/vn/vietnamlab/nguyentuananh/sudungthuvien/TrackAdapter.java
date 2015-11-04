package vn.vietnamlab.nguyentuananh.sudungthuvien;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by NguyenAnh on 11/2/2015.
 */
public class TrackAdapter extends BaseAdapter {
    public ArrayList<TrackObject> mListObjects;
    public Context mContext;
    private Typeface mTypefaceBold;
    private Typeface mTypefaceLight;

    public TrackAdapter(Activity mContext, ArrayList<TrackObject> listDrawerObjects) {
        this.mContext = mContext;
        this.mListObjects = listDrawerObjects;
    }

    @Override
    public int getCount() {
        return this.mListObjects != null?this.mListObjects.size():0;
    }

    @Override
    public Object getItem(int position) {
        if(this.mListObjects != null && this.mListObjects.size() > 0) {
            int size = this.mListObjects.size();
            if(position >= 0 && position < size) {
                return this.mListObjects.get(position);
            }
        }

        return null;
    }

    @Override
    public long getItemId(int position) {
        return (long)position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder mHolder;
        LayoutInflater mInflater;
        if (convertView == null) {
            mHolder = new ViewHolder();
            mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.item_track, null);
            convertView.setTag(mHolder);
            mHolder.mImgSongs = (ImageView) convertView.findViewById(R.id.img_track);
            mHolder.mImgUsername = (ImageView) convertView.findViewById(R.id.img_avatar);

            mHolder.mTvSongName = (TextView) convertView.findViewById(R.id.tv_song);
            mHolder.mTvUsername = (TextView) convertView.findViewById(R.id.tv_username);
            mHolder.mTvDuration = (TextView) convertView.findViewById(R.id.tv_duration);
            mHolder.mTvPlayCount = (TextView) convertView.findViewById(R.id.tv_playcount);
            mHolder.mTvTime = (TextView) convertView.findViewById(R.id.tv_time);
            mHolder.mBtnDownload = (Button) convertView.findViewById(R.id.btn_download);
            mHolder.mRootLayout = (RelativeLayout) convertView.findViewById(R.id.layout_root);
            mHolder.mImgLogo = (ImageView) convertView.findViewById(R.id.img_logo);

            mHolder.mTvSongName.setTypeface(mTypefaceBold);
            mHolder.mTvUsername.setTypeface(mTypefaceBold);

            mHolder.mTvDuration.setTypeface(mTypefaceLight);
            mHolder.mTvPlayCount.setTypeface(mTypefaceLight);
            mHolder.mTvTime.setTypeface(mTypefaceLight);
        } else {
            mHolder = (ViewHolder) convertView.getTag();
        }

        final TrackObject mTrackObject = (TrackObject) mListObjects.get(position);
        mHolder.mTvSongName.setText(mTrackObject.getTitle());
        mHolder.mTvUsername.setText(mTrackObject.getUsername());
        mHolder.mTvPlayCount.setText(String.valueOf(mTrackObject.getPlaybackCount()));

        //duration
        long duration = mTrackObject.getDuration() / 1000;
        String minute = String.valueOf((int) (duration / 60));
        String seconds = String.valueOf((int) (duration % 60));
        if (minute.length() < 2) {
            minute = "0" + minute;
        }
        if (seconds.length() < 2) {
            seconds = "0" + seconds;
        }
        mHolder.mTvDuration.setText(minute + ":" + seconds);

        String urlTrack = mTrackObject.getArtworkUrl();
        String urlAvartar = mTrackObject.getAvatarUrl();
        if (urlTrack!=null) {
            Picasso.with(mContext).load(urlTrack).into(mHolder.mImgSongs);
            Picasso.with(mContext).load(urlAvartar).into(mHolder.mImgUsername);
        } else {
            mHolder.mImgSongs.setImageResource(R.drawable.music_note);
        }

        return convertView;
    }



    private static class ViewHolder {
        public RelativeLayout mRootLayout;
        public ImageView mImgSongs;
        public ImageView mImgUsername;
        public TextView mTvSongName;
        public TextView mTvUsername;
        public Button mBtnDownload;
        public TextView mTvDuration;
        public TextView mTvPlayCount;
        public TextView mTvTime;
        public ImageView mImgLogo;
    }
}
