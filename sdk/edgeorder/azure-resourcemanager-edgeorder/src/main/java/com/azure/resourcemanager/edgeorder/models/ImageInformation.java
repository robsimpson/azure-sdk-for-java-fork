// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Image for the product. */
@Immutable
public final class ImageInformation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageInformation.class);

    /*
     * Type of the image
     */
    @JsonProperty(value = "imageType", access = JsonProperty.Access.WRITE_ONLY)
    private ImageType imageType;

    /*
     * Url of the image
     */
    @JsonProperty(value = "imageUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String imageUrl;

    /**
     * Get the imageType property: Type of the image.
     *
     * @return the imageType value.
     */
    public ImageType imageType() {
        return this.imageType;
    }

    /**
     * Get the imageUrl property: Url of the image.
     *
     * @return the imageUrl value.
     */
    public String imageUrl() {
        return this.imageUrl;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
