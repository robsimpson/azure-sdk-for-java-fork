// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU for the resource. */
@Fluent
public final class SkuName {
    /*
     * SKU name for this resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of SkuName class. */
    public SkuName() {
    }

    /**
     * Get the name property: SKU name for this resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: SKU name for this resource.
     *
     * @param name the name value to set.
     * @return the SkuName object itself.
     */
    public SkuName withName(String name) {
        this.name = name;
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
