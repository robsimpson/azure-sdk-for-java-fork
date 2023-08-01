// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VwanInfo for Firewall Networking. */
@Fluent
public final class VwanConfiguration {
    /*
     * Network Virtual Appliance resource ID
     */
    @JsonProperty(value = "networkVirtualApplianceId")
    private String networkVirtualApplianceId;

    /*
     * vHub Address
     */
    @JsonProperty(value = "vHub", required = true)
    private IpAddressSpace vHub;

    /*
     * Trust Subnet
     */
    @JsonProperty(value = "trustSubnet")
    private IpAddressSpace trustSubnet;

    /*
     * Untrust Subnet
     */
    @JsonProperty(value = "unTrustSubnet")
    private IpAddressSpace unTrustSubnet;

    /*
     * IP of trust subnet for UDR
     */
    @JsonProperty(value = "ipOfTrustSubnetForUdr")
    private IpAddress ipOfTrustSubnetForUdr;

    /** Creates an instance of VwanConfiguration class. */
    public VwanConfiguration() {
    }

    /**
     * Get the networkVirtualApplianceId property: Network Virtual Appliance resource ID.
     *
     * @return the networkVirtualApplianceId value.
     */
    public String networkVirtualApplianceId() {
        return this.networkVirtualApplianceId;
    }

    /**
     * Set the networkVirtualApplianceId property: Network Virtual Appliance resource ID.
     *
     * @param networkVirtualApplianceId the networkVirtualApplianceId value to set.
     * @return the VwanConfiguration object itself.
     */
    public VwanConfiguration withNetworkVirtualApplianceId(String networkVirtualApplianceId) {
        this.networkVirtualApplianceId = networkVirtualApplianceId;
        return this;
    }

    /**
     * Get the vHub property: vHub Address.
     *
     * @return the vHub value.
     */
    public IpAddressSpace vHub() {
        return this.vHub;
    }

    /**
     * Set the vHub property: vHub Address.
     *
     * @param vHub the vHub value to set.
     * @return the VwanConfiguration object itself.
     */
    public VwanConfiguration withVHub(IpAddressSpace vHub) {
        this.vHub = vHub;
        return this;
    }

    /**
     * Get the trustSubnet property: Trust Subnet.
     *
     * @return the trustSubnet value.
     */
    public IpAddressSpace trustSubnet() {
        return this.trustSubnet;
    }

    /**
     * Set the trustSubnet property: Trust Subnet.
     *
     * @param trustSubnet the trustSubnet value to set.
     * @return the VwanConfiguration object itself.
     */
    public VwanConfiguration withTrustSubnet(IpAddressSpace trustSubnet) {
        this.trustSubnet = trustSubnet;
        return this;
    }

    /**
     * Get the unTrustSubnet property: Untrust Subnet.
     *
     * @return the unTrustSubnet value.
     */
    public IpAddressSpace unTrustSubnet() {
        return this.unTrustSubnet;
    }

    /**
     * Set the unTrustSubnet property: Untrust Subnet.
     *
     * @param unTrustSubnet the unTrustSubnet value to set.
     * @return the VwanConfiguration object itself.
     */
    public VwanConfiguration withUnTrustSubnet(IpAddressSpace unTrustSubnet) {
        this.unTrustSubnet = unTrustSubnet;
        return this;
    }

    /**
     * Get the ipOfTrustSubnetForUdr property: IP of trust subnet for UDR.
     *
     * @return the ipOfTrustSubnetForUdr value.
     */
    public IpAddress ipOfTrustSubnetForUdr() {
        return this.ipOfTrustSubnetForUdr;
    }

    /**
     * Set the ipOfTrustSubnetForUdr property: IP of trust subnet for UDR.
     *
     * @param ipOfTrustSubnetForUdr the ipOfTrustSubnetForUdr value to set.
     * @return the VwanConfiguration object itself.
     */
    public VwanConfiguration withIpOfTrustSubnetForUdr(IpAddress ipOfTrustSubnetForUdr) {
        this.ipOfTrustSubnetForUdr = ipOfTrustSubnetForUdr;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vHub() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property vHub in model VwanConfiguration"));
        } else {
            vHub().validate();
        }
        if (trustSubnet() != null) {
            trustSubnet().validate();
        }
        if (unTrustSubnet() != null) {
            unTrustSubnet().validate();
        }
        if (ipOfTrustSubnetForUdr() != null) {
            ipOfTrustSubnetForUdr().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VwanConfiguration.class);
}
