// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The type used for update operations of the FirewallResource. */
@Fluent
public final class FirewallResourceUpdate {
    /*
     * The managed service identities assigned to this resource.
     */
    @JsonProperty(value = "identity")
    private AzureResourceManagerManagedIdentityProperties identity;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The updatable properties of the FirewallResource.
     */
    @JsonProperty(value = "properties")
    private FirewallResourceUpdateProperties properties;

    /** Creates an instance of FirewallResourceUpdate class. */
    public FirewallResourceUpdate() {
    }

    /**
     * Get the identity property: The managed service identities assigned to this resource.
     *
     * @return the identity value.
     */
    public AzureResourceManagerManagedIdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed service identities assigned to this resource.
     *
     * @param identity the identity value to set.
     * @return the FirewallResourceUpdate object itself.
     */
    public FirewallResourceUpdate withIdentity(AzureResourceManagerManagedIdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the FirewallResourceUpdate object itself.
     */
    public FirewallResourceUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The updatable properties of the FirewallResource.
     *
     * @return the properties value.
     */
    public FirewallResourceUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The updatable properties of the FirewallResource.
     *
     * @param properties the properties value to set.
     * @return the FirewallResourceUpdate object itself.
     */
    public FirewallResourceUpdate withProperties(FirewallResourceUpdateProperties properties) {
        this.properties = properties;
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
