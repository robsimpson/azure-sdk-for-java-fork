// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Advance configuration for AKS networking. */
@Fluent
public final class AksNetworkingConfiguration {
    /*
     * Virtual network subnet resource ID the compute nodes belong to
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /*
     * A CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any Subnet IP
     * ranges.
     */
    @JsonProperty(value = "serviceCidr")
    private String serviceCidr;

    /*
     * An IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service address range
     * specified in serviceCidr.
     */
    @JsonProperty(value = "dnsServiceIP")
    private String dnsServiceIp;

    /*
     * A CIDR notation IP range assigned to the Docker bridge network. It must not overlap with any Subnet IP ranges or
     * the Kubernetes service address range.
     */
    @JsonProperty(value = "dockerBridgeCidr")
    private String dockerBridgeCidr;

    /** Creates an instance of AksNetworkingConfiguration class. */
    public AksNetworkingConfiguration() {
    }

    /**
     * Get the subnetId property: Virtual network subnet resource ID the compute nodes belong to.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: Virtual network subnet resource ID the compute nodes belong to.
     *
     * @param subnetId the subnetId value to set.
     * @return the AksNetworkingConfiguration object itself.
     */
    public AksNetworkingConfiguration withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the serviceCidr property: A CIDR notation IP range from which to assign service cluster IPs. It must not
     * overlap with any Subnet IP ranges.
     *
     * @return the serviceCidr value.
     */
    public String serviceCidr() {
        return this.serviceCidr;
    }

    /**
     * Set the serviceCidr property: A CIDR notation IP range from which to assign service cluster IPs. It must not
     * overlap with any Subnet IP ranges.
     *
     * @param serviceCidr the serviceCidr value to set.
     * @return the AksNetworkingConfiguration object itself.
     */
    public AksNetworkingConfiguration withServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }

    /**
     * Get the dnsServiceIp property: An IP address assigned to the Kubernetes DNS service. It must be within the
     * Kubernetes service address range specified in serviceCidr.
     *
     * @return the dnsServiceIp value.
     */
    public String dnsServiceIp() {
        return this.dnsServiceIp;
    }

    /**
     * Set the dnsServiceIp property: An IP address assigned to the Kubernetes DNS service. It must be within the
     * Kubernetes service address range specified in serviceCidr.
     *
     * @param dnsServiceIp the dnsServiceIp value to set.
     * @return the AksNetworkingConfiguration object itself.
     */
    public AksNetworkingConfiguration withDnsServiceIp(String dnsServiceIp) {
        this.dnsServiceIp = dnsServiceIp;
        return this;
    }

    /**
     * Get the dockerBridgeCidr property: A CIDR notation IP range assigned to the Docker bridge network. It must not
     * overlap with any Subnet IP ranges or the Kubernetes service address range.
     *
     * @return the dockerBridgeCidr value.
     */
    public String dockerBridgeCidr() {
        return this.dockerBridgeCidr;
    }

    /**
     * Set the dockerBridgeCidr property: A CIDR notation IP range assigned to the Docker bridge network. It must not
     * overlap with any Subnet IP ranges or the Kubernetes service address range.
     *
     * @param dockerBridgeCidr the dockerBridgeCidr value to set.
     * @return the AksNetworkingConfiguration object itself.
     */
    public AksNetworkingConfiguration withDockerBridgeCidr(String dockerBridgeCidr) {
        this.dockerBridgeCidr = dockerBridgeCidr;
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
