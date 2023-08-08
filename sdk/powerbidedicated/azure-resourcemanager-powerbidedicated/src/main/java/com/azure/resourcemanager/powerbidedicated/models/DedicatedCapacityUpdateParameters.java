// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.powerbidedicated.fluent.models.DedicatedCapacityMutableProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Provision request specification. */
@Fluent
public final class DedicatedCapacityUpdateParameters {
    /*
     * The SKU of the Dedicated capacity resource.
     */
    @JsonProperty(value = "sku")
    private CapacitySku sku;

    /*
     * Key-value pairs of additional provisioning properties.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Properties of the provision operation request.
     */
    @JsonProperty(value = "properties")
    private DedicatedCapacityMutableProperties innerProperties;

    /** Creates an instance of DedicatedCapacityUpdateParameters class. */
    public DedicatedCapacityUpdateParameters() {
    }

    /**
     * Get the sku property: The SKU of the Dedicated capacity resource.
     *
     * @return the sku value.
     */
    public CapacitySku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the Dedicated capacity resource.
     *
     * @param sku the sku value to set.
     * @return the DedicatedCapacityUpdateParameters object itself.
     */
    public DedicatedCapacityUpdateParameters withSku(CapacitySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tags property: Key-value pairs of additional provisioning properties.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Key-value pairs of additional provisioning properties.
     *
     * @param tags the tags value to set.
     * @return the DedicatedCapacityUpdateParameters object itself.
     */
    public DedicatedCapacityUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the provision operation request.
     *
     * @return the innerProperties value.
     */
    private DedicatedCapacityMutableProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the administration property: A collection of Dedicated capacity administrators.
     *
     * @return the administration value.
     */
    public DedicatedCapacityAdministrators administration() {
        return this.innerProperties() == null ? null : this.innerProperties().administration();
    }

    /**
     * Set the administration property: A collection of Dedicated capacity administrators.
     *
     * @param administration the administration value to set.
     * @return the DedicatedCapacityUpdateParameters object itself.
     */
    public DedicatedCapacityUpdateParameters withAdministration(DedicatedCapacityAdministrators administration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedCapacityMutableProperties();
        }
        this.innerProperties().withAdministration(administration);
        return this;
    }

    /**
     * Get the mode property: Specifies the generation of the Power BI Embedded capacity. If no value is specified, the
     * default value 'Gen2' is used. [Learn
     * More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2).
     *
     * @return the mode value.
     */
    public Mode mode() {
        return this.innerProperties() == null ? null : this.innerProperties().mode();
    }

    /**
     * Set the mode property: Specifies the generation of the Power BI Embedded capacity. If no value is specified, the
     * default value 'Gen2' is used. [Learn
     * More](https://docs.microsoft.com/power-bi/developer/embedded/power-bi-embedded-generation-2).
     *
     * @param mode the mode value to set.
     * @return the DedicatedCapacityUpdateParameters object itself.
     */
    public DedicatedCapacityUpdateParameters withMode(Mode mode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DedicatedCapacityMutableProperties();
        }
        this.innerProperties().withMode(mode);
        return this;
    }

    /**
     * Get the tenantId property: Tenant ID for the capacity. Used for creating Pro Plus capacity.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Get the friendlyName property: Capacity name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
