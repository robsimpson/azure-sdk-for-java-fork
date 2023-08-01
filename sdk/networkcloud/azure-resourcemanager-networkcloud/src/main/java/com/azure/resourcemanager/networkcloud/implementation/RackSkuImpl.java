// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.networkcloud.fluent.models.RackSkuInner;
import com.azure.resourcemanager.networkcloud.models.MachineSkuSlot;
import com.azure.resourcemanager.networkcloud.models.RackSku;
import com.azure.resourcemanager.networkcloud.models.RackSkuProvisioningState;
import com.azure.resourcemanager.networkcloud.models.RackSkuType;
import com.azure.resourcemanager.networkcloud.models.StorageApplianceSkuSlot;
import java.util.Collections;
import java.util.List;

public final class RackSkuImpl implements RackSku {
    private RackSkuInner innerObject;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    RackSkuImpl(RackSkuInner innerObject, com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
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

    public List<MachineSkuSlot> computeMachines() {
        List<MachineSkuSlot> inner = this.innerModel().computeMachines();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<MachineSkuSlot> controllerMachines() {
        List<MachineSkuSlot> inner = this.innerModel().controllerMachines();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String description() {
        return this.innerModel().description();
    }

    public Long maxClusterSlots() {
        return this.innerModel().maxClusterSlots();
    }

    public RackSkuProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public RackSkuType rackType() {
        return this.innerModel().rackType();
    }

    public List<StorageApplianceSkuSlot> storageAppliances() {
        List<StorageApplianceSkuSlot> inner = this.innerModel().storageAppliances();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> supportedRackSkuIds() {
        List<String> inner = this.innerModel().supportedRackSkuIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RackSkuInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }
}
