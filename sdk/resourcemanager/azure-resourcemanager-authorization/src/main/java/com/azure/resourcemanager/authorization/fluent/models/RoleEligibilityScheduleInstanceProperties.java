// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.models.ExpandedProperties;
import com.azure.resourcemanager.authorization.models.MemberType;
import com.azure.resourcemanager.authorization.models.PrincipalType;
import com.azure.resourcemanager.authorization.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Role eligibility schedule properties with scope. */
@Fluent
public final class RoleEligibilityScheduleInstanceProperties {
    /*
     * The role eligibility schedule scope.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * The role definition ID.
     */
    @JsonProperty(value = "roleDefinitionId")
    private String roleDefinitionId;

    /*
     * The principal ID.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * The principal type of the assigned principal ID.
     */
    @JsonProperty(value = "principalType")
    private PrincipalType principalType;

    /*
     * Id of the master role eligibility schedule
     */
    @JsonProperty(value = "roleEligibilityScheduleId")
    private String roleEligibilityScheduleId;

    /*
     * The status of the role eligibility schedule instance
     */
    @JsonProperty(value = "status")
    private Status status;

    /*
     * The startDateTime of the role eligibility schedule instance
     */
    @JsonProperty(value = "startDateTime")
    private OffsetDateTime startDateTime;

    /*
     * The endDateTime of the role eligibility schedule instance
     */
    @JsonProperty(value = "endDateTime")
    private OffsetDateTime endDateTime;

    /*
     * Membership type of the role eligibility schedule
     */
    @JsonProperty(value = "memberType")
    private MemberType memberType;

    /*
     * The conditions on the role assignment. This limits the resources it can be assigned to. e.g.:
     * @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase
     * 'foo_storage_container'
     */
    @JsonProperty(value = "condition")
    private String condition;

    /*
     * Version of the condition. Currently accepted value is '2.0'
     */
    @JsonProperty(value = "conditionVersion")
    private String conditionVersion;

    /*
     * DateTime when role eligibility schedule was created
     */
    @JsonProperty(value = "createdOn")
    private OffsetDateTime createdOn;

    /*
     * Additional properties of principal, scope and role definition
     */
    @JsonProperty(value = "expandedProperties")
    private ExpandedProperties expandedProperties;

    /** Creates an instance of RoleEligibilityScheduleInstanceProperties class. */
    public RoleEligibilityScheduleInstanceProperties() {
    }

    /**
     * Get the scope property: The role eligibility schedule scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The role eligibility schedule scope.
     *
     * @param scope the scope value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the roleDefinitionId property: The role definition ID.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The role definition ID.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: The principal ID.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID.
     *
     * @param principalId the principalId value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the principalType property: The principal type of the assigned principal ID.
     *
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.principalType;
    }

    /**
     * Set the principalType property: The principal type of the assigned principal ID.
     *
     * @param principalType the principalType value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get the roleEligibilityScheduleId property: Id of the master role eligibility schedule.
     *
     * @return the roleEligibilityScheduleId value.
     */
    public String roleEligibilityScheduleId() {
        return this.roleEligibilityScheduleId;
    }

    /**
     * Set the roleEligibilityScheduleId property: Id of the master role eligibility schedule.
     *
     * @param roleEligibilityScheduleId the roleEligibilityScheduleId value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withRoleEligibilityScheduleId(String roleEligibilityScheduleId) {
        this.roleEligibilityScheduleId = roleEligibilityScheduleId;
        return this;
    }

    /**
     * Get the status property: The status of the role eligibility schedule instance.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the role eligibility schedule instance.
     *
     * @param status the status value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the startDateTime property: The startDateTime of the role eligibility schedule instance.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: The startDateTime of the role eligibility schedule instance.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the endDateTime property: The endDateTime of the role eligibility schedule instance.
     *
     * @return the endDateTime value.
     */
    public OffsetDateTime endDateTime() {
        return this.endDateTime;
    }

    /**
     * Set the endDateTime property: The endDateTime of the role eligibility schedule instance.
     *
     * @param endDateTime the endDateTime value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withEndDateTime(OffsetDateTime endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Get the memberType property: Membership type of the role eligibility schedule.
     *
     * @return the memberType value.
     */
    public MemberType memberType() {
        return this.memberType;
    }

    /**
     * Set the memberType property: Membership type of the role eligibility schedule.
     *
     * @param memberType the memberType value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withMemberType(MemberType memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * Get the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     *
     * @return the condition value.
     */
    public String condition() {
        return this.condition;
    }

    /**
     * Set the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     *
     * @param condition the condition value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @return the conditionVersion value.
     */
    public String conditionVersion() {
        return this.conditionVersion;
    }

    /**
     * Set the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @param conditionVersion the conditionVersion value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withConditionVersion(String conditionVersion) {
        this.conditionVersion = conditionVersion;
        return this;
    }

    /**
     * Get the createdOn property: DateTime when role eligibility schedule was created.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Set the createdOn property: DateTime when role eligibility schedule was created.
     *
     * @param createdOn the createdOn value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get the expandedProperties property: Additional properties of principal, scope and role definition.
     *
     * @return the expandedProperties value.
     */
    public ExpandedProperties expandedProperties() {
        return this.expandedProperties;
    }

    /**
     * Set the expandedProperties property: Additional properties of principal, scope and role definition.
     *
     * @param expandedProperties the expandedProperties value to set.
     * @return the RoleEligibilityScheduleInstanceProperties object itself.
     */
    public RoleEligibilityScheduleInstanceProperties withExpandedProperties(ExpandedProperties expandedProperties) {
        this.expandedProperties = expandedProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (expandedProperties() != null) {
            expandedProperties().validate();
        }
    }
}
