// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NginxFrontendIpConfiguration model. */
@Fluent
public final class NginxFrontendIpConfiguration {
    /*
     * The publicIPAddresses property.
     */
    @JsonProperty(value = "publicIPAddresses")
    private List<NginxPublicIpAddress> publicIpAddresses;

    /*
     * The privateIPAddresses property.
     */
    @JsonProperty(value = "privateIPAddresses")
    private List<NginxPrivateIpAddress> privateIpAddresses;

    /** Creates an instance of NginxFrontendIpConfiguration class. */
    public NginxFrontendIpConfiguration() {
    }

    /**
     * Get the publicIpAddresses property: The publicIPAddresses property.
     *
     * @return the publicIpAddresses value.
     */
    public List<NginxPublicIpAddress> publicIpAddresses() {
        return this.publicIpAddresses;
    }

    /**
     * Set the publicIpAddresses property: The publicIPAddresses property.
     *
     * @param publicIpAddresses the publicIpAddresses value to set.
     * @return the NginxFrontendIpConfiguration object itself.
     */
    public NginxFrontendIpConfiguration withPublicIpAddresses(List<NginxPublicIpAddress> publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
        return this;
    }

    /**
     * Get the privateIpAddresses property: The privateIPAddresses property.
     *
     * @return the privateIpAddresses value.
     */
    public List<NginxPrivateIpAddress> privateIpAddresses() {
        return this.privateIpAddresses;
    }

    /**
     * Set the privateIpAddresses property: The privateIPAddresses property.
     *
     * @param privateIpAddresses the privateIpAddresses value to set.
     * @return the NginxFrontendIpConfiguration object itself.
     */
    public NginxFrontendIpConfiguration withPrivateIpAddresses(List<NginxPrivateIpAddress> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicIpAddresses() != null) {
            publicIpAddresses().forEach(e -> e.validate());
        }
        if (privateIpAddresses() != null) {
            privateIpAddresses().forEach(e -> e.validate());
        }
    }
}
