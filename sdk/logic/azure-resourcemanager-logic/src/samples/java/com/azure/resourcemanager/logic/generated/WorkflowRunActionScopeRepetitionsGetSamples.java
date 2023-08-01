// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

/** Samples for WorkflowRunActionScopeRepetitions Get. */
public final class WorkflowRunActionScopeRepetitionsGetSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowRunActionScopeRepetitions_Get.json
     */
    /**
     * Sample code: Get a scoped repetition.
     *
     * @param manager Entry point to LogicManager.
     */
    public static void getAScopedRepetition(com.azure.resourcemanager.logic.LogicManager manager) {
        manager
            .workflowRunActionScopeRepetitions()
            .getWithResponse(
                "testResourceGroup",
                "testFlow",
                "08586776228332053161046300351",
                "for_each",
                "000000",
                com.azure.core.util.Context.NONE);
    }
}
