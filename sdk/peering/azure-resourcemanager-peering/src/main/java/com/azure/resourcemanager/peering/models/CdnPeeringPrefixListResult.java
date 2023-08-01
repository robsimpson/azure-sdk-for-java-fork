// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.peering.fluent.models.CdnPeeringPrefixInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The paginated list of CDN peering prefixes. */
@Fluent
public final class CdnPeeringPrefixListResult {
    /*
     * The list of CDN peering prefixes.
     */
    @JsonProperty(value = "value")
    private List<CdnPeeringPrefixInner> value;

    /*
     * The link to fetch the next page of CDN peering prefixes.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of CdnPeeringPrefixListResult class. */
    public CdnPeeringPrefixListResult() {
    }

    /**
     * Get the value property: The list of CDN peering prefixes.
     *
     * @return the value value.
     */
    public List<CdnPeeringPrefixInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of CDN peering prefixes.
     *
     * @param value the value value to set.
     * @return the CdnPeeringPrefixListResult object itself.
     */
    public CdnPeeringPrefixListResult withValue(List<CdnPeeringPrefixInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to fetch the next page of CDN peering prefixes.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to fetch the next page of CDN peering prefixes.
     *
     * @param nextLink the nextLink value to set.
     * @return the CdnPeeringPrefixListResult object itself.
     */
    public CdnPeeringPrefixListResult withNextLink(String nextLink) {
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
