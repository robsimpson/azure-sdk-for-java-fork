// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains information about orchestrator. */
@Fluent
public final class OrchestratorProfile {
    /*
     * Orchestrator type.
     */
    @JsonProperty(value = "orchestratorType")
    private String orchestratorType;

    /*
     * Orchestrator version (major, minor, patch).
     */
    @JsonProperty(value = "orchestratorVersion", required = true)
    private String orchestratorVersion;

    /*
     * Whether Kubernetes version is currently in preview.
     */
    @JsonProperty(value = "isPreview")
    private Boolean isPreview;

    /** Creates an instance of OrchestratorProfile class. */
    public OrchestratorProfile() {
    }

    /**
     * Get the orchestratorType property: Orchestrator type.
     *
     * @return the orchestratorType value.
     */
    public String orchestratorType() {
        return this.orchestratorType;
    }

    /**
     * Set the orchestratorType property: Orchestrator type.
     *
     * @param orchestratorType the orchestratorType value to set.
     * @return the OrchestratorProfile object itself.
     */
    public OrchestratorProfile withOrchestratorType(String orchestratorType) {
        this.orchestratorType = orchestratorType;
        return this;
    }

    /**
     * Get the orchestratorVersion property: Orchestrator version (major, minor, patch).
     *
     * @return the orchestratorVersion value.
     */
    public String orchestratorVersion() {
        return this.orchestratorVersion;
    }

    /**
     * Set the orchestratorVersion property: Orchestrator version (major, minor, patch).
     *
     * @param orchestratorVersion the orchestratorVersion value to set.
     * @return the OrchestratorProfile object itself.
     */
    public OrchestratorProfile withOrchestratorVersion(String orchestratorVersion) {
        this.orchestratorVersion = orchestratorVersion;
        return this;
    }

    /**
     * Get the isPreview property: Whether Kubernetes version is currently in preview.
     *
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: Whether Kubernetes version is currently in preview.
     *
     * @param isPreview the isPreview value to set.
     * @return the OrchestratorProfile object itself.
     */
    public OrchestratorProfile withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (orchestratorVersion() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property orchestratorVersion in model OrchestratorProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OrchestratorProfile.class);
}
