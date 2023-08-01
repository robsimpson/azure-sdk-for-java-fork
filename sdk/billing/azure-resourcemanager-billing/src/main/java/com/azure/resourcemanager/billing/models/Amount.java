// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The amount. */
@Fluent
public final class Amount {
    /*
     * The currency for the amount value.
     */
    @JsonProperty(value = "currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /*
     * Amount value.
     */
    @JsonProperty(value = "value")
    private Float value;

    /** Creates an instance of Amount class. */
    public Amount() {
    }

    /**
     * Get the currency property: The currency for the amount value.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the value property: Amount value.
     *
     * @return the value value.
     */
    public Float value() {
        return this.value;
    }

    /**
     * Set the value property: Amount value.
     *
     * @param value the value value to set.
     * @return the Amount object itself.
     */
    public Amount withValue(Float value) {
        this.value = value;
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
