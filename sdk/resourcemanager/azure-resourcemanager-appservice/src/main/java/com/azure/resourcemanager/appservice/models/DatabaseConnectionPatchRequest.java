// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.fluent.models.DatabaseConnectionPatchRequestProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Static Site Database Connection Request Properties resource when patching. */
@Fluent
public final class DatabaseConnectionPatchRequest {
    /*
     * DatabaseConnectionPatchRequest resource specific properties
     */
    @JsonProperty(value = "properties")
    private DatabaseConnectionPatchRequestProperties innerProperties;

    /** Creates an instance of DatabaseConnectionPatchRequest class. */
    public DatabaseConnectionPatchRequest() {
    }

    /**
     * Get the innerProperties property: DatabaseConnectionPatchRequest resource specific properties.
     *
     * @return the innerProperties value.
     */
    private DatabaseConnectionPatchRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resourceId property: The resource id of the database.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceId();
    }

    /**
     * Set the resourceId property: The resource id of the database.
     *
     * @param resourceId the resourceId value to set.
     * @return the DatabaseConnectionPatchRequest object itself.
     */
    public DatabaseConnectionPatchRequest withResourceId(String resourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseConnectionPatchRequestProperties();
        }
        this.innerProperties().withResourceId(resourceId);
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
        return this.innerProperties() == null ? null : this.innerProperties().connectionIdentity();
    }

    /**
     * Set the connectionIdentity property: If present, the identity is used in conjunction with connection string to
     * connect to the database. Use of the system-assigned managed identity is indicated with the string
     * 'SystemAssigned', while use of a user-assigned managed identity is indicated with the resource id of the managed
     * identity resource.
     *
     * @param connectionIdentity the connectionIdentity value to set.
     * @return the DatabaseConnectionPatchRequest object itself.
     */
    public DatabaseConnectionPatchRequest withConnectionIdentity(String connectionIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseConnectionPatchRequestProperties();
        }
        this.innerProperties().withConnectionIdentity(connectionIdentity);
        return this;
    }

    /**
     * Get the connectionString property: The connection string to use to connect to the database.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionString();
    }

    /**
     * Set the connectionString property: The connection string to use to connect to the database.
     *
     * @param connectionString the connectionString value to set.
     * @return the DatabaseConnectionPatchRequest object itself.
     */
    public DatabaseConnectionPatchRequest withConnectionString(String connectionString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseConnectionPatchRequestProperties();
        }
        this.innerProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the region property: The region of the database resource.
     *
     * @return the region value.
     */
    public String region() {
        return this.innerProperties() == null ? null : this.innerProperties().region();
    }

    /**
     * Set the region property: The region of the database resource.
     *
     * @param region the region value to set.
     * @return the DatabaseConnectionPatchRequest object itself.
     */
    public DatabaseConnectionPatchRequest withRegion(String region) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseConnectionPatchRequestProperties();
        }
        this.innerProperties().withRegion(region);
        return this;
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
