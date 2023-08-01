// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines a service unit. */
@Fluent
public final class ServiceUnit extends ServiceUnitProperties {
    /*
     * Name of the service unit.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Detailed step information, if present.
     */
    @JsonProperty(value = "steps")
    private List<RolloutStep> steps;

    /** Creates an instance of ServiceUnit class. */
    public ServiceUnit() {
    }

    /**
     * Get the name property: Name of the service unit.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the service unit.
     *
     * @param name the name value to set.
     * @return the ServiceUnit object itself.
     */
    public ServiceUnit withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the steps property: Detailed step information, if present.
     *
     * @return the steps value.
     */
    public List<RolloutStep> steps() {
        return this.steps;
    }

    /**
     * Set the steps property: Detailed step information, if present.
     *
     * @param steps the steps value to set.
     * @return the ServiceUnit object itself.
     */
    public ServiceUnit withSteps(List<RolloutStep> steps) {
        this.steps = steps;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceUnit withTargetResourceGroup(String targetResourceGroup) {
        super.withTargetResourceGroup(targetResourceGroup);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceUnit withDeploymentMode(DeploymentMode deploymentMode) {
        super.withDeploymentMode(deploymentMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceUnit withArtifacts(ServiceUnitArtifacts artifacts) {
        super.withArtifacts(artifacts);
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
        if (steps() != null) {
            steps().forEach(e -> e.validate());
        }
    }
}
