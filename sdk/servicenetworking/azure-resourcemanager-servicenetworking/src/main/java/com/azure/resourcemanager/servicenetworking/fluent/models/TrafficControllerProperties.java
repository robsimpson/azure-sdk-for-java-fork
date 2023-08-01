// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.servicenetworking.models.ProvisioningState;
import com.azure.resourcemanager.servicenetworking.models.ResourceId;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Traffic Controller Properties. */
@Immutable
public final class TrafficControllerProperties {
    /*
     * Configuration Endpoints.
     */
    @JsonProperty(value = "configurationEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> configurationEndpoints;

    /*
     * Frontends References List
     */
    @JsonProperty(value = "frontends", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceId> frontends;

    /*
     * Associations References List
     */
    @JsonProperty(value = "associations", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceId> associations;

    /*
     * The status of the last operation.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of TrafficControllerProperties class. */
    public TrafficControllerProperties() {
    }

    /**
     * Get the configurationEndpoints property: Configuration Endpoints.
     *
     * @return the configurationEndpoints value.
     */
    public List<String> configurationEndpoints() {
        return this.configurationEndpoints;
    }

    /**
     * Get the frontends property: Frontends References List.
     *
     * @return the frontends value.
     */
    public List<ResourceId> frontends() {
        return this.frontends;
    }

    /**
     * Get the associations property: Associations References List.
     *
     * @return the associations value.
     */
    public List<ResourceId> associations() {
        return this.associations;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frontends() != null) {
            frontends().forEach(e -> e.validate());
        }
        if (associations() != null) {
            associations().forEach(e -> e.validate());
        }
    }
}
