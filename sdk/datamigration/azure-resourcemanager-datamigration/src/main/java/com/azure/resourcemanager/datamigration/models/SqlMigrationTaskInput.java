// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Base class for migration task input. */
@Fluent
public class SqlMigrationTaskInput {
    /*
     * Information for connecting to source
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private SqlConnectionInfo sourceConnectionInfo;

    /*
     * Information for connecting to target
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private SqlConnectionInfo targetConnectionInfo;

    /** Creates an instance of SqlMigrationTaskInput class. */
    public SqlMigrationTaskInput() {
    }

    /**
     * Get the sourceConnectionInfo property: Information for connecting to source.
     *
     * @return the sourceConnectionInfo value.
     */
    public SqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Information for connecting to source.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the SqlMigrationTaskInput object itself.
     */
    public SqlMigrationTaskInput withSourceConnectionInfo(SqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get the targetConnectionInfo property: Information for connecting to target.
     *
     * @return the targetConnectionInfo value.
     */
    public SqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Information for connecting to target.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the SqlMigrationTaskInput object itself.
     */
    public SqlMigrationTaskInput withTargetConnectionInfo(SqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceConnectionInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceConnectionInfo in model SqlMigrationTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
        if (targetConnectionInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model SqlMigrationTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SqlMigrationTaskInput.class);
}
