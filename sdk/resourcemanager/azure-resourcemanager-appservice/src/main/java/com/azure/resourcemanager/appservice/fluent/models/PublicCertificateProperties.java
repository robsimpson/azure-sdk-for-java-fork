// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.resourcemanager.appservice.models.PublicCertificateLocation;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PublicCertificate resource specific properties. */
@Fluent
public final class PublicCertificateProperties {
    /*
     * Public Certificate byte array
     */
    @JsonProperty(value = "blob")
    private byte[] blob;

    /*
     * Public Certificate Location
     */
    @JsonProperty(value = "publicCertificateLocation")
    private PublicCertificateLocation publicCertificateLocation;

    /*
     * Certificate Thumbprint
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /** Creates an instance of PublicCertificateProperties class. */
    public PublicCertificateProperties() {
    }

    /**
     * Get the blob property: Public Certificate byte array.
     *
     * @return the blob value.
     */
    public byte[] blob() {
        return CoreUtils.clone(this.blob);
    }

    /**
     * Set the blob property: Public Certificate byte array.
     *
     * @param blob the blob value to set.
     * @return the PublicCertificateProperties object itself.
     */
    public PublicCertificateProperties withBlob(byte[] blob) {
        this.blob = CoreUtils.clone(blob);
        return this;
    }

    /**
     * Get the publicCertificateLocation property: Public Certificate Location.
     *
     * @return the publicCertificateLocation value.
     */
    public PublicCertificateLocation publicCertificateLocation() {
        return this.publicCertificateLocation;
    }

    /**
     * Set the publicCertificateLocation property: Public Certificate Location.
     *
     * @param publicCertificateLocation the publicCertificateLocation value to set.
     * @return the PublicCertificateProperties object itself.
     */
    public PublicCertificateProperties withPublicCertificateLocation(
        PublicCertificateLocation publicCertificateLocation) {
        this.publicCertificateLocation = publicCertificateLocation;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate Thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
