// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.fluent.models.VolumeGroupInner;
import com.azure.resourcemanager.netapp.models.VolumeGroup;
import com.azure.resourcemanager.netapp.models.VolumeGroupMetadata;

public final class VolumeGroupImpl implements VolumeGroup {
    private VolumeGroupInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    VolumeGroupImpl(VolumeGroupInner innerObject, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String location() {
        return this.innerModel().location();
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

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VolumeGroupMetadata groupMetadata() {
        return this.innerModel().groupMetadata();
    }

    public VolumeGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
