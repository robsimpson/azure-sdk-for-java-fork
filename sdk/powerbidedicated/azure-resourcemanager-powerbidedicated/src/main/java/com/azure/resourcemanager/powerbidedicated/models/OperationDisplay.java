// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The object that represents the operation. */
@Fluent
public final class OperationDisplay {
    /*
     * Service provider: Microsoft.PowerBIDedicated.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /*
     * Resource on which the operation is performed: capacity, etc.
     */
    @JsonProperty(value = "resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /*
     * Operation type: create, update, delete, etc.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /*
     * Localized description of the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /** Creates an instance of OperationDisplay class. */
    public OperationDisplay() {
    }

    /**
     * Get the provider property: Service provider: Microsoft.PowerBIDedicated.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the resource property: Resource on which the operation is performed: capacity, etc.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the operation property: Operation type: create, update, delete, etc.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the description property: Localized description of the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Localized description of the operation.
     *
     * @param description the description value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
