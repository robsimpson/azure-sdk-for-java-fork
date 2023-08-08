// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The properties of the update connection operation. */
@Fluent
public final class ConnectionUpdateProperties {
    /*
     * Gets or sets the description of the connection.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Gets or sets the field definition values of the connection.
     */
    @JsonProperty(value = "fieldDefinitionValues")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> fieldDefinitionValues;

    /**
     * Get the description property: Gets or sets the description of the connection.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description of the connection.
     *
     * @param description the description value to set.
     * @return the ConnectionUpdateProperties object itself.
     */
    public ConnectionUpdateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the fieldDefinitionValues property: Gets or sets the field definition values of the connection.
     *
     * @return the fieldDefinitionValues value.
     */
    public Map<String, String> fieldDefinitionValues() {
        return this.fieldDefinitionValues;
    }

    /**
     * Set the fieldDefinitionValues property: Gets or sets the field definition values of the connection.
     *
     * @param fieldDefinitionValues the fieldDefinitionValues value to set.
     * @return the ConnectionUpdateProperties object itself.
     */
    public ConnectionUpdateProperties withFieldDefinitionValues(Map<String, String> fieldDefinitionValues) {
        this.fieldDefinitionValues = fieldDefinitionValues;
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
