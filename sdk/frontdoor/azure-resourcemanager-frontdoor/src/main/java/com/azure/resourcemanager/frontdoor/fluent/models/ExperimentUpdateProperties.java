// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.models.State;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the properties of an experiment. */
@Fluent
public final class ExperimentUpdateProperties {
    /*
     * The description of the intent or details of the Experiment
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The state of the Experiment
     */
    @JsonProperty(value = "enabledState")
    private State enabledState;

    /** Creates an instance of ExperimentUpdateProperties class. */
    public ExperimentUpdateProperties() {
    }

    /**
     * Get the description property: The description of the intent or details of the Experiment.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the intent or details of the Experiment.
     *
     * @param description the description value to set.
     * @return the ExperimentUpdateProperties object itself.
     */
    public ExperimentUpdateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the enabledState property: The state of the Experiment.
     *
     * @return the enabledState value.
     */
    public State enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: The state of the Experiment.
     *
     * @param enabledState the enabledState value to set.
     * @return the ExperimentUpdateProperties object itself.
     */
    public ExperimentUpdateProperties withEnabledState(State enabledState) {
        this.enabledState = enabledState;
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
