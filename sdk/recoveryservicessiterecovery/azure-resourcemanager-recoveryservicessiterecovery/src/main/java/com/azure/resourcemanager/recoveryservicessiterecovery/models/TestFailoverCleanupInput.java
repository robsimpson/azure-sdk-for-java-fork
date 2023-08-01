// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input definition for test failover cleanup. */
@Fluent
public final class TestFailoverCleanupInput {
    /*
     * Test failover cleanup input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private TestFailoverCleanupInputProperties properties;

    /** Creates an instance of TestFailoverCleanupInput class. */
    public TestFailoverCleanupInput() {
    }

    /**
     * Get the properties property: Test failover cleanup input properties.
     *
     * @return the properties value.
     */
    public TestFailoverCleanupInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Test failover cleanup input properties.
     *
     * @param properties the properties value to set.
     * @return the TestFailoverCleanupInput object itself.
     */
    public TestFailoverCleanupInput withProperties(TestFailoverCleanupInputProperties properties) {
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
                        "Missing required property properties in model TestFailoverCleanupInput"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TestFailoverCleanupInput.class);
}
