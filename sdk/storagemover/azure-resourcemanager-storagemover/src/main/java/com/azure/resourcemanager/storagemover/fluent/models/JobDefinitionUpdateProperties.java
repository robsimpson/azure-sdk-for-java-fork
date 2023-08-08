// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storagemover.models.CopyMode;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Job definition properties. */
@Fluent
public final class JobDefinitionUpdateProperties {
    /*
     * A description for the Job Definition.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Strategy to use for copy.
     */
    @JsonProperty(value = "copyMode")
    private CopyMode copyMode;

    /*
     * Name of the Agent to assign for new Job Runs of this Job Definition.
     */
    @JsonProperty(value = "agentName")
    private String agentName;

    /** Creates an instance of JobDefinitionUpdateProperties class. */
    public JobDefinitionUpdateProperties() {
    }

    /**
     * Get the description property: A description for the Job Definition.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for the Job Definition.
     *
     * @param description the description value to set.
     * @return the JobDefinitionUpdateProperties object itself.
     */
    public JobDefinitionUpdateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the copyMode property: Strategy to use for copy.
     *
     * @return the copyMode value.
     */
    public CopyMode copyMode() {
        return this.copyMode;
    }

    /**
     * Set the copyMode property: Strategy to use for copy.
     *
     * @param copyMode the copyMode value to set.
     * @return the JobDefinitionUpdateProperties object itself.
     */
    public JobDefinitionUpdateProperties withCopyMode(CopyMode copyMode) {
        this.copyMode = copyMode;
        return this;
    }

    /**
     * Get the agentName property: Name of the Agent to assign for new Job Runs of this Job Definition.
     *
     * @return the agentName value.
     */
    public String agentName() {
        return this.agentName;
    }

    /**
     * Set the agentName property: Name of the Agent to assign for new Job Runs of this Job Definition.
     *
     * @param agentName the agentName value to set.
     * @return the JobDefinitionUpdateProperties object itself.
     */
    public JobDefinitionUpdateProperties withAgentName(String agentName) {
        this.agentName = agentName;
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
