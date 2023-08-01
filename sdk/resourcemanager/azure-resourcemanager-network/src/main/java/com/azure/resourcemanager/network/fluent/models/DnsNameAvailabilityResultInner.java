// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response for the CheckDnsNameAvailability API service call. */
@Fluent
public final class DnsNameAvailabilityResultInner {
    /*
     * Domain availability (True/False).
     */
    @JsonProperty(value = "available")
    private Boolean available;

    /** Creates an instance of DnsNameAvailabilityResultInner class. */
    public DnsNameAvailabilityResultInner() {
    }

    /**
     * Get the available property: Domain availability (True/False).
     *
     * @return the available value.
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set the available property: Domain availability (True/False).
     *
     * @param available the available value to set.
     * @return the DnsNameAvailabilityResultInner object itself.
     */
    public DnsNameAvailabilityResultInner withAvailable(Boolean available) {
        this.available = available;
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
