// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the identity properties. */
@Fluent
public final class IdentityDetails {
    /*
     * The type of identity
     */
    @JsonProperty(value = "type")
    private IdentityType type;

    /*
     * Specifies the principal id for the identity for the job.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * Specifies the tenant id for the identity for the job.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /** Creates an instance of IdentityDetails class. */
    public IdentityDetails() {
    }

    /**
     * Get the type property: The type of identity.
     *
     * @return the type value.
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity.
     *
     * @param type the type value to set.
     * @return the IdentityDetails object itself.
     */
    public IdentityDetails withType(IdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: Specifies the principal id for the identity for the job.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: Specifies the tenant id for the identity for the job.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
