// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

/** Samples for WorkspaceFeatures List. */
public final class WorkspaceFeaturesListSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/WorkspaceFeature/list.json
     */
    /**
     * Sample code: List Workspace features.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listWorkspaceFeatures(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.workspaceFeatures().list("myResourceGroup", "testworkspace", com.azure.core.util.Context.NONE);
    }
}
