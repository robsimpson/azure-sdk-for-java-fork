// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** VNet properties for managed integration runtime. */
@Fluent
public final class IntegrationRuntimeVNetProperties {
    /*
     * The ID of the VNet that this integration runtime will join.
     */
    @JsonProperty(value = "vNetId")
    private String vNetId;

    /*
     * The name of the subnet this integration runtime will join.
     */
    @JsonProperty(value = "subnet")
    private String subnet;

    /*
     * Resource IDs of the public IP addresses that this integration runtime will use.
     */
    @JsonProperty(value = "publicIPs")
    private List<String> publicIPs;

    /*
     * The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /*
     * VNet properties for managed integration runtime.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of IntegrationRuntimeVNetProperties class. */
    public IntegrationRuntimeVNetProperties() {
    }

    /**
     * Get the vNetId property: The ID of the VNet that this integration runtime will join.
     *
     * @return the vNetId value.
     */
    public String vNetId() {
        return this.vNetId;
    }

    /**
     * Set the vNetId property: The ID of the VNet that this integration runtime will join.
     *
     * @param vNetId the vNetId value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties withVNetId(String vNetId) {
        this.vNetId = vNetId;
        return this;
    }

    /**
     * Get the subnet property: The name of the subnet this integration runtime will join.
     *
     * @return the subnet value.
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The name of the subnet this integration runtime will join.
     *
     * @param subnet the subnet value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIPs property: Resource IDs of the public IP addresses that this integration runtime will use.
     *
     * @return the publicIPs value.
     */
    public List<String> publicIPs() {
        return this.publicIPs;
    }

    /**
     * Set the publicIPs property: Resource IDs of the public IP addresses that this integration runtime will use.
     *
     * @param publicIPs the publicIPs value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties withPublicIPs(List<String> publicIPs) {
        this.publicIPs = publicIPs;
        return this;
    }

    /**
     * Get the subnetId property: The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The ID of subnet, to which this Azure-SSIS integration runtime will be joined.
     *
     * @param subnetId the subnetId value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the additionalProperties property: VNet properties for managed integration runtime.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: VNet properties for managed integration runtime.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the IntegrationRuntimeVNetProperties object itself.
     */
    public IntegrationRuntimeVNetProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
