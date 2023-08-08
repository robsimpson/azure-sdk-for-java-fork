// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PressureTendency model. */
@Fluent
public final class PressureTendency {
    /*
     * Description of the pressure tendency in specified language
     */
    @JsonProperty(value = "localizedDescription")
    private String description;

    /*
     * Pressure tendency code regardless of language. One of F=Falling, S=Steady, R=Rising.
     */
    @JsonProperty(value = "code")
    private String code;

    /** Set default PressureTendency constructor to private */
    private PressureTendency() {}

    /**
     * Get the description property: Description of the pressure tendency in specified language.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the code property: Pressure tendency code regardless of language. One of F=Falling, S=Steady, R=Rising.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }
}
