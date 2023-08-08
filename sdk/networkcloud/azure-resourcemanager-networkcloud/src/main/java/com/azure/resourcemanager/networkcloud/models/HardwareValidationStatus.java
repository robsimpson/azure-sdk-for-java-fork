// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** HardwareValidationStatus represents the latest hardware validation details performed for this bare metal machine. */
@Immutable
public final class HardwareValidationStatus {
    /*
     * The timestamp of the hardware validation execution.
     */
    @JsonProperty(value = "lastValidationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastValidationTime;

    /*
     * The outcome of the hardware validation.
     */
    @JsonProperty(value = "result", access = JsonProperty.Access.WRITE_ONLY)
    private BareMetalMachineHardwareValidationResult result;

    /** Creates an instance of HardwareValidationStatus class. */
    public HardwareValidationStatus() {
    }

    /**
     * Get the lastValidationTime property: The timestamp of the hardware validation execution.
     *
     * @return the lastValidationTime value.
     */
    public OffsetDateTime lastValidationTime() {
        return this.lastValidationTime;
    }

    /**
     * Get the result property: The outcome of the hardware validation.
     *
     * @return the result value.
     */
    public BareMetalMachineHardwareValidationResult result() {
        return this.result;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
