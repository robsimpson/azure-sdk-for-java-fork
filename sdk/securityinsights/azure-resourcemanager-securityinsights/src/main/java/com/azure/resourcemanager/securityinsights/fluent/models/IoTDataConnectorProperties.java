// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.models.AlertsDataTypeOfDataConnector;
import com.azure.resourcemanager.securityinsights.models.DataConnectorWithAlertsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IoT data connector properties. */
@Fluent
public final class IoTDataConnectorProperties extends DataConnectorWithAlertsProperties {
    /*
     * The subscription id to connect to, and get the data from.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * Get the subscriptionId property: The subscription id to connect to, and get the data from.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription id to connect to, and get the data from.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the IoTDataConnectorProperties object itself.
     */
    public IoTDataConnectorProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IoTDataConnectorProperties withDataTypes(AlertsDataTypeOfDataConnector dataTypes) {
        super.withDataTypes(dataTypes);
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
    }
}
