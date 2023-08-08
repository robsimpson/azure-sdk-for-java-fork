// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes scaling information of a sku. */
@Immutable
public final class SkuCapacity {
    /*
     * The lowest permitted capacity for this resource
     */
    @JsonProperty(value = "minimum", access = JsonProperty.Access.WRITE_ONLY)
    private Integer minimum;

    /*
     * The highest permitted capacity for this resource
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maximum;

    /*
     * The default capacity.
     */
    @JsonProperty(value = "default", access = JsonProperty.Access.WRITE_ONLY)
    private Integer defaultProperty;

    /*
     * Allows capacity value list.
     */
    @JsonProperty(value = "allowedValues", access = JsonProperty.Access.WRITE_ONLY)
    private List<Integer> allowedValues;

    /*
     * The scale type applicable to the sku.
     */
    @JsonProperty(value = "scaleType", access = JsonProperty.Access.WRITE_ONLY)
    private ScaleType scaleType;

    /** Creates an instance of SkuCapacity class. */
    public SkuCapacity() {
    }

    /**
     * Get the minimum property: The lowest permitted capacity for this resource.
     *
     * @return the minimum value.
     */
    public Integer minimum() {
        return this.minimum;
    }

    /**
     * Get the maximum property: The highest permitted capacity for this resource.
     *
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Get the defaultProperty property: The default capacity.
     *
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.defaultProperty;
    }

    /**
     * Get the allowedValues property: Allows capacity value list.
     *
     * @return the allowedValues value.
     */
    public List<Integer> allowedValues() {
        return this.allowedValues;
    }

    /**
     * Get the scaleType property: The scale type applicable to the sku.
     *
     * @return the scaleType value.
     */
    public ScaleType scaleType() {
        return this.scaleType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
