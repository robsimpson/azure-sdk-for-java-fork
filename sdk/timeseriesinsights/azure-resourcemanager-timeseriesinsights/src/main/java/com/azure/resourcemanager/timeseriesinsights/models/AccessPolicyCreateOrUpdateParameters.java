// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.AccessPolicyResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AccessPolicyCreateOrUpdateParameters model. */
@Fluent
public final class AccessPolicyCreateOrUpdateParameters {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties", required = true)
    private AccessPolicyResourceProperties innerProperties = new AccessPolicyResourceProperties();

    /** Creates an instance of AccessPolicyCreateOrUpdateParameters class. */
    public AccessPolicyCreateOrUpdateParameters() {
    }

    /**
     * Get the innerProperties property: The properties property.
     *
     * @return the innerProperties value.
     */
    private AccessPolicyResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the principalObjectId property: The objectId of the principal in Azure Active Directory.
     *
     * @return the principalObjectId value.
     */
    public String principalObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalObjectId();
    }

    /**
     * Set the principalObjectId property: The objectId of the principal in Azure Active Directory.
     *
     * @param principalObjectId the principalObjectId value to set.
     * @return the AccessPolicyCreateOrUpdateParameters object itself.
     */
    public AccessPolicyCreateOrUpdateParameters withPrincipalObjectId(String principalObjectId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessPolicyResourceProperties();
        }
        this.innerProperties().withPrincipalObjectId(principalObjectId);
        return this;
    }

    /**
     * Get the description property: An description of the access policy.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: An description of the access policy.
     *
     * @param description the description value to set.
     * @return the AccessPolicyCreateOrUpdateParameters object itself.
     */
    public AccessPolicyCreateOrUpdateParameters withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessPolicyResourceProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the roles property: The list of roles the principal is assigned on the environment.
     *
     * @return the roles value.
     */
    public List<AccessPolicyRole> roles() {
        return this.innerProperties() == null ? null : this.innerProperties().roles();
    }

    /**
     * Set the roles property: The list of roles the principal is assigned on the environment.
     *
     * @param roles the roles value to set.
     * @return the AccessPolicyCreateOrUpdateParameters object itself.
     */
    public AccessPolicyCreateOrUpdateParameters withRoles(List<AccessPolicyRole> roles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessPolicyResourceProperties();
        }
        this.innerProperties().withRoles(roles);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model AccessPolicyCreateOrUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AccessPolicyCreateOrUpdateParameters.class);
}
