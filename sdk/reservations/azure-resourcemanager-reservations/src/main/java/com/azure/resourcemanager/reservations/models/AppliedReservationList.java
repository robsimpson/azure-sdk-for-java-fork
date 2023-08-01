// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paginated list of applied reservations. */
@Fluent
public final class AppliedReservationList {
    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<String> value;

    /*
     * Url to get the next page of reservations
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of AppliedReservationList class. */
    public AppliedReservationList() {
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the AppliedReservationList object itself.
     */
    public AppliedReservationList withValue(List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Url to get the next page of reservations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to get the next page of reservations.
     *
     * @param nextLink the nextLink value to set.
     * @return the AppliedReservationList object itself.
     */
    public AppliedReservationList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
