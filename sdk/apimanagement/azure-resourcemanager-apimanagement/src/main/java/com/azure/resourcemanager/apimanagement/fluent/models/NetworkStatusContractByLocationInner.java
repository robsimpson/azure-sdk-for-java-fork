// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network Status in the Location. */
@Fluent
public final class NetworkStatusContractByLocationInner {
    /*
     * Location of service
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Network status in Location
     */
    @JsonProperty(value = "networkStatus")
    private NetworkStatusContractInner networkStatus;

    /**
     * Get the location property: Location of service.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location of service.
     *
     * @param location the location value to set.
     * @return the NetworkStatusContractByLocationInner object itself.
     */
    public NetworkStatusContractByLocationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the networkStatus property: Network status in Location.
     *
     * @return the networkStatus value.
     */
    public NetworkStatusContractInner networkStatus() {
        return this.networkStatus;
    }

    /**
     * Set the networkStatus property: Network status in Location.
     *
     * @param networkStatus the networkStatus value to set.
     * @return the NetworkStatusContractByLocationInner object itself.
     */
    public NetworkStatusContractByLocationInner withNetworkStatus(NetworkStatusContractInner networkStatus) {
        this.networkStatus = networkStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkStatus() != null) {
            networkStatus().validate();
        }
    }
}
