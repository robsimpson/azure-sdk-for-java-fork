// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual disk model. */
@Fluent
public final class VirtualDisk {
    /*
     * Disk's Controller id
     */
    @JsonProperty(value = "controllerId", required = true)
    private String controllerId;

    /*
     * Disk's independence mode type
     */
    @JsonProperty(value = "independenceMode", required = true)
    private DiskIndependenceMode independenceMode;

    /*
     * Disk's total size
     */
    @JsonProperty(value = "totalSize", required = true)
    private int totalSize;

    /*
     * Disk's id
     */
    @JsonProperty(value = "virtualDiskId")
    private String virtualDiskId;

    /*
     * Disk's display name
     */
    @JsonProperty(value = "virtualDiskName", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualDiskName;

    /** Creates an instance of VirtualDisk class. */
    public VirtualDisk() {
    }

    /**
     * Get the controllerId property: Disk's Controller id.
     *
     * @return the controllerId value.
     */
    public String controllerId() {
        return this.controllerId;
    }

    /**
     * Set the controllerId property: Disk's Controller id.
     *
     * @param controllerId the controllerId value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withControllerId(String controllerId) {
        this.controllerId = controllerId;
        return this;
    }

    /**
     * Get the independenceMode property: Disk's independence mode type.
     *
     * @return the independenceMode value.
     */
    public DiskIndependenceMode independenceMode() {
        return this.independenceMode;
    }

    /**
     * Set the independenceMode property: Disk's independence mode type.
     *
     * @param independenceMode the independenceMode value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withIndependenceMode(DiskIndependenceMode independenceMode) {
        this.independenceMode = independenceMode;
        return this;
    }

    /**
     * Get the totalSize property: Disk's total size.
     *
     * @return the totalSize value.
     */
    public int totalSize() {
        return this.totalSize;
    }

    /**
     * Set the totalSize property: Disk's total size.
     *
     * @param totalSize the totalSize value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withTotalSize(int totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * Get the virtualDiskId property: Disk's id.
     *
     * @return the virtualDiskId value.
     */
    public String virtualDiskId() {
        return this.virtualDiskId;
    }

    /**
     * Set the virtualDiskId property: Disk's id.
     *
     * @param virtualDiskId the virtualDiskId value to set.
     * @return the VirtualDisk object itself.
     */
    public VirtualDisk withVirtualDiskId(String virtualDiskId) {
        this.virtualDiskId = virtualDiskId;
        return this;
    }

    /**
     * Get the virtualDiskName property: Disk's display name.
     *
     * @return the virtualDiskName value.
     */
    public String virtualDiskName() {
        return this.virtualDiskName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (controllerId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property controllerId in model VirtualDisk"));
        }
        if (independenceMode() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property independenceMode in model VirtualDisk"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualDisk.class);
}
