// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for AdminRuleCollections Get. */
public final class AdminRuleCollectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/NetworkManagerAdminRuleCollectionGet.json
     */
    /**
     * Sample code: Gets security admin rule collection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsSecurityAdminRuleCollection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getAdminRuleCollections()
            .getWithResponse(
                "rg1",
                "testNetworkManager",
                "myTestSecurityConfig",
                "testRuleCollection",
                com.azure.core.util.Context.NONE);
    }
}
