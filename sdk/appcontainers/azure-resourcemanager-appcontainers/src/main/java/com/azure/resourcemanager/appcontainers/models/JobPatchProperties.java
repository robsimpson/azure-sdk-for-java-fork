// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Container Apps Job resource specific properties. */
@Fluent
public final class JobPatchProperties {
    /*
     * Managed identities needed by a container app job to interact with other Azure services to not maintain any
     * secrets or credentials in code.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private JobPatchPropertiesProperties properties;

    /** Creates an instance of JobPatchProperties class. */
    public JobPatchProperties() {
    }

    /**
     * Get the identity property: Managed identities needed by a container app job to interact with other Azure services
     * to not maintain any secrets or credentials in code.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identities needed by a container app job to interact with other Azure services
     * to not maintain any secrets or credentials in code.
     *
     * @param identity the identity value to set.
     * @return the JobPatchProperties object itself.
     */
    public JobPatchProperties withIdentity(ManagedServiceIdentity identity) {
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
     * @return the JobPatchProperties object itself.
     */
    public JobPatchProperties withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public JobPatchPropertiesProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the JobPatchProperties object itself.
     */
    public JobPatchProperties withProperties(JobPatchPropertiesProperties properties) {
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
