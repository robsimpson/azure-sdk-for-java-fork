// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The request parameters for scheduling a run. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = RunRequest.class)
@JsonTypeName("RunRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DockerBuildRequest", value = DockerBuildRequest.class),
    @JsonSubTypes.Type(name = "FileTaskRunRequest", value = FileTaskRunRequest.class),
    @JsonSubTypes.Type(name = "TaskRunRequest", value = TaskRunRequest.class),
    @JsonSubTypes.Type(name = "EncodedTaskRunRequest", value = EncodedTaskRunRequest.class)
})
@Fluent
public class RunRequest {
    /*
     * The value that indicates whether archiving is enabled for the run or not.
     */
    @JsonProperty(value = "isArchiveEnabled")
    private Boolean isArchiveEnabled;

    /*
     * The dedicated agent pool for the run.
     */
    @JsonProperty(value = "agentPoolName")
    private String agentPoolName;

    /*
     * The template that describes the repository and tag information for run log artifact.
     */
    @JsonProperty(value = "logTemplate")
    private String logTemplate;

    /** Creates an instance of RunRequest class. */
    public RunRequest() {
    }

    /**
     * Get the isArchiveEnabled property: The value that indicates whether archiving is enabled for the run or not.
     *
     * @return the isArchiveEnabled value.
     */
    public Boolean isArchiveEnabled() {
        return this.isArchiveEnabled;
    }

    /**
     * Set the isArchiveEnabled property: The value that indicates whether archiving is enabled for the run or not.
     *
     * @param isArchiveEnabled the isArchiveEnabled value to set.
     * @return the RunRequest object itself.
     */
    public RunRequest withIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.isArchiveEnabled = isArchiveEnabled;
        return this;
    }

    /**
     * Get the agentPoolName property: The dedicated agent pool for the run.
     *
     * @return the agentPoolName value.
     */
    public String agentPoolName() {
        return this.agentPoolName;
    }

    /**
     * Set the agentPoolName property: The dedicated agent pool for the run.
     *
     * @param agentPoolName the agentPoolName value to set.
     * @return the RunRequest object itself.
     */
    public RunRequest withAgentPoolName(String agentPoolName) {
        this.agentPoolName = agentPoolName;
        return this;
    }

    /**
     * Get the logTemplate property: The template that describes the repository and tag information for run log
     * artifact.
     *
     * @return the logTemplate value.
     */
    public String logTemplate() {
        return this.logTemplate;
    }

    /**
     * Set the logTemplate property: The template that describes the repository and tag information for run log
     * artifact.
     *
     * @param logTemplate the logTemplate value to set.
     * @return the RunRequest object itself.
     */
    public RunRequest withLogTemplate(String logTemplate) {
        this.logTemplate = logTemplate;
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
