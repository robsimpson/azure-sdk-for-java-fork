// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Integration runtime debug resource. */
@Fluent
public final class IntegrationRuntimeDebugResource extends SubResourceDebugResource {
    /*
     * Integration runtime properties.
     */
    @JsonProperty(value = "properties", required = true)
    private IntegrationRuntime properties;

    /** Creates an instance of IntegrationRuntimeDebugResource class. */
    public IntegrationRuntimeDebugResource() {}

    /**
     * Get the properties property: Integration runtime properties.
     *
     * @return the properties value.
     */
    public IntegrationRuntime getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Integration runtime properties.
     *
     * @param properties the properties value to set.
     * @return the IntegrationRuntimeDebugResource object itself.
     */
    public IntegrationRuntimeDebugResource setProperties(IntegrationRuntime properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IntegrationRuntimeDebugResource setName(String name) {
        super.setName(name);
        return this;
    }
}
