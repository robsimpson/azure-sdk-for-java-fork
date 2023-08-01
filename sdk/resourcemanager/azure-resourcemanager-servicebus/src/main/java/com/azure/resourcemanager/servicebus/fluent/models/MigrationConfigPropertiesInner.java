// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Single item in List or Get Migration Config operation. */
@Fluent
public final class MigrationConfigPropertiesInner extends ProxyResource {
    /*
     * Properties required to the Create Migration Configuration
     */
    @JsonProperty(value = "properties")
    private MigrationConfigPropertiesProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the innerProperties property: Properties required to the Create Migration Configuration.
     *
     * @return the innerProperties value.
     */
    private MigrationConfigPropertiesProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the provisioningState property: Provisioning state of Migration Configuration.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the pendingReplicationOperationsCount property: Number of entities pending to be replicated.
     *
     * @return the pendingReplicationOperationsCount value.
     */
    public Long pendingReplicationOperationsCount() {
        return this.innerProperties() == null ? null : this.innerProperties().pendingReplicationOperationsCount();
    }

    /**
     * Get the targetNamespace property: Existing premium Namespace ARM Id name which has no entities, will be used for
     * migration.
     *
     * @return the targetNamespace value.
     */
    public String targetNamespace() {
        return this.innerProperties() == null ? null : this.innerProperties().targetNamespace();
    }

    /**
     * Set the targetNamespace property: Existing premium Namespace ARM Id name which has no entities, will be used for
     * migration.
     *
     * @param targetNamespace the targetNamespace value to set.
     * @return the MigrationConfigPropertiesInner object itself.
     */
    public MigrationConfigPropertiesInner withTargetNamespace(String targetNamespace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationConfigPropertiesProperties();
        }
        this.innerProperties().withTargetNamespace(targetNamespace);
        return this;
    }

    /**
     * Get the postMigrationName property: Name to access Standard Namespace after migration.
     *
     * @return the postMigrationName value.
     */
    public String postMigrationName() {
        return this.innerProperties() == null ? null : this.innerProperties().postMigrationName();
    }

    /**
     * Set the postMigrationName property: Name to access Standard Namespace after migration.
     *
     * @param postMigrationName the postMigrationName value to set.
     * @return the MigrationConfigPropertiesInner object itself.
     */
    public MigrationConfigPropertiesInner withPostMigrationName(String postMigrationName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MigrationConfigPropertiesProperties();
        }
        this.innerProperties().withPostMigrationName(postMigrationName);
        return this;
    }

    /**
     * Get the migrationState property: State in which Standard to Premium Migration is, possible values : Unknown,
     * Reverting, Completing, Initiating, Syncing, Active.
     *
     * @return the migrationState value.
     */
    public String migrationState() {
        return this.innerProperties() == null ? null : this.innerProperties().migrationState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
