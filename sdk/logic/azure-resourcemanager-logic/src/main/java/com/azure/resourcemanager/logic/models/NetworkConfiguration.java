// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The network configuration. */
@Fluent
public final class NetworkConfiguration {
    /*
     * Gets the virtual network address space.
     */
    @JsonProperty(value = "virtualNetworkAddressSpace")
    private String virtualNetworkAddressSpace;

    /*
     * The access endpoint.
     */
    @JsonProperty(value = "accessEndpoint")
    private IntegrationServiceEnvironmentAccessEndpoint accessEndpoint;

    /*
     * The subnets.
     */
    @JsonProperty(value = "subnets")
    private List<ResourceReference> subnets;

    /** Creates an instance of NetworkConfiguration class. */
    public NetworkConfiguration() {
    }

    /**
     * Get the virtualNetworkAddressSpace property: Gets the virtual network address space.
     *
     * @return the virtualNetworkAddressSpace value.
     */
    public String virtualNetworkAddressSpace() {
        return this.virtualNetworkAddressSpace;
    }

    /**
     * Set the virtualNetworkAddressSpace property: Gets the virtual network address space.
     *
     * @param virtualNetworkAddressSpace the virtualNetworkAddressSpace value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withVirtualNetworkAddressSpace(String virtualNetworkAddressSpace) {
        this.virtualNetworkAddressSpace = virtualNetworkAddressSpace;
        return this;
    }

    /**
     * Get the accessEndpoint property: The access endpoint.
     *
     * @return the accessEndpoint value.
     */
    public IntegrationServiceEnvironmentAccessEndpoint accessEndpoint() {
        return this.accessEndpoint;
    }

    /**
     * Set the accessEndpoint property: The access endpoint.
     *
     * @param accessEndpoint the accessEndpoint value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withAccessEndpoint(IntegrationServiceEnvironmentAccessEndpoint accessEndpoint) {
        this.accessEndpoint = accessEndpoint;
        return this;
    }

    /**
     * Get the subnets property: The subnets.
     *
     * @return the subnets value.
     */
    public List<ResourceReference> subnets() {
        return this.subnets;
    }

    /**
     * Set the subnets property: The subnets.
     *
     * @param subnets the subnets value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withSubnets(List<ResourceReference> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessEndpoint() != null) {
            accessEndpoint().validate();
        }
        if (subnets() != null) {
            subnets().forEach(e -> e.validate());
        }
    }
}
