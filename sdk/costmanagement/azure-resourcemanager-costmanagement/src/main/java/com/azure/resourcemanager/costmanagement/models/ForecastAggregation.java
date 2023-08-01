// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The aggregation expression to be used in the forecast. */
@Fluent
public final class ForecastAggregation {
    /*
     * The name of the column to aggregate.
     */
    @JsonProperty(value = "name", required = true)
    private FunctionName name;

    /*
     * The name of the aggregation function to use.
     */
    @JsonProperty(value = "function", required = true)
    private FunctionType function;

    /** Creates an instance of ForecastAggregation class. */
    public ForecastAggregation() {
    }

    /**
     * Get the name property: The name of the column to aggregate.
     *
     * @return the name value.
     */
    public FunctionName name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the column to aggregate.
     *
     * @param name the name value to set.
     * @return the ForecastAggregation object itself.
     */
    public ForecastAggregation withName(FunctionName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the function property: The name of the aggregation function to use.
     *
     * @return the function value.
     */
    public FunctionType function() {
        return this.function;
    }

    /**
     * Set the function property: The name of the aggregation function to use.
     *
     * @param function the function value to set.
     * @return the ForecastAggregation object itself.
     */
    public ForecastAggregation withFunction(FunctionType function) {
        this.function = function;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ForecastAggregation"));
        }
        if (function() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property function in model ForecastAggregation"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ForecastAggregation.class);
}
