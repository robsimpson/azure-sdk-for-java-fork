// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.apimanagement.fluent.models.BackendReconnectProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Reconnect request parameters. */
@Fluent
public final class BackendReconnectContract extends ProxyResource {
    /*
     * Reconnect request properties.
     */
    @JsonProperty(value = "properties")
    private BackendReconnectProperties innerProperties;

    /**
     * Get the innerProperties property: Reconnect request properties.
     *
     * @return the innerProperties value.
     */
    private BackendReconnectProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the after property: Duration in ISO8601 format after which reconnect will be initiated. Minimum duration of
     * the Reconnect is PT2M.
     *
     * @return the after value.
     */
    public Duration after() {
        return this.innerProperties() == null ? null : this.innerProperties().after();
    }

    /**
     * Set the after property: Duration in ISO8601 format after which reconnect will be initiated. Minimum duration of
     * the Reconnect is PT2M.
     *
     * @param after the after value to set.
     * @return the BackendReconnectContract object itself.
     */
    public BackendReconnectContract withAfter(Duration after) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackendReconnectProperties();
        }
        this.innerProperties().withAfter(after);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
