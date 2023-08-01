/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DescriptionExclude.
 */
public enum DescriptionExclude {
    /** Enum value Celebrities. */
    CELEBRITIES("Celebrities"),

    /** Enum value Landmarks. */
    LANDMARKS("Landmarks");

    /** The actual serialized value for a DescriptionExclude instance. */
    private String value;

    DescriptionExclude(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DescriptionExclude instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DescriptionExclude object, or null if unable to parse.
     */
    @JsonCreator
    public static DescriptionExclude fromString(String value) {
        DescriptionExclude[] items = DescriptionExclude.values();
        for (DescriptionExclude item : items) {
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
