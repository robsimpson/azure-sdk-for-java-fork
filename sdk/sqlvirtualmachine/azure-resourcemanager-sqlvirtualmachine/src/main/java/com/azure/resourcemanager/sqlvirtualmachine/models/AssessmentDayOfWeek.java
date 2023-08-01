// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Day of the week to run assessment. */
public enum AssessmentDayOfWeek {
    /** Enum value Monday. */
    MONDAY("Monday"),

    /** Enum value Tuesday. */
    TUESDAY("Tuesday"),

    /** Enum value Wednesday. */
    WEDNESDAY("Wednesday"),

    /** Enum value Thursday. */
    THURSDAY("Thursday"),

    /** Enum value Friday. */
    FRIDAY("Friday"),

    /** Enum value Saturday. */
    SATURDAY("Saturday"),

    /** Enum value Sunday. */
    SUNDAY("Sunday");

    /** The actual serialized value for a AssessmentDayOfWeek instance. */
    private final String value;

    AssessmentDayOfWeek(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AssessmentDayOfWeek instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AssessmentDayOfWeek object, or null if unable to parse.
     */
    @JsonCreator
    public static AssessmentDayOfWeek fromString(String value) {
        if (value == null) {
            return null;
        }
        AssessmentDayOfWeek[] items = AssessmentDayOfWeek.values();
        for (AssessmentDayOfWeek item : items) {
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
