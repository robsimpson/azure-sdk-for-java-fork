// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input required to add a provider. */
@Fluent
public final class AddRecoveryServicesProviderInput {
    /*
     * The properties of an add provider request.
     */
    @JsonProperty(value = "properties", required = true)
    private AddRecoveryServicesProviderInputProperties properties;

    /** Creates an instance of AddRecoveryServicesProviderInput class. */
    public AddRecoveryServicesProviderInput() {
    }

    /**
     * Get the properties property: The properties of an add provider request.
     *
     * @return the properties value.
     */
    public AddRecoveryServicesProviderInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of an add provider request.
     *
     * @param properties the properties value to set.
     * @return the AddRecoveryServicesProviderInput object itself.
     */
    public AddRecoveryServicesProviderInput withProperties(AddRecoveryServicesProviderInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model AddRecoveryServicesProviderInput"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AddRecoveryServicesProviderInput.class);
}
