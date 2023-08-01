// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateLinkResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains a list of PrivateLinkResource and a possible link to query more results. */
@Fluent
public final class PrivateLinkResourceList {
    /*
     * List of PrivateLinkResource
     */
    @JsonProperty(value = "value")
    private List<PrivateLinkResourceInner> value;

    /*
     * The URL the client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of PrivateLinkResourceList class. */
    public PrivateLinkResourceList() {
    }

    /**
     * Get the value property: List of PrivateLinkResource.
     *
     * @return the value value.
     */
    public List<PrivateLinkResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of PrivateLinkResource.
     *
     * @param value the value value to set.
     * @return the PrivateLinkResourceList object itself.
     */
    public PrivateLinkResourceList withValue(List<PrivateLinkResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL the client should use to fetch the next page (per server side paging). It's
     * null for now, added for future use.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL the client should use to fetch the next page (per server side paging). It's
     * null for now, added for future use.
     *
     * @param nextLink the nextLink value to set.
     * @return the PrivateLinkResourceList object itself.
     */
    public PrivateLinkResourceList withNextLink(String nextLink) {
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
