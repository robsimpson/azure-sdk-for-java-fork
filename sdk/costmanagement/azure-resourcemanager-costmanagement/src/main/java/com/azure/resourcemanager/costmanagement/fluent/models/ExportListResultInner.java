// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of listing exports. It contains a list of available exports in the scope provided. */
@Immutable
public final class ExportListResultInner {
    /*
     * The list of exports.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExportInner> value;

    /** Creates an instance of ExportListResultInner class. */
    public ExportListResultInner() {
    }

    /**
     * Get the value property: The list of exports.
     *
     * @return the value value.
     */
    public List<ExportInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
