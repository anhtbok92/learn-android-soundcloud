package vn.vietnamlab.nguyentuananh.sudungthuvien;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by danhdueexoictif on 10/28/15.
 */
public class SoundCloudUser implements Parcelable {
    private String avatar_url;
    private int id;
    private String kind;
    private String permalink_url;
    private String uri;
    private String username;
    private String permalink;
    private String last_modified;

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
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

    public String getPermalink_url() {
        return permalink_url;
    }

    public void setPermalink_url(String permalink_url) {
        this.permalink_url = permalink_url;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.avatar_url);
        dest.writeInt(this.id);
        dest.writeString(this.kind);
        dest.writeString(this.permalink_url);
        dest.writeString(this.uri);
        dest.writeString(this.username);
        dest.writeString(this.permalink);
        dest.writeString(this.last_modified);
    }

    public SoundCloudUser() {
    }

    protected SoundCloudUser(Parcel in) {
        this.avatar_url = in.readString();
        this.id = in.readInt();
        this.kind = in.readString();
        this.permalink_url = in.readString();
        this.uri = in.readString();
        this.username = in.readString();
        this.permalink = in.readString();
        this.last_modified = in.readString();
    }

    public static final Creator<SoundCloudUser> CREATOR = new Creator<SoundCloudUser>() {
        public SoundCloudUser createFromParcel(Parcel source) {
            return new SoundCloudUser(source);
        }

        public SoundCloudUser[] newArray(int size) {
            return new SoundCloudUser[size];
        }
    };
}
