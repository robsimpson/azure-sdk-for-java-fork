// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.fluent.models.BigDataPoolResourceInfoInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Collection of Big Data pools
 *
 * <p>Collection of Big Data pool information.
 */
@Fluent
public final class BigDataPoolResourceInfoListResult {
    /*
     * Link to the next page of results
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * List of Big Data pools
     */
    @JsonProperty(value = "value")
    private List<BigDataPoolResourceInfoInner> value;

    /** Creates an instance of BigDataPoolResourceInfoListResult class. */
    public BigDataPoolResourceInfoListResult() {
    }

    /**
     * Get the nextLink property: Link to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next page of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the BigDataPoolResourceInfoListResult object itself.
     */
    public BigDataPoolResourceInfoListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: List of Big Data pools.
     *
     * @return the value value.
     */
    public List<BigDataPoolResourceInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Big Data pools.
     *
     * @param value the value value to set.
     * @return the BigDataPoolResourceInfoListResult object itself.
     */
    public BigDataPoolResourceInfoListResult withValue(List<BigDataPoolResourceInfoInner> value) {
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
            value().forEach(e -> e.validate());
        }
    }
}
