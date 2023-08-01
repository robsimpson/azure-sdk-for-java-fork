// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Definition of the certificate. */
@Fluent
public final class CertificateInner extends ProxyResource {
    /*
     * Gets or sets the properties of the certificate.
     */
    @JsonProperty(value = "properties")
    private CertificateProperties innerProperties;

    /**
     * Get the innerProperties property: Gets or sets the properties of the certificate.
     *
     * @return the innerProperties value.
     */
    private CertificateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the thumbprint property: Gets the thumbprint of the certificate.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Get the expiryTime property: Gets the expiry time of the certificate.
     *
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expiryTime();
    }

    /**
     * Get the isExportable property: Gets the is exportable flag of the certificate.
     *
     * @return the isExportable value.
     */
    public Boolean isExportable() {
        return this.innerProperties() == null ? null : this.innerProperties().isExportable();
    }

    /**
     * Get the creationTime property: Gets the creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Get the lastModifiedTime property: Gets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Get the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Gets or sets the description.
     *
     * @param description the description value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CertificateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
