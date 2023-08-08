// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Pause replication input. */
@Fluent
public final class PauseReplicationInput {
    /*
     * Pause replication input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private PauseReplicationInputProperties properties;

    /** Creates an instance of PauseReplicationInput class. */
    public PauseReplicationInput() {
    }

    /**
     * Get the properties property: Pause replication input properties.
     *
     * @return the properties value.
     */
    public PauseReplicationInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Pause replication input properties.
     *
     * @param properties the properties value to set.
     * @return the PauseReplicationInput object itself.
     */
    public PauseReplicationInput withProperties(PauseReplicationInputProperties properties) {
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
                    new IllegalArgumentException(
                        "Missing required property properties in model PauseReplicationInput"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PauseReplicationInput.class);
}
