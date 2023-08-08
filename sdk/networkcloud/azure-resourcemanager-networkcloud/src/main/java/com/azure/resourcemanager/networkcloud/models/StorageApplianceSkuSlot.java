// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.networkcloud.fluent.models.StorageApplianceSkuProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StorageApplianceSkuSlot represents the single SKU and rack slot associated with the storage appliance. */
@Immutable
public final class StorageApplianceSkuSlot {
    /*
     * StorageApplianceSkuProperties represents the properties of the storage appliance SKU.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties")
    private StorageApplianceSkuProperties innerProperties;

    /*
     * The position in the rack for the storage appliance.
     */
    @JsonProperty(value = "rackSlot", access = JsonProperty.Access.WRITE_ONLY)
    private Long rackSlot;

    /** Creates an instance of StorageApplianceSkuSlot class. */
    public StorageApplianceSkuSlot() {
    }

    /**
     * Get the innerProperties property: StorageApplianceSkuProperties represents the properties of the storage
     * appliance SKU.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private StorageApplianceSkuProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the rackSlot property: The position in the rack for the storage appliance.
     *
     * @return the rackSlot value.
     */
    public Long rackSlot() {
        return this.rackSlot;
    }

    /**
     * Get the capacityGB property: The maximum capacity of the storage appliance.
     *
     * @return the capacityGB value.
     */
    public Long capacityGB() {
        return this.innerProperties() == null ? null : this.innerProperties().capacityGB();
    }

    /**
     * Get the model property: The model of the storage appliance.
     *
     * @return the model value.
     */
    public String model() {
        return this.innerProperties() == null ? null : this.innerProperties().model();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
