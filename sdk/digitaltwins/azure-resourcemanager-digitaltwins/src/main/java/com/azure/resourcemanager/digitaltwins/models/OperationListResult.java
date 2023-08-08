// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.digitaltwins.fluent.models.OperationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of DigitalTwins service operations. It contains a list of operations and a URL link to get the next set of
 * results.
 */
@Fluent
public final class OperationListResult {
    /*
     * The link used to get the next page of DigitalTwins description objects.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * A list of DigitalTwins operations supported by the Microsoft.DigitalTwins resource provider.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationInner> value;

    /** Creates an instance of OperationListResult class. */
    public OperationListResult() {
    }

    /**
     * Get the nextLink property: The link used to get the next page of DigitalTwins description objects.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of DigitalTwins description objects.
     *
     * @param nextLink the nextLink value to set.
     * @return the OperationListResult object itself.
     */
    public OperationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: A list of DigitalTwins operations supported by the Microsoft.DigitalTwins resource
     * provider.
     *
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
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
