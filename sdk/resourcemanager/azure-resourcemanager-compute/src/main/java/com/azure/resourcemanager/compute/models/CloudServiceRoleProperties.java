// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The cloud service role properties. */
@Immutable
public final class CloudServiceRoleProperties {
    /*
     * Specifies the ID which uniquely identifies a cloud service role.
     */
    @JsonProperty(value = "uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /** Creates an instance of CloudServiceRoleProperties class. */
    public CloudServiceRoleProperties() {
    }

    /**
     * Get the uniqueId property: Specifies the ID which uniquely identifies a cloud service role.
     *
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
