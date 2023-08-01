// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LinuxProfile - Profile for Linux VMs in the container service cluster. */
@Fluent
public class LinuxProfile {
    /*
     * Profile for Linux VMs in the container service cluster.
     */
    @JsonProperty(value = "linuxProfile")
    private LinuxProfileProperties linuxProfile;

    /** Creates an instance of LinuxProfile class. */
    public LinuxProfile() {
    }

    /**
     * Get the linuxProfile property: Profile for Linux VMs in the container service cluster.
     *
     * @return the linuxProfile value.
     */
    public LinuxProfileProperties linuxProfile() {
        return this.linuxProfile;
    }

    /**
     * Set the linuxProfile property: Profile for Linux VMs in the container service cluster.
     *
     * @param linuxProfile the linuxProfile value to set.
     * @return the LinuxProfile object itself.
     */
    public LinuxProfile withLinuxProfile(LinuxProfileProperties linuxProfile) {
        this.linuxProfile = linuxProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linuxProfile() != null) {
            linuxProfile().validate();
        }
    }
}
