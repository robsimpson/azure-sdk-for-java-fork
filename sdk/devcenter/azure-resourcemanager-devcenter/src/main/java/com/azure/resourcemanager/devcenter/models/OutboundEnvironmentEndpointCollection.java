// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.fluent.models.OutboundEnvironmentEndpointInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Values returned by the List operation. */
@Fluent
public final class OutboundEnvironmentEndpointCollection {
    /*
     * The collection of outbound network dependency endpoints returned by the listing operation.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<OutboundEnvironmentEndpointInner> value;

    /*
     * The continuation token.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of OutboundEnvironmentEndpointCollection class. */
    public OutboundEnvironmentEndpointCollection() {
    }

    /**
     * Get the value property: The collection of outbound network dependency endpoints returned by the listing
     * operation.
     *
     * @return the value value.
     */
    public List<OutboundEnvironmentEndpointInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The continuation token.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The continuation token.
     *
     * @param nextLink the nextLink value to set.
     * @return the OutboundEnvironmentEndpointCollection object itself.
     */
    public OutboundEnvironmentEndpointCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
