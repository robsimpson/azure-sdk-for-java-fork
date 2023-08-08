// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The aggregate values of reservation utilization. */
@Immutable
public final class ReservationUtilizationAggregates {
    /*
     * The grain of the aggregate
     */
    @JsonProperty(value = "grain", access = JsonProperty.Access.WRITE_ONLY)
    private Float grain;

    /*
     * The grain unit of the aggregate
     */
    @JsonProperty(value = "grainUnit", access = JsonProperty.Access.WRITE_ONLY)
    private String grainUnit;

    /*
     * The aggregate value
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Float value;

    /*
     * The aggregate value unit
     */
    @JsonProperty(value = "valueUnit", access = JsonProperty.Access.WRITE_ONLY)
    private String valueUnit;

    /** Creates an instance of ReservationUtilizationAggregates class. */
    public ReservationUtilizationAggregates() {
    }

    /**
     * Get the grain property: The grain of the aggregate.
     *
     * @return the grain value.
     */
    public Float grain() {
        return this.grain;
    }

    /**
     * Get the grainUnit property: The grain unit of the aggregate.
     *
     * @return the grainUnit value.
     */
    public String grainUnit() {
        return this.grainUnit;
    }

    /**
     * Get the value property: The aggregate value.
     *
     * @return the value value.
     */
    public Float value() {
        return this.value;
    }

    /**
     * Get the valueUnit property: The aggregate value unit.
     *
     * @return the valueUnit value.
     */
    public String valueUnit() {
        return this.valueUnit;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
