// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrincipalType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an Active Directory administrator. */
@Fluent
public final class AdministratorPropertiesForAdd {
    /*
     * The principal type used to represent the type of Active Directory Administrator.
     */
    @JsonProperty(value = "principalType")
    private PrincipalType principalType;

    /*
     * Active Directory administrator principal name.
     */
    @JsonProperty(value = "principalName")
    private String principalName;

    /*
     * The tenantId of the Active Directory administrator.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /** Creates an instance of AdministratorPropertiesForAdd class. */
    public AdministratorPropertiesForAdd() {
    }

    /**
     * Get the principalType property: The principal type used to represent the type of Active Directory Administrator.
     *
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.principalType;
    }

    /**
     * Set the principalType property: The principal type used to represent the type of Active Directory Administrator.
     *
     * @param principalType the principalType value to set.
     * @return the AdministratorPropertiesForAdd object itself.
     */
    public AdministratorPropertiesForAdd withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get the principalName property: Active Directory administrator principal name.
     *
     * @return the principalName value.
     */
    public String principalName() {
        return this.principalName;
    }

    /**
     * Set the principalName property: Active Directory administrator principal name.
     *
     * @param principalName the principalName value to set.
     * @return the AdministratorPropertiesForAdd object itself.
     */
    public AdministratorPropertiesForAdd withPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }

    /**
     * Get the tenantId property: The tenantId of the Active Directory administrator.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenantId of the Active Directory administrator.
     *
     * @param tenantId the tenantId value to set.
     * @return the AdministratorPropertiesForAdd object itself.
     */
    public AdministratorPropertiesForAdd withTenantId(String tenantId) {
        this.tenantId = tenantId;
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
