// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMappingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network Mapping model. Ideally it should have been possible to inherit this class from prev version in
 * InheritedModels as long as there is no difference in structure or method signature. Since there were no base Models
 * for certain fields and methods viz NetworkMappingProperties and Load with required return type, the class has been
 * introduced in its entirety with references to base models to facilitate extensions in subsequent versions.
 */
@Fluent
public final class NetworkMappingInner extends ProxyResource {
    /*
     * The Network Mapping Properties.
     */
    @JsonProperty(value = "properties")
    private NetworkMappingProperties properties;

    /*
     * Resource Location
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Creates an instance of NetworkMappingInner class.
     */
    public NetworkMappingInner() {
    }

    /**
     * Get the properties property: The Network Mapping Properties.
     * 
     * @return the properties value.
     */
    public NetworkMappingProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The Network Mapping Properties.
     * 
     * @param properties the properties value to set.
     * @return the NetworkMappingInner object itself.
     */
    public NetworkMappingInner withProperties(NetworkMappingProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the location property: Resource Location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     * 
     * @param location the location value to set.
     * @return the NetworkMappingInner object itself.
     */
    public NetworkMappingInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
