// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings of the session to be created. */
@Fluent
public final class CreateSessionSettings {
    /*
     * The time in minutes the session will run after reaching the 'Ready'
     * state. It has to be between 0 and 1440.
     */
    @JsonProperty(value = "maxLeaseTimeMinutes", required = true)
    private int maxLeaseTimeMinutes;

    /*
     * The size of the server used for the rendering session. The size impacts
     * the number of polygons the server can render. Refer to
     * https://docs.microsoft.com/azure/remote-rendering/reference/vm-sizes for
     * details.
     */
    @JsonProperty(value = "size", required = true)
    private SessionSize size;

    /**
     * Creates an instance of CreateSessionSettings class.
     *
     * @param maxLeaseTimeMinutes the maxLeaseTimeMinutes value to set.
     * @param size the size value to set.
     */
    @JsonCreator
    public CreateSessionSettings(
            @JsonProperty(value = "maxLeaseTimeMinutes", required = true) int maxLeaseTimeMinutes,
            @JsonProperty(value = "size", required = true) SessionSize size) {
        this.maxLeaseTimeMinutes = maxLeaseTimeMinutes;
        this.size = size;
    }

    /**
     * Get the maxLeaseTimeMinutes property: The time in minutes the session will run after reaching the 'Ready' state.
     * It has to be between 0 and 1440.
     *
     * @return the maxLeaseTimeMinutes value.
     */
    public int getMaxLeaseTimeMinutes() {
        return this.maxLeaseTimeMinutes;
    }

    /**
     * Get the size property: The size of the server used for the rendering session. The size impacts the number of
     * polygons the server can render. Refer to https://docs.microsoft.com/azure/remote-rendering/reference/vm-sizes for
     * details.
     *
     * @return the size value.
     */
    public SessionSize getSize() {
        return this.size;
    }
}
