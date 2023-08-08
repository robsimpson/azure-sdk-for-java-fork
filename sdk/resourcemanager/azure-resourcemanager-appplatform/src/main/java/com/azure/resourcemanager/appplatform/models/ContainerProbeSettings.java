// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Container liveness and readiness probe settings. */
@Fluent
public final class ContainerProbeSettings {
    /*
     * Indicates whether disable the liveness and readiness probe
     */
    @JsonProperty(value = "disableProbe")
    private Boolean disableProbe;

    /**
     * Get the disableProbe property: Indicates whether disable the liveness and readiness probe.
     *
     * @return the disableProbe value.
     */
    public Boolean disableProbe() {
        return this.disableProbe;
    }

    /**
     * Set the disableProbe property: Indicates whether disable the liveness and readiness probe.
     *
     * @param disableProbe the disableProbe value to set.
     * @return the ContainerProbeSettings object itself.
     */
    public ContainerProbeSettings withDisableProbe(Boolean disableProbe) {
        this.disableProbe = disableProbe;
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
