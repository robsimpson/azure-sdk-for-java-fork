// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The virtualNetworks resource definition. */
@Fluent
public final class VirtualNetworksInner extends Resource {
    /*
     * HybridAKSNetworkSpec defines the desired state of HybridAKSNetwork
     */
    @JsonProperty(value = "properties")
    private VirtualNetworksProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The extendedLocation property.
     */
    @JsonProperty(value = "extendedLocation")
    private VirtualNetworksExtendedLocation extendedLocation;

    /** Creates an instance of VirtualNetworksInner class. */
    public VirtualNetworksInner() {
    }

    /**
     * Get the properties property: HybridAKSNetworkSpec defines the desired state of HybridAKSNetwork.
     *
     * @return the properties value.
     */
    public VirtualNetworksProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: HybridAKSNetworkSpec defines the desired state of HybridAKSNetwork.
     *
     * @param properties the properties value to set.
     * @return the VirtualNetworksInner object itself.
     */
    public VirtualNetworksInner withProperties(VirtualNetworksProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the extendedLocation property: The extendedLocation property.
     *
     * @return the extendedLocation value.
     */
    public VirtualNetworksExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extendedLocation property.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the VirtualNetworksInner object itself.
     */
    public VirtualNetworksInner withExtendedLocation(VirtualNetworksExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworksInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworksInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
