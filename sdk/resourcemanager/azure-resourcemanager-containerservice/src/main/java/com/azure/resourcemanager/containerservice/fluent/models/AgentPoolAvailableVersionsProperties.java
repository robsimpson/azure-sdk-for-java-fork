// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerservice.models.AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of available agent pool versions. */
@Fluent
public final class AgentPoolAvailableVersionsProperties {
    /*
     * List of versions available for agent pool.
     */
    @JsonProperty(value = "agentPoolVersions")
    private List<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> agentPoolVersions;

    /** Creates an instance of AgentPoolAvailableVersionsProperties class. */
    public AgentPoolAvailableVersionsProperties() {
    }

    /**
     * Get the agentPoolVersions property: List of versions available for agent pool.
     *
     * @return the agentPoolVersions value.
     */
    public List<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> agentPoolVersions() {
        return this.agentPoolVersions;
    }

    /**
     * Set the agentPoolVersions property: List of versions available for agent pool.
     *
     * @param agentPoolVersions the agentPoolVersions value to set.
     * @return the AgentPoolAvailableVersionsProperties object itself.
     */
    public AgentPoolAvailableVersionsProperties withAgentPoolVersions(
        List<AgentPoolAvailableVersionsPropertiesAgentPoolVersionsItem> agentPoolVersions) {
        this.agentPoolVersions = agentPoolVersions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (agentPoolVersions() != null) {
            agentPoolVersions().forEach(e -> e.validate());
        }
    }
}
