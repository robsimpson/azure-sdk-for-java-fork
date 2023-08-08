// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.policyinsights.models.RemediationDeploymentSummary;
import com.azure.resourcemanager.policyinsights.models.RemediationFilters;
import com.azure.resourcemanager.policyinsights.models.RemediationPropertiesFailureThreshold;
import com.azure.resourcemanager.policyinsights.models.ResourceDiscoveryMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The remediation definition. */
@Fluent
public final class RemediationInner extends ProxyResource {
    /*
     * Properties for the remediation.
     */
    @JsonProperty(value = "properties")
    private RemediationProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of RemediationInner class. */
    public RemediationInner() {
    }

    /**
     * Get the innerProperties property: Properties for the remediation.
     *
     * @return the innerProperties value.
     */
    private RemediationProperties innerProperties() {
        return this.innerProperties;
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
     * Get the policyAssignmentId property: The resource ID of the policy assignment that should be remediated.
     *
     * @return the policyAssignmentId value.
     */
    public String policyAssignmentId() {
        return this.innerProperties() == null ? null : this.innerProperties().policyAssignmentId();
    }

    /**
     * Set the policyAssignmentId property: The resource ID of the policy assignment that should be remediated.
     *
     * @param policyAssignmentId the policyAssignmentId value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withPolicyAssignmentId(String policyAssignmentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemediationProperties();
        }
        this.innerProperties().withPolicyAssignmentId(policyAssignmentId);
        return this;
    }

    /**
     * Get the policyDefinitionReferenceId property: The policy definition reference ID of the individual definition
     * that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     *
     * @return the policyDefinitionReferenceId value.
     */
    public String policyDefinitionReferenceId() {
        return this.innerProperties() == null ? null : this.innerProperties().policyDefinitionReferenceId();
    }

    /**
     * Set the policyDefinitionReferenceId property: The policy definition reference ID of the individual definition
     * that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     *
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemediationProperties();
        }
        this.innerProperties().withPolicyDefinitionReferenceId(policyDefinitionReferenceId);
        return this;
    }

    /**
     * Get the resourceDiscoveryMode property: The way resources to remediate are discovered. Defaults to
     * ExistingNonCompliant if not specified.
     *
     * @return the resourceDiscoveryMode value.
     */
    public ResourceDiscoveryMode resourceDiscoveryMode() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceDiscoveryMode();
    }

    /**
     * Set the resourceDiscoveryMode property: The way resources to remediate are discovered. Defaults to
     * ExistingNonCompliant if not specified.
     *
     * @param resourceDiscoveryMode the resourceDiscoveryMode value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withResourceDiscoveryMode(ResourceDiscoveryMode resourceDiscoveryMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemediationProperties();
        }
        this.innerProperties().withResourceDiscoveryMode(resourceDiscoveryMode);
        return this;
    }

    /**
     * Get the provisioningState property: The status of the remediation.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the createdOn property: The time at which the remediation was created.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Get the lastUpdatedOn property: The time at which the remediation was last updated.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime lastUpdatedOn() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdatedOn();
    }

    /**
     * Get the filters property: The filters that will be applied to determine which resources to remediate.
     *
     * @return the filters value.
     */
    public RemediationFilters filters() {
        return this.innerProperties() == null ? null : this.innerProperties().filters();
    }

    /**
     * Set the filters property: The filters that will be applied to determine which resources to remediate.
     *
     * @param filters the filters value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withFilters(RemediationFilters filters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemediationProperties();
        }
        this.innerProperties().withFilters(filters);
        return this;
    }

    /**
     * Get the deploymentStatus property: The deployment status summary for all deployments created by the remediation.
     *
     * @return the deploymentStatus value.
     */
    public RemediationDeploymentSummary deploymentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentStatus();
    }

    /**
     * Get the statusMessage property: The remediation status message. Provides additional details regarding the state
     * of the remediation.
     *
     * @return the statusMessage value.
     */
    public String statusMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().statusMessage();
    }

    /**
     * Get the correlationId property: The remediation correlation Id. Can be used to find events related to the
     * remediation in the activity log.
     *
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.innerProperties() == null ? null : this.innerProperties().correlationId();
    }

    /**
     * Get the resourceCount property: Determines the max number of resources that can be remediated by the remediation
     * job. If not provided, the default resource count is used.
     *
     * @return the resourceCount value.
     */
    public Integer resourceCount() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceCount();
    }

    /**
     * Set the resourceCount property: Determines the max number of resources that can be remediated by the remediation
     * job. If not provided, the default resource count is used.
     *
     * @param resourceCount the resourceCount value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withResourceCount(Integer resourceCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemediationProperties();
        }
        this.innerProperties().withResourceCount(resourceCount);
        return this;
    }

    /**
     * Get the parallelDeployments property: Determines how many resources to remediate at any given time. Can be used
     * to increase or reduce the pace of the remediation. If not provided, the default parallel deployments value is
     * used.
     *
     * @return the parallelDeployments value.
     */
    public Integer parallelDeployments() {
        return this.innerProperties() == null ? null : this.innerProperties().parallelDeployments();
    }

    /**
     * Set the parallelDeployments property: Determines how many resources to remediate at any given time. Can be used
     * to increase or reduce the pace of the remediation. If not provided, the default parallel deployments value is
     * used.
     *
     * @param parallelDeployments the parallelDeployments value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withParallelDeployments(Integer parallelDeployments) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemediationProperties();
        }
        this.innerProperties().withParallelDeployments(parallelDeployments);
        return this;
    }

    /**
     * Get the failureThreshold property: The remediation failure threshold settings.
     *
     * @return the failureThreshold value.
     */
    public RemediationPropertiesFailureThreshold failureThreshold() {
        return this.innerProperties() == null ? null : this.innerProperties().failureThreshold();
    }

    /**
     * Set the failureThreshold property: The remediation failure threshold settings.
     *
     * @param failureThreshold the failureThreshold value to set.
     * @return the RemediationInner object itself.
     */
    public RemediationInner withFailureThreshold(RemediationPropertiesFailureThreshold failureThreshold) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RemediationProperties();
        }
        this.innerProperties().withFailureThreshold(failureThreshold);
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
