// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The live event metadata insertion endpoint. */
@Fluent
public final class LiveEventTimedMetadataEndpoint {
    /*
     * The metadata endpoint URL.
     */
    @JsonProperty(value = "url")
    private String url;

    /** Creates an instance of LiveEventTimedMetadataEndpoint class. */
    public LiveEventTimedMetadataEndpoint() {
    }

    /**
     * Get the url property: The metadata endpoint URL.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The metadata endpoint URL.
     *
     * @param url the url value to set.
     * @return the LiveEventTimedMetadataEndpoint object itself.
     */
    public LiveEventTimedMetadataEndpoint withUrl(String url) {
        this.url = url;
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
