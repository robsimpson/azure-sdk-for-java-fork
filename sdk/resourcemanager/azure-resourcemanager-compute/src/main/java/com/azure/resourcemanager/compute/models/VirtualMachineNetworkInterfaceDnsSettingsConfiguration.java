// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machines network configuration's DNS settings. */
@Fluent
public final class VirtualMachineNetworkInterfaceDnsSettingsConfiguration {
    /*
     * List of DNS servers IP addresses
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /** Creates an instance of VirtualMachineNetworkInterfaceDnsSettingsConfiguration class. */
    public VirtualMachineNetworkInterfaceDnsSettingsConfiguration() {
    }

    /**
     * Get the dnsServers property: List of DNS servers IP addresses.
     *
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: List of DNS servers IP addresses.
     *
     * @param dnsServers the dnsServers value to set.
     * @return the VirtualMachineNetworkInterfaceDnsSettingsConfiguration object itself.
     */
    public VirtualMachineNetworkInterfaceDnsSettingsConfiguration withDnsServers(List<String> dnsServers) {
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
