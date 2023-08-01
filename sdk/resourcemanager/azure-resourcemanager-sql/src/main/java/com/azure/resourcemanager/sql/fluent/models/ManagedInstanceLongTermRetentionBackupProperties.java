// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.sql.models.BackupStorageRedundancy;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of a long term retention backup. */
@Immutable
public final class ManagedInstanceLongTermRetentionBackupProperties {
    /*
     * The managed instance that the backup database belongs to.
     */
    @JsonProperty(value = "managedInstanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String managedInstanceName;

    /*
     * The create time of the instance.
     */
    @JsonProperty(value = "managedInstanceCreateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime managedInstanceCreateTime;

    /*
     * The name of the database the backup belong to
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The delete time of the database
     */
    @JsonProperty(value = "databaseDeletionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime databaseDeletionTime;

    /*
     * The time the backup was taken
     */
    @JsonProperty(value = "backupTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime backupTime;

    /*
     * The time the long term retention backup will expire.
     */
    @JsonProperty(value = "backupExpirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime backupExpirationTime;

    /*
     * The storage redundancy type of the backup
     */
    @JsonProperty(value = "backupStorageRedundancy", access = JsonProperty.Access.WRITE_ONLY)
    private BackupStorageRedundancy backupStorageRedundancy;

    /** Creates an instance of ManagedInstanceLongTermRetentionBackupProperties class. */
    public ManagedInstanceLongTermRetentionBackupProperties() {
    }

    /**
     * Get the managedInstanceName property: The managed instance that the backup database belongs to.
     *
     * @return the managedInstanceName value.
     */
    public String managedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * Get the managedInstanceCreateTime property: The create time of the instance.
     *
     * @return the managedInstanceCreateTime value.
     */
    public OffsetDateTime managedInstanceCreateTime() {
        return this.managedInstanceCreateTime;
    }

    /**
     * Get the databaseName property: The name of the database the backup belong to.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the databaseDeletionTime property: The delete time of the database.
     *
     * @return the databaseDeletionTime value.
     */
    public OffsetDateTime databaseDeletionTime() {
        return this.databaseDeletionTime;
    }

    /**
     * Get the backupTime property: The time the backup was taken.
     *
     * @return the backupTime value.
     */
    public OffsetDateTime backupTime() {
        return this.backupTime;
    }

    /**
     * Get the backupExpirationTime property: The time the long term retention backup will expire.
     *
     * @return the backupExpirationTime value.
     */
    public OffsetDateTime backupExpirationTime() {
        return this.backupExpirationTime;
    }

    /**
     * Get the backupStorageRedundancy property: The storage redundancy type of the backup.
     *
     * @return the backupStorageRedundancy value.
     */
    public BackupStorageRedundancy backupStorageRedundancy() {
        return this.backupStorageRedundancy;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
