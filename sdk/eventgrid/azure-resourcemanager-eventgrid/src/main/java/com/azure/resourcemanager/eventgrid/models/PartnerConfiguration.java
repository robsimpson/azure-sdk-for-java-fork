// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerConfigurationInner;
import java.util.Map;

/** An immutable client-side representation of PartnerConfiguration. */
public interface PartnerConfiguration {
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
     * Gets the systemData property: The system metadata relating to partner configuration resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the location property: Location of the resource.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Tags of the resource.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the partnerAuthorization property: The details of authorized partners.
     *
     * @return the partnerAuthorization value.
     */
    PartnerAuthorization partnerAuthorization();

    /**
     * Gets the provisioningState property: Provisioning state of the partner configuration.
     *
     * @return the provisioningState value.
     */
    PartnerConfigurationProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.PartnerConfigurationInner object.
     *
     * @return the inner object.
     */
    PartnerConfigurationInner innerModel();
}
