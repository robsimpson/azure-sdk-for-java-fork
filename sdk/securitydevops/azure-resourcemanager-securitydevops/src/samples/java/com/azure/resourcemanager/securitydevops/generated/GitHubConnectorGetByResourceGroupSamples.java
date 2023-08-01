// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.Context;

/** Samples for GitHubConnector GetByResourceGroup. */
public final class GitHubConnectorGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/securitydevops/resource-manager/Microsoft.SecurityDevOps/preview/2022-09-01-preview/examples/GitHubConnectorGet.json
     */
    /**
     * Sample code: GitHubConnector_Get.
     *
     * @param manager Entry point to SecurityDevOpsManager.
     */
    public static void gitHubConnectorGet(com.azure.resourcemanager.securitydevops.SecurityDevOpsManager manager) {
        manager.gitHubConnectors().getByResourceGroupWithResponse("westusrg", "testconnector", Context.NONE);
    }
}
