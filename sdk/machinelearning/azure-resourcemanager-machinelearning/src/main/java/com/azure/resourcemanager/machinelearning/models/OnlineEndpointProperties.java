// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.fluent.models.EndpointAuthKeysInner;
import com.azure.resourcemanager.machinelearning.fluent.models.EndpointPropertiesBaseInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Online endpoint configuration. */
@Fluent
public final class OnlineEndpointProperties extends EndpointPropertiesBaseInner {
    /*
     * ARM resource ID of the compute if it exists.
     * optional
     */
    @JsonProperty(value = "compute")
    private String compute;

    /*
     * Provisioning state for the endpoint.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EndpointProvisioningState provisioningState;

    /*
     * Set to "Enabled" for endpoints that should allow public access when Private Link is enabled.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccessType publicNetworkAccess;

    /*
     * Percentage of traffic from endpoint to divert to each deployment. Traffic values need to sum to 100.
     */
    @JsonProperty(value = "traffic")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Integer> traffic;

    /** Creates an instance of OnlineEndpointProperties class. */
    public OnlineEndpointProperties() {
    }

    /**
     * Get the compute property: ARM resource ID of the compute if it exists. optional.
     *
     * @return the compute value.
     */
    public String compute() {
        return this.compute;
    }

    /**
     * Set the compute property: ARM resource ID of the compute if it exists. optional.
     *
     * @param compute the compute value to set.
     * @return the OnlineEndpointProperties object itself.
     */
    public OnlineEndpointProperties withCompute(String compute) {
        this.compute = compute;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state for the endpoint.
     *
     * @return the provisioningState value.
     */
    public EndpointProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the publicNetworkAccess property: Set to "Enabled" for endpoints that should allow public access when Private
     * Link is enabled.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessType publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Set to "Enabled" for endpoints that should allow public access when Private
     * Link is enabled.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the OnlineEndpointProperties object itself.
     */
    public OnlineEndpointProperties withPublicNetworkAccess(PublicNetworkAccessType publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the traffic property: Percentage of traffic from endpoint to divert to each deployment. Traffic values need
     * to sum to 100.
     *
     * @return the traffic value.
     */
    public Map<String, Integer> traffic() {
        return this.traffic;
    }

    /**
     * Set the traffic property: Percentage of traffic from endpoint to divert to each deployment. Traffic values need
     * to sum to 100.
     *
     * @param traffic the traffic value to set.
     * @return the OnlineEndpointProperties object itself.
     */
    public OnlineEndpointProperties withTraffic(Map<String, Integer> traffic) {
        this.traffic = traffic;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OnlineEndpointProperties withAuthMode(EndpointAuthMode authMode) {
        super.withAuthMode(authMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OnlineEndpointProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OnlineEndpointProperties withKeys(EndpointAuthKeysInner keys) {
        super.withKeys(keys);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OnlineEndpointProperties withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
