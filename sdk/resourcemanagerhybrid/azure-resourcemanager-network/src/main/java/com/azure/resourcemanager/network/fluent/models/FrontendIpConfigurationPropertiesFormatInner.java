// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of Frontend IP Configuration of the load balancer. */
@Fluent
public final class FrontendIpConfigurationPropertiesFormatInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(FrontendIpConfigurationPropertiesFormatInner.class);

    /*
     * Read only. Inbound rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "inboundNatRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundNatRules;

    /*
     * Read only. Inbound pools URIs that use this frontend IP.
     */
    @JsonProperty(value = "inboundNatPools", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundNatPools;

    /*
     * Read only. Outbound rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "outboundRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> outboundRules;

    /*
     * Gets load balancing rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "loadBalancingRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> loadBalancingRules;

    /*
     * The private IP address of the IP configuration.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIpAddress;

    /*
     * The Private IP allocation method. Possible values are: 'Static' and
     * 'Dynamic'.
     */
    @JsonProperty(value = "privateIPAllocationMethod")
    private IpAllocationMethod privateIpAllocationMethod;

    /*
     * The reference of the subnet resource.
     */
    @JsonProperty(value = "subnet")
    private SubnetInner subnet;

    /*
     * The reference of the Public IP resource.
     */
    @JsonProperty(value = "publicIPAddress")
    private PublicIpAddressInner publicIpAddress;

    /*
     * The reference of the Public IP Prefix resource.
     */
    @JsonProperty(value = "publicIPPrefix")
    private SubResource publicIpPrefix;

    /*
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the inboundNatRules property: Read only. Inbound rules URIs that use this frontend IP.
     *
     * @return the inboundNatRules value.
     */
    public List<SubResource> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Get the inboundNatPools property: Read only. Inbound pools URIs that use this frontend IP.
     *
     * @return the inboundNatPools value.
     */
    public List<SubResource> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Get the outboundRules property: Read only. Outbound rules URIs that use this frontend IP.
     *
     * @return the outboundRules value.
     */
    public List<SubResource> outboundRules() {
        return this.outboundRules;
    }

    /**
     * Get the loadBalancingRules property: Gets load balancing rules URIs that use this frontend IP.
     *
     * @return the loadBalancingRules value.
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Get the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the FrontendIpConfigurationPropertiesFormatInner object itself.
     */
    public FrontendIpConfigurationPropertiesFormatInner withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The Private IP allocation method. Possible values are: 'Static' and
     * 'Dynamic'.
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: The Private IP allocation method. Possible values are: 'Static' and
     * 'Dynamic'.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the FrontendIpConfigurationPropertiesFormatInner object itself.
     */
    public FrontendIpConfigurationPropertiesFormatInner withPrivateIpAllocationMethod(
        IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: The reference of the subnet resource.
     *
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The reference of the subnet resource.
     *
     * @param subnet the subnet value to set.
     * @return the FrontendIpConfigurationPropertiesFormatInner object itself.
     */
    public FrontendIpConfigurationPropertiesFormatInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIpAddress property: The reference of the Public IP resource.
     *
     * @return the publicIpAddress value.
     */
    public PublicIpAddressInner publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: The reference of the Public IP resource.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the FrontendIpConfigurationPropertiesFormatInner object itself.
     */
    public FrontendIpConfigurationPropertiesFormatInner withPublicIpAddress(PublicIpAddressInner publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the publicIpPrefix property: The reference of the Public IP Prefix resource.
     *
     * @return the publicIpPrefix value.
     */
    public SubResource publicIpPrefix() {
        return this.publicIpPrefix;
    }

    /**
     * Set the publicIpPrefix property: The reference of the Public IP Prefix resource.
     *
     * @param publicIpPrefix the publicIpPrefix value to set.
     * @return the FrontendIpConfigurationPropertiesFormatInner object itself.
     */
    public FrontendIpConfigurationPropertiesFormatInner withPublicIpPrefix(SubResource publicIpPrefix) {
        this.publicIpPrefix = publicIpPrefix;
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the FrontendIpConfigurationPropertiesFormatInner object itself.
     */
    public FrontendIpConfigurationPropertiesFormatInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
        if (publicIpAddress() != null) {
            publicIpAddress().validate();
        }
    }
}
