// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkDeviceSkuInner;
import java.util.List;

/** An immutable client-side representation of NetworkDeviceSku. */
public interface NetworkDeviceSku {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the model property: Model of the network device.
     *
     * @return the model value.
     */
    String model();

    /**
     * Gets the manufacturer property: Manufacturer of the network device.
     *
     * @return the manufacturer value.
     */
    String manufacturer();

    /**
     * Gets the supportedVersions property: List of supported version details of network device.
     *
     * @return the supportedVersions value.
     */
    List<SupportedVersionProperties> supportedVersions();

    /**
     * Gets the supportedRoleTypes property: Available roles for the network device.
     *
     * @return the supportedRoleTypes value.
     */
    List<NetworkDeviceRoleName> supportedRoleTypes();

    /**
     * Gets the interfaces property: List of network device interfaces.
     *
     * @return the interfaces value.
     */
    List<DeviceInterfaceProperties> interfaces();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkDeviceSkuInner object.
     *
     * @return the inner object.
     */
    NetworkDeviceSkuInner innerModel();
}
