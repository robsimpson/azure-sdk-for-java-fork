// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CancelEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DbServerMetadata;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LogicalReplicationOnSourceDbEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationMode;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationSecretParameters;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationStatus;
import com.azure.resourcemanager.postgresqlflexibleserver.models.OverwriteDbsInTargetEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.StartDataMigrationEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.TriggerCutoverEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Migration resource properties. */
@Fluent
public final class MigrationResourceProperties {
    /*
     * ID for migration, a GUID.
     */
    @JsonProperty(value = "migrationId", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationId;

    /*
     * Current status of migration
     */
    @JsonProperty(value = "currentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationStatus currentStatus;

    /*
     * There are two types of migration modes Online and Offline
     */
    @JsonProperty(value = "migrationMode")
    private MigrationMode migrationMode;

    /*
     * Metadata of the source database server
     */
    @JsonProperty(value = "sourceDbServerMetadata", access = JsonProperty.Access.WRITE_ONLY)
    private DbServerMetadata sourceDbServerMetadata;

    /*
     * Metadata of the target database server
     */
    @JsonProperty(value = "targetDbServerMetadata", access = JsonProperty.Access.WRITE_ONLY)
    private DbServerMetadata targetDbServerMetadata;

    /*
     * ResourceId of the source database server
     */
    @JsonProperty(value = "sourceDbServerResourceId")
    private String sourceDbServerResourceId;

    /*
     * Source server fully qualified domain name or ip. It is a optional value, if customer provide it, dms will always
     * use it for connection
     */
    @JsonProperty(value = "sourceDbServerFullyQualifiedDomainName")
    private String sourceDbServerFullyQualifiedDomainName;

    /*
     * ResourceId of the source database server
     */
    @JsonProperty(value = "targetDbServerResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetDbServerResourceId;

    /*
     * Target server fully qualified domain name or ip. It is a optional value, if customer provide it, dms will always
     * use it for connection
     */
    @JsonProperty(value = "targetDbServerFullyQualifiedDomainName")
    private String targetDbServerFullyQualifiedDomainName;

    /*
     * Migration secret parameters
     */
    @JsonProperty(value = "secretParameters")
    private MigrationSecretParameters secretParameters;

    /*
     * Number of databases to migrate
     */
    @JsonProperty(value = "dbsToMigrate")
    private List<String> dbsToMigrate;

    /*
     * Indicates whether to setup LogicalReplicationOnSourceDb, if needed
     */
    @JsonProperty(value = "setupLogicalReplicationOnSourceDbIfNeeded")
    private LogicalReplicationOnSourceDbEnum setupLogicalReplicationOnSourceDbIfNeeded;

    /*
     * Indicates whether the databases on the target server can be overwritten, if already present. If set to False,
     * the migration workflow will wait for a confirmation, if it detects that the database already exists.
     */
    @JsonProperty(value = "overwriteDbsInTarget")
    private OverwriteDbsInTargetEnum overwriteDbsInTarget;

    /*
     * Start time in UTC for migration window
     */
    @JsonProperty(value = "migrationWindowStartTimeInUtc")
    private OffsetDateTime migrationWindowStartTimeInUtc;

    /*
     * End time in UTC for migration window
     */
    @JsonProperty(value = "migrationWindowEndTimeInUtc")
    private OffsetDateTime migrationWindowEndTimeInUtc;

    /*
     * Indicates whether the data migration should start right away
     */
    @JsonProperty(value = "startDataMigration")
    private StartDataMigrationEnum startDataMigration;

    /*
     * To trigger cutover for entire migration we need to send this flag as True
     */
    @JsonProperty(value = "triggerCutover")
    private TriggerCutoverEnum triggerCutover;

    /*
     * When you want to trigger cutover for specific databases send triggerCutover flag as True and database names in
     * this array
     */
    @JsonProperty(value = "dbsToTriggerCutoverOn")
    private List<String> dbsToTriggerCutoverOn;

    /*
     * To trigger cancel for entire migration we need to send this flag as True
     */
    @JsonProperty(value = "cancel")
    private CancelEnum cancel;

    /*
     * When you want to trigger cancel for specific databases send cancel flag as True and database names in this array
     */
    @JsonProperty(value = "dbsToCancelMigrationOn")
    private List<String> dbsToCancelMigrationOn;

    /** Creates an instance of MigrationResourceProperties class. */
    public MigrationResourceProperties() {
    }

    /**
     * Get the migrationId property: ID for migration, a GUID.
     *
     * @return the migrationId value.
     */
    public String migrationId() {
        return this.migrationId;
    }

    /**
     * Get the currentStatus property: Current status of migration.
     *
     * @return the currentStatus value.
     */
    public MigrationStatus currentStatus() {
        return this.currentStatus;
    }

    /**
     * Get the migrationMode property: There are two types of migration modes Online and Offline.
     *
     * @return the migrationMode value.
     */
    public MigrationMode migrationMode() {
        return this.migrationMode;
    }

    /**
     * Set the migrationMode property: There are two types of migration modes Online and Offline.
     *
     * @param migrationMode the migrationMode value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withMigrationMode(MigrationMode migrationMode) {
        this.migrationMode = migrationMode;
        return this;
    }

    /**
     * Get the sourceDbServerMetadata property: Metadata of the source database server.
     *
     * @return the sourceDbServerMetadata value.
     */
    public DbServerMetadata sourceDbServerMetadata() {
        return this.sourceDbServerMetadata;
    }

    /**
     * Get the targetDbServerMetadata property: Metadata of the target database server.
     *
     * @return the targetDbServerMetadata value.
     */
    public DbServerMetadata targetDbServerMetadata() {
        return this.targetDbServerMetadata;
    }

    /**
     * Get the sourceDbServerResourceId property: ResourceId of the source database server.
     *
     * @return the sourceDbServerResourceId value.
     */
    public String sourceDbServerResourceId() {
        return this.sourceDbServerResourceId;
    }

    /**
     * Set the sourceDbServerResourceId property: ResourceId of the source database server.
     *
     * @param sourceDbServerResourceId the sourceDbServerResourceId value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withSourceDbServerResourceId(String sourceDbServerResourceId) {
        this.sourceDbServerResourceId = sourceDbServerResourceId;
        return this;
    }

    /**
     * Get the sourceDbServerFullyQualifiedDomainName property: Source server fully qualified domain name or ip. It is a
     * optional value, if customer provide it, dms will always use it for connection.
     *
     * @return the sourceDbServerFullyQualifiedDomainName value.
     */
    public String sourceDbServerFullyQualifiedDomainName() {
        return this.sourceDbServerFullyQualifiedDomainName;
    }

    /**
     * Set the sourceDbServerFullyQualifiedDomainName property: Source server fully qualified domain name or ip. It is a
     * optional value, if customer provide it, dms will always use it for connection.
     *
     * @param sourceDbServerFullyQualifiedDomainName the sourceDbServerFullyQualifiedDomainName value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withSourceDbServerFullyQualifiedDomainName(
        String sourceDbServerFullyQualifiedDomainName) {
        this.sourceDbServerFullyQualifiedDomainName = sourceDbServerFullyQualifiedDomainName;
        return this;
    }

    /**
     * Get the targetDbServerResourceId property: ResourceId of the source database server.
     *
     * @return the targetDbServerResourceId value.
     */
    public String targetDbServerResourceId() {
        return this.targetDbServerResourceId;
    }

    /**
     * Get the targetDbServerFullyQualifiedDomainName property: Target server fully qualified domain name or ip. It is a
     * optional value, if customer provide it, dms will always use it for connection.
     *
     * @return the targetDbServerFullyQualifiedDomainName value.
     */
    public String targetDbServerFullyQualifiedDomainName() {
        return this.targetDbServerFullyQualifiedDomainName;
    }

    /**
     * Set the targetDbServerFullyQualifiedDomainName property: Target server fully qualified domain name or ip. It is a
     * optional value, if customer provide it, dms will always use it for connection.
     *
     * @param targetDbServerFullyQualifiedDomainName the targetDbServerFullyQualifiedDomainName value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withTargetDbServerFullyQualifiedDomainName(
        String targetDbServerFullyQualifiedDomainName) {
        this.targetDbServerFullyQualifiedDomainName = targetDbServerFullyQualifiedDomainName;
        return this;
    }

    /**
     * Get the secretParameters property: Migration secret parameters.
     *
     * @return the secretParameters value.
     */
    public MigrationSecretParameters secretParameters() {
        return this.secretParameters;
    }

    /**
     * Set the secretParameters property: Migration secret parameters.
     *
     * @param secretParameters the secretParameters value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withSecretParameters(MigrationSecretParameters secretParameters) {
        this.secretParameters = secretParameters;
        return this;
    }

    /**
     * Get the dbsToMigrate property: Number of databases to migrate.
     *
     * @return the dbsToMigrate value.
     */
    public List<String> dbsToMigrate() {
        return this.dbsToMigrate;
    }

    /**
     * Set the dbsToMigrate property: Number of databases to migrate.
     *
     * @param dbsToMigrate the dbsToMigrate value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withDbsToMigrate(List<String> dbsToMigrate) {
        this.dbsToMigrate = dbsToMigrate;
        return this;
    }

    /**
     * Get the setupLogicalReplicationOnSourceDbIfNeeded property: Indicates whether to setup
     * LogicalReplicationOnSourceDb, if needed.
     *
     * @return the setupLogicalReplicationOnSourceDbIfNeeded value.
     */
    public LogicalReplicationOnSourceDbEnum setupLogicalReplicationOnSourceDbIfNeeded() {
        return this.setupLogicalReplicationOnSourceDbIfNeeded;
    }

    /**
     * Set the setupLogicalReplicationOnSourceDbIfNeeded property: Indicates whether to setup
     * LogicalReplicationOnSourceDb, if needed.
     *
     * @param setupLogicalReplicationOnSourceDbIfNeeded the setupLogicalReplicationOnSourceDbIfNeeded value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withSetupLogicalReplicationOnSourceDbIfNeeded(
        LogicalReplicationOnSourceDbEnum setupLogicalReplicationOnSourceDbIfNeeded) {
        this.setupLogicalReplicationOnSourceDbIfNeeded = setupLogicalReplicationOnSourceDbIfNeeded;
        return this;
    }

    /**
     * Get the overwriteDbsInTarget property: Indicates whether the databases on the target server can be overwritten,
     * if already present. If set to False, the migration workflow will wait for a confirmation, if it detects that the
     * database already exists.
     *
     * @return the overwriteDbsInTarget value.
     */
    public OverwriteDbsInTargetEnum overwriteDbsInTarget() {
        return this.overwriteDbsInTarget;
    }

    /**
     * Set the overwriteDbsInTarget property: Indicates whether the databases on the target server can be overwritten,
     * if already present. If set to False, the migration workflow will wait for a confirmation, if it detects that the
     * database already exists.
     *
     * @param overwriteDbsInTarget the overwriteDbsInTarget value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withOverwriteDbsInTarget(OverwriteDbsInTargetEnum overwriteDbsInTarget) {
        this.overwriteDbsInTarget = overwriteDbsInTarget;
        return this;
    }

    /**
     * Get the migrationWindowStartTimeInUtc property: Start time in UTC for migration window.
     *
     * @return the migrationWindowStartTimeInUtc value.
     */
    public OffsetDateTime migrationWindowStartTimeInUtc() {
        return this.migrationWindowStartTimeInUtc;
    }

    /**
     * Set the migrationWindowStartTimeInUtc property: Start time in UTC for migration window.
     *
     * @param migrationWindowStartTimeInUtc the migrationWindowStartTimeInUtc value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withMigrationWindowStartTimeInUtc(OffsetDateTime migrationWindowStartTimeInUtc) {
        this.migrationWindowStartTimeInUtc = migrationWindowStartTimeInUtc;
        return this;
    }

    /**
     * Get the migrationWindowEndTimeInUtc property: End time in UTC for migration window.
     *
     * @return the migrationWindowEndTimeInUtc value.
     */
    public OffsetDateTime migrationWindowEndTimeInUtc() {
        return this.migrationWindowEndTimeInUtc;
    }

    /**
     * Set the migrationWindowEndTimeInUtc property: End time in UTC for migration window.
     *
     * @param migrationWindowEndTimeInUtc the migrationWindowEndTimeInUtc value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withMigrationWindowEndTimeInUtc(OffsetDateTime migrationWindowEndTimeInUtc) {
        this.migrationWindowEndTimeInUtc = migrationWindowEndTimeInUtc;
        return this;
    }

    /**
     * Get the startDataMigration property: Indicates whether the data migration should start right away.
     *
     * @return the startDataMigration value.
     */
    public StartDataMigrationEnum startDataMigration() {
        return this.startDataMigration;
    }

    /**
     * Set the startDataMigration property: Indicates whether the data migration should start right away.
     *
     * @param startDataMigration the startDataMigration value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withStartDataMigration(StartDataMigrationEnum startDataMigration) {
        this.startDataMigration = startDataMigration;
        return this;
    }

    /**
     * Get the triggerCutover property: To trigger cutover for entire migration we need to send this flag as True.
     *
     * @return the triggerCutover value.
     */
    public TriggerCutoverEnum triggerCutover() {
        return this.triggerCutover;
    }

    /**
     * Set the triggerCutover property: To trigger cutover for entire migration we need to send this flag as True.
     *
     * @param triggerCutover the triggerCutover value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withTriggerCutover(TriggerCutoverEnum triggerCutover) {
        this.triggerCutover = triggerCutover;
        return this;
    }

    /**
     * Get the dbsToTriggerCutoverOn property: When you want to trigger cutover for specific databases send
     * triggerCutover flag as True and database names in this array.
     *
     * @return the dbsToTriggerCutoverOn value.
     */
    public List<String> dbsToTriggerCutoverOn() {
        return this.dbsToTriggerCutoverOn;
    }

    /**
     * Set the dbsToTriggerCutoverOn property: When you want to trigger cutover for specific databases send
     * triggerCutover flag as True and database names in this array.
     *
     * @param dbsToTriggerCutoverOn the dbsToTriggerCutoverOn value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withDbsToTriggerCutoverOn(List<String> dbsToTriggerCutoverOn) {
        this.dbsToTriggerCutoverOn = dbsToTriggerCutoverOn;
        return this;
    }

    /**
     * Get the cancel property: To trigger cancel for entire migration we need to send this flag as True.
     *
     * @return the cancel value.
     */
    public CancelEnum cancel() {
        return this.cancel;
    }

    /**
     * Set the cancel property: To trigger cancel for entire migration we need to send this flag as True.
     *
     * @param cancel the cancel value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withCancel(CancelEnum cancel) {
        this.cancel = cancel;
        return this;
    }

    /**
     * Get the dbsToCancelMigrationOn property: When you want to trigger cancel for specific databases send cancel flag
     * as True and database names in this array.
     *
     * @return the dbsToCancelMigrationOn value.
     */
    public List<String> dbsToCancelMigrationOn() {
        return this.dbsToCancelMigrationOn;
    }

    /**
     * Set the dbsToCancelMigrationOn property: When you want to trigger cancel for specific databases send cancel flag
     * as True and database names in this array.
     *
     * @param dbsToCancelMigrationOn the dbsToCancelMigrationOn value to set.
     * @return the MigrationResourceProperties object itself.
     */
    public MigrationResourceProperties withDbsToCancelMigrationOn(List<String> dbsToCancelMigrationOn) {
        this.dbsToCancelMigrationOn = dbsToCancelMigrationOn;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (currentStatus() != null) {
            currentStatus().validate();
        }
        if (sourceDbServerMetadata() != null) {
            sourceDbServerMetadata().validate();
        }
        if (targetDbServerMetadata() != null) {
            targetDbServerMetadata().validate();
        }
        if (secretParameters() != null) {
            secretParameters().validate();
        }
    }
}
