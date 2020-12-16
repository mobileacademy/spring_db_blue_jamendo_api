
package com.myapp.jamendoapi.models.track;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Tags {

    @SerializedName("genres")
    private List<String> mGenres;
    @SerializedName("instruments")
    private List<String> mInstruments;
    @SerializedName("vartags")
    private List<String> mVartags;

    public List<String> getGenres() {
        return mGenres;
    }

    public void setGenres(List<String> genres) {
        mGenres = genres;
    }

    public List<String> getInstruments() {
        return mInstruments;
    }

    public void setInstruments(List<String> instruments) {
        mInstruments = instruments;
    }

    public List<String> getVartags() {
        return mVartags;
    }

    public void setVartags(List<String> vartags) {
        mVartags = vartags;
    }

}
