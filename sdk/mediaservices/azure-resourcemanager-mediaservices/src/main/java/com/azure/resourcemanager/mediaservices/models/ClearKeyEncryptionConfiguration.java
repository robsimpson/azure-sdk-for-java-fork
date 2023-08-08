// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class to specify ClearKey configuration of common encryption schemes in Streaming Policy. */
@Fluent
public final class ClearKeyEncryptionConfiguration {
    /*
     * Template for the URL of the custom service delivering content keys to end user players. Not required when using
     * Azure Media Services for issuing licenses. The template supports replaceable tokens that the service will update
     * at runtime with the value specific to the request.  The currently supported token value is {AlternativeMediaId},
     * which is replaced with the value of StreamingLocatorId.AlternativeMediaId.
     */
    @JsonProperty(value = "customKeysAcquisitionUrlTemplate")
    private String customKeysAcquisitionUrlTemplate;

    /** Creates an instance of ClearKeyEncryptionConfiguration class. */
    public ClearKeyEncryptionConfiguration() {
    }

    /**
     * Get the customKeysAcquisitionUrlTemplate property: Template for the URL of the custom service delivering content
     * keys to end user players. Not required when using Azure Media Services for issuing licenses. The template
     * supports replaceable tokens that the service will update at runtime with the value specific to the request. The
     * currently supported token value is {AlternativeMediaId}, which is replaced with the value of
     * StreamingLocatorId.AlternativeMediaId.
     *
     * @return the customKeysAcquisitionUrlTemplate value.
     */
    public String customKeysAcquisitionUrlTemplate() {
        return this.customKeysAcquisitionUrlTemplate;
    }

    /**
     * Set the customKeysAcquisitionUrlTemplate property: Template for the URL of the custom service delivering content
     * keys to end user players. Not required when using Azure Media Services for issuing licenses. The template
     * supports replaceable tokens that the service will update at runtime with the value specific to the request. The
     * currently supported token value is {AlternativeMediaId}, which is replaced with the value of
     * StreamingLocatorId.AlternativeMediaId.
     *
     * @param customKeysAcquisitionUrlTemplate the customKeysAcquisitionUrlTemplate value to set.
     * @return the ClearKeyEncryptionConfiguration object itself.
     */
    public ClearKeyEncryptionConfiguration withCustomKeysAcquisitionUrlTemplate(
        String customKeysAcquisitionUrlTemplate) {
        this.customKeysAcquisitionUrlTemplate = customKeysAcquisitionUrlTemplate;
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
