// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An error response from the Virtual Instance for SAP Workload service. */
@Fluent
public final class SapVirtualInstanceError {
    /*
     * The Virtual Instance for SAP error body.
     */
    @JsonProperty(value = "properties")
    private ErrorDefinition properties;

    /** Creates an instance of SapVirtualInstanceError class. */
    public SapVirtualInstanceError() {
    }

    /**
     * Get the properties property: The Virtual Instance for SAP error body.
     *
     * @return the properties value.
     */
    public ErrorDefinition properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The Virtual Instance for SAP error body.
     *
     * @param properties the properties value to set.
     * @return the SapVirtualInstanceError object itself.
     */
    public SapVirtualInstanceError withProperties(ErrorDefinition properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
