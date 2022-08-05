// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the cloud service role sku. */
@Fluent
public final class CloudServiceRoleSku {
    /*
     * The sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is currently on, you need
     * to delete and recreate the cloud service or move back to the old sku.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Specifies the tier of the cloud service. Possible Values are <br /><br /> **Standard** <br /><br /> **Basic**
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * Specifies the number of role instances in the cloud service.
     */
    @JsonProperty(value = "capacity")
    private Long capacity;

    /**
     * Get the name property: The sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is
     * currently on, you need to delete and recreate the cloud service or move back to the old sku.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is
     * currently on, you need to delete and recreate the cloud service or move back to the old sku.
     *
     * @param name the name value to set.
     * @return the CloudServiceRoleSku object itself.
     */
    public CloudServiceRoleSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Specifies the tier of the cloud service. Possible Values are &lt;br /&gt;&lt;br /&gt;
     * **Standard** &lt;br /&gt;&lt;br /&gt; **Basic**.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Specifies the tier of the cloud service. Possible Values are &lt;br /&gt;&lt;br /&gt;
     * **Standard** &lt;br /&gt;&lt;br /&gt; **Basic**.
     *
     * @param tier the tier value to set.
     * @return the CloudServiceRoleSku object itself.
     */
    public CloudServiceRoleSku withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: Specifies the number of role instances in the cloud service.
     *
     * @return the capacity value.
     */
    public Long capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Specifies the number of role instances in the cloud service.
     *
     * @param capacity the capacity value to set.
     * @return the CloudServiceRoleSku object itself.
     */
    public CloudServiceRoleSku withCapacity(Long capacity) {
        this.capacity = capacity;
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
