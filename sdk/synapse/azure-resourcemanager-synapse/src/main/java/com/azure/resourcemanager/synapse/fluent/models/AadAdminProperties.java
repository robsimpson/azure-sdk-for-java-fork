// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Workspace active directory administrator properties. */
@Fluent
public final class AadAdminProperties {
    /*
     * Tenant ID of the workspace active directory administrator
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * Login of the workspace active directory administrator
     */
    @JsonProperty(value = "login")
    private String login;

    /*
     * Workspace active directory administrator type
     */
    @JsonProperty(value = "administratorType")
    private String administratorType;

    /*
     * Object ID of the workspace active directory administrator
     */
    @JsonProperty(value = "sid")
    private String sid;

    /** Creates an instance of AadAdminProperties class. */
    public AadAdminProperties() {
    }

    /**
     * Get the tenantId property: Tenant ID of the workspace active directory administrator.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant ID of the workspace active directory administrator.
     *
     * @param tenantId the tenantId value to set.
     * @return the AadAdminProperties object itself.
     */
    public AadAdminProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the login property: Login of the workspace active directory administrator.
     *
     * @return the login value.
     */
    public String login() {
        return this.login;
    }

    /**
     * Set the login property: Login of the workspace active directory administrator.
     *
     * @param login the login value to set.
     * @return the AadAdminProperties object itself.
     */
    public AadAdminProperties withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the administratorType property: Workspace active directory administrator type.
     *
     * @return the administratorType value.
     */
    public String administratorType() {
        return this.administratorType;
    }

    /**
     * Set the administratorType property: Workspace active directory administrator type.
     *
     * @param administratorType the administratorType value to set.
     * @return the AadAdminProperties object itself.
     */
    public AadAdminProperties withAdministratorType(String administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get the sid property: Object ID of the workspace active directory administrator.
     *
     * @return the sid value.
     */
    public String sid() {
        return this.sid;
    }

    /**
     * Set the sid property: Object ID of the workspace active directory administrator.
     *
     * @param sid the sid value to set.
     * @return the AadAdminProperties object itself.
     */
    public AadAdminProperties withSid(String sid) {
        this.sid = sid;
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
