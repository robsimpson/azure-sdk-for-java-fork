// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.P2SVpnServerConfigRadiusClientRootCertificatePropertiesFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Radius client root certificate of P2SVpnServerConfiguration. */
@Fluent
public final class P2SVpnServerConfigRadiusClientRootCertificate extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(P2SVpnServerConfigRadiusClientRootCertificate.class);

    /*
     * Properties of the Radius client root certificate.
     */
    @JsonProperty(value = "properties")
    private P2SVpnServerConfigRadiusClientRootCertificatePropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the innerProperties property: Properties of the Radius client root certificate.
     *
     * @return the innerProperties value.
     */
    private P2SVpnServerConfigRadiusClientRootCertificatePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the P2SVpnServerConfigRadiusClientRootCertificate object itself.
     */
    public P2SVpnServerConfigRadiusClientRootCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the P2SVpnServerConfigRadiusClientRootCertificate object itself.
     */
    public P2SVpnServerConfigRadiusClientRootCertificate withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public P2SVpnServerConfigRadiusClientRootCertificate withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the thumbprint property: The Radius client root certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Set the thumbprint property: The Radius client root certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the P2SVpnServerConfigRadiusClientRootCertificate object itself.
     */
    public P2SVpnServerConfigRadiusClientRootCertificate withThumbprint(String thumbprint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnServerConfigRadiusClientRootCertificatePropertiesFormat();
        }
        this.innerProperties().withThumbprint(thumbprint);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Radius client root certificate resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
