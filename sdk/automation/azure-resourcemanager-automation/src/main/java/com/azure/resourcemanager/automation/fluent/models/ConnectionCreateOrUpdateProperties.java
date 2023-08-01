// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.models.ConnectionTypeAssociationProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The properties of the create connection properties. */
@Fluent
public final class ConnectionCreateOrUpdateProperties {
    /*
     * Gets or sets the description of the connection.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Gets or sets the connectionType of the connection.
     */
    @JsonProperty(value = "connectionType", required = true)
    private ConnectionTypeAssociationProperty connectionType;

    /*
     * Gets or sets the field definition properties of the connection.
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
     * @return the ConnectionCreateOrUpdateProperties object itself.
     */
    public ConnectionCreateOrUpdateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the connectionType property: Gets or sets the connectionType of the connection.
     *
     * @return the connectionType value.
     */
    public ConnectionTypeAssociationProperty connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: Gets or sets the connectionType of the connection.
     *
     * @param connectionType the connectionType value to set.
     * @return the ConnectionCreateOrUpdateProperties object itself.
     */
    public ConnectionCreateOrUpdateProperties withConnectionType(ConnectionTypeAssociationProperty connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get the fieldDefinitionValues property: Gets or sets the field definition properties of the connection.
     *
     * @return the fieldDefinitionValues value.
     */
    public Map<String, String> fieldDefinitionValues() {
        return this.fieldDefinitionValues;
    }

    /**
     * Set the fieldDefinitionValues property: Gets or sets the field definition properties of the connection.
     *
     * @param fieldDefinitionValues the fieldDefinitionValues value to set.
     * @return the ConnectionCreateOrUpdateProperties object itself.
     */
    public ConnectionCreateOrUpdateProperties withFieldDefinitionValues(Map<String, String> fieldDefinitionValues) {
        this.fieldDefinitionValues = fieldDefinitionValues;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionType in model ConnectionCreateOrUpdateProperties"));
        } else {
            connectionType().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectionCreateOrUpdateProperties.class);
}
