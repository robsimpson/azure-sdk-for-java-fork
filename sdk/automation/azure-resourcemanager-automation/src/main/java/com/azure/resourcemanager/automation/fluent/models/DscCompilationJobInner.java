// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.automation.models.DscConfigurationAssociationProperty;
import com.azure.resourcemanager.automation.models.JobProvisioningState;
import com.azure.resourcemanager.automation.models.JobStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/** Definition of the Dsc Compilation job. */
@Fluent
public final class DscCompilationJobInner extends ProxyResource {
    /*
     * Gets or sets the properties of the Dsc Compilation job.
     */
    @JsonProperty(value = "properties")
    private DscCompilationJobProperties innerProperties;

    /**
     * Get the innerProperties property: Gets or sets the properties of the Dsc Compilation job.
     *
     * @return the innerProperties value.
     */
    private DscCompilationJobProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the configuration property: Gets or sets the configuration.
     *
     * @return the configuration value.
     */
    public DscConfigurationAssociationProperty configuration() {
        return this.innerProperties() == null ? null : this.innerProperties().configuration();
    }

    /**
     * Set the configuration property: Gets or sets the configuration.
     *
     * @param configuration the configuration value to set.
     * @return the DscCompilationJobInner object itself.
     */
    public DscCompilationJobInner withConfiguration(DscConfigurationAssociationProperty configuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscCompilationJobProperties();
        }
        this.innerProperties().withConfiguration(configuration);
        return this;
    }

    /**
     * Get the startedBy property: Gets the compilation job started by.
     *
     * @return the startedBy value.
     */
    public String startedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().startedBy();
    }

    /**
     * Get the jobId property: Gets the id of the job.
     *
     * @return the jobId value.
     */
    public UUID jobId() {
        return this.innerProperties() == null ? null : this.innerProperties().jobId();
    }

    /**
     * Get the creationTime property: Gets the creation time of the job.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Get the provisioningState property: The current provisioning state of the job.
     *
     * @return the provisioningState value.
     */
    public JobProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The current provisioning state of the job.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the DscCompilationJobInner object itself.
     */
    public DscCompilationJobInner withProvisioningState(JobProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscCompilationJobProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the runOn property: Gets or sets the runOn which specifies the group name where the job is to be executed.
     *
     * @return the runOn value.
     */
    public String runOn() {
        return this.innerProperties() == null ? null : this.innerProperties().runOn();
    }

    /**
     * Set the runOn property: Gets or sets the runOn which specifies the group name where the job is to be executed.
     *
     * @param runOn the runOn value to set.
     * @return the DscCompilationJobInner object itself.
     */
    public DscCompilationJobInner withRunOn(String runOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscCompilationJobProperties();
        }
        this.innerProperties().withRunOn(runOn);
        return this;
    }

    /**
     * Get the status property: Gets or sets the status of the job.
     *
     * @return the status value.
     */
    public JobStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Gets or sets the status of the job.
     *
     * @param status the status value to set.
     * @return the DscCompilationJobInner object itself.
     */
    public DscCompilationJobInner withStatus(JobStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscCompilationJobProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the statusDetails property: Gets or sets the status details of the job.
     *
     * @return the statusDetails value.
     */
    public String statusDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().statusDetails();
    }

    /**
     * Set the statusDetails property: Gets or sets the status details of the job.
     *
     * @param statusDetails the statusDetails value to set.
     * @return the DscCompilationJobInner object itself.
     */
    public DscCompilationJobInner withStatusDetails(String statusDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscCompilationJobProperties();
        }
        this.innerProperties().withStatusDetails(statusDetails);
        return this;
    }

    /**
     * Get the startTime property: Gets the start time of the job.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Get the endTime property: Gets the end time of the job.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Get the exception property: Gets the exception of the job.
     *
     * @return the exception value.
     */
    public String exception() {
        return this.innerProperties() == null ? null : this.innerProperties().exception();
    }

    /**
     * Get the lastModifiedTime property: Gets the last modified time of the job.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Get the lastStatusModifiedTime property: Gets the last status modified time of the job.
     *
     * @return the lastStatusModifiedTime value.
     */
    public OffsetDateTime lastStatusModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastStatusModifiedTime();
    }

    /**
     * Get the parameters property: Gets or sets the parameters of the job.
     *
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: Gets or sets the parameters of the job.
     *
     * @param parameters the parameters value to set.
     * @return the DscCompilationJobInner object itself.
     */
    public DscCompilationJobInner withParameters(Map<String, String> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DscCompilationJobProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
