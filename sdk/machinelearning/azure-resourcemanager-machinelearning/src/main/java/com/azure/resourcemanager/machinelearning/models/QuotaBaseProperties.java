// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties for Quota update or retrieval. */
@Fluent
public final class QuotaBaseProperties {
    /*
     * Specifies the resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Specifies the resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Limit.
     *
     * The maximum permitted quota of the resource.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /*
     * An enum describing the unit of quota measurement.
     */
    @JsonProperty(value = "unit")
    private QuotaUnit unit;

    /** Creates an instance of QuotaBaseProperties class. */
    public QuotaBaseProperties() {
    }

    /**
     * Get the id property: Specifies the resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Specifies the resource ID.
     *
     * @param id the id value to set.
     * @return the QuotaBaseProperties object itself.
     */
    public QuotaBaseProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: Specifies the resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the resource type.
     *
     * @param type the type value to set.
     * @return the QuotaBaseProperties object itself.
     */
    public QuotaBaseProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the limit property: Limit.
     *
     * <p>The maximum permitted quota of the resource.
     *
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: Limit.
     *
     * <p>The maximum permitted quota of the resource.
     *
     * @param limit the limit value to set.
     * @return the QuotaBaseProperties object itself.
     */
    public QuotaBaseProperties withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the unit property: An enum describing the unit of quota measurement.
     *
     * @return the unit value.
     */
    public QuotaUnit unit() {
        return this.unit;
    }

    /**
     * Set the unit property: An enum describing the unit of quota measurement.
     *
     * @param unit the unit value to set.
     * @return the QuotaBaseProperties object itself.
     */
    public QuotaBaseProperties withUnit(QuotaUnit unit) {
        this.unit = unit;
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
