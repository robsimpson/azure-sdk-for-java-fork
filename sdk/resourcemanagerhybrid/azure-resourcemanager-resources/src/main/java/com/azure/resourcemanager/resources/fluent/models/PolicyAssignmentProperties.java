// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The policy assignment properties. */
@Fluent
public final class PolicyAssignmentProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyAssignmentProperties.class);

    /*
     * The display name of the policy assignment.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The ID of the policy definition.
     */
    @JsonProperty(value = "policyDefinitionId")
    private String policyDefinitionId;

    /*
     * The scope for the policy assignment.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * Required if a parameter is used in policy rule.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /*
     * This message will be part of response in case of policy violation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the displayName property: The display name of the policy assignment.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the policy assignment.
     *
     * @param displayName the displayName value to set.
     * @return the PolicyAssignmentProperties object itself.
     */
    public PolicyAssignmentProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the policyDefinitionId property: The ID of the policy definition.
     *
     * @return the policyDefinitionId value.
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the policyDefinitionId property: The ID of the policy definition.
     *
     * @param policyDefinitionId the policyDefinitionId value to set.
     * @return the PolicyAssignmentProperties object itself.
     */
    public PolicyAssignmentProperties withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get the scope property: The scope for the policy assignment.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope for the policy assignment.
     *
     * @param scope the scope value to set.
     * @return the PolicyAssignmentProperties object itself.
     */
    public PolicyAssignmentProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the parameters property: Required if a parameter is used in policy rule.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Required if a parameter is used in policy rule.
     *
     * @param parameters the parameters value to set.
     * @return the PolicyAssignmentProperties object itself.
     */
    public PolicyAssignmentProperties withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the description property: This message will be part of response in case of policy violation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: This message will be part of response in case of policy violation.
     *
     * @param description the description value to set.
     * @return the PolicyAssignmentProperties object itself.
     */
    public PolicyAssignmentProperties withDescription(String description) {
        this.description = description;
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
