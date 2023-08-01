// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.operationsmanagement.models.ManagementAssociationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The container for solution. */
@Fluent
public final class ManagementAssociationInner extends ProxyResource {
    /*
     * Resource location
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Properties for ManagementAssociation object supported by the OperationsManagement resource provider.
     */
    @JsonProperty(value = "properties")
    private ManagementAssociationProperties properties;

    /** Creates an instance of ManagementAssociationInner class. */
    public ManagementAssociationInner() {
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     *
     * @param location the location value to set.
     * @return the ManagementAssociationInner object itself.
     */
    public ManagementAssociationInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the properties property: Properties for ManagementAssociation object supported by the OperationsManagement
     * resource provider.
     *
     * @return the properties value.
     */
    public ManagementAssociationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties for ManagementAssociation object supported by the OperationsManagement
     * resource provider.
     *
     * @param properties the properties value to set.
     * @return the ManagementAssociationInner object itself.
     */
    public ManagementAssociationInner withProperties(ManagementAssociationProperties properties) {
        this.properties = properties;
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
    }
}
