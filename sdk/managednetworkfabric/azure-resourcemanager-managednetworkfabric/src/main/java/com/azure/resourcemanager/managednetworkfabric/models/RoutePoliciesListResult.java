// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.RoutePolicyInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of RoutePolicies. */
@Fluent
public final class RoutePoliciesListResult {
    /*
     * List of RoutePolicy resources.
     */
    @JsonProperty(value = "value")
    private List<RoutePolicyInner> value;

    /*
     * Url to follow for getting next page of resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of RoutePoliciesListResult class. */
    public RoutePoliciesListResult() {
    }

    /**
     * Get the value property: List of RoutePolicy resources.
     *
     * @return the value value.
     */
    public List<RoutePolicyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of RoutePolicy resources.
     *
     * @param value the value value to set.
     * @return the RoutePoliciesListResult object itself.
     */
    public RoutePoliciesListResult withValue(List<RoutePolicyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Url to follow for getting next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to follow for getting next page of resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the RoutePoliciesListResult object itself.
     */
    public RoutePoliciesListResult withNextLink(String nextLink) {
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
