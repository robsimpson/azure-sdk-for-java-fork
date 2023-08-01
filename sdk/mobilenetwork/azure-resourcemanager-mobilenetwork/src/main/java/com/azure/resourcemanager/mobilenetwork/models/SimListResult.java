// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for list SIMs API service call. */
@Fluent
public final class SimListResult {
    /*
     * A list of SIMs in a resource group.
     */
    @JsonProperty(value = "value")
    private List<SimInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of SimListResult class. */
    public SimListResult() {
    }

    /**
     * Get the value property: A list of SIMs in a resource group.
     *
     * @return the value value.
     */
    public List<SimInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of SIMs in a resource group.
     *
     * @param value the value value to set.
     * @return the SimListResult object itself.
     */
    public SimListResult withValue(List<SimInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
