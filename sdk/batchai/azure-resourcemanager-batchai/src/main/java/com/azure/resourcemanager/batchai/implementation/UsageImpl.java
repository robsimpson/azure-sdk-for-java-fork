// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.implementation;

import com.azure.resourcemanager.batchai.fluent.models.UsageInner;
import com.azure.resourcemanager.batchai.models.Usage;
import com.azure.resourcemanager.batchai.models.UsageName;
import com.azure.resourcemanager.batchai.models.UsageUnit;

public final class UsageImpl implements Usage {
    private UsageInner innerObject;

    private final com.azure.resourcemanager.batchai.BatchAIManager serviceManager;

    UsageImpl(UsageInner innerObject, com.azure.resourcemanager.batchai.BatchAIManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public UsageUnit unit() {
        return this.innerModel().unit();
    }

    public Integer currentValue() {
        return this.innerModel().currentValue();
    }

    public Long limit() {
        return this.innerModel().limit();
    }

    public UsageName name() {
        return this.innerModel().name();
    }

    public UsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.batchai.BatchAIManager manager() {
        return this.serviceManager;
    }
}
