// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Deployment What-If operation settings. */
@Fluent
public final class DeploymentWhatIfSettings {
    /*
     * The format of the What-If results
     */
    @JsonProperty(value = "resultFormat")
    private WhatIfResultFormat resultFormat;

    /** Creates an instance of DeploymentWhatIfSettings class. */
    public DeploymentWhatIfSettings() {
    }

    /**
     * Get the resultFormat property: The format of the What-If results.
     *
     * @return the resultFormat value.
     */
    public WhatIfResultFormat resultFormat() {
        return this.resultFormat;
    }

    /**
     * Set the resultFormat property: The format of the What-If results.
     *
     * @param resultFormat the resultFormat value to set.
     * @return the DeploymentWhatIfSettings object itself.
     */
    public DeploymentWhatIfSettings withResultFormat(WhatIfResultFormat resultFormat) {
        this.resultFormat = resultFormat;
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
