// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response for GenerateExpressRoutePortsLOA API service call. */
@Fluent
public final class GenerateExpressRoutePortsLoaResultInner {
    /*
     * The content as a base64 encoded string.
     */
    @JsonProperty(value = "encodedContent")
    private String encodedContent;

    /** Creates an instance of GenerateExpressRoutePortsLoaResultInner class. */
    public GenerateExpressRoutePortsLoaResultInner() {
    }

    /**
     * Get the encodedContent property: The content as a base64 encoded string.
     *
     * @return the encodedContent value.
     */
    public String encodedContent() {
        return this.encodedContent;
    }

    /**
     * Set the encodedContent property: The content as a base64 encoded string.
     *
     * @param encodedContent the encodedContent value to set.
     * @return the GenerateExpressRoutePortsLoaResultInner object itself.
     */
    public GenerateExpressRoutePortsLoaResultInner withEncodedContent(String encodedContent) {
        this.encodedContent = encodedContent;
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
