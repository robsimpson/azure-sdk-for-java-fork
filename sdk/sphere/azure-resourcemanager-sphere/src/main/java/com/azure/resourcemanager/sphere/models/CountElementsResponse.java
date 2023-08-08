// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response of the count for elements. */
@Fluent
public class CountElementsResponse {
    /*
     * Number of children resources in parent resource.
     */
    @JsonProperty(value = "value", required = true)
    private int value;

    /** Creates an instance of CountElementsResponse class. */
    public CountElementsResponse() {
    }

    /**
     * Get the value property: Number of children resources in parent resource.
     *
     * @return the value value.
     */
    public int value() {
        return this.value;
    }

    /**
     * Set the value property: Number of children resources in parent resource.
     *
     * @param value the value value to set.
     * @return the CountElementsResponse object itself.
     */
    public CountElementsResponse withValue(int value) {
        this.value = value;
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
