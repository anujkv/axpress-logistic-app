package com.axpresslogistics.it2.axpresslogisticapp.model.CRMModel.businesscard.BusinessCardListResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchBusinessCardResponse {

    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("business_card")
    @Expose
    private List<SearchBusinessCardM> searchBusinessCardM = null;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SearchBusinessCardM> getBusinessCard() {
        return searchBusinessCardM;
    }

    public void setBusinessCard(List<SearchBusinessCardM> searchBusinessCardM) {
        this.searchBusinessCardM = searchBusinessCardM;
    }

}