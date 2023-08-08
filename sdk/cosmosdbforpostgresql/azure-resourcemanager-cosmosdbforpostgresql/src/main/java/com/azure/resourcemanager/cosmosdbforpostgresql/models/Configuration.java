// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ConfigurationInner;
import java.util.List;

/** An immutable client-side representation of Configuration. */
public interface Configuration {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: Description of the configuration.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the dataType property: Data type of the configuration.
     *
     * @return the dataType value.
     */
    ConfigurationDataType dataType();

    /**
     * Gets the allowedValues property: Allowed values of the configuration.
     *
     * @return the allowedValues value.
     */
    String allowedValues();

    /**
     * Gets the requiresRestart property: If configuration change requires restart.
     *
     * @return the requiresRestart value.
     */
    Boolean requiresRestart();

    /**
     * Gets the serverRoleGroupConfigurations property: The list of server role group configuration values.
     *
     * @return the serverRoleGroupConfigurations value.
     */
    List<ServerRoleGroupConfiguration> serverRoleGroupConfigurations();

    /**
     * Gets the provisioningState property: Provisioning state of the configuration.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ConfigurationInner object.
     *
     * @return the inner object.
     */
    ConfigurationInner innerModel();
}
