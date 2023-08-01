// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * SQL pool collection
 *
 * <p>List of SQL pools.
 */
@Fluent
public final class SqlPoolInfoListResult {
    /*
     * Link to the next page of results
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * List of SQL pools
     */
    @JsonProperty(value = "value")
    private List<SqlPoolInner> value;

    /** Creates an instance of SqlPoolInfoListResult class. */
    public SqlPoolInfoListResult() {
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
     * @return the SqlPoolInfoListResult object itself.
     */
    public SqlPoolInfoListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: List of SQL pools.
     *
     * @return the value value.
     */
    public List<SqlPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of SQL pools.
     *
     * @param value the value value to set.
     * @return the SqlPoolInfoListResult object itself.
     */
    public SqlPoolInfoListResult withValue(List<SqlPoolInner> value) {
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
