// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.implementation;

import com.azure.resourcemanager.botservice.fluent.models.OperationResultsDescriptionInner;
import com.azure.resourcemanager.botservice.models.OperationResultStatus;
import com.azure.resourcemanager.botservice.models.OperationResultsDescription;
import java.time.OffsetDateTime;

public final class OperationResultsDescriptionImpl implements OperationResultsDescription {
    private OperationResultsDescriptionInner innerObject;

    private final com.azure.resourcemanager.botservice.BotServiceManager serviceManager;

    OperationResultsDescriptionImpl(
        OperationResultsDescriptionInner innerObject,
        com.azure.resourcemanager.botservice.BotServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationResultStatus status() {
        return this.innerModel().status();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OperationResultsDescriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.botservice.BotServiceManager manager() {
        return this.serviceManager;
    }
}
