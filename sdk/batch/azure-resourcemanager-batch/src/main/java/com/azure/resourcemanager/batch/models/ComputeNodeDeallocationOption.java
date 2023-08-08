// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Determines what to do with a node and its running task(s) after it has been selected for deallocation. */
public enum ComputeNodeDeallocationOption {
    /** Enum value Requeue. */
    REQUEUE("Requeue"),

    /** Enum value Terminate. */
    TERMINATE("Terminate"),

    /** Enum value TaskCompletion. */
    TASK_COMPLETION("TaskCompletion"),

    /** Enum value RetainedData. */
    RETAINED_DATA("RetainedData");

    /** The actual serialized value for a ComputeNodeDeallocationOption instance. */
    private final String value;

    ComputeNodeDeallocationOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComputeNodeDeallocationOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeNodeDeallocationOption object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeNodeDeallocationOption fromString(String value) {
        if (value == null) {
            return null;
        }
        ComputeNodeDeallocationOption[] items = ComputeNodeDeallocationOption.values();
        for (ComputeNodeDeallocationOption item : items) {
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
