package com.axpresslogistics.it2.axpresslogisticapp.model.operationResponse.ApprovalVehicle.VehicleList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchVehicleResponse {
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("savedvehiclesearch")
    @Expose
    private List<Savedvehiclesearch> savedvehiclesearch = null;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("db_name")
    @Expose
    private String dbName;

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

    public List<Savedvehiclesearch> getSavedvehiclesearch() {
        return savedvehiclesearch;
    }

    public void setSavedvehiclesearch(List<Savedvehiclesearch> savedvehiclesearch) {
        this.savedvehiclesearch = savedvehiclesearch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

}
