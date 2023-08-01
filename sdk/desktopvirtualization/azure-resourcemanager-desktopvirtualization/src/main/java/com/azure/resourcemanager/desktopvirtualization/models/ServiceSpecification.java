// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Service specification payload. */
@Fluent
public final class ServiceSpecification {
    /*
     * Specifications of the Log for Azure Monitoring
     */
    @JsonProperty(value = "logSpecifications")
    private List<LogSpecification> logSpecifications;

    /** Creates an instance of ServiceSpecification class. */
    public ServiceSpecification() {
    }

    /**
     * Get the logSpecifications property: Specifications of the Log for Azure Monitoring.
     *
     * @return the logSpecifications value.
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: Specifications of the Log for Azure Monitoring.
     *
     * @param logSpecifications the logSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withLogSpecifications(List<LogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
    }
}
