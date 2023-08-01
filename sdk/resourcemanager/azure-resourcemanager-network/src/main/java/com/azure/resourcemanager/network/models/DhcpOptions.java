// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * DhcpOptions contains an array of DNS servers available to VMs deployed in the virtual network. Standard DHCP option
 * for a subnet overrides VNET DHCP options.
 */
@Fluent
public final class DhcpOptions {
    /*
     * The list of DNS servers IP addresses.
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /** Creates an instance of DhcpOptions class. */
    public DhcpOptions() {
    }

    /**
     * Get the dnsServers property: The list of DNS servers IP addresses.
     *
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: The list of DNS servers IP addresses.
     *
     * @param dnsServers the dnsServers value to set.
     * @return the DhcpOptions object itself.
     */
    public DhcpOptions withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
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
