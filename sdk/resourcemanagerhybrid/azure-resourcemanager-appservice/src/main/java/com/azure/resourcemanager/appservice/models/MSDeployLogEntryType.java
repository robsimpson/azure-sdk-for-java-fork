// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for MSDeployLogEntryType. */
public enum MSDeployLogEntryType {
    /** Enum value Message. */
    MESSAGE("Message"),

    /** Enum value Warning. */
    WARNING("Warning"),

    /** Enum value Error. */
    ERROR("Error");

    /** The actual serialized value for a MSDeployLogEntryType instance. */
    private final String value;

    MSDeployLogEntryType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MSDeployLogEntryType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MSDeployLogEntryType object, or null if unable to parse.
     */
    @JsonCreator
    public static MSDeployLogEntryType fromString(String value) {
        MSDeployLogEntryType[] items = MSDeployLogEntryType.values();
        for (MSDeployLogEntryType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
