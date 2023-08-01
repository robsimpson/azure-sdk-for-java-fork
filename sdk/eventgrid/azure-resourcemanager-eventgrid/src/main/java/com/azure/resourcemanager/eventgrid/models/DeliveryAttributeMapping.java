// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Delivery attribute mapping details. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = DeliveryAttributeMapping.class)
@JsonTypeName("DeliveryAttributeMapping")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Static", value = StaticDeliveryAttributeMapping.class),
    @JsonSubTypes.Type(name = "Dynamic", value = DynamicDeliveryAttributeMapping.class)
})
@Fluent
public class DeliveryAttributeMapping {
    /*
     * Name of the delivery attribute or header.
     */
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of DeliveryAttributeMapping class. */
    public DeliveryAttributeMapping() {
    }

    /**
     * Get the name property: Name of the delivery attribute or header.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the delivery attribute or header.
     *
     * @param name the name value to set.
     * @return the DeliveryAttributeMapping object itself.
     */
    public DeliveryAttributeMapping withName(String name) {
        this.name = name;
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
