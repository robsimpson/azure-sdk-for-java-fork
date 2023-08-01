// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A reference to an Azure resource. */
@Fluent
public final class ResourceReference {
    /*
     * The fully qualified Azure resource id.
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of ResourceReference class. */
    public ResourceReference() {
    }

    /**
     * Get the id property: The fully qualified Azure resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The fully qualified Azure resource id.
     *
     * @param id the id value to set.
     * @return the ResourceReference object itself.
     */
    public ResourceReference withId(String id) {
        this.id = id;
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
