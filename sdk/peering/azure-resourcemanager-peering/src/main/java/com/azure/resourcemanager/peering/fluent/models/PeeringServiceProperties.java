// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.peering.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that define connectivity to the Peering Service. */
@Fluent
public final class PeeringServiceProperties {
    /*
     * The location (state/province) of the customer.
     */
    @JsonProperty(value = "peeringServiceLocation")
    private String peeringServiceLocation;

    /*
     * The name of the service provider.
     */
    @JsonProperty(value = "peeringServiceProvider")
    private String peeringServiceProvider;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The primary peering (Microsoft/service provider) location to be used for customer traffic.
     */
    @JsonProperty(value = "providerPrimaryPeeringLocation")
    private String providerPrimaryPeeringLocation;

    /*
     * The backup peering (Microsoft/service provider) location to be used for customer traffic.
     */
    @JsonProperty(value = "providerBackupPeeringLocation")
    private String providerBackupPeeringLocation;

    /** Creates an instance of PeeringServiceProperties class. */
    public PeeringServiceProperties() {
    }

    /**
     * Get the peeringServiceLocation property: The location (state/province) of the customer.
     *
     * @return the peeringServiceLocation value.
     */
    public String peeringServiceLocation() {
        return this.peeringServiceLocation;
    }

    /**
     * Set the peeringServiceLocation property: The location (state/province) of the customer.
     *
     * @param peeringServiceLocation the peeringServiceLocation value to set.
     * @return the PeeringServiceProperties object itself.
     */
    public PeeringServiceProperties withPeeringServiceLocation(String peeringServiceLocation) {
        this.peeringServiceLocation = peeringServiceLocation;
        return this;
    }

    /**
     * Get the peeringServiceProvider property: The name of the service provider.
     *
     * @return the peeringServiceProvider value.
     */
    public String peeringServiceProvider() {
        return this.peeringServiceProvider;
    }

    /**
     * Set the peeringServiceProvider property: The name of the service provider.
     *
     * @param peeringServiceProvider the peeringServiceProvider value to set.
     * @return the PeeringServiceProperties object itself.
     */
    public PeeringServiceProperties withPeeringServiceProvider(String peeringServiceProvider) {
        this.peeringServiceProvider = peeringServiceProvider;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the providerPrimaryPeeringLocation property: The primary peering (Microsoft/service provider) location to be
     * used for customer traffic.
     *
     * @return the providerPrimaryPeeringLocation value.
     */
    public String providerPrimaryPeeringLocation() {
        return this.providerPrimaryPeeringLocation;
    }

    /**
     * Set the providerPrimaryPeeringLocation property: The primary peering (Microsoft/service provider) location to be
     * used for customer traffic.
     *
     * @param providerPrimaryPeeringLocation the providerPrimaryPeeringLocation value to set.
     * @return the PeeringServiceProperties object itself.
     */
    public PeeringServiceProperties withProviderPrimaryPeeringLocation(String providerPrimaryPeeringLocation) {
        this.providerPrimaryPeeringLocation = providerPrimaryPeeringLocation;
        return this;
    }

    /**
     * Get the providerBackupPeeringLocation property: The backup peering (Microsoft/service provider) location to be
     * used for customer traffic.
     *
     * @return the providerBackupPeeringLocation value.
     */
    public String providerBackupPeeringLocation() {
        return this.providerBackupPeeringLocation;
    }

    /**
     * Set the providerBackupPeeringLocation property: The backup peering (Microsoft/service provider) location to be
     * used for customer traffic.
     *
     * @param providerBackupPeeringLocation the providerBackupPeeringLocation value to set.
     * @return the PeeringServiceProperties object itself.
     */
    public PeeringServiceProperties withProviderBackupPeeringLocation(String providerBackupPeeringLocation) {
        this.providerBackupPeeringLocation = providerBackupPeeringLocation;
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
