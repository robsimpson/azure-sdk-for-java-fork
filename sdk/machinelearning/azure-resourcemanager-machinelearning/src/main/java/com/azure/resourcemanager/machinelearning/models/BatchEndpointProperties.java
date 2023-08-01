// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.fluent.models.EndpointAuthKeysInner;
import com.azure.resourcemanager.machinelearning.fluent.models.EndpointPropertiesBaseInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Batch endpoint configuration. */
@Fluent
public final class BatchEndpointProperties extends EndpointPropertiesBaseInner {
    /*
     * Default values for Batch Endpoint
     */
    @JsonProperty(value = "defaults")
    private BatchEndpointDefaults defaults;

    /*
     * Provisioning state for the endpoint.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EndpointProvisioningState provisioningState;

    /** Creates an instance of BatchEndpointProperties class. */
    public BatchEndpointProperties() {
    }

    /**
     * Get the defaults property: Default values for Batch Endpoint.
     *
     * @return the defaults value.
     */
    public BatchEndpointDefaults defaults() {
        return this.defaults;
    }

    /**
     * Set the defaults property: Default values for Batch Endpoint.
     *
     * @param defaults the defaults value to set.
     * @return the BatchEndpointProperties object itself.
     */
    public BatchEndpointProperties withDefaults(BatchEndpointDefaults defaults) {
        this.defaults = defaults;
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

    /** {@inheritDoc} */
    @Override
    public BatchEndpointProperties withAuthMode(EndpointAuthMode authMode) {
        super.withAuthMode(authMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BatchEndpointProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BatchEndpointProperties withKeys(EndpointAuthKeysInner keys) {
        super.withKeys(keys);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BatchEndpointProperties withProperties(Map<String, String> properties) {
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
        if (defaults() != null) {
            defaults().validate();
        }
    }
}
