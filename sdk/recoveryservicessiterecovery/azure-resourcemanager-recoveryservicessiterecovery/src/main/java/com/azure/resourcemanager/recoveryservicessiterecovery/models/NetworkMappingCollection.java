// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.NetworkMappingInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of network mappings. As with NetworkMapping, it should be possible to reuse a prev version of this class. It
 * doesn't seem likely this class could be anything more than a slightly bespoke collection of NetworkMapping. Hence it
 * makes sense to override Load with Base.NetworkMapping instead of existing CurrentVersion.NetworkMapping.
 */
@Fluent
public final class NetworkMappingCollection {
    /*
     * The Network Mappings list.
     */
    @JsonProperty(value = "value")
    private List<NetworkMappingInner> value;

    /*
     * The value of next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of NetworkMappingCollection class. */
    public NetworkMappingCollection() {
    }

    /**
     * Get the value property: The Network Mappings list.
     *
     * @return the value value.
     */
    public List<NetworkMappingInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The Network Mappings list.
     *
     * @param value the value value to set.
     * @return the NetworkMappingCollection object itself.
     */
    public NetworkMappingCollection withValue(List<NetworkMappingInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the NetworkMappingCollection object itself.
     */
    public NetworkMappingCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
