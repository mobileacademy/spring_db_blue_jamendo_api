
package com.myapp.jamendoapi.models.track;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Musicinfo {

    @SerializedName("acousticelectric")
    private String mAcousticelectric;
    @SerializedName("gender")
    private String mGender;
    @SerializedName("lang")
    private String mLang;
    @SerializedName("speed")
    private String mSpeed;
    @SerializedName("tags")
    private Tags mTags;
    @SerializedName("vocalinstrumental")
    private String mVocalinstrumental;

    public String getAcousticelectric() {
        return mAcousticelectric;
    }

    public void setAcousticelectric(String acousticelectric) {
        mAcousticelectric = acousticelectric;
    }

    public String getGender() {
        return mGender;
    }

    public void setGender(String gender) {
        mGender = gender;
    }

    public String getLang() {
        return mLang;
    }

    public void setLang(String lang) {
        mLang = lang;
    }

    public String getSpeed() {
        return mSpeed;
    }

    public void setSpeed(String speed) {
        mSpeed = speed;
    }

    public Tags getTags() {
        return mTags;
    }

    public void setTags(Tags tags) {
        mTags = tags;
    }

    public String getVocalinstrumental() {
        return mVocalinstrumental;
    }

    public void setVocalinstrumental(String vocalinstrumental) {
        mVocalinstrumental = vocalinstrumental;
    }

}
