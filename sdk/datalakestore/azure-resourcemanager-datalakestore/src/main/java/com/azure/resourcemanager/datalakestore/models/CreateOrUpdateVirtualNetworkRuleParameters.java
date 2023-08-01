// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datalakestore.fluent.models.CreateOrUpdateVirtualNetworkRuleProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to create a new virtual network rule. */
@Fluent
public final class CreateOrUpdateVirtualNetworkRuleParameters {
    /*
     * The virtual network rule properties to use when creating a new virtual network rule.
     */
    @JsonProperty(value = "properties", required = true)
    private CreateOrUpdateVirtualNetworkRuleProperties innerProperties =
        new CreateOrUpdateVirtualNetworkRuleProperties();

    /** Creates an instance of CreateOrUpdateVirtualNetworkRuleParameters class. */
    public CreateOrUpdateVirtualNetworkRuleParameters() {
    }

    /**
     * Get the innerProperties property: The virtual network rule properties to use when creating a new virtual network
     * rule.
     *
     * @return the innerProperties value.
     */
    private CreateOrUpdateVirtualNetworkRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the subnetId property: The resource identifier for the subnet.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().subnetId();
    }

    /**
     * Set the subnetId property: The resource identifier for the subnet.
     *
     * @param subnetId the subnetId value to set.
     * @return the CreateOrUpdateVirtualNetworkRuleParameters object itself.
     */
    public CreateOrUpdateVirtualNetworkRuleParameters withSubnetId(String subnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateOrUpdateVirtualNetworkRuleProperties();
        }
        this.innerProperties().withSubnetId(subnetId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model"
                            + " CreateOrUpdateVirtualNetworkRuleParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CreateOrUpdateVirtualNetworkRuleParameters.class);
}
