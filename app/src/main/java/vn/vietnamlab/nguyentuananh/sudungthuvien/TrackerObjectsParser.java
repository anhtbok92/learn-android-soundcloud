package vn.vietnamlab.nguyentuananh.sudungthuvien;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by danhdueexoictif on 10/28/15.
 */
public class TrackerObjectsParser {

    public static final String DATE_PATTERN_ORI = "yyyy/MM/dd hh:mm:ss Z";
    public static final String KEY_DOWNLOAD_URL = "download_url";
    public static final String KEY_KEY_SIGNATURE = "key_signature";
    public static final String KEY_USER_FAVORITE = "user_favorite";
    public static final String KEY_LIKES_COUNT = "likes_count";
    public static final String KEY_RELEASE = "release";
    public static final String KEY_ATTACHMENTS_URI = "attachments_uri";
    public static final String KEY_WAVEFORM_URL = "waveform_url";
    public static final String KEY_PURCHASE_URL = "purchase_url";
    public static final String KEY_VIDEO_URL = "video_url";
    public static final String KEY_STREAMABLE = "streamable";
    public static final String KEY_ARTWORK_URL = "artwork_url";
    public static final String KEY_COMMENT_COUNT = "comment_count";
    public static final String KEY_COMMENTABLE = "commentable";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_DOWNLOAD_COUNT = "download_count";
    public static final String KEY_DOWNLOADABLE = "downloadable";
    public static final String KEY_EMBEDDABLE_BY = "embeddable_by";
    public static final String KEY_FAVORITINGS_COUNT = "favoritings_count";
    public static final String KEY_GENRE = "genre";
    public static final String KEY_ISRC = "isrc";
    public static final String KEY_LABEL_ID = "label_id";
    public static final String KEY_LABEL_NAME = "label_name";
    public static final String KEY_LICENSE = "license";
    public static final String KEY_ORIGINAL_CONTENT_SIZE = "original_content_size";
    public static final String KEY_ORIGINAL_FORMAT = "original_format";
    public static final String KEY_PLAYBACK_COUNT = "playback_count";
    public static final String KEY_PURCHASE_TITLE = "purchase_title";
    public static final String KEY_RELEASE_DAY = "release_day";
    public static final String KEY_RELEASE_MONTH = "release_month";
    public static final String KEY_RELEASE_YEAR = "release_year";
    public static final String KEY_REPOSTS_COUNT = "reposts_count";
    public static final String KEY_STATE = "state";
    public static final String KEY_TAG_LIST = "tag_list";
    public static final String KEY_TRACK_TYPE = "track_type";
    public static final String KEY_USER = "user";
    public static final String KEY_USER_AVATAR_URL = "avatar_url";
    public static final String KEY_USER_KIND = "kind";
    public static final String KEY_USER_PERMALINK_URL = "permalink_url";
    public static final String KEY_USER_URI = "uri";
    public static final String KEY_USERNAME = "username";
    public static final String KEY_USER_PERMALINK = "permalink";
    public static final String KEY_USER_LAST_MODIFIED = "last_modified";
    public static final String KEY_BPM = "bpm";
    public static final String KEY_USER_PLAYBACK_COUNT = "user_playback_count";
    public static final String KEY_ID = "id";
    public static final String KEY_KIND = "kind";
    public static final String KEY_CREATED_AT = "created_at";
    public static final String KEY_LAST_MODIFIED = "last_modified";
    public static final String KEY_PERMALINK = "permalink";
    public static final String KEY_PERMALINK_URL = "permalink_url";
    public static final String KEY_TITLE = "title";
    public static final String KEY_DURATION = "duration";
    public static final String KEY_SHARING = "sharing";
    public static final String KEY_STREAM_URL = "stream_url";
    public static final String KEY_URI = "uri";
    public static final String KEY_USER_ID = "user_id";
    public static final String KEY_POLICY = "policy";
    public static final String KEY_MONETIZATION_MODEL = "monetization_model";

    public static List<D3TrackerObject> parseD3TrackerObjects(String strString) {
        ArrayList<D3TrackerObject> lstD3TrackerObjects = new ArrayList<D3TrackerObject>();

        try {
            JSONArray jsonArray = new JSONArray(strString);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                // Parsing one Tracker
                D3TrackerObject d3TrackerObject = new D3TrackerObject();
                d3TrackerObject = pareD3TrackerObject(jsonObject);

                lstD3TrackerObjects.add(d3TrackerObject);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return lstD3TrackerObjects;
    }

    public static D3TrackerObject pareD3TrackerObject(JSONObject jsonObject) {
        D3TrackerObject d3TrackerObject = new D3TrackerObject();

        if (jsonObject != null)
        {
            d3TrackerObject.setDownload_url(getString(jsonObject, KEY_DOWNLOAD_URL));
            d3TrackerObject.setKey_signature(getString(jsonObject, KEY_KEY_SIGNATURE));
            d3TrackerObject.setUser_favorite(getString(jsonObject, KEY_USER_FAVORITE));
            d3TrackerObject.setLikes_count(getInt(jsonObject, KEY_LIKES_COUNT));
            d3TrackerObject.setRelease(getString(jsonObject, KEY_RELEASE));
            d3TrackerObject.setAttachments_uri(getString(jsonObject, KEY_ATTACHMENTS_URI));
            d3TrackerObject.setWaveform_url(getString(jsonObject, KEY_WAVEFORM_URL));
            d3TrackerObject.setPurchase_url(getString(jsonObject, KEY_PURCHASE_URL));
            d3TrackerObject.setVideo_url(getString(jsonObject, KEY_VIDEO_URL));
            d3TrackerObject.setStreamable(getBoolean(jsonObject, KEY_STREAMABLE));
            d3TrackerObject.setArtwork_url(getString(jsonObject, KEY_ARTWORK_URL));
            d3TrackerObject.setComment_count(getInt(jsonObject, KEY_COMMENT_COUNT));
            d3TrackerObject.setCommentable(getBoolean(jsonObject, KEY_COMMENTABLE));
            d3TrackerObject.setDescription(getString(jsonObject, KEY_DESCRIPTION));
            d3TrackerObject.setDownload_count(getInt(jsonObject, KEY_DOWNLOAD_COUNT));
            d3TrackerObject.setDownloadable(getBoolean(jsonObject, KEY_DOWNLOADABLE));
            d3TrackerObject.setEmbeddable_by(getString(jsonObject, KEY_EMBEDDABLE_BY));
            d3TrackerObject.setFavoritings_count(getInt(jsonObject, KEY_FAVORITINGS_COUNT));
            d3TrackerObject.setGenre(getString(jsonObject, KEY_GENRE));
            d3TrackerObject.setIsrc(getString(jsonObject, KEY_ISRC));
            d3TrackerObject.setLabel_id(getInt(jsonObject, KEY_LABEL_ID));
            d3TrackerObject.setLabel_name(getString(jsonObject, KEY_LABEL_NAME));
            d3TrackerObject.setLicense(getString(jsonObject, KEY_LICENSE));
            d3TrackerObject.setOriginal_content_size(getInt(jsonObject, KEY_ORIGINAL_CONTENT_SIZE));
            d3TrackerObject.setOriginal_format(getString(jsonObject, KEY_ORIGINAL_FORMAT));
            d3TrackerObject.setPlayback_count(getInt(jsonObject, KEY_PLAYBACK_COUNT));
            d3TrackerObject.setPurchase_title(getString(jsonObject, KEY_PURCHASE_TITLE));
            d3TrackerObject.setRelease_day(getString(jsonObject, KEY_RELEASE_DAY));
            d3TrackerObject.setRelease_month(getString(jsonObject, KEY_RELEASE_MONTH));
            d3TrackerObject.setRelease_year(getString(jsonObject, KEY_RELEASE_YEAR));
            d3TrackerObject.setReposts_count(getInt(jsonObject, KEY_REPOSTS_COUNT));
            d3TrackerObject.setState(getString(jsonObject, KEY_STATE));
            d3TrackerObject.setTag_list(getString(jsonObject, KEY_TAG_LIST));
            d3TrackerObject.setTrack_type(getString(jsonObject, KEY_TRACK_TYPE));
            d3TrackerObject.setUser(pareSoundcloudUser(getJsonObject(jsonObject, KEY_USER)));
            d3TrackerObject.setBpm(getInt(jsonObject, KEY_BPM));
            d3TrackerObject.setUser_playback_count(getInt(jsonObject, KEY_USER_PLAYBACK_COUNT));
            d3TrackerObject.setId(getInt(jsonObject, KEY_ID));
            d3TrackerObject.setKind(getString(jsonObject, KEY_KIND));
            d3TrackerObject.setCreated_at(getString(jsonObject, KEY_CREATED_AT));
            d3TrackerObject.setLast_modified(getString(jsonObject, KEY_LAST_MODIFIED));
            d3TrackerObject.setPermalink(getString(jsonObject, KEY_PERMALINK));
            d3TrackerObject.setPermalink_url(getString(jsonObject, KEY_PERMALINK_URL));
            d3TrackerObject.setTitle(getString(jsonObject, KEY_TITLE));
            d3TrackerObject.setDuration(getInt(jsonObject, KEY_DURATION));
            d3TrackerObject.setSharing(getString(jsonObject, KEY_SHARING));
            d3TrackerObject.setStream_url(getString(jsonObject, KEY_STREAM_URL));
            d3TrackerObject.setUri(getString(jsonObject, KEY_URI));
            d3TrackerObject.setUser_id(getInt(jsonObject, KEY_USER_ID));
            d3TrackerObject.setPolicy(getString(jsonObject, KEY_POLICY));
            d3TrackerObject.setMonetization_model(getString(jsonObject, KEY_MONETIZATION_MODEL));
        }

        return d3TrackerObject;
    }

    public static SoundCloudUser pareSoundcloudUser(JSONObject jsonObjectUser) {
        SoundCloudUser soundcloudUser = new SoundCloudUser();

        if (jsonObjectUser!= null)
        {
            soundcloudUser.setAvatar_url(getString(jsonObjectUser, KEY_USER_AVATAR_URL));
            soundcloudUser.setId(getInt(jsonObjectUser, KEY_USER_ID));
            soundcloudUser.setKind(getString(jsonObjectUser, KEY_USER_KIND));
            soundcloudUser.setPermalink_url(getString(jsonObjectUser, KEY_USER_PERMALINK_URL));
            soundcloudUser.setUri(getString(jsonObjectUser, KEY_USER_URI));
            soundcloudUser.setUsername(getString(jsonObjectUser, KEY_USERNAME));
            soundcloudUser.setPermalink(getString(jsonObjectUser, KEY_USER_PERMALINK));
            soundcloudUser.setLast_modified(getString(jsonObjectUser, KEY_USER_LAST_MODIFIED));
        }

        return soundcloudUser;
    }

    public static String getString(JSONObject jsonObject, String key) {
        String result = "";
        if (jsonObject != null && jsonObject.has(key)) {
            try {
                result = jsonObject.getString(key);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static int getInt(JSONObject jsonObject, String key)
    {
        int result = 0;

        if (jsonObject != null && jsonObject.has(key))
        {
            try {
                result = jsonObject.getInt(key);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static long getLong(JSONObject jsonObject, String key)
    {
        long result = 0;

        if (jsonObject != null & jsonObject.has(key))
        {
            try {
                result = jsonObject.getLong(key);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static boolean getBoolean(JSONObject jsonObject, String key)
    {
        boolean result = false;

        if (jsonObject != null && jsonObject.has(key))
        {
            try {
                result = jsonObject.getBoolean(key);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static JSONObject getJsonObject(JSONObject jsonObject, String key) {
        JSONObject result = null;

        if (jsonObject != null&& jsonObject.has(key))
        {
            try {
                result = jsonObject.getJSONObject(key);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static JSONArray getJSOJsonArray(JSONObject jsonObject, String key)
    {
        JSONArray result = null;

        if (jsonObject != null && jsonObject.has(key))
        {
            try {
                result = jsonObject.getJSONArray(key);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static ArrayList<TrackObject> pareTrackObjects(String strString)
    {
        ArrayList<TrackObject> lstTrackObjects = new ArrayList<TrackObject>();

        try {
            JSONArray jsonArray = new JSONArray(strString);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                // Parsing one Tracker
                TrackObject trackObject = new TrackObject();
                trackObject = pareTrackObject(jsonObject);

                lstTrackObjects.add(trackObject);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return  lstTrackObjects;
    }

    public static TrackObject pareTrackObject(JSONObject jsonObject)
    {
        TrackObject trackObject = new TrackObject();
        Date e;
        if (jsonObject != null)
        {
            trackObject.setId(getLong(jsonObject, KEY_ID));
            SimpleDateFormat format = new SimpleDateFormat(DATE_PATTERN_ORI);

            try {
                e = format.parse(getString(jsonObject, KEY_CREATED_AT));
            } catch (ParseException var4) {
                var4.printStackTrace();
                return null;
            }
            trackObject.setCreatedDate(e);
            trackObject.setUserId(getLong(jsonObject, KEY_USER_ID));
            trackObject.setDuration(getLong(jsonObject, KEY_DURATION));
            trackObject.setSharing(getString(jsonObject, KEY_SHARING));
            trackObject.setTagList(getString(jsonObject, KEY_TAG_LIST));
            trackObject.setGenre(getString(jsonObject, KEY_GENRE));
            trackObject.setTitle(getString(jsonObject, KEY_TITLE));
            trackObject.setDescription(getString(jsonObject, KEY_DESCRIPTION));

            // Paring Sound Cloud User
            SoundCloudUser soundCloudUser = pareSoundcloudUser(getJsonObject(jsonObject, KEY_USER));

            trackObject.setUsername(soundCloudUser.getUsername());
            trackObject.setAvatarUrl(soundCloudUser.getAvatar_url());
            trackObject.setPermalinkUrl(getString(jsonObject, KEY_PERMALINK));
            trackObject.setArtworkUrl(getString(jsonObject, KEY_ARTWORK_URL));
            trackObject.setWaveForm(getString(jsonObject, KEY_WAVEFORM_URL));
            trackObject.setPlaybackCount(getLong(jsonObject, KEY_PLAYBACK_COUNT));
            trackObject.setFavoriteCount(getLong(jsonObject, KEY_FAVORITINGS_COUNT));
            trackObject.setCommentCount(getLong(jsonObject, KEY_COMMENT_COUNT));
            trackObject.setStreamable(getBoolean(jsonObject, KEY_STREAMABLE));
        }

        return trackObject;
    }
}