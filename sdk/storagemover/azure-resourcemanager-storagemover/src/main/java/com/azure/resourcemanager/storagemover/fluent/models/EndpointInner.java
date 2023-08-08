// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagemover.models.EndpointBaseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Endpoint resource, which contains information about file sources and targets. */
@Fluent
public final class EndpointInner extends ProxyResource {
    /*
     * The resource specific properties for the Storage Mover resource.
     */
    @JsonProperty(value = "properties", required = true)
    private EndpointBaseProperties properties;

    /** Creates an instance of EndpointInner class. */
    public EndpointInner() {
    }

    /**
     * Get the properties property: The resource specific properties for the Storage Mover resource.
     *
     * @return the properties value.
     */
    public EndpointBaseProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource specific properties for the Storage Mover resource.
     *
     * @param properties the properties value to set.
     * @return the EndpointInner object itself.
     */
    public EndpointInner withProperties(EndpointBaseProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property properties in model EndpointInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EndpointInner.class);
}
