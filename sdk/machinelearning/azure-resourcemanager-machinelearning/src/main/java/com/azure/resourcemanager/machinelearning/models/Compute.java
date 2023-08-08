// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** Machine Learning compute object. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "computeType",
    defaultImpl = Compute.class)
@JsonTypeName("Compute")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AKS", value = Aks.class),
    @JsonSubTypes.Type(name = "Kubernetes", value = Kubernetes.class),
    @JsonSubTypes.Type(name = "AmlCompute", value = AmlCompute.class),
    @JsonSubTypes.Type(name = "ComputeInstance", value = ComputeInstance.class),
    @JsonSubTypes.Type(name = "VirtualMachine", value = VirtualMachine.class),
    @JsonSubTypes.Type(name = "HDInsight", value = HDInsight.class),
    @JsonSubTypes.Type(name = "DataFactory", value = DataFactory.class),
    @JsonSubTypes.Type(name = "Databricks", value = Databricks.class),
    @JsonSubTypes.Type(name = "DataLakeAnalytics", value = DataLakeAnalytics.class),
    @JsonSubTypes.Type(name = "SynapseSpark", value = SynapseSpark.class)
})
@Fluent
public class Compute {
    /*
     * Location for the underlying compute
     */
    @JsonProperty(value = "computeLocation")
    private String computeLocation;

    /*
     * The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The description of the Machine Learning compute.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The time at which the compute was created.
     */
    @JsonProperty(value = "createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * The time at which the compute was last modified.
     */
    @JsonProperty(value = "modifiedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime modifiedOn;

    /*
     * ARM resource id of the underlying compute
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Errors during provisioning
     */
    @JsonProperty(value = "provisioningErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagementError> provisioningErrors;

    /*
     * Indicating whether the compute was provisioned by user and brought from outside if true, or machine learning
     * service provisioned it if false.
     */
    @JsonProperty(value = "isAttachedCompute", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAttachedCompute;

    /*
     * Opt-out of local authentication and ensure customers can use only MSI and AAD exclusively for authentication.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /** Creates an instance of Compute class. */
    public Compute() {
    }

    /**
     * Get the computeLocation property: Location for the underlying compute.
     *
     * @return the computeLocation value.
     */
    public String computeLocation() {
        return this.computeLocation;
    }

    /**
     * Set the computeLocation property: Location for the underlying compute.
     *
     * @param computeLocation the computeLocation value to set.
     * @return the Compute object itself.
     */
    public Compute withComputeLocation(String computeLocation) {
        this.computeLocation = computeLocation;
        return this;
    }

    /**
     * Get the provisioningState property: The provision state of the cluster. Valid values are Unknown, Updating,
     * Provisioning, Succeeded, and Failed.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the description property: The description of the Machine Learning compute.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the Machine Learning compute.
     *
     * @param description the description value to set.
     * @return the Compute object itself.
     */
    public Compute withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the createdOn property: The time at which the compute was created.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /**
     * Get the modifiedOn property: The time at which the compute was last modified.
     *
     * @return the modifiedOn value.
     */
    public OffsetDateTime modifiedOn() {
        return this.modifiedOn;
    }

    /**
     * Get the resourceId property: ARM resource id of the underlying compute.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: ARM resource id of the underlying compute.
     *
     * @param resourceId the resourceId value to set.
     * @return the Compute object itself.
     */
    public Compute withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the provisioningErrors property: Errors during provisioning.
     *
     * @return the provisioningErrors value.
     */
    public List<ManagementError> provisioningErrors() {
        return this.provisioningErrors;
    }

    /**
     * Get the isAttachedCompute property: Indicating whether the compute was provisioned by user and brought from
     * outside if true, or machine learning service provisioned it if false.
     *
     * @return the isAttachedCompute value.
     */
    public Boolean isAttachedCompute() {
        return this.isAttachedCompute;
    }

    /**
     * Get the disableLocalAuth property: Opt-out of local authentication and ensure customers can use only MSI and AAD
     * exclusively for authentication.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: Opt-out of local authentication and ensure customers can use only MSI and AAD
     * exclusively for authentication.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the Compute object itself.
     */
    public Compute withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
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
