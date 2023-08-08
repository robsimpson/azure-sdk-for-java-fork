// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Gateway authentication keys. */
@Fluent
public final class GatewayKeysContractInner {
    /*
     * Primary gateway key.
     */
    @JsonProperty(value = "primary")
    private String primary;

    /*
     * Secondary gateway key.
     */
    @JsonProperty(value = "secondary")
    private String secondary;

    /**
     * Get the primary property: Primary gateway key.
     *
     * @return the primary value.
     */
    public String primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Primary gateway key.
     *
     * @param primary the primary value to set.
     * @return the GatewayKeysContractInner object itself.
     */
    public GatewayKeysContractInner withPrimary(String primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the secondary property: Secondary gateway key.
     *
     * @return the secondary value.
     */
    public String secondary() {
        return this.secondary;
    }

    /**
     * Set the secondary property: Secondary gateway key.
     *
     * @param secondary the secondary value to set.
     * @return the GatewayKeysContractInner object itself.
     */
    public GatewayKeysContractInner withSecondary(String secondary) {
        this.secondary = secondary;
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
