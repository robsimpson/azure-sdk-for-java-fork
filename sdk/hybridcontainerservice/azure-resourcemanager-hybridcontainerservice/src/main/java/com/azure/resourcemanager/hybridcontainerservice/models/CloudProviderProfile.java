// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CloudProviderProfile - The underlying cloud infra provider properties. */
@Fluent
public final class CloudProviderProfile {
    /*
     * InfraNetworkProfile - List of infra network profiles for the provisioned cluster
     */
    @JsonProperty(value = "infraNetworkProfile")
    private CloudProviderProfileInfraNetworkProfile infraNetworkProfile;

    /*
     * InfraStorageProfile - List of infra storage profiles for the provisioned cluster
     */
    @JsonProperty(value = "infraStorageProfile")
    private CloudProviderProfileInfraStorageProfile infraStorageProfile;

    /** Creates an instance of CloudProviderProfile class. */
    public CloudProviderProfile() {
    }

    /**
     * Get the infraNetworkProfile property: InfraNetworkProfile - List of infra network profiles for the provisioned
     * cluster.
     *
     * @return the infraNetworkProfile value.
     */
    public CloudProviderProfileInfraNetworkProfile infraNetworkProfile() {
        return this.infraNetworkProfile;
    }

    /**
     * Set the infraNetworkProfile property: InfraNetworkProfile - List of infra network profiles for the provisioned
     * cluster.
     *
     * @param infraNetworkProfile the infraNetworkProfile value to set.
     * @return the CloudProviderProfile object itself.
     */
    public CloudProviderProfile withInfraNetworkProfile(CloudProviderProfileInfraNetworkProfile infraNetworkProfile) {
        this.infraNetworkProfile = infraNetworkProfile;
        return this;
    }

    /**
     * Get the infraStorageProfile property: InfraStorageProfile - List of infra storage profiles for the provisioned
     * cluster.
     *
     * @return the infraStorageProfile value.
     */
    public CloudProviderProfileInfraStorageProfile infraStorageProfile() {
        return this.infraStorageProfile;
    }

    /**
     * Set the infraStorageProfile property: InfraStorageProfile - List of infra storage profiles for the provisioned
     * cluster.
     *
     * @param infraStorageProfile the infraStorageProfile value to set.
     * @return the CloudProviderProfile object itself.
     */
    public CloudProviderProfile withInfraStorageProfile(CloudProviderProfileInfraStorageProfile infraStorageProfile) {
        this.infraStorageProfile = infraStorageProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (infraNetworkProfile() != null) {
            infraNetworkProfile().validate();
        }
        if (infraStorageProfile() != null) {
            infraStorageProfile().validate();
        }
    }
}
