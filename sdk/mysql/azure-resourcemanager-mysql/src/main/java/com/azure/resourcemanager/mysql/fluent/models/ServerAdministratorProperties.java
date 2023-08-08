// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.models.AdministratorType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The properties of an server Administrator. */
@Fluent
public final class ServerAdministratorProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerAdministratorProperties.class);

    /*
     * The type of administrator.
     */
    @JsonProperty(value = "administratorType", required = true)
    private AdministratorType administratorType;

    /*
     * The server administrator login account name.
     */
    @JsonProperty(value = "login", required = true)
    private String login;

    /*
     * The server administrator Sid (Secure ID).
     */
    @JsonProperty(value = "sid", required = true)
    private UUID sid;

    /*
     * The server Active Directory Administrator tenant id.
     */
    @JsonProperty(value = "tenantId", required = true)
    private UUID tenantId;

    /**
     * Get the administratorType property: The type of administrator.
     *
     * @return the administratorType value.
     */
    public AdministratorType administratorType() {
        return this.administratorType;
    }

    /**
     * Set the administratorType property: The type of administrator.
     *
     * @param administratorType the administratorType value to set.
     * @return the ServerAdministratorProperties object itself.
     */
    public ServerAdministratorProperties withAdministratorType(AdministratorType administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get the login property: The server administrator login account name.
     *
     * @return the login value.
     */
    public String login() {
        return this.login;
    }

    /**
     * Set the login property: The server administrator login account name.
     *
     * @param login the login value to set.
     * @return the ServerAdministratorProperties object itself.
     */
    public ServerAdministratorProperties withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the sid property: The server administrator Sid (Secure ID).
     *
     * @return the sid value.
     */
    public UUID sid() {
        return this.sid;
    }

    /**
     * Set the sid property: The server administrator Sid (Secure ID).
     *
     * @param sid the sid value to set.
     * @return the ServerAdministratorProperties object itself.
     */
    public ServerAdministratorProperties withSid(UUID sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Get the tenantId property: The server Active Directory Administrator tenant id.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The server Active Directory Administrator tenant id.
     *
     * @param tenantId the tenantId value to set.
     * @return the ServerAdministratorProperties object itself.
     */
    public ServerAdministratorProperties withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (administratorType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property administratorType in model ServerAdministratorProperties"));
        }
        if (login() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property login in model ServerAdministratorProperties"));
        }
        if (sid() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sid in model ServerAdministratorProperties"));
        }
        if (tenantId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property tenantId in model ServerAdministratorProperties"));
        }
    }
}
