// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorSkuInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for list vendor sku API service call. */
@Fluent
public final class VendorSkuListResult {
    /*
     * A list of vendor skus offered by the vendor.
     */
    @JsonProperty(value = "value")
    private List<VendorSkuInner> value;

    /*
     * The URI to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of VendorSkuListResult class. */
    public VendorSkuListResult() {
    }

    /**
     * Get the value property: A list of vendor skus offered by the vendor.
     *
     * @return the value value.
     */
    public List<VendorSkuInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of vendor skus offered by the vendor.
     *
     * @param value the value value to set.
     * @return the VendorSkuListResult object itself.
     */
    public VendorSkuListResult withValue(List<VendorSkuInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to get the next set of results.
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
