// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Operation type. */
public enum BackupRestoreOperationType {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value Clone. */
    CLONE("Clone"),

    /** Enum value Relocation. */
    RELOCATION("Relocation"),

    /** Enum value Snapshot. */
    SNAPSHOT("Snapshot"),

    /** Enum value CloudFS. */
    CLOUD_FS("CloudFS");

    /** The actual serialized value for a BackupRestoreOperationType instance. */
    private final String value;

    BackupRestoreOperationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a BackupRestoreOperationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed BackupRestoreOperationType object, or null if unable to parse.
     */
    @JsonCreator
    public static BackupRestoreOperationType fromString(String value) {
        if (value == null) {
            return null;
        }
        BackupRestoreOperationType[] items = BackupRestoreOperationType.values();
        for (BackupRestoreOperationType item : items) {
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
