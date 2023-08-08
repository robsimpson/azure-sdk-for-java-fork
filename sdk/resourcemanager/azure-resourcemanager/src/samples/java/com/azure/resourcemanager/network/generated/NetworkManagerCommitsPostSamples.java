// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.NetworkManagerCommitInner;
import com.azure.resourcemanager.network.models.ConfigurationType;
import java.util.Arrays;

/** Samples for NetworkManagerCommits Post. */
public final class NetworkManagerCommitsPostSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/NetworkManagerCommitPost.json
     */
    /**
     * Sample code: NetworkManageCommitPost.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkManageCommitPost(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkManagerCommits()
            .post(
                "resoureGroupSample",
                "testNetworkManager",
                new NetworkManagerCommitInner()
                    .withTargetLocations(Arrays.asList("useast"))
                    .withConfigurationIds(
                        Arrays
                            .asList(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resoureGroupSample/providers/Microsoft.Network/networkManagers/testNetworkManager/securityAdminConfigurations/SampleSecurityAdminConfig"))
                    .withCommitType(ConfigurationType.SECURITY_ADMIN),
                com.azure.core.util.Context.NONE);
    }
}
