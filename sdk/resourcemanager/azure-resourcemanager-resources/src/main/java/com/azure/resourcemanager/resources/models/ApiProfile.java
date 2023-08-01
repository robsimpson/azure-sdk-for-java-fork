// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApiProfile model. */
@Immutable
public final class ApiProfile {
    /*
     * The profile version.
     */
    @JsonProperty(value = "profileVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String profileVersion;

    /*
     * The API version.
     */
    @JsonProperty(value = "apiVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String apiVersion;

    /** Creates an instance of ApiProfile class. */
    public ApiProfile() {
    }

    /**
     * Get the profileVersion property: The profile version.
     *
     * @return the profileVersion value.
     */
    public String profileVersion() {
        return this.profileVersion;
    }

    /**
     * Get the apiVersion property: The API version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
