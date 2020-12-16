
package com.myapp.jamendoapi.models.track;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Headers {

    @SerializedName("code")
    private Long mCode;
    @SerializedName("error_message")
    private String mErrorMessage;
    @SerializedName("results_count")
    private Long mResultsCount;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("warnings")
    private String mWarnings;

    public Long getCode() {
        return mCode;
    }

    public void setCode(Long code) {
        mCode = code;
    }

    public String getErrorMessage() {
        return mErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        mErrorMessage = errorMessage;
    }

    public Long getResultsCount() {
        return mResultsCount;
    }

    public void setResultsCount(Long resultsCount) {
        mResultsCount = resultsCount;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public String getWarnings() {
        return mWarnings;
    }

    public void setWarnings(String warnings) {
        mWarnings = warnings;
    }

}
