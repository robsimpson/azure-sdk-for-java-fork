// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkTableRequestTargetStructureOptions model. */
@Fluent
public final class LinkTableRequestTargetStructureOptions {
    /*
     * Target table structure type
     */
    @JsonProperty(value = "type")
    private String type;

    /** Creates an instance of LinkTableRequestTargetStructureOptions class. */
    public LinkTableRequestTargetStructureOptions() {}

    /**
     * Get the type property: Target table structure type.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Target table structure type.
     *
     * @param type the type value to set.
     * @return the LinkTableRequestTargetStructureOptions object itself.
     */
    public LinkTableRequestTargetStructureOptions setType(String type) {
        this.type = type;
        return this;
    }
}
