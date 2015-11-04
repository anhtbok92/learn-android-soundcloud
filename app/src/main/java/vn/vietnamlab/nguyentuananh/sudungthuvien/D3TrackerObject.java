package vn.vietnamlab.nguyentuananh.sudungthuvien;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by danhdueexoictif on 10/28/15.
 */
public class D3TrackerObject implements Parcelable {
    private String download_url;
    private String key_signature;
    private String user_favorite;
    private int likes_count;
    private String release;
    private String attachments_uri;
    private String waveform_url;
    private String purchase_url;
    private String video_url;
    private boolean streamable;
    private String artwork_url;
    private int comment_count;
    private boolean commentable;
    private String description;
    private int download_count;
    private boolean downloadable;
    private String embeddable_by;
    private int favoritings_count;
    private String genre;
    private String isrc;
    private int label_id;
    private String label_name;
    private String license;
    private int original_content_size;
    private String original_format;
    private int playback_count;
    private String purchase_title;
    private String release_day;
    private String release_month;
    private String release_year;
    private int reposts_count;
    private String state;
    private String tag_list;
    private String track_type;
    private SoundCloudUser user;
    private int bpm;
    private int user_playback_count;
    private int id;
    private String kind;
    private String created_at;
    private String last_modified;
    private String permalink;
    private String permalink_url;
    private String title;
    private int duration;
    private String sharing;
    private String stream_url;
    private String uri;
    private int user_id;
    private String policy;
    private String monetization_model;

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getKey_signature() {
        return key_signature;
    }

    public void setKey_signature(String key_signature) {
        this.key_signature = key_signature;
    }

    public String getUser_favorite() {
        return user_favorite;
    }

    public void setUser_favorite(String user_favorite) {
        this.user_favorite = user_favorite;
    }

    public int getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(int likes_count) {
        this.likes_count = likes_count;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getAttachments_uri() {
        return attachments_uri;
    }

    public void setAttachments_uri(String attachments_uri) {
        this.attachments_uri = attachments_uri;
    }

    public String getWaveform_url() {
        return waveform_url;
    }

    public void setWaveform_url(String waveform_url) {
        this.waveform_url = waveform_url;
    }

    public String getPurchase_url() {
        return purchase_url;
    }

    public void setPurchase_url(String purchase_url) {
        this.purchase_url = purchase_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public boolean isStreamable() {
        return streamable;
    }

    public void setStreamable(boolean streamable) {
        this.streamable = streamable;
    }

    public String getArtwork_url() {
        return artwork_url;
    }

    public void setArtwork_url(String artwork_url) {
        this.artwork_url = artwork_url;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public boolean isCommentable() {
        return commentable;
    }

    public void setCommentable(boolean commentable) {
        this.commentable = commentable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDownload_count() {
        return download_count;
    }

    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }

    public boolean isDownloadable() {
        return downloadable;
    }

    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable;
    }

    public String getEmbeddable_by() {
        return embeddable_by;
    }

    public void setEmbeddable_by(String embeddable_by) {
        this.embeddable_by = embeddable_by;
    }

    public int getFavoritings_count() {
        return favoritings_count;
    }

    public void setFavoritings_count(int favoritings_count) {
        this.favoritings_count = favoritings_count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public int getLabel_id() {
        return label_id;
    }

    public void setLabel_id(int label_id) {
        this.label_id = label_id;
    }

    public String getLabel_name() {
        return label_name;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getOriginal_content_size() {
        return original_content_size;
    }

    public void setOriginal_content_size(int original_content_size) {
        this.original_content_size = original_content_size;
    }

    public String getOriginal_format() {
        return original_format;
    }

    public void setOriginal_format(String original_format) {
        this.original_format = original_format;
    }

    public int getPlayback_count() {
        return playback_count;
    }

    public void setPlayback_count(int playback_count) {
        this.playback_count = playback_count;
    }

    public String getPurchase_title() {
        return purchase_title;
    }

    public void setPurchase_title(String purchase_title) {
        this.purchase_title = purchase_title;
    }

    public String getRelease_day() {
        return release_day;
    }

    public void setRelease_day(String release_day) {
        this.release_day = release_day;
    }

    public String getRelease_month() {
        return release_month;
    }

    public void setRelease_month(String release_month) {
        this.release_month = release_month;
    }

    public String getRelease_year() {
        return release_year;
    }

    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }

    public int getReposts_count() {
        return reposts_count;
    }

    public void setReposts_count(int reposts_count) {
        this.reposts_count = reposts_count;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTag_list() {
        return tag_list;
    }

    public void setTag_list(String tag_list) {
        this.tag_list = tag_list;
    }

    public String getTrack_type() {
        return track_type;
    }

    public void setTrack_type(String track_type) {
        this.track_type = track_type;
    }

    public SoundCloudUser getUser() {
        return user;
    }

    public void setUser(SoundCloudUser user) {
        this.user = user;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public int getUser_playback_count() {
        return user_playback_count;
    }

    public void setUser_playback_count(int user_playback_count) {
        this.user_playback_count = user_playback_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getPermalink_url() {
        return permalink_url;
    }

    public void setPermalink_url(String permalink_url) {
        this.permalink_url = permalink_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public String getStream_url() {
        return stream_url;
    }

    public void setStream_url(String stream_url) {
        this.stream_url = stream_url;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getMonetization_model() {
        return monetization_model;
    }

    public void setMonetization_model(String monetization_model) {
        this.monetization_model = monetization_model;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.download_url);
        dest.writeString(this.key_signature);
        dest.writeString(this.user_favorite);
        dest.writeInt(this.likes_count);
        dest.writeString(this.release);
        dest.writeString(this.attachments_uri);
        dest.writeString(this.waveform_url);
        dest.writeString(this.purchase_url);
        dest.writeString(this.video_url);
        dest.writeByte(streamable ? (byte) 1 : (byte) 0);
        dest.writeString(this.artwork_url);
        dest.writeInt(this.comment_count);
        dest.writeByte(commentable ? (byte) 1 : (byte) 0);
        dest.writeString(this.description);
        dest.writeInt(this.download_count);
        dest.writeByte(downloadable ? (byte) 1 : (byte) 0);
        dest.writeString(this.embeddable_by);
        dest.writeInt(this.favoritings_count);
        dest.writeString(this.genre);
        dest.writeString(this.isrc);
        dest.writeInt(this.label_id);
        dest.writeString(this.label_name);
        dest.writeString(this.license);
        dest.writeInt(this.original_content_size);
        dest.writeString(this.original_format);
        dest.writeInt(this.playback_count);
        dest.writeString(this.purchase_title);
        dest.writeString(this.release_day);
        dest.writeString(this.release_month);
        dest.writeString(this.release_year);
        dest.writeInt(this.reposts_count);
        dest.writeString(this.state);
        dest.writeString(this.tag_list);
        dest.writeString(this.track_type);
        dest.writeParcelable(this.user, flags);
        dest.writeInt(this.bpm);
        dest.writeInt(this.user_playback_count);
        dest.writeInt(this.id);
        dest.writeString(this.kind);
        dest.writeString(this.created_at);
        dest.writeString(this.last_modified);
        dest.writeString(this.permalink);
        dest.writeString(this.permalink_url);
        dest.writeString(this.title);
        dest.writeInt(this.duration);
        dest.writeString(this.sharing);
        dest.writeString(this.stream_url);
        dest.writeString(this.uri);
        dest.writeInt(this.user_id);
        dest.writeString(this.policy);
        dest.writeString(this.monetization_model);
    }

    public D3TrackerObject() {
    }

    protected D3TrackerObject(Parcel in) {
        this.download_url = in.readString();
        this.key_signature = in.readString();
        this.user_favorite = in.readString();
        this.likes_count = in.readInt();
        this.release = in.readString();
        this.attachments_uri = in.readString();
        this.waveform_url = in.readString();
        this.purchase_url = in.readString();
        this.video_url = in.readString();
        this.streamable = in.readByte() != 0;
        this.artwork_url = in.readString();
        this.comment_count = in.readInt();
        this.commentable = in.readByte() != 0;
        this.description = in.readString();
        this.download_count = in.readInt();
        this.downloadable = in.readByte() != 0;
        this.embeddable_by = in.readString();
        this.favoritings_count = in.readInt();
        this.genre = in.readString();
        this.isrc = in.readString();
        this.label_id = in.readInt();
        this.label_name = in.readString();
        this.license = in.readString();
        this.original_content_size = in.readInt();
        this.original_format = in.readString();
        this.playback_count = in.readInt();
        this.purchase_title = in.readString();
        this.release_day = in.readString();
        this.release_month = in.readString();
        this.release_year = in.readString();
        this.reposts_count = in.readInt();
        this.state = in.readString();
        this.tag_list = in.readString();
        this.track_type = in.readString();
        this.user = in.readParcelable(SoundCloudUser.class.getClassLoader());
        this.bpm = in.readInt();
        this.user_playback_count = in.readInt();
        this.id = in.readInt();
        this.kind = in.readString();
        this.created_at = in.readString();
        this.last_modified = in.readString();
        this.permalink = in.readString();
        this.permalink_url = in.readString();
        this.title = in.readString();
        this.duration = in.readInt();
        this.sharing = in.readString();
        this.stream_url = in.readString();
        this.uri = in.readString();
        this.user_id = in.readInt();
        this.policy = in.readString();
        this.monetization_model = in.readString();
    }

    public static final Creator<D3TrackerObject> CREATOR = new Creator<D3TrackerObject>() {
        public D3TrackerObject createFromParcel(Parcel source) {
            return new D3TrackerObject(source);
        }

        public D3TrackerObject[] newArray(int size) {
            return new D3TrackerObject[size];
        }
    };
}
