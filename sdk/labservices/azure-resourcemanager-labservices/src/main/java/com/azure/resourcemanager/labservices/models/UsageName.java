// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Usage Names. */
@Fluent
public final class UsageName {
    /*
     * The localized name of the resource.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /*
     * The instances of the resource.
     */
    @JsonProperty(value = "skuInstances")
    private List<String> skuInstances;

    /*
     * The name of the resource.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the localizedValue property: The localized name of the resource.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: The localized name of the resource.
     *
     * @param localizedValue the localizedValue value to set.
     * @return the UsageName object itself.
     */
    public UsageName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

    /**
     * Get the skuInstances property: The instances of the resource.
     *
     * @return the skuInstances value.
     */
    public List<String> skuInstances() {
        return this.skuInstances;
    }

    /**
     * Set the skuInstances property: The instances of the resource.
     *
     * @param skuInstances the skuInstances value to set.
     * @return the UsageName object itself.
     */
    public UsageName withSkuInstances(List<String> skuInstances) {
        this.skuInstances = skuInstances;
        return this;
    }

    /**
     * Get the value property: The name of the resource.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The name of the resource.
     *
     * @param value the value value to set.
     * @return the UsageName object itself.
     */
    public UsageName withValue(String value) {
        this.value = value;
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
