// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.models.EnvironmentTypeEnableStatus;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import com.azure.resourcemanager.devcenter.models.UserRoleAssignmentValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents an environment type. */
@Fluent
public final class ProjectEnvironmentTypeInner extends ProxyResource {
    /*
     * Properties of an environment type.
     */
    @JsonProperty(value = "properties")
    private ProjectEnvironmentTypeProperties innerProperties;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Managed identity properties
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * The geo-location for the environment type
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ProjectEnvironmentTypeInner class. */
    public ProjectEnvironmentTypeInner() {
    }

    /**
     * Get the innerProperties property: Properties of an environment type.
     *
     * @return the innerProperties value.
     */
    private ProjectEnvironmentTypeProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the ProjectEnvironmentTypeInner object itself.
     */
    public ProjectEnvironmentTypeInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: Managed identity properties.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity properties.
     *
     * @param identity the identity value to set.
     * @return the ProjectEnvironmentTypeInner object itself.
     */
    public ProjectEnvironmentTypeInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the location property: The geo-location for the environment type.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location for the environment type.
     *
     * @param location the location value to set.
     * @return the ProjectEnvironmentTypeInner object itself.
     */
    public ProjectEnvironmentTypeInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentTargetId property: Id of a subscription that the environment type will be mapped to. The
     * environment's resources will be deployed into this subscription.
     *
     * @return the deploymentTargetId value.
     */
    public String deploymentTargetId() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentTargetId();
    }

    /**
     * Set the deploymentTargetId property: Id of a subscription that the environment type will be mapped to. The
     * environment's resources will be deployed into this subscription.
     *
     * @param deploymentTargetId the deploymentTargetId value to set.
     * @return the ProjectEnvironmentTypeInner object itself.
     */
    public ProjectEnvironmentTypeInner withDeploymentTargetId(String deploymentTargetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProjectEnvironmentTypeProperties();
        }
        this.innerProperties().withDeploymentTargetId(deploymentTargetId);
        return this;
    }

    /**
     * Get the status property: Defines whether this Environment Type can be used in this Project.
     *
     * @return the status value.
     */
    public EnvironmentTypeEnableStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Defines whether this Environment Type can be used in this Project.
     *
     * @param status the status value to set.
     * @return the ProjectEnvironmentTypeInner object itself.
     */
    public ProjectEnvironmentTypeInner withStatus(EnvironmentTypeEnableStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProjectEnvironmentTypeProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the creatorRoleAssignment property: The role definition assigned to the environment creator on backing
     * resources.
     *
     * @return the creatorRoleAssignment value.
     */
    public ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment creatorRoleAssignment() {
        return this.innerProperties() == null ? null : this.innerProperties().creatorRoleAssignment();
    }

    /**
     * Set the creatorRoleAssignment property: The role definition assigned to the environment creator on backing
     * resources.
     *
     * @param creatorRoleAssignment the creatorRoleAssignment value to set.
     * @return the ProjectEnvironmentTypeInner object itself.
     */
    public ProjectEnvironmentTypeInner withCreatorRoleAssignment(
        ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment creatorRoleAssignment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProjectEnvironmentTypeProperties();
        }
        this.innerProperties().withCreatorRoleAssignment(creatorRoleAssignment);
        return this;
    }

    /**
     * Get the userRoleAssignments property: Role Assignments created on environment backing resources. This is a
     * mapping from a user object ID to an object of role definition IDs.
     *
     * @return the userRoleAssignments value.
     */
    public Map<String, UserRoleAssignmentValue> userRoleAssignments() {
        return this.innerProperties() == null ? null : this.innerProperties().userRoleAssignments();
    }

    /**
     * Set the userRoleAssignments property: Role Assignments created on environment backing resources. This is a
     * mapping from a user object ID to an object of role definition IDs.
     *
     * @param userRoleAssignments the userRoleAssignments value to set.
     * @return the ProjectEnvironmentTypeInner object itself.
     */
    public ProjectEnvironmentTypeInner withUserRoleAssignments(
        Map<String, UserRoleAssignmentValue> userRoleAssignments) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProjectEnvironmentTypeProperties();
        }
        this.innerProperties().withUserRoleAssignments(userRoleAssignments);
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
        if (identity() != null) {
            identity().validate();
        }
    }
}
