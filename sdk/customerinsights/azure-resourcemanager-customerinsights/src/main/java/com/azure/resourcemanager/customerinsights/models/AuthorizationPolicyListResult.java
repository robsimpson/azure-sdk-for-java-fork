// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.customerinsights.fluent.models.AuthorizationPolicyResourceFormatInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of list authorization policy operation. */
@Fluent
public final class AuthorizationPolicyListResult {
    /*
     * Results of the list operation.
     */
    @JsonProperty(value = "value")
    private List<AuthorizationPolicyResourceFormatInner> value;

    /*
     * Link to the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of AuthorizationPolicyListResult class. */
    public AuthorizationPolicyListResult() {
    }

    /**
     * Get the value property: Results of the list operation.
     *
     * @return the value value.
     */
    public List<AuthorizationPolicyResourceFormatInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of the list operation.
     *
     * @param value the value value to set.
     * @return the AuthorizationPolicyListResult object itself.
     */
    public AuthorizationPolicyListResult withValue(List<AuthorizationPolicyResourceFormatInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the AuthorizationPolicyListResult object itself.
     */
    public AuthorizationPolicyListResult withNextLink(String nextLink) {
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
