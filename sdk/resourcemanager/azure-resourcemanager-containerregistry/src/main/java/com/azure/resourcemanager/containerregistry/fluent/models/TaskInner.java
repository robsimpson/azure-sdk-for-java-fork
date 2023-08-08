// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.containerregistry.models.AgentProperties;
import com.azure.resourcemanager.containerregistry.models.Credentials;
import com.azure.resourcemanager.containerregistry.models.IdentityProperties;
import com.azure.resourcemanager.containerregistry.models.PlatformProperties;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.models.TaskStatus;
import com.azure.resourcemanager.containerregistry.models.TaskStepProperties;
import com.azure.resourcemanager.containerregistry.models.TriggerProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The task that has the ARM resource and task properties. The task will have all information to schedule a run against
 * it.
 */
@Fluent
public final class TaskInner extends Resource {
    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private IdentityProperties identity;

    /*
     * The properties of a task.
     */
    @JsonProperty(value = "properties")
    private TaskProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of TaskInner class. */
    public TaskInner() {
    }

    /**
     * Get the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    public IdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     *
     * @param identity the identity value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withIdentity(IdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of a task.
     *
     * @return the innerProperties value.
     */
    private TaskProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public TaskInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TaskInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the task.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the creationDate property: The creation date of task.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the status property: The current status of task.
     *
     * @return the status value.
     */
    public TaskStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The current status of task.
     *
     * @param status the status value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withStatus(TaskStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the platform property: The platform properties against which the run has to happen.
     *
     * @return the platform value.
     */
    public PlatformProperties platform() {
        return this.innerProperties() == null ? null : this.innerProperties().platform();
    }

    /**
     * Set the platform property: The platform properties against which the run has to happen.
     *
     * @param platform the platform value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withPlatform(PlatformProperties platform) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskProperties();
        }
        this.innerProperties().withPlatform(platform);
        return this;
    }

    /**
     * Get the agentConfiguration property: The machine configuration of the run agent.
     *
     * @return the agentConfiguration value.
     */
    public AgentProperties agentConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().agentConfiguration();
    }

    /**
     * Set the agentConfiguration property: The machine configuration of the run agent.
     *
     * @param agentConfiguration the agentConfiguration value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withAgentConfiguration(AgentProperties agentConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskProperties();
        }
        this.innerProperties().withAgentConfiguration(agentConfiguration);
        return this;
    }

    /**
     * Get the agentPoolName property: The dedicated agent pool for the task.
     *
     * @return the agentPoolName value.
     */
    public String agentPoolName() {
        return this.innerProperties() == null ? null : this.innerProperties().agentPoolName();
    }

    /**
     * Set the agentPoolName property: The dedicated agent pool for the task.
     *
     * @param agentPoolName the agentPoolName value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withAgentPoolName(String agentPoolName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskProperties();
        }
        this.innerProperties().withAgentPoolName(agentPoolName);
        return this;
    }

    /**
     * Get the timeout property: Run timeout in seconds.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.innerProperties() == null ? null : this.innerProperties().timeout();
    }

    /**
     * Set the timeout property: Run timeout in seconds.
     *
     * @param timeout the timeout value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withTimeout(Integer timeout) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskProperties();
        }
        this.innerProperties().withTimeout(timeout);
        return this;
    }

    /**
     * Get the step property: The properties of a task step.
     *
     * @return the step value.
     */
    public TaskStepProperties step() {
        return this.innerProperties() == null ? null : this.innerProperties().step();
    }

    /**
     * Set the step property: The properties of a task step.
     *
     * @param step the step value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withStep(TaskStepProperties step) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskProperties();
        }
        this.innerProperties().withStep(step);
        return this;
    }

    /**
     * Get the trigger property: The properties that describe all triggers for the task.
     *
     * @return the trigger value.
     */
    public TriggerProperties trigger() {
        return this.innerProperties() == null ? null : this.innerProperties().trigger();
    }

    /**
     * Set the trigger property: The properties that describe all triggers for the task.
     *
     * @param trigger the trigger value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withTrigger(TriggerProperties trigger) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskProperties();
        }
        this.innerProperties().withTrigger(trigger);
        return this;
    }

    /**
     * Get the credentials property: The properties that describes a set of credentials that will be used when this run
     * is invoked.
     *
     * @return the credentials value.
     */
    public Credentials credentials() {
        return this.innerProperties() == null ? null : this.innerProperties().credentials();
    }

    /**
     * Set the credentials property: The properties that describes a set of credentials that will be used when this run
     * is invoked.
     *
     * @param credentials the credentials value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withCredentials(Credentials credentials) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskProperties();
        }
        this.innerProperties().withCredentials(credentials);
        return this;
    }

    /**
     * Get the logTemplate property: The template that describes the repository and tag information for run log
     * artifact.
     *
     * @return the logTemplate value.
     */
    public String logTemplate() {
        return this.innerProperties() == null ? null : this.innerProperties().logTemplate();
    }

    /**
     * Set the logTemplate property: The template that describes the repository and tag information for run log
     * artifact.
     *
     * @param logTemplate the logTemplate value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withLogTemplate(String logTemplate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskProperties();
        }
        this.innerProperties().withLogTemplate(logTemplate);
        return this;
    }

    /**
     * Get the isSystemTask property: The value of this property indicates whether the task resource is system task or
     * not.
     *
     * @return the isSystemTask value.
     */
    public Boolean isSystemTask() {
        return this.innerProperties() == null ? null : this.innerProperties().isSystemTask();
    }

    /**
     * Set the isSystemTask property: The value of this property indicates whether the task resource is system task or
     * not.
     *
     * @param isSystemTask the isSystemTask value to set.
     * @return the TaskInner object itself.
     */
    public TaskInner withIsSystemTask(Boolean isSystemTask) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskProperties();
        }
        this.innerProperties().withIsSystemTask(isSystemTask);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
