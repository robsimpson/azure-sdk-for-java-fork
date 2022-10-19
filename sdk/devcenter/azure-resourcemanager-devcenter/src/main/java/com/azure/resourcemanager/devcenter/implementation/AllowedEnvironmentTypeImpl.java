// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.fluent.models.AllowedEnvironmentTypeInner;
import com.azure.resourcemanager.devcenter.models.AllowedEnvironmentType;

public final class AllowedEnvironmentTypeImpl implements AllowedEnvironmentType {
    private AllowedEnvironmentTypeInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    AllowedEnvironmentTypeImpl(
        AllowedEnvironmentTypeInner innerObject, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public AllowedEnvironmentTypeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }
}