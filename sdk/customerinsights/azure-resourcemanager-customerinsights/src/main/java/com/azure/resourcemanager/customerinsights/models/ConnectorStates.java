// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** State of connector. */
public enum ConnectorStates {
    /** Enum value Creating. */
    CREATING("Creating"),

    /** Enum value Created. */
    CREATED("Created"),

    /** Enum value Ready. */
    READY("Ready"),

    /** Enum value Expiring. */
    EXPIRING("Expiring"),

    /** Enum value Deleting. */
    DELETING("Deleting"),

    /** Enum value Failed. */
    FAILED("Failed");

    /** The actual serialized value for a ConnectorStates instance. */
    private final String value;

    ConnectorStates(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ConnectorStates instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ConnectorStates object, or null if unable to parse.
     */
    @JsonCreator
    public static ConnectorStates fromString(String value) {
        if (value == null) {
            return null;
        }
        ConnectorStates[] items = ConnectorStates.values();
        for (ConnectorStates item : items) {
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
