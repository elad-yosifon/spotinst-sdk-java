package com.spotinst.sdkjava.model;

/**
 * Created by talzur on 11/01/2017.
 */
interface ISpotinstElastigroupRepo extends IRepository<Elastigroup, Void, String> {
    RepoGenericResponse<Boolean> detachInstances(String groupId, ElastigroupDetachInstancesRequest detachRequest,String authToken);
    RepoGenericResponse<ElastigroupScalingResponse> scaleUp(ElastigroupScalingRequest scalingRequest,String authToken);
}
