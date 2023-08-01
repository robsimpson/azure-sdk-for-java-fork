// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineScaleSetNetworkConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machine scale set network profile's network configurations. */
@Fluent
public final class VirtualMachineScaleSetNetworkConfiguration extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetNetworkConfiguration.class);

    /*
     * The network configuration name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Describes a virtual machine scale set network profile's IP
     * configuration.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineScaleSetNetworkConfigurationProperties innerProperties;

    /**
     * Get the name property: The network configuration name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The network configuration name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Describes a virtual machine scale set network profile's IP configuration.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineScaleSetNetworkConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineScaleSetNetworkConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Set the primary property: Specifies the primary network interface in case the virtual machine has more than 1
     * network interface.
     *
     * @param primary the primary value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration withPrimary(Boolean primary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetNetworkConfigurationProperties();
        }
        this.innerProperties().withPrimary(primary);
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     *
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.innerProperties() == null ? null : this.innerProperties().enableAcceleratedNetworking();
    }

    /**
     * Set the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration withEnableAcceleratedNetworking(
        Boolean enableAcceleratedNetworking) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetNetworkConfigurationProperties();
        }
        this.innerProperties().withEnableAcceleratedNetworking(enableAcceleratedNetworking);
        return this;
    }

    /**
     * Get the enableFpga property: Specifies whether the network interface is FPGA networking-enabled.
     *
     * @return the enableFpga value.
     */
    public Boolean enableFpga() {
        return this.innerProperties() == null ? null : this.innerProperties().enableFpga();
    }

    /**
     * Set the enableFpga property: Specifies whether the network interface is FPGA networking-enabled.
     *
     * @param enableFpga the enableFpga value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration withEnableFpga(Boolean enableFpga) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetNetworkConfigurationProperties();
        }
        this.innerProperties().withEnableFpga(enableFpga);
        return this;
    }

    /**
     * Get the networkSecurityGroup property: The network security group.
     *
     * @return the networkSecurityGroup value.
     */
    public SubResource networkSecurityGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityGroup();
    }

    /**
     * Set the networkSecurityGroup property: The network security group.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetNetworkConfigurationProperties();
        }
        this.innerProperties().withNetworkSecurityGroup(networkSecurityGroup);
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the network interfaces.
     *
     * @return the dnsSettings value.
     */
    public VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsSettings();
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the network interfaces.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration withDnsSettings(
        VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetNetworkConfigurationProperties();
        }
        this.innerProperties().withDnsSettings(dnsSettings);
        return this;
    }

    /**
     * Get the ipConfigurations property: Specifies the IP configurations of the network interface.
     *
     * @return the ipConfigurations value.
     */
    public List<VirtualMachineScaleSetIpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: Specifies the IP configurations of the network interface.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration withIpConfigurations(
        List<VirtualMachineScaleSetIpConfiguration> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetNetworkConfigurationProperties();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     *
     * @return the enableIpForwarding value.
     */
    public Boolean enableIpForwarding() {
        return this.innerProperties() == null ? null : this.innerProperties().enableIpForwarding();
    }

    /**
     * Set the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     *
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration withEnableIpForwarding(Boolean enableIpForwarding) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetNetworkConfigurationProperties();
        }
        this.innerProperties().withEnableIpForwarding(enableIpForwarding);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model VirtualMachineScaleSetNetworkConfiguration"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
