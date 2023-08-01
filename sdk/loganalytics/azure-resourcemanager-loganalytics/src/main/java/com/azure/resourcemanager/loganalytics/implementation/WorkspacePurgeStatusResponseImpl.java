// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.resourcemanager.loganalytics.fluent.models.WorkspacePurgeStatusResponseInner;
import com.azure.resourcemanager.loganalytics.models.PurgeState;
import com.azure.resourcemanager.loganalytics.models.WorkspacePurgeStatusResponse;

public final class WorkspacePurgeStatusResponseImpl implements WorkspacePurgeStatusResponse {
    private WorkspacePurgeStatusResponseInner innerObject;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    WorkspacePurgeStatusResponseImpl(
        WorkspacePurgeStatusResponseInner innerObject,
        com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public PurgeState status() {
        return this.innerModel().status();
    }

    public WorkspacePurgeStatusResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
