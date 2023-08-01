// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.avs.models.VMTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NSX Virtual Machine. */
@Fluent
public final class WorkloadNetworkVirtualMachineInner extends ProxyResource {
    /*
     * Virtual machine properties.
     */
    @JsonProperty(value = "properties")
    private WorkloadNetworkVirtualMachineProperties innerProperties;

    /** Creates an instance of WorkloadNetworkVirtualMachineInner class. */
    public WorkloadNetworkVirtualMachineInner() {
    }

    /**
     * Get the innerProperties property: Virtual machine properties.
     *
     * @return the innerProperties value.
     */
    private WorkloadNetworkVirtualMachineProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: Display name of the VM.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display name of the VM.
     *
     * @param displayName the displayName value to set.
     * @return the WorkloadNetworkVirtualMachineInner object itself.
     */
    public WorkloadNetworkVirtualMachineInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadNetworkVirtualMachineProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the vmType property: Virtual machine type.
     *
     * @return the vmType value.
     */
    public VMTypeEnum vmType() {
        return this.innerProperties() == null ? null : this.innerProperties().vmType();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
