// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Search Address Batch service call. */
@Immutable
public final class SearchAddressBatchResult extends BatchResult {
    /*
     * Array containing the batch results.
     */
    @JsonProperty(value = "batchItems", access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchAddressBatchItemPrivate> batchItems;

    /** Creates an instance of SearchAddressBatchResult class. */
    public SearchAddressBatchResult() {}

    /**
     * Get the batchItems property: Array containing the batch results.
     *
     * @return the batchItems value.
     */
    public List<SearchAddressBatchItemPrivate> getBatchItems() {
        return this.batchItems;
    }
}
