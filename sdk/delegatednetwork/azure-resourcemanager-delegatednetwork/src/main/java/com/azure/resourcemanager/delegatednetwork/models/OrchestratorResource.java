// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents an instance of a resource. */
@Fluent
public class OrchestratorResource extends Resource {
    /*
     * The kind of workbook. Choices are user and shared.
     */
    @JsonProperty(value = "kind", required = true)
    private OrchestratorKind kind;

    /*
     * The identity of the orchestrator
     */
    @JsonProperty(value = "identity")
    private OrchestratorIdentity identity;

    /** Creates an instance of OrchestratorResource class. */
    public OrchestratorResource() {
    }

    /**
     * Get the kind property: The kind of workbook. Choices are user and shared.
     *
     * @return the kind value.
     */
    public OrchestratorKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of workbook. Choices are user and shared.
     *
     * @param kind the kind value to set.
     * @return the OrchestratorResource object itself.
     */
    public OrchestratorResource withKind(OrchestratorKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the identity property: The identity of the orchestrator.
     *
     * @return the identity value.
     */
    public OrchestratorIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the orchestrator.
     *
     * @param identity the identity value to set.
     * @return the OrchestratorResource object itself.
     */
    public OrchestratorResource withIdentity(OrchestratorIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrchestratorResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrchestratorResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kind() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property kind in model OrchestratorResource"));
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OrchestratorResource.class);
}
