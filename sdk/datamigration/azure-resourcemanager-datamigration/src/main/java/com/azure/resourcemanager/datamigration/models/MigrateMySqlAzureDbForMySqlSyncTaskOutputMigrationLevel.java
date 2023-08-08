// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** The MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("MigrationLevelOutput")
@Immutable
public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel
    extends MigrateMySqlAzureDbForMySqlSyncTaskOutput {
    /*
     * Migration start time
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startedOn;

    /*
     * Migration end time
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endedOn;

    /*
     * Source server version
     */
    @JsonProperty(value = "sourceServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerVersion;

    /*
     * Source server name
     */
    @JsonProperty(value = "sourceServer", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServer;

    /*
     * Target server version
     */
    @JsonProperty(value = "targetServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerVersion;

    /*
     * Target server name
     */
    @JsonProperty(value = "targetServer", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServer;

    /** Creates an instance of MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel class. */
    public MigrateMySqlAzureDbForMySqlSyncTaskOutputMigrationLevel() {
    }

    /**
     * Get the startedOn property: Migration start time.
     *
     * @return the startedOn value.
     */
    public OffsetDateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get the endedOn property: Migration end time.
     *
     * @return the endedOn value.
     */
    public OffsetDateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get the sourceServerVersion property: Source server version.
     *
     * @return the sourceServerVersion value.
     */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Get the sourceServer property: Source server name.
     *
     * @return the sourceServer value.
     */
    public String sourceServer() {
        return this.sourceServer;
    }

    /**
     * Get the targetServerVersion property: Target server version.
     *
     * @return the targetServerVersion value.
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Get the targetServer property: Target server name.
     *
     * @return the targetServer value.
     */
    public String targetServer() {
        return this.targetServer;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
