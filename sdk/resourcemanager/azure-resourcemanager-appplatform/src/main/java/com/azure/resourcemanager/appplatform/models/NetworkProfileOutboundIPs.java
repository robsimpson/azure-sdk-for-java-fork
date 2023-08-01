// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Desired outbound IP resources for Azure Spring Apps resource. */
@Immutable
public final class NetworkProfileOutboundIPs {
    /*
     * A list of public IP addresses.
     */
    @JsonProperty(value = "publicIPs", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> publicIPs;

    /**
     * Get the publicIPs property: A list of public IP addresses.
     *
     * @return the publicIPs value.
     */
    public List<String> publicIPs() {
        return this.publicIPs;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
