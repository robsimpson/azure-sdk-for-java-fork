// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU parameters supplied to the create namespace operation. */
@Fluent
public final class Sku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Sku.class);

    /*
     * Name of this SKU.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /*
     * The billing tier of this particular SKU.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /*
     * The Event Hubs throughput units for Basic or Standard tiers, where value
     * should be 0 to 20 throughput units. The Event Hubs premium units for
     * Premium tier, where value should be 0 to 10 premium units.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name property: Name of this SKU.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of this SKU.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The billing tier of this particular SKU.
     *
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The billing tier of this particular SKU.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: The Event Hubs throughput units for Basic or Standard tiers, where value should be 0
     * to 20 throughput units. The Event Hubs premium units for Premium tier, where value should be 0 to 10 premium
     * units.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The Event Hubs throughput units for Basic or Standard tiers, where value should be 0
     * to 20 throughput units. The Event Hubs premium units for Premium tier, where value should be 0 to 10 premium
     * units.
     *
     * @param capacity the capacity value to set.
     * @return the Sku object itself.
     */
    public Sku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Sku"));
        }
    }
}
