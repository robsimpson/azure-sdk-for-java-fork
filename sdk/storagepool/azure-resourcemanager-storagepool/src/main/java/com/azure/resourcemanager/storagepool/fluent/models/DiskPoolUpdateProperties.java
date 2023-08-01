// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storagepool.models.Disk;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties for Disk Pool update request. */
@Fluent
public final class DiskPoolUpdateProperties {
    /*
     * List of Azure Managed Disks to attach to a Disk Pool.
     */
    @JsonProperty(value = "disks")
    private List<Disk> disks;

    /** Creates an instance of DiskPoolUpdateProperties class. */
    public DiskPoolUpdateProperties() {
    }

    /**
     * Get the disks property: List of Azure Managed Disks to attach to a Disk Pool.
     *
     * @return the disks value.
     */
    public List<Disk> disks() {
        return this.disks;
    }

    /**
     * Set the disks property: List of Azure Managed Disks to attach to a Disk Pool.
     *
     * @param disks the disks value to set.
     * @return the DiskPoolUpdateProperties object itself.
     */
    public DiskPoolUpdateProperties withDisks(List<Disk> disks) {
        this.disks = disks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (disks() != null) {
            disks().forEach(e -> e.validate());
        }
    }
}
