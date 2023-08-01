// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a cluster role. */
@Fluent
public final class RoleInner extends ProxyResource {
    /*
     * The properties of a role.
     */
    @JsonProperty(value = "properties", required = true)
    private RoleProperties innerProperties = new RoleProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of RoleInner class. */
    public RoleInner() {
    }

    /**
     * Get the innerProperties property: The properties of a role.
     *
     * @return the innerProperties value.
     */
    private RoleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the password property: The password of the cluster role.
     *
     * @return the password value.
     */
    public String password() {
        return this.innerProperties() == null ? null : this.innerProperties().password();
    }

    /**
     * Set the password property: The password of the cluster role.
     *
     * @param password the password value to set.
     * @return the RoleInner object itself.
     */
    public RoleInner withPassword(String password) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleProperties();
        }
        this.innerProperties().withPassword(password);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the role.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model RoleInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RoleInner.class);
}
