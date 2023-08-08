// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

/** Samples for NetworkExperimentProfiles List. */
public final class NetworkExperimentProfilesListSamples {
    /*
     * x-ms-original-file: specification/frontdoor/resource-manager/Microsoft.Network/stable/2019-11-01/examples/NetworkExperimentListProfiles.json
     */
    /**
     * Sample code: List NetworkExperiment Profiles in a Resource Group.
     *
     * @param manager Entry point to FrontDoorManager.
     */
    public static void listNetworkExperimentProfilesInAResourceGroup(
        com.azure.resourcemanager.frontdoor.FrontDoorManager manager) {
        manager.networkExperimentProfiles().list(com.azure.core.util.Context.NONE);
    }
}
