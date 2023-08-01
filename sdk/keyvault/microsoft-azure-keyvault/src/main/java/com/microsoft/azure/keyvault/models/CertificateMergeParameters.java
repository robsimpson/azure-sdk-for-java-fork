// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The certificate merge parameters.
 */
public class CertificateMergeParameters {
    /**
     * The certificate or the certificate chain to merge.
     */
    @JsonProperty(value = "x5c", required = true)
    private List<byte[]> x509Certificates;

    /**
     * The attributes of the certificate (optional).
     */
    @JsonProperty(value = "attributes")
    private CertificateAttributes certificateAttributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the x509Certificates value.
     *
     * @return the x509Certificates value
     */
    public List<byte[]> x509Certificates() {
        return this.x509Certificates;
    }

    /**
     * Set the x509Certificates value.
     *
     * @param x509Certificates the x509Certificates value to set
     * @return the CertificateMergeParameters object itself.
     */
    public CertificateMergeParameters withX509Certificates(List<byte[]> x509Certificates) {
        this.x509Certificates = x509Certificates;
        return this;
    }

    /**
     * Get the certificateAttributes value.
     *
     * @return the certificateAttributes value
     */
    public CertificateAttributes certificateAttributes() {
        return this.certificateAttributes;
    }

    /**
     * Set the certificateAttributes value.
     *
     * @param certificateAttributes the certificateAttributes value to set
     * @return the CertificateMergeParameters object itself.
     */
    public CertificateMergeParameters withCertificateAttributes(CertificateAttributes certificateAttributes) {
        this.certificateAttributes = certificateAttributes;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the CertificateMergeParameters object itself.
     */
    public CertificateMergeParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
