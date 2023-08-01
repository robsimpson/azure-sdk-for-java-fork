// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;

/** Samples for PolicyStates ListQueryResultsForResourceGroup. */
public final class PolicyStatesListQueryResultsForResourceGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/examples/PolicyStates_QueryResourceGroupScopeNextLink.json
     */
    /**
     * Sample code: Query latest at resource group scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtResourceGroupScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResourceGroup(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/examples/PolicyStates_QueryResourceGroupScope.json
     */
    /**
     * Sample code: Query latest at resource group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtResourceGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResourceGroup(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
