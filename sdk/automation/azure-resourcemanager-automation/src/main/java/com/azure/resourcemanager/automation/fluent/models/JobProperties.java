// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.models.JobProvisioningState;
import com.azure.resourcemanager.automation.models.JobStatus;
import com.azure.resourcemanager.automation.models.RunbookAssociationProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/** Definition of job properties. */
@Fluent
public final class JobProperties {
    /*
     * Gets or sets the runbook.
     */
    @JsonProperty(value = "runbook")
    private RunbookAssociationProperty runbook;

    /*
     * Gets or sets the job started by.
     */
    @JsonProperty(value = "startedBy")
    private String startedBy;

    /*
     * Gets or sets the runOn which specifies the group name where the job is to be executed.
     */
    @JsonProperty(value = "runOn")
    private String runOn;

    /*
     * Gets or sets the id of the job.
     */
    @JsonProperty(value = "jobId")
    private UUID jobId;

    /*
     * Gets or sets the creation time of the job.
     */
    @JsonProperty(value = "creationTime")
    private OffsetDateTime creationTime;

    /*
     * Gets or sets the status of the job.
     */
    @JsonProperty(value = "status")
    private JobStatus status;

    /*
     * Gets or sets the status details of the job.
     */
    @JsonProperty(value = "statusDetails")
    private String statusDetails;

    /*
     * Gets or sets the start time of the job.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * Gets or sets the end time of the job.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * Gets or sets the exception of the job.
     */
    @JsonProperty(value = "exception")
    private String exception;

    /*
     * Gets or sets the last modified time of the job.
     */
    @JsonProperty(value = "lastModifiedTime")
    private OffsetDateTime lastModifiedTime;

    /*
     * Gets or sets the last status modified time of the job.
     */
    @JsonProperty(value = "lastStatusModifiedTime")
    private OffsetDateTime lastStatusModifiedTime;

    /*
     * Gets or sets the parameters of the job.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> parameters;

    /*
     * The current provisioning state of the job.
     */
    @JsonProperty(value = "provisioningState")
    private JobProvisioningState provisioningState;

    /**
     * Get the runbook property: Gets or sets the runbook.
     *
     * @return the runbook value.
     */
    public RunbookAssociationProperty runbook() {
        return this.runbook;
    }

    /**
     * Set the runbook property: Gets or sets the runbook.
     *
     * @param runbook the runbook value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withRunbook(RunbookAssociationProperty runbook) {
        this.runbook = runbook;
        return this;
    }

    /**
     * Get the startedBy property: Gets or sets the job started by.
     *
     * @return the startedBy value.
     */
    public String startedBy() {
        return this.startedBy;
    }

    /**
     * Set the startedBy property: Gets or sets the job started by.
     *
     * @param startedBy the startedBy value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withStartedBy(String startedBy) {
        this.startedBy = startedBy;
        return this;
    }

    /**
     * Get the runOn property: Gets or sets the runOn which specifies the group name where the job is to be executed.
     *
     * @return the runOn value.
     */
    public String runOn() {
        return this.runOn;
    }

    /**
     * Set the runOn property: Gets or sets the runOn which specifies the group name where the job is to be executed.
     *
     * @param runOn the runOn value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withRunOn(String runOn) {
        this.runOn = runOn;
        return this;
    }

    /**
     * Get the jobId property: Gets or sets the id of the job.
     *
     * @return the jobId value.
     */
    public UUID jobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: Gets or sets the id of the job.
     *
     * @param jobId the jobId value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withJobId(UUID jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the creationTime property: Gets or sets the creation time of the job.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: Gets or sets the creation time of the job.
     *
     * @param creationTime the creationTime value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the status property: Gets or sets the status of the job.
     *
     * @return the status value.
     */
    public JobStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Gets or sets the status of the job.
     *
     * @param status the status value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withStatus(JobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusDetails property: Gets or sets the status details of the job.
     *
     * @return the statusDetails value.
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Set the statusDetails property: Gets or sets the status details of the job.
     *
     * @param statusDetails the statusDetails value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * Get the startTime property: Gets or sets the start time of the job.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Gets or sets the start time of the job.
     *
     * @param startTime the startTime value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Gets or sets the end time of the job.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Gets or sets the end time of the job.
     *
     * @param endTime the endTime value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the exception property: Gets or sets the exception of the job.
     *
     * @return the exception value.
     */
    public String exception() {
        return this.exception;
    }

    /**
     * Set the exception property: Gets or sets the exception of the job.
     *
     * @param exception the exception value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withException(String exception) {
        this.exception = exception;
        return this;
    }

    /**
     * Get the lastModifiedTime property: Gets or sets the last modified time of the job.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime property: Gets or sets the last modified time of the job.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get the lastStatusModifiedTime property: Gets or sets the last status modified time of the job.
     *
     * @return the lastStatusModifiedTime value.
     */
    public OffsetDateTime lastStatusModifiedTime() {
        return this.lastStatusModifiedTime;
    }

    /**
     * Set the lastStatusModifiedTime property: Gets or sets the last status modified time of the job.
     *
     * @param lastStatusModifiedTime the lastStatusModifiedTime value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withLastStatusModifiedTime(OffsetDateTime lastStatusModifiedTime) {
        this.lastStatusModifiedTime = lastStatusModifiedTime;
        return this;
    }

    /**
     * Get the parameters property: Gets or sets the parameters of the job.
     *
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Gets or sets the parameters of the job.
     *
     * @param parameters the parameters value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the provisioningState property: The current provisioning state of the job.
     *
     * @return the provisioningState value.
     */
    public JobProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The current provisioning state of the job.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withProvisioningState(JobProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (runbook() != null) {
            runbook().validate();
        }
    }
}
