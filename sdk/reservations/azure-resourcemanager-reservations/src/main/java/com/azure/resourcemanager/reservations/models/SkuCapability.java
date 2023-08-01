// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Capability of a sku. */
@Fluent
public final class SkuCapability {
    /*
     * An invariant to describe the feature.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * An invariant if the feature is measured by quantity.
     */
    @JsonProperty(value = "value")
    private String value;

    /** Creates an instance of SkuCapability class. */
    public SkuCapability() {
    }

    /**
     * Get the name property: An invariant to describe the feature.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: An invariant to describe the feature.
     *
     * @param name the name value to set.
     * @return the SkuCapability object itself.
     */
    public SkuCapability withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: An invariant if the feature is measured by quantity.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: An invariant if the feature is measured by quantity.
     *
     * @param value the value value to set.
     * @return the SkuCapability object itself.
     */
    public SkuCapability withValue(String value) {
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
