// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DatabaseConnectionPatchRequest resource specific properties. */
@Fluent
public final class DatabaseConnectionPatchRequestProperties {
    /*
     * The resource id of the database.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * If present, the identity is used in conjunction with connection string to connect to the database. Use of the
     * system-assigned managed identity is indicated with the string 'SystemAssigned', while use of a user-assigned
     * managed identity is indicated with the resource id of the managed identity resource.
     */
    @JsonProperty(value = "connectionIdentity")
    private String connectionIdentity;

    /*
     * The connection string to use to connect to the database.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * The region of the database resource.
     */
    @JsonProperty(value = "region")
    private String region;

    /** Creates an instance of DatabaseConnectionPatchRequestProperties class. */
    public DatabaseConnectionPatchRequestProperties() {
    }

    /**
     * Get the resourceId property: The resource id of the database.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource id of the database.
     *
     * @param resourceId the resourceId value to set.
     * @return the DatabaseConnectionPatchRequestProperties object itself.
     */
    public DatabaseConnectionPatchRequestProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the connectionIdentity property: If present, the identity is used in conjunction with connection string to
     * connect to the database. Use of the system-assigned managed identity is indicated with the string
     * 'SystemAssigned', while use of a user-assigned managed identity is indicated with the resource id of the managed
     * identity resource.
     *
     * @return the connectionIdentity value.
     */
    public String connectionIdentity() {
        return this.connectionIdentity;
    }

    /**
     * Set the connectionIdentity property: If present, the identity is used in conjunction with connection string to
     * connect to the database. Use of the system-assigned managed identity is indicated with the string
     * 'SystemAssigned', while use of a user-assigned managed identity is indicated with the resource id of the managed
     * identity resource.
     *
     * @param connectionIdentity the connectionIdentity value to set.
     * @return the DatabaseConnectionPatchRequestProperties object itself.
     */
    public DatabaseConnectionPatchRequestProperties withConnectionIdentity(String connectionIdentity) {
        this.connectionIdentity = connectionIdentity;
        return this;
    }

    /**
     * Get the connectionString property: The connection string to use to connect to the database.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string to use to connect to the database.
     *
     * @param connectionString the connectionString value to set.
     * @return the DatabaseConnectionPatchRequestProperties object itself.
     */
    public DatabaseConnectionPatchRequestProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the region property: The region of the database resource.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: The region of the database resource.
     *
     * @param region the region value to set.
     * @return the DatabaseConnectionPatchRequestProperties object itself.
     */
    public DatabaseConnectionPatchRequestProperties withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
