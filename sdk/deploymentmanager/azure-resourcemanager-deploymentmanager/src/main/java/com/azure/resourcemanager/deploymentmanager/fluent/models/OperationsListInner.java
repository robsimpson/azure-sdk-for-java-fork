// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.deploymentmanager.models.Operation;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The operations response. */
@Fluent
public final class OperationsListInner {
    /*
     * The list of supported operations
     */
    @JsonProperty(value = "value")
    private Operation value;

    /** Creates an instance of OperationsListInner class. */
    public OperationsListInner() {
    }

    /**
     * Get the value property: The list of supported operations.
     *
     * @return the value value.
     */
    public Operation value() {
        return this.value;
    }

    /**
     * Set the value property: The list of supported operations.
     *
     * @param value the value value to set.
     * @return the OperationsListInner object itself.
     */
    public OperationsListInner withValue(Operation value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().validate();
        }
    }
}
