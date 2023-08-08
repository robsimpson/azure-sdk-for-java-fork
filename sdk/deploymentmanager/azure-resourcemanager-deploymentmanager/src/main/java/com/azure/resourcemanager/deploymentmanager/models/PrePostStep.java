// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that define a step. */
@Fluent
public final class PrePostStep {
    /*
     * The resource Id of the step to be run.
     */
    @JsonProperty(value = "stepId", required = true)
    private String stepId;

    /** Creates an instance of PrePostStep class. */
    public PrePostStep() {
    }

    /**
     * Get the stepId property: The resource Id of the step to be run.
     *
     * @return the stepId value.
     */
    public String stepId() {
        return this.stepId;
    }

    /**
     * Set the stepId property: The resource Id of the step to be run.
     *
     * @param stepId the stepId value to set.
     * @return the PrePostStep object itself.
     */
    public PrePostStep withStepId(String stepId) {
        this.stepId = stepId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stepId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property stepId in model PrePostStep"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrePostStep.class);
}
