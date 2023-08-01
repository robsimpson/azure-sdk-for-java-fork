// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.DataConnectorTenantId;
import com.azure.resourcemanager.securityinsights.models.McasDataConnectorDataTypes;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MCAS (Microsoft Cloud App Security) data connector properties. */
@Fluent
public final class McasDataConnectorProperties extends DataConnectorTenantId {
    /*
     * The available data types for the connector.
     */
    @JsonProperty(value = "dataTypes", required = true)
    private McasDataConnectorDataTypes dataTypes;

    /**
     * Get the dataTypes property: The available data types for the connector.
     *
     * @return the dataTypes value.
     */
    public McasDataConnectorDataTypes dataTypes() {
        return this.dataTypes;
    }

    /**
     * Set the dataTypes property: The available data types for the connector.
     *
     * @param dataTypes the dataTypes value to set.
     * @return the McasDataConnectorProperties object itself.
     */
    public McasDataConnectorProperties withDataTypes(McasDataConnectorDataTypes dataTypes) {
        this.dataTypes = dataTypes;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public McasDataConnectorProperties withTenantId(String tenantId) {
        super.withTenantId(tenantId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataTypes() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataTypes in model McasDataConnectorProperties"));
        } else {
            dataTypes().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(McasDataConnectorProperties.class);
}
