// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details related to the IPv6 address configuration. */
@Immutable
public final class Ipv6Config {
    /*
     * The IPv6 address of the network adapter.
     */
    @JsonProperty(value = "ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /*
     * The IPv6 prefix of the network adapter.
     */
    @JsonProperty(value = "prefixLength", access = JsonProperty.Access.WRITE_ONLY)
    private Integer prefixLength;

    /*
     * The IPv6 gateway of the network adapter.
     */
    @JsonProperty(value = "gateway", access = JsonProperty.Access.WRITE_ONLY)
    private String gateway;

    /** Creates an instance of Ipv6Config class. */
    public Ipv6Config() {
    }

    /**
     * Get the ipAddress property: The IPv6 address of the network adapter.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Get the prefixLength property: The IPv6 prefix of the network adapter.
     *
     * @return the prefixLength value.
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }

    /**
     * Get the gateway property: The IPv6 gateway of the network adapter.
     *
     * @return the gateway value.
     */
    public String gateway() {
        return this.gateway;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
