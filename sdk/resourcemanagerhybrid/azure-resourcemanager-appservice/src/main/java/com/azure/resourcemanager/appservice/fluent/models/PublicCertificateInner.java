// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.PublicCertificateLocation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Public certificate object. */
@Fluent
public final class PublicCertificateInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicCertificateInner.class);

    /*
     * PublicCertificate resource specific properties
     */
    @JsonProperty(value = "properties")
    private PublicCertificateProperties innerProperties;

    /**
     * Get the innerProperties property: PublicCertificate resource specific properties.
     *
     * @return the innerProperties value.
     */
    private PublicCertificateProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public PublicCertificateInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the blob property: Public Certificate byte array.
     *
     * @return the blob value.
     */
    public byte[] blob() {
        return this.innerProperties() == null ? null : this.innerProperties().blob();
    }

    /**
     * Set the blob property: Public Certificate byte array.
     *
     * @param blob the blob value to set.
     * @return the PublicCertificateInner object itself.
     */
    public PublicCertificateInner withBlob(byte[] blob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicCertificateProperties();
        }
        this.innerProperties().withBlob(blob);
        return this;
    }

    /**
     * Get the publicCertificateLocation property: Public Certificate Location.
     *
     * @return the publicCertificateLocation value.
     */
    public PublicCertificateLocation publicCertificateLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().publicCertificateLocation();
    }

    /**
     * Set the publicCertificateLocation property: Public Certificate Location.
     *
     * @param publicCertificateLocation the publicCertificateLocation value to set.
     * @return the PublicCertificateInner object itself.
     */
    public PublicCertificateInner withPublicCertificateLocation(PublicCertificateLocation publicCertificateLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PublicCertificateProperties();
        }
        this.innerProperties().withPublicCertificateLocation(publicCertificateLocation);
        return this;
    }

    /**
     * Get the thumbprint property: Certificate Thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
