// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appcontainers.models.ReplicaContainer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Replica resource specific properties. */
@Fluent
public final class ReplicaProperties {
    /*
     * Timestamp describing when the pod was created by controller
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * The containers collection under a replica.
     */
    @JsonProperty(value = "containers")
    private List<ReplicaContainer> containers;

    /** Creates an instance of ReplicaProperties class. */
    public ReplicaProperties() {
    }

    /**
     * Get the createdTime property: Timestamp describing when the pod was created by controller.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the containers property: The containers collection under a replica.
     *
     * @return the containers value.
     */
    public List<ReplicaContainer> containers() {
        return this.containers;
    }

    /**
     * Set the containers property: The containers collection under a replica.
     *
     * @param containers the containers value to set.
     * @return the ReplicaProperties object itself.
     */
    public ReplicaProperties withContainers(List<ReplicaContainer> containers) {
        this.containers = containers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (containers() != null) {
            containers().forEach(e -> e.validate());
        }
    }
}
