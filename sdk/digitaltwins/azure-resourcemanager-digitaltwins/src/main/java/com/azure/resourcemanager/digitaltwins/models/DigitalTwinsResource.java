// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The common properties of a DigitalTwinsInstance. */
@Fluent
public class DigitalTwinsResource extends Resource {
    /*
     * The managed identity for the DigitalTwinsInstance.
     */
    @JsonProperty(value = "identity")
    private DigitalTwinsIdentity identity;

    /*
     * Metadata pertaining to creation and last modification of the DigitalTwinsInstance.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of DigitalTwinsResource class. */
    public DigitalTwinsResource() {
    }

    /**
     * Get the identity property: The managed identity for the DigitalTwinsInstance.
     *
     * @return the identity value.
     */
    public DigitalTwinsIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identity for the DigitalTwinsInstance.
     *
     * @param identity the identity value to set.
     * @return the DigitalTwinsResource object itself.
     */
    public DigitalTwinsResource withIdentity(DigitalTwinsIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the DigitalTwinsInstance.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public DigitalTwinsResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DigitalTwinsResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
