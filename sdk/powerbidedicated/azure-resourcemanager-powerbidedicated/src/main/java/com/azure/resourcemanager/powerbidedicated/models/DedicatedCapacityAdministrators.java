// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An array of administrator user identities. */
@Fluent
public final class DedicatedCapacityAdministrators {
    /*
     * An array of administrator user identities.
     */
    @JsonProperty(value = "members")
    private List<String> members;

    /** Creates an instance of DedicatedCapacityAdministrators class. */
    public DedicatedCapacityAdministrators() {
    }

    /**
     * Get the members property: An array of administrator user identities.
     *
     * @return the members value.
     */
    public List<String> members() {
        return this.members;
    }

    /**
     * Set the members property: An array of administrator user identities.
     *
     * @param members the members value to set.
     * @return the DedicatedCapacityAdministrators object itself.
     */
    public DedicatedCapacityAdministrators withMembers(List<String> members) {
        this.members = members;
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
