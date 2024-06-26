// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.models.WorkspaceStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Integration Runtime Operation Status Properties. */
@Fluent
public final class IntegrationRuntimeStopOperationStatusInner {
    /*
     * status of Start Integrationruntimes.
     */
    @JsonProperty(value = "status")
    private WorkspaceStatus status;

    /*
     * The operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The operation properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /*
     * The operation error message.
     */
    @JsonProperty(value = "error")
    private String error;

    /** Creates an instance of IntegrationRuntimeStopOperationStatusInner class. */
    public IntegrationRuntimeStopOperationStatusInner() {
    }

    /**
     * Get the status property: status of Start Integrationruntimes.
     *
     * @return the status value.
     */
    public WorkspaceStatus status() {
        return this.status;
    }

    /**
     * Set the status property: status of Start Integrationruntimes.
     *
     * @param status the status value to set.
     * @return the IntegrationRuntimeStopOperationStatusInner object itself.
     */
    public IntegrationRuntimeStopOperationStatusInner withStatus(WorkspaceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name property: The operation name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The operation name.
     *
     * @param name the name value to set.
     * @return the IntegrationRuntimeStopOperationStatusInner object itself.
     */
    public IntegrationRuntimeStopOperationStatusInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: The operation properties.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The operation properties.
     *
     * @param properties the properties value to set.
     * @return the IntegrationRuntimeStopOperationStatusInner object itself.
     */
    public IntegrationRuntimeStopOperationStatusInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the error property: The operation error message.
     *
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: The operation error message.
     *
     * @param error the error value to set.
     * @return the IntegrationRuntimeStopOperationStatusInner object itself.
     */
    public IntegrationRuntimeStopOperationStatusInner withError(String error) {
        this.error = error;
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
