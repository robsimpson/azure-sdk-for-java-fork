// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.models.SkuCapacity;
import com.azure.resourcemanager.machinelearning.models.SkuSetting;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Fulfills ARM Contract requirement to list all available SKUS for a resource. */
@Fluent
public final class SkuResourceInner {
    /*
     * Gets or sets the Sku Capacity.
     */
    @JsonProperty(value = "capacity")
    private SkuCapacity capacity;

    /*
     * The resource type name.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * Gets or sets the Sku.
     */
    @JsonProperty(value = "sku")
    private SkuSetting sku;

    /** Creates an instance of SkuResourceInner class. */
    public SkuResourceInner() {
    }

    /**
     * Get the capacity property: Gets or sets the Sku Capacity.
     *
     * @return the capacity value.
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Gets or sets the Sku Capacity.
     *
     * @param capacity the capacity value to set.
     * @return the SkuResourceInner object itself.
     */
    public SkuResourceInner withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the resourceType property: The resource type name.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the sku property: Gets or sets the Sku.
     *
     * @return the sku value.
     */
    public SkuSetting sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Gets or sets the Sku.
     *
     * @param sku the sku value to set.
     * @return the SkuResourceInner object itself.
     */
    public SkuResourceInner withSku(SkuSetting sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capacity() != null) {
            capacity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
