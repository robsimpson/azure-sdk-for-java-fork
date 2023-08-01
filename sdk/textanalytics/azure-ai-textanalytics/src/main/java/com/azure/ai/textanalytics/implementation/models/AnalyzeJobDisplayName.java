// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AnalyzeJobDisplayName model. */
@Fluent
public class AnalyzeJobDisplayName {
    /*
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the displayName property: The displayName property.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName property.
     *
     * @param displayName the displayName value to set.
     * @return the AnalyzeJobDisplayName object itself.
     */
    public AnalyzeJobDisplayName setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
