// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A VM Family and its associated core quota for the Batch account. */
@Immutable
public final class VirtualMachineFamilyCoreQuota {
    /*
     * The Virtual Machine family name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The core quota for the VM family for the Batch account.
     */
    @JsonProperty(value = "coreQuota", access = JsonProperty.Access.WRITE_ONLY)
    private Integer coreQuota;

    /** Creates an instance of VirtualMachineFamilyCoreQuota class. */
    public VirtualMachineFamilyCoreQuota() {
    }

    /**
     * Get the name property: The Virtual Machine family name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the coreQuota property: The core quota for the VM family for the Batch account.
     *
     * @return the coreQuota value.
     */
    public Integer coreQuota() {
        return this.coreQuota;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
