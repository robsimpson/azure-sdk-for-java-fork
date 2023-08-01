// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.SyncConflictResolutionPolicy;
import com.azure.resourcemanager.sql.models.SyncGroupSchema;
import com.azure.resourcemanager.sql.models.SyncGroupState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of a sync group. */
@Fluent
public final class SyncGroupProperties {
    /*
     * Sync interval of the sync group.
     */
    @JsonProperty(value = "interval")
    private Integer interval;

    /*
     * Last sync time of the sync group.
     */
    @JsonProperty(value = "lastSyncTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastSyncTime;

    /*
     * Conflict resolution policy of the sync group.
     */
    @JsonProperty(value = "conflictResolutionPolicy")
    private SyncConflictResolutionPolicy conflictResolutionPolicy;

    /*
     * ARM resource id of the sync database in the sync group.
     */
    @JsonProperty(value = "syncDatabaseId")
    private String syncDatabaseId;

    /*
     * User name for the sync group hub database credential.
     */
    @JsonProperty(value = "hubDatabaseUserName")
    private String hubDatabaseUsername;

    /*
     * Password for the sync group hub database credential.
     */
    @JsonProperty(value = "hubDatabasePassword")
    private String hubDatabasePassword;

    /*
     * Sync state of the sync group.
     */
    @JsonProperty(value = "syncState", access = JsonProperty.Access.WRITE_ONLY)
    private SyncGroupState syncState;

    /*
     * Sync schema of the sync group.
     */
    @JsonProperty(value = "schema")
    private SyncGroupSchema schema;

    /*
     * If conflict logging is enabled.
     */
    @JsonProperty(value = "enableConflictLogging")
    private Boolean enableConflictLogging;

    /*
     * Conflict logging retention period.
     */
    @JsonProperty(value = "conflictLoggingRetentionInDays")
    private Integer conflictLoggingRetentionInDays;

    /*
     * If use private link connection is enabled.
     */
    @JsonProperty(value = "usePrivateLinkConnection")
    private Boolean usePrivateLinkConnection;

    /*
     * Private endpoint name of the sync group if use private link connection is enabled.
     */
    @JsonProperty(value = "privateEndpointName", access = JsonProperty.Access.WRITE_ONLY)
    private String privateEndpointName;

    /** Creates an instance of SyncGroupProperties class. */
    public SyncGroupProperties() {
    }

    /**
     * Get the interval property: Sync interval of the sync group.
     *
     * @return the interval value.
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set the interval property: Sync interval of the sync group.
     *
     * @param interval the interval value to set.
     * @return the SyncGroupProperties object itself.
     */
    public SyncGroupProperties withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the lastSyncTime property: Last sync time of the sync group.
     *
     * @return the lastSyncTime value.
     */
    public OffsetDateTime lastSyncTime() {
        return this.lastSyncTime;
    }

    /**
     * Get the conflictResolutionPolicy property: Conflict resolution policy of the sync group.
     *
     * @return the conflictResolutionPolicy value.
     */
    public SyncConflictResolutionPolicy conflictResolutionPolicy() {
        return this.conflictResolutionPolicy;
    }

    /**
     * Set the conflictResolutionPolicy property: Conflict resolution policy of the sync group.
     *
     * @param conflictResolutionPolicy the conflictResolutionPolicy value to set.
     * @return the SyncGroupProperties object itself.
     */
    public SyncGroupProperties withConflictResolutionPolicy(SyncConflictResolutionPolicy conflictResolutionPolicy) {
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        return this;
    }

    /**
     * Get the syncDatabaseId property: ARM resource id of the sync database in the sync group.
     *
     * @return the syncDatabaseId value.
     */
    public String syncDatabaseId() {
        return this.syncDatabaseId;
    }

    /**
     * Set the syncDatabaseId property: ARM resource id of the sync database in the sync group.
     *
     * @param syncDatabaseId the syncDatabaseId value to set.
     * @return the SyncGroupProperties object itself.
     */
    public SyncGroupProperties withSyncDatabaseId(String syncDatabaseId) {
        this.syncDatabaseId = syncDatabaseId;
        return this;
    }

    /**
     * Get the hubDatabaseUsername property: User name for the sync group hub database credential.
     *
     * @return the hubDatabaseUsername value.
     */
    public String hubDatabaseUsername() {
        return this.hubDatabaseUsername;
    }

    /**
     * Set the hubDatabaseUsername property: User name for the sync group hub database credential.
     *
     * @param hubDatabaseUsername the hubDatabaseUsername value to set.
     * @return the SyncGroupProperties object itself.
     */
    public SyncGroupProperties withHubDatabaseUsername(String hubDatabaseUsername) {
        this.hubDatabaseUsername = hubDatabaseUsername;
        return this;
    }

    /**
     * Get the hubDatabasePassword property: Password for the sync group hub database credential.
     *
     * @return the hubDatabasePassword value.
     */
    public String hubDatabasePassword() {
        return this.hubDatabasePassword;
    }

    /**
     * Set the hubDatabasePassword property: Password for the sync group hub database credential.
     *
     * @param hubDatabasePassword the hubDatabasePassword value to set.
     * @return the SyncGroupProperties object itself.
     */
    public SyncGroupProperties withHubDatabasePassword(String hubDatabasePassword) {
        this.hubDatabasePassword = hubDatabasePassword;
        return this;
    }

    /**
     * Get the syncState property: Sync state of the sync group.
     *
     * @return the syncState value.
     */
    public SyncGroupState syncState() {
        return this.syncState;
    }

    /**
     * Get the schema property: Sync schema of the sync group.
     *
     * @return the schema value.
     */
    public SyncGroupSchema schema() {
        return this.schema;
    }

    /**
     * Set the schema property: Sync schema of the sync group.
     *
     * @param schema the schema value to set.
     * @return the SyncGroupProperties object itself.
     */
    public SyncGroupProperties withSchema(SyncGroupSchema schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the enableConflictLogging property: If conflict logging is enabled.
     *
     * @return the enableConflictLogging value.
     */
    public Boolean enableConflictLogging() {
        return this.enableConflictLogging;
    }

    /**
     * Set the enableConflictLogging property: If conflict logging is enabled.
     *
     * @param enableConflictLogging the enableConflictLogging value to set.
     * @return the SyncGroupProperties object itself.
     */
    public SyncGroupProperties withEnableConflictLogging(Boolean enableConflictLogging) {
        this.enableConflictLogging = enableConflictLogging;
        return this;
    }

    /**
     * Get the conflictLoggingRetentionInDays property: Conflict logging retention period.
     *
     * @return the conflictLoggingRetentionInDays value.
     */
    public Integer conflictLoggingRetentionInDays() {
        return this.conflictLoggingRetentionInDays;
    }

    /**
     * Set the conflictLoggingRetentionInDays property: Conflict logging retention period.
     *
     * @param conflictLoggingRetentionInDays the conflictLoggingRetentionInDays value to set.
     * @return the SyncGroupProperties object itself.
     */
    public SyncGroupProperties withConflictLoggingRetentionInDays(Integer conflictLoggingRetentionInDays) {
        this.conflictLoggingRetentionInDays = conflictLoggingRetentionInDays;
        return this;
    }

    /**
     * Get the usePrivateLinkConnection property: If use private link connection is enabled.
     *
     * @return the usePrivateLinkConnection value.
     */
    public Boolean usePrivateLinkConnection() {
        return this.usePrivateLinkConnection;
    }

    /**
     * Set the usePrivateLinkConnection property: If use private link connection is enabled.
     *
     * @param usePrivateLinkConnection the usePrivateLinkConnection value to set.
     * @return the SyncGroupProperties object itself.
     */
    public SyncGroupProperties withUsePrivateLinkConnection(Boolean usePrivateLinkConnection) {
        this.usePrivateLinkConnection = usePrivateLinkConnection;
        return this;
    }

    /**
     * Get the privateEndpointName property: Private endpoint name of the sync group if use private link connection is
     * enabled.
     *
     * @return the privateEndpointName value.
     */
    public String privateEndpointName() {
        return this.privateEndpointName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schema() != null) {
            schema().validate();
        }
    }
}
