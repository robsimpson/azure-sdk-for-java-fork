// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Restriction of a sku. */
@Fluent
public final class SkuRestriction {
    /*
     * The type of restrictions.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The value of restrictions. If the restriction type is set to location. This would be different locations where
     * the sku is restricted.
     */
    @JsonProperty(value = "values")
    private List<String> values;

    /*
     * The reason for restriction.
     */
    @JsonProperty(value = "reasonCode")
    private String reasonCode;

    /** Creates an instance of SkuRestriction class. */
    public SkuRestriction() {
    }

    /**
     * Get the type property: The type of restrictions.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of restrictions.
     *
     * @param type the type value to set.
     * @return the SkuRestriction object itself.
     */
    public SkuRestriction withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the values property: The value of restrictions. If the restriction type is set to location. This would be
     * different locations where the sku is restricted.
     *
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: The value of restrictions. If the restriction type is set to location. This would be
     * different locations where the sku is restricted.
     *
     * @param values the values value to set.
     * @return the SkuRestriction object itself.
     */
    public SkuRestriction withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the reasonCode property: The reason for restriction.
     *
     * @return the reasonCode value.
     */
    public String reasonCode() {
        return this.reasonCode;
    }

    /**
     * Set the reasonCode property: The reason for restriction.
     *
     * @param reasonCode the reasonCode value to set.
     * @return the SkuRestriction object itself.
     */
    public SkuRestriction withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
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
