// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.models.AvailableWorkloadProfileInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of available workload profiles in the location. */
@Fluent
public final class AvailableWorkloadProfilesCollection {
    /*
     * Collection of workload profiles.
     */
    @JsonProperty(value = "value", required = true)
    private List<AvailableWorkloadProfileInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of AvailableWorkloadProfilesCollection class. */
    public AvailableWorkloadProfilesCollection() {
    }

    /**
     * Get the value property: Collection of workload profiles.
     *
     * @return the value value.
     */
    public List<AvailableWorkloadProfileInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of workload profiles.
     *
     * @param value the value value to set.
     * @return the AvailableWorkloadProfilesCollection object itself.
     */
    public AvailableWorkloadProfilesCollection withValue(List<AvailableWorkloadProfileInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model AvailableWorkloadProfilesCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AvailableWorkloadProfilesCollection.class);
}
