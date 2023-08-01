// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeStopOperationStatusInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeStopOperationStatus;
import com.azure.resourcemanager.synapse.models.WorkspaceStatus;

public final class IntegrationRuntimeStopOperationStatusImpl implements IntegrationRuntimeStopOperationStatus {
    private IntegrationRuntimeStopOperationStatusInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    IntegrationRuntimeStopOperationStatusImpl(
        IntegrationRuntimeStopOperationStatusInner innerObject,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public WorkspaceStatus status() {
        return this.innerModel().status();
    }

    public String name() {
        return this.innerModel().name();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public String error() {
        return this.innerModel().error();
    }

    public IntegrationRuntimeStopOperationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
