// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneVersionInner;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneVersion;
import com.azure.resourcemanager.mobilenetwork.models.Platform;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class PacketCoreControlPlaneVersionImpl implements PacketCoreControlPlaneVersion {
    private PacketCoreControlPlaneVersionInner innerObject;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    PacketCoreControlPlaneVersionImpl(
        PacketCoreControlPlaneVersionInner innerObject,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
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

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<Platform> platforms() {
        List<Platform> inner = this.innerModel().platforms();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PacketCoreControlPlaneVersionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }
}
