// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Packet core data plane resource. Must be created in the same location as its parent packet core control plane. */
@Fluent
public final class PacketCoreDataPlaneInner extends Resource {
    /*
     * Packet core data plane Properties.
     */
    @JsonProperty(value = "properties", required = true)
    private PacketCoreDataPlanePropertiesFormat innerProperties = new PacketCoreDataPlanePropertiesFormat();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of PacketCoreDataPlaneInner class. */
    public PacketCoreDataPlaneInner() {
    }

    /**
     * Get the innerProperties property: Packet core data plane Properties.
     *
     * @return the innerProperties value.
     */
    private PacketCoreDataPlanePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public PacketCoreDataPlaneInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PacketCoreDataPlaneInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet core data plane resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the userPlaneAccessInterface property: The user plane interface on the access network. For 5G networks, this
     * is the N3 interface. For 4G networks, this is the S1-U interface.
     *
     * @return the userPlaneAccessInterface value.
     */
    public InterfaceProperties userPlaneAccessInterface() {
        return this.innerProperties() == null ? null : this.innerProperties().userPlaneAccessInterface();
    }

    /**
     * Set the userPlaneAccessInterface property: The user plane interface on the access network. For 5G networks, this
     * is the N3 interface. For 4G networks, this is the S1-U interface.
     *
     * @param userPlaneAccessInterface the userPlaneAccessInterface value to set.
     * @return the PacketCoreDataPlaneInner object itself.
     */
    public PacketCoreDataPlaneInner withUserPlaneAccessInterface(InterfaceProperties userPlaneAccessInterface) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreDataPlanePropertiesFormat();
        }
        this.innerProperties().withUserPlaneAccessInterface(userPlaneAccessInterface);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model PacketCoreDataPlaneInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PacketCoreDataPlaneInner.class);
}
