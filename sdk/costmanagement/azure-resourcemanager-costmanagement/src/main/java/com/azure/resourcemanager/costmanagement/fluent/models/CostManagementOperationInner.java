// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.costmanagement.models.Operation;
import com.azure.resourcemanager.costmanagement.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A Cost management REST API operation. */
@Fluent
public final class CostManagementOperationInner extends Operation {
    /*
     * Operation id: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /** Creates an instance of CostManagementOperationInner class. */
    public CostManagementOperationInner() {
    }

    /**
     * Get the id property: Operation id: {provider}/{resource}/{operation}.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /** {@inheritDoc} */
    @Override
    public CostManagementOperationInner withDisplay(OperationDisplay display) {
        super.withDisplay(display);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
