// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mobilenetwork.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Object that describes a single Microsoft.MobileNetwork operation. */
@Fluent
public final class OperationInner {
    /*
     * Indicates whether the operation applies to data-plane.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * Operation name: {provider}/{resource}/{operation}
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The object that represents the operation.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /** Creates an instance of OperationInner class. */
    public OperationInner() {
    }

    /**
     * Get the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: The object that represents the operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
