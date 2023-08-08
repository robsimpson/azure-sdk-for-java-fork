// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Specifies that the content key ID is specified in the PlayReady configuration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier")
@Fluent
public final class ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier
    extends ContentKeyPolicyPlayReadyContentKeyLocation {
    /*
     * The content key ID.
     */
    @JsonProperty(value = "keyId", required = true)
    private UUID keyId;

    /** Creates an instance of ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier class. */
    public ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier() {
    }

    /**
     * Get the keyId property: The content key ID.
     *
     * @return the keyId value.
     */
    public UUID keyId() {
        return this.keyId;
    }

    /**
     * Set the keyId property: The content key ID.
     *
     * @param keyId the keyId value to set.
     * @return the ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier object itself.
     */
    public ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier withKeyId(UUID keyId) {
        this.keyId = keyId;
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
        if (keyId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyId in model"
                            + " ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier"));
        }
    }

    private static final ClientLogger LOGGER =
        new ClientLogger(ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier.class);
}
