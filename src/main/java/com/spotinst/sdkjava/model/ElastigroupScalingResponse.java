package com.spotinst.sdkjava.model;

import java.util.List;

/**
 * Created by talzur on 26/01/2017.
 */
public class ElastigroupScalingResponse {
    //region Members
    private List<ElastigroupNewInstance> newInstances;
    private List<ElastigroupNewSpotRequest> newSpotRequests;
    //endregion

    //region Getter and Setter methods

    public List<ElastigroupNewInstance> getNewInstances() {
        return newInstances;
    }

    public void setNewInstances(List<ElastigroupNewInstance> newInstances) {
        this.newInstances = newInstances;
    }

    public List<ElastigroupNewSpotRequest> getNewSpotRequests() {
        return newSpotRequests;
    }

    public void setNewSpotRequests(List<ElastigroupNewSpotRequest> newSpotRequests) {
        this.newSpotRequests = newSpotRequests;
    }
    //endregion
}
