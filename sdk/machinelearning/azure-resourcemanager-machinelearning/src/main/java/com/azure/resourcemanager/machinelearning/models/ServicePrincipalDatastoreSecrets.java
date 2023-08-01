// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.fluent.models.DatastoreSecretsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Datastore Service Principal secrets. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "secretsType")
@JsonTypeName("ServicePrincipal")
@Fluent
public final class ServicePrincipalDatastoreSecrets extends DatastoreSecretsInner {
    /*
     * Service principal secret.
     */
    @JsonProperty(value = "clientSecret")
    private String clientSecret;

    /** Creates an instance of ServicePrincipalDatastoreSecrets class. */
    public ServicePrincipalDatastoreSecrets() {
    }

    /**
     * Get the clientSecret property: Service principal secret.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: Service principal secret.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the ServicePrincipalDatastoreSecrets object itself.
     */
    public ServicePrincipalDatastoreSecrets withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
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
