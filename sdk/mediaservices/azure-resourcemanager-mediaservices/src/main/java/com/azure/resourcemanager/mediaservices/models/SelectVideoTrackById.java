// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Select video tracks from the input by specifying a track identifier. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.SelectVideoTrackById")
@Fluent
public final class SelectVideoTrackById extends VideoTrackDescriptor {
    /*
     * Track identifier to select
     */
    @JsonProperty(value = "trackId", required = true)
    private long trackId;

    /** Creates an instance of SelectVideoTrackById class. */
    public SelectVideoTrackById() {
    }

    /**
     * Get the trackId property: Track identifier to select.
     *
     * @return the trackId value.
     */
    public long trackId() {
        return this.trackId;
    }

    /**
     * Set the trackId property: Track identifier to select.
     *
     * @param trackId the trackId value to set.
     * @return the SelectVideoTrackById object itself.
     */
    public SelectVideoTrackById withTrackId(long trackId) {
        this.trackId = trackId;
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
