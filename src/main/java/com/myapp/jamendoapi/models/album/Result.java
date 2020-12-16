
package com.myapp.jamendoapi.models.album;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Result {

    @SerializedName("artist_id")
    private String mArtistId;
    @SerializedName("artist_name")
    private String mArtistName;
    @SerializedName("id")
    private String mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("name")
    private String mName;
    @SerializedName("releasedate")
    private String mReleasedate;
    @SerializedName("shareurl")
    private String mShareurl;
    @SerializedName("shorturl")
    private String mShorturl;
    @SerializedName("zip")
    private String mZip;

    public String getArtistId() {
        return mArtistId;
    }

    public void setArtistId(String artistId) {
        mArtistId = artistId;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public void setArtistName(String artistName) {
        mArtistName = artistName;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getReleasedate() {
        return mReleasedate;
    }

    public void setReleasedate(String releasedate) {
        mReleasedate = releasedate;
    }

    public String getShareurl() {
        return mShareurl;
    }

    public void setShareurl(String shareurl) {
        mShareurl = shareurl;
    }

    public String getShorturl() {
        return mShorturl;
    }

    public void setShorturl(String shorturl) {
        mShorturl = shorturl;
    }

    public String getZip() {
        return mZip;
    }

    public void setZip(String zip) {
        mZip = zip;
    }

}
