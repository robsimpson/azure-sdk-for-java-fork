// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Routes that matched. */
@Fluent
public final class MatchedRoute {
    /*
     * Properties of routes that matched
     */
    @JsonProperty(value = "properties")
    private RouteProperties properties;

    /** Creates an instance of MatchedRoute class. */
    public MatchedRoute() {
    }

    /**
     * Get the properties property: Properties of routes that matched.
     *
     * @return the properties value.
     */
    public RouteProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of routes that matched.
     *
     * @param properties the properties value to set.
     * @return the MatchedRoute object itself.
     */
    public MatchedRoute withProperties(RouteProperties properties) {
        this.properties = properties;
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
