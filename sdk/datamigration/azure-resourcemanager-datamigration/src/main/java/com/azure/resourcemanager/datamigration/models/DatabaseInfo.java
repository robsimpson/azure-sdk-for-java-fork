// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Project Database Details. */
@Fluent
public final class DatabaseInfo {
    /*
     * Name of the database
     */
    @JsonProperty(value = "sourceDatabaseName", required = true)
    private String sourceDatabaseName;

    /** Creates an instance of DatabaseInfo class. */
    public DatabaseInfo() {
    }

    /**
     * Get the sourceDatabaseName property: Name of the database.
     *
     * @return the sourceDatabaseName value.
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Set the sourceDatabaseName property: Name of the database.
     *
     * @param sourceDatabaseName the sourceDatabaseName value to set.
     * @return the DatabaseInfo object itself.
     */
    public DatabaseInfo withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceDatabaseName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sourceDatabaseName in model DatabaseInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabaseInfo.class);
}
