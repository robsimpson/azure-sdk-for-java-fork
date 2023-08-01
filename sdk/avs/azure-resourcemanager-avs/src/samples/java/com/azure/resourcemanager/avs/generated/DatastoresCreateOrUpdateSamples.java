// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.resourcemanager.avs.models.NetAppVolume;

/** Samples for Datastores CreateOrUpdate. */
public final class DatastoresCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2022-05-01/examples/Datastores_CreateOrUpdate.json
     */
    /**
     * Sample code: Datastores_CreateOrUpdate.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void datastoresCreateOrUpdate(com.azure.resourcemanager.avs.AvsManager manager) {
        manager
            .datastores()
            .define("datastore1")
            .withExistingCluster("group1", "cloud1", "cluster1")
            .withNetAppVolume(
                new NetAppVolume()
                    .withId(
                        "/subscriptions/11111111-1111-1111-1111-111111111111/resourceGroups/ResourceGroup1/providers/Microsoft.NetApp/netAppAccounts/NetAppAccount1/capacityPools/CapacityPool1/volumes/NFSVol1"))
            .create();
    }
}
