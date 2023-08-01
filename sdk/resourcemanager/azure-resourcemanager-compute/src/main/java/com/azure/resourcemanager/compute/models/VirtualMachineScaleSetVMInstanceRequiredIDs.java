// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies a list of virtual machine instance IDs from the VM scale set. */
@Fluent
public final class VirtualMachineScaleSetVMInstanceRequiredIDs {
    /*
     * The virtual machine scale set instance ids.
     */
    @JsonProperty(value = "instanceIds", required = true)
    private List<String> instanceIds;

    /** Creates an instance of VirtualMachineScaleSetVMInstanceRequiredIDs class. */
    public VirtualMachineScaleSetVMInstanceRequiredIDs() {
    }

    /**
     * Get the instanceIds property: The virtual machine scale set instance ids.
     *
     * @return the instanceIds value.
     */
    public List<String> instanceIds() {
        return this.instanceIds;
    }

    /**
     * Set the instanceIds property: The virtual machine scale set instance ids.
     *
     * @param instanceIds the instanceIds value to set.
     * @return the VirtualMachineScaleSetVMInstanceRequiredIDs object itself.
     */
    public VirtualMachineScaleSetVMInstanceRequiredIDs withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (instanceIds() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property instanceIds in model VirtualMachineScaleSetVMInstanceRequiredIDs"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetVMInstanceRequiredIDs.class);
}
