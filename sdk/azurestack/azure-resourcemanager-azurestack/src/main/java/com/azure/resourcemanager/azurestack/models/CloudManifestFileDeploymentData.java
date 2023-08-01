// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurestack.fluent.models.CloudManifestFileEnvironmentEndpoints;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cloud specific manifest data for AzureStack deployment. */
@Fluent
public final class CloudManifestFileDeploymentData {
    /*
     * Dsms external certificates.
     */
    @JsonProperty(value = "externalDsmsCertificates")
    private String externalDsmsCertificates;

    /*
     * Signing verification public key.
     */
    @JsonProperty(value = "customCloudVerificationKey")
    private String customCloudVerificationKey;

    /*
     * Environment endpoints.
     */
    @JsonProperty(value = "customEnvironmentEndpoints")
    private CloudManifestFileEnvironmentEndpoints innerCustomEnvironmentEndpoints;

    /** Creates an instance of CloudManifestFileDeploymentData class. */
    public CloudManifestFileDeploymentData() {
    }

    /**
     * Get the externalDsmsCertificates property: Dsms external certificates.
     *
     * @return the externalDsmsCertificates value.
     */
    public String externalDsmsCertificates() {
        return this.externalDsmsCertificates;
    }

    /**
     * Set the externalDsmsCertificates property: Dsms external certificates.
     *
     * @param externalDsmsCertificates the externalDsmsCertificates value to set.
     * @return the CloudManifestFileDeploymentData object itself.
     */
    public CloudManifestFileDeploymentData withExternalDsmsCertificates(String externalDsmsCertificates) {
        this.externalDsmsCertificates = externalDsmsCertificates;
        return this;
    }

    /**
     * Get the customCloudVerificationKey property: Signing verification public key.
     *
     * @return the customCloudVerificationKey value.
     */
    public String customCloudVerificationKey() {
        return this.customCloudVerificationKey;
    }

    /**
     * Set the customCloudVerificationKey property: Signing verification public key.
     *
     * @param customCloudVerificationKey the customCloudVerificationKey value to set.
     * @return the CloudManifestFileDeploymentData object itself.
     */
    public CloudManifestFileDeploymentData withCustomCloudVerificationKey(String customCloudVerificationKey) {
        this.customCloudVerificationKey = customCloudVerificationKey;
        return this;
    }

    /**
     * Get the innerCustomEnvironmentEndpoints property: Environment endpoints.
     *
     * @return the innerCustomEnvironmentEndpoints value.
     */
    private CloudManifestFileEnvironmentEndpoints innerCustomEnvironmentEndpoints() {
        return this.innerCustomEnvironmentEndpoints;
    }

    /**
     * Get the customCloudArmEndpoint property: ARM endpoint.
     *
     * @return the customCloudArmEndpoint value.
     */
    public String customCloudArmEndpoint() {
        return this.innerCustomEnvironmentEndpoints() == null
            ? null
            : this.innerCustomEnvironmentEndpoints().customCloudArmEndpoint();
    }

    /**
     * Set the customCloudArmEndpoint property: ARM endpoint.
     *
     * @param customCloudArmEndpoint the customCloudArmEndpoint value to set.
     * @return the CloudManifestFileDeploymentData object itself.
     */
    public CloudManifestFileDeploymentData withCustomCloudArmEndpoint(String customCloudArmEndpoint) {
        if (this.innerCustomEnvironmentEndpoints() == null) {
            this.innerCustomEnvironmentEndpoints = new CloudManifestFileEnvironmentEndpoints();
        }
        this.innerCustomEnvironmentEndpoints().withCustomCloudArmEndpoint(customCloudArmEndpoint);
        return this;
    }

    /**
     * Get the externalDsmsEndpoint property: Dsms endpoint.
     *
     * @return the externalDsmsEndpoint value.
     */
    public String externalDsmsEndpoint() {
        return this.innerCustomEnvironmentEndpoints() == null
            ? null
            : this.innerCustomEnvironmentEndpoints().externalDsmsEndpoint();
    }

    /**
     * Set the externalDsmsEndpoint property: Dsms endpoint.
     *
     * @param externalDsmsEndpoint the externalDsmsEndpoint value to set.
     * @return the CloudManifestFileDeploymentData object itself.
     */
    public CloudManifestFileDeploymentData withExternalDsmsEndpoint(String externalDsmsEndpoint) {
        if (this.innerCustomEnvironmentEndpoints() == null) {
            this.innerCustomEnvironmentEndpoints = new CloudManifestFileEnvironmentEndpoints();
        }
        this.innerCustomEnvironmentEndpoints().withExternalDsmsEndpoint(externalDsmsEndpoint);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerCustomEnvironmentEndpoints() != null) {
            innerCustomEnvironmentEndpoints().validate();
        }
    }
}
