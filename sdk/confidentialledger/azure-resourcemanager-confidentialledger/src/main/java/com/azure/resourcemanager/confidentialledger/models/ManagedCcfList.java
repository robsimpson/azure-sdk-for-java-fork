// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.confidentialledger.fluent.models.ManagedCcfInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Object that includes an array of Managed CCF and a possible link for next set. */
@Fluent
public final class ManagedCcfList {
    /*
     * List of Managed CCF
     */
    @JsonProperty(value = "value")
    private List<ManagedCcfInner> value;

    /*
     * The URL the client should use to fetch the next page (per server side paging).
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ManagedCcfList class. */
    public ManagedCcfList() {
    }

    /**
     * Get the value property: List of Managed CCF.
     *
     * @return the value value.
     */
    public List<ManagedCcfInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Managed CCF.
     *
     * @param value the value value to set.
     * @return the ManagedCcfList object itself.
     */
    public ManagedCcfList withValue(List<ManagedCcfInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL the client should use to fetch the next page (per server side paging).
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL the client should use to fetch the next page (per server side paging).
     *
     * @param nextLink the nextLink value to set.
     * @return the ManagedCcfList object itself.
     */
    public ManagedCcfList withNextLink(String nextLink) {
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
