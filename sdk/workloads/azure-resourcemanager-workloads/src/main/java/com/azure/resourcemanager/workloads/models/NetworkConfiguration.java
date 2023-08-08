// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the network configuration type for SAP system infrastructure that is being deployed. */
@Fluent
public final class NetworkConfiguration {
    /*
     * Specifies whether a secondary IP address should be added to the network interface on all VMs of the SAP system
     * being deployed
     */
    @JsonProperty(value = "isSecondaryIpEnabled")
    private Boolean isSecondaryIpEnabled;

    /** Creates an instance of NetworkConfiguration class. */
    public NetworkConfiguration() {
    }

    /**
     * Get the isSecondaryIpEnabled property: Specifies whether a secondary IP address should be added to the network
     * interface on all VMs of the SAP system being deployed.
     *
     * @return the isSecondaryIpEnabled value.
     */
    public Boolean isSecondaryIpEnabled() {
        return this.isSecondaryIpEnabled;
    }

    /**
     * Set the isSecondaryIpEnabled property: Specifies whether a secondary IP address should be added to the network
     * interface on all VMs of the SAP system being deployed.
     *
     * @param isSecondaryIpEnabled the isSecondaryIpEnabled value to set.
     * @return the NetworkConfiguration object itself.
     */
    public NetworkConfiguration withIsSecondaryIpEnabled(Boolean isSecondaryIpEnabled) {
        this.isSecondaryIpEnabled = isSecondaryIpEnabled;
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
