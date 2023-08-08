// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.resourcemanager.signalr.fluent.models.SignalRUsageInner;
import com.azure.resourcemanager.signalr.models.SignalRUsage;
import com.azure.resourcemanager.signalr.models.SignalRUsageName;

public final class SignalRUsageImpl implements SignalRUsage {
    private SignalRUsageInner innerObject;

    private final com.azure.resourcemanager.signalr.SignalRManager serviceManager;

    SignalRUsageImpl(SignalRUsageInner innerObject, com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public Long currentValue() {
        return this.innerModel().currentValue();
    }

    public Long limit() {
        return this.innerModel().limit();
    }

    public SignalRUsageName name() {
        return this.innerModel().name();
    }

    public String unit() {
        return this.innerModel().unit();
    }

    public SignalRUsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.signalr.SignalRManager manager() {
        return this.serviceManager;
    }
}
