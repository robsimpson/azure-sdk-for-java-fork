// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The UriFileJobOutput model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobOutputType")
@JsonTypeName("uri_file")
@Fluent
public final class UriFileJobOutput extends JobOutput {
    /*
     * Output Asset Delivery Mode.
     */
    @JsonProperty(value = "mode")
    private OutputDeliveryMode mode;

    /*
     * Output Asset URI.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /** Creates an instance of UriFileJobOutput class. */
    public UriFileJobOutput() {
    }

    /**
     * Get the mode property: Output Asset Delivery Mode.
     *
     * @return the mode value.
     */
    public OutputDeliveryMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Output Asset Delivery Mode.
     *
     * @param mode the mode value to set.
     * @return the UriFileJobOutput object itself.
     */
    public UriFileJobOutput withMode(OutputDeliveryMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the uri property: Output Asset URI.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: Output Asset URI.
     *
     * @param uri the uri value to set.
     * @return the UriFileJobOutput object itself.
     */
    public UriFileJobOutput withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UriFileJobOutput withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
