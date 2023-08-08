// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.fluent.models.RemediationInner;

/** Samples for Remediations CreateOrUpdateAtManagementGroup. */
public final class RemediationsCreateOrUpdateAtManagementGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2021-10-01/examples/Remediations_CreateManagementGroupScope.json
     */
    /**
     * Sample code: Create remediation at management group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void createRemediationAtManagementGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .remediations()
            .createOrUpdateAtManagementGroupWithResponse(
                "financeMg",
                "storageRemediation",
                new RemediationInner()
                    .withPolicyAssignmentId(
                        "/providers/microsoft.management/managementGroups/financeMg/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5"),
                Context.NONE);
    }
}
