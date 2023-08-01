// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SKU capacity. */
@Fluent
public final class SkuCapacity {
    /*
     * Gets or sets the minimum.
     */
    @JsonProperty(value = "minimum", required = true)
    private int minimum;

    /*
     * Gets or sets the maximum.
     */
    @JsonProperty(value = "maximum")
    private Integer maximum;

    /*
     * Gets or sets the default.
     */
    @JsonProperty(value = "default")
    private Integer defaultProperty;

    /*
     * Gets or sets the type of the scale.
     */
    @JsonProperty(value = "scaleType")
    private SkuScaleType scaleType;

    /**
     * Get the minimum property: Gets or sets the minimum.
     *
     * @return the minimum value.
     */
    public int minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: Gets or sets the minimum.
     *
     * @param minimum the minimum value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMinimum(int minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: Gets or sets the maximum.
     *
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: Gets or sets the maximum.
     *
     * @param maximum the maximum value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withMaximum(Integer maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the defaultProperty property: Gets or sets the default.
     *
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Set the defaultProperty property: Gets or sets the default.
     *
     * @param defaultProperty the defaultProperty value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withDefaultProperty(Integer defaultProperty) {
        this.defaultProperty = defaultProperty;
        return this;
    }

    /**
     * Get the scaleType property: Gets or sets the type of the scale.
     *
     * @return the scaleType value.
     */
    public SkuScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Set the scaleType property: Gets or sets the type of the scale.
     *
     * @param scaleType the scaleType value to set.
     * @return the SkuCapacity object itself.
     */
    public SkuCapacity withScaleType(SkuScaleType scaleType) {
        this.scaleType = scaleType;
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
