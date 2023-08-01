// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PathResourceType. */
public enum PathResourceType {
    /** Enum value directory. */
    DIRECTORY("directory"),

    /** Enum value file. */
    FILE("file");

    /** The actual serialized value for a PathResourceType instance. */
    private final String value;

    PathResourceType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PathResourceType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PathResourceType object, or null if unable to parse.
     */
    @JsonCreator
    public static PathResourceType fromString(String value) {
        if (value == null) {
            return null;
        }
        PathResourceType[] items = PathResourceType.values();
        for (PathResourceType item : items) {
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
