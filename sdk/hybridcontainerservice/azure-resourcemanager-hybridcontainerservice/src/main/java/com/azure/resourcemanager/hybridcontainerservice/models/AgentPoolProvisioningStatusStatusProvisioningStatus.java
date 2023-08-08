// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains Provisioning errors. */
@Fluent
public final class AgentPoolProvisioningStatusStatusProvisioningStatus {
    /*
     * The error property.
     */
    @JsonProperty(value = "error")
    private AgentPoolProvisioningStatusError error;

    /*
     * The operationId property.
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /*
     * Phase represents the current phase of cluster actuation. E.g. Pending, Running, Terminating, Failed etc.
     */
    @JsonProperty(value = "phase")
    private String phase;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private String status;

    /** Creates an instance of AgentPoolProvisioningStatusStatusProvisioningStatus class. */
    public AgentPoolProvisioningStatusStatusProvisioningStatus() {
    }

    /**
     * Get the error property: The error property.
     *
     * @return the error value.
     */
    public AgentPoolProvisioningStatusError error() {
        return this.error;
    }

    /**
     * Set the error property: The error property.
     *
     * @param error the error value to set.
     * @return the AgentPoolProvisioningStatusStatusProvisioningStatus object itself.
     */
    public AgentPoolProvisioningStatusStatusProvisioningStatus withError(AgentPoolProvisioningStatusError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the operationId property: The operationId property.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The operationId property.
     *
     * @param operationId the operationId value to set.
     * @return the AgentPoolProvisioningStatusStatusProvisioningStatus object itself.
     */
    public AgentPoolProvisioningStatusStatusProvisioningStatus withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the phase property: Phase represents the current phase of cluster actuation. E.g. Pending, Running,
     * Terminating, Failed etc.
     *
     * @return the phase value.
     */
    public String phase() {
        return this.phase;
    }

    /**
     * Set the phase property: Phase represents the current phase of cluster actuation. E.g. Pending, Running,
     * Terminating, Failed etc.
     *
     * @param phase the phase value to set.
     * @return the AgentPoolProvisioningStatusStatusProvisioningStatus object itself.
     */
    public AgentPoolProvisioningStatusStatusProvisioningStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the AgentPoolProvisioningStatusStatusProvisioningStatus object itself.
     */
    public AgentPoolProvisioningStatusStatusProvisioningStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
    }
}
