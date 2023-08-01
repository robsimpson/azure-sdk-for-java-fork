// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.resourcemanager.logic.models.SetTriggerStateActionDefinition;
import com.azure.resourcemanager.logic.models.WorkflowTriggerReference;

/** Samples for WorkflowTriggers SetState. */
public final class WorkflowTriggersSetStateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_SetState.json
     */
    /**
     * Sample code: Set trigger state.
     *
     * @param manager Entry point to LogicManager.
     */
    public static void setTriggerState(com.azure.resourcemanager.logic.LogicManager manager) {
        manager
            .workflowTriggers()
            .setStateWithResponse(
                "testResourceGroup",
                "testWorkflow",
                "testTrigger",
                new SetTriggerStateActionDefinition()
                    .withSource(
                        new WorkflowTriggerReference()
                            .withId(
                                "subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/sourceResGroup/providers/Microsoft.Logic/workflows/sourceWorkflow/triggers/sourceTrigger")),
                com.azure.core.util.Context.NONE);
    }
}
