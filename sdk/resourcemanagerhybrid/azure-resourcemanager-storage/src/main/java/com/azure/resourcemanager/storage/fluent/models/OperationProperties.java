// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.models.ServiceSpecification;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of operation, include metric specifications. */
@Fluent
public final class OperationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationProperties.class);

    /*
     * One property of operation, include metric specifications.
     */
    @JsonProperty(value = "serviceSpecification")
    private ServiceSpecification serviceSpecification;

    /**
     * Get the serviceSpecification property: One property of operation, include metric specifications.
     *
     * @return the serviceSpecification value.
     */
    public ServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification property: One property of operation, include metric specifications.
     *
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationProperties object itself.
     */
    public OperationProperties withServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
    }
}
