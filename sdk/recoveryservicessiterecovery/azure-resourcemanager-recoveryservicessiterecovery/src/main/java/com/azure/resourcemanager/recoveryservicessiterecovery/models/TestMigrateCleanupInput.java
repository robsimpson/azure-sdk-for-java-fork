// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input for test migrate cleanup. */
@Fluent
public final class TestMigrateCleanupInput {
    /*
     * Test migrate cleanup input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private TestMigrateCleanupInputProperties properties;

    /** Creates an instance of TestMigrateCleanupInput class. */
    public TestMigrateCleanupInput() {
    }

    /**
     * Get the properties property: Test migrate cleanup input properties.
     *
     * @return the properties value.
     */
    public TestMigrateCleanupInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Test migrate cleanup input properties.
     *
     * @param properties the properties value to set.
     * @return the TestMigrateCleanupInput object itself.
     */
    public TestMigrateCleanupInput withProperties(TestMigrateCleanupInputProperties properties) {
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
                        "Missing required property properties in model TestMigrateCleanupInput"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TestMigrateCleanupInput.class);
}
