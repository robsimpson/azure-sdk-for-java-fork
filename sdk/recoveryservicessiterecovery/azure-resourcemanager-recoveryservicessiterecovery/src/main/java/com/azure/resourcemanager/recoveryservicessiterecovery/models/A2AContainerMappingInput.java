// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A2A container mapping input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
@Fluent
public final class A2AContainerMappingInput extends ReplicationProviderSpecificContainerMappingInput {
    /*
     * A value indicating whether the auto update is enabled.
     */
    @JsonProperty(value = "agentAutoUpdateStatus")
    private AgentAutoUpdateStatus agentAutoUpdateStatus;

    /*
     * The automation account arm id.
     */
    @JsonProperty(value = "automationAccountArmId")
    private String automationAccountArmId;

    /*
     * A value indicating the type authentication to use for automation Account.
     */
    @JsonProperty(value = "automationAccountAuthenticationType")
    private AutomationAccountAuthenticationType automationAccountAuthenticationType;

    /** Creates an instance of A2AContainerMappingInput class. */
    public A2AContainerMappingInput() {
    }

    /**
     * Get the agentAutoUpdateStatus property: A value indicating whether the auto update is enabled.
     *
     * @return the agentAutoUpdateStatus value.
     */
    public AgentAutoUpdateStatus agentAutoUpdateStatus() {
        return this.agentAutoUpdateStatus;
    }

    /**
     * Set the agentAutoUpdateStatus property: A value indicating whether the auto update is enabled.
     *
     * @param agentAutoUpdateStatus the agentAutoUpdateStatus value to set.
     * @return the A2AContainerMappingInput object itself.
     */
    public A2AContainerMappingInput withAgentAutoUpdateStatus(AgentAutoUpdateStatus agentAutoUpdateStatus) {
        this.agentAutoUpdateStatus = agentAutoUpdateStatus;
        return this;
    }

    /**
     * Get the automationAccountArmId property: The automation account arm id.
     *
     * @return the automationAccountArmId value.
     */
    public String automationAccountArmId() {
        return this.automationAccountArmId;
    }

    /**
     * Set the automationAccountArmId property: The automation account arm id.
     *
     * @param automationAccountArmId the automationAccountArmId value to set.
     * @return the A2AContainerMappingInput object itself.
     */
    public A2AContainerMappingInput withAutomationAccountArmId(String automationAccountArmId) {
        this.automationAccountArmId = automationAccountArmId;
        return this;
    }

    /**
     * Get the automationAccountAuthenticationType property: A value indicating the type authentication to use for
     * automation Account.
     *
     * @return the automationAccountAuthenticationType value.
     */
    public AutomationAccountAuthenticationType automationAccountAuthenticationType() {
        return this.automationAccountAuthenticationType;
    }

    /**
     * Set the automationAccountAuthenticationType property: A value indicating the type authentication to use for
     * automation Account.
     *
     * @param automationAccountAuthenticationType the automationAccountAuthenticationType value to set.
     * @return the A2AContainerMappingInput object itself.
     */
    public A2AContainerMappingInput withAutomationAccountAuthenticationType(
        AutomationAccountAuthenticationType automationAccountAuthenticationType) {
        this.automationAccountAuthenticationType = automationAccountAuthenticationType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
