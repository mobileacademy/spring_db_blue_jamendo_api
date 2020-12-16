
package com.myapp.jamendoapi.models.artist;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Result {

    @SerializedName("id")
    private String mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("joindate")
    private String mJoindate;
    @SerializedName("name")
    private String mName;
    @SerializedName("shareurl")
    private String mShareurl;
    @SerializedName("shorturl")
    private String mShorturl;
    @SerializedName("website")
    private String mWebsite;

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

    public String getJoindate() {
        return mJoindate;
    }

    public void setJoindate(String joindate) {
        mJoindate = joindate;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
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

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String website) {
        mWebsite = website;
    }

}
