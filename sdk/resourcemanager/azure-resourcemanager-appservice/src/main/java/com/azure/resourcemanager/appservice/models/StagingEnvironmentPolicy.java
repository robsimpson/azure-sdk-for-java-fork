// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** State indicating whether staging environments are allowed or not allowed for a static web app. */
public enum StagingEnvironmentPolicy {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a StagingEnvironmentPolicy instance. */
    private final String value;

    StagingEnvironmentPolicy(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StagingEnvironmentPolicy instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StagingEnvironmentPolicy object, or null if unable to parse.
     */
    @JsonCreator
    public static StagingEnvironmentPolicy fromString(String value) {
        if (value == null) {
            return null;
        }
        StagingEnvironmentPolicy[] items = StagingEnvironmentPolicy.values();
        for (StagingEnvironmentPolicy item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
