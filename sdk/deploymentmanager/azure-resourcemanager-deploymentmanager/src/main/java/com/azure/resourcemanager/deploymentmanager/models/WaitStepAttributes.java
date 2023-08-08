// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters for the wait step. */
@Fluent
public final class WaitStepAttributes {
    /*
     * The duration in ISO 8601 format of how long the wait should be.
     */
    @JsonProperty(value = "duration", required = true)
    private String duration;

    /** Creates an instance of WaitStepAttributes class. */
    public WaitStepAttributes() {
    }

    /**
     * Get the duration property: The duration in ISO 8601 format of how long the wait should be.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set the duration property: The duration in ISO 8601 format of how long the wait should be.
     *
     * @param duration the duration value to set.
     * @return the WaitStepAttributes object itself.
     */
    public WaitStepAttributes withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (duration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property duration in model WaitStepAttributes"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WaitStepAttributes.class);
}
