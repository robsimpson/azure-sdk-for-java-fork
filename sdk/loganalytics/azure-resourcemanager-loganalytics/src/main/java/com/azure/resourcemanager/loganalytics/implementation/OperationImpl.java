// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.resourcemanager.loganalytics.fluent.models.OperationInner;
import com.azure.resourcemanager.loganalytics.models.Operation;
import com.azure.resourcemanager.loganalytics.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    OperationImpl(
        OperationInner innerObject, com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
