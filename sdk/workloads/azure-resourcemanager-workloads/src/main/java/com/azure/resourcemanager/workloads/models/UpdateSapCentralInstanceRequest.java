// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Defines the request body for updating SAP Central Instance. */
@Fluent
public final class UpdateSapCentralInstanceRequest {
    /*
     * Gets or sets the Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of UpdateSapCentralInstanceRequest class. */
    public UpdateSapCentralInstanceRequest() {
    }

    /**
     * Get the tags property: Gets or sets the Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets the Resource tags.
     *
     * @param tags the tags value to set.
     * @return the UpdateSapCentralInstanceRequest object itself.
     */
    public UpdateSapCentralInstanceRequest withTags(Map<String, String> tags) {
        this.tags = tags;
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
