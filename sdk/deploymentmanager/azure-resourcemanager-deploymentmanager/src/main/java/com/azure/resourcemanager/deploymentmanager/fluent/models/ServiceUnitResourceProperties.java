// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.deploymentmanager.models.DeploymentMode;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnitArtifacts;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnitProperties;

/** The properties that define the service unit. */
@Fluent
public final class ServiceUnitResourceProperties extends ServiceUnitProperties {
    /** Creates an instance of ServiceUnitResourceProperties class. */
    public ServiceUnitResourceProperties() {
    }

    /** {@inheritDoc} */
    @Override
    public ServiceUnitResourceProperties withTargetResourceGroup(String targetResourceGroup) {
        super.withTargetResourceGroup(targetResourceGroup);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceUnitResourceProperties withDeploymentMode(DeploymentMode deploymentMode) {
        super.withDeploymentMode(deploymentMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceUnitResourceProperties withArtifacts(ServiceUnitArtifacts artifacts) {
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
    }
}
