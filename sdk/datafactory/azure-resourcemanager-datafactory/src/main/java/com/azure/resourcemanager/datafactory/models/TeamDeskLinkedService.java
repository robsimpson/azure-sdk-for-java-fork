// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.TeamDeskLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for TeamDesk. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TeamDesk")
@Fluent
public final class TeamDeskLinkedService extends LinkedService {
    /*
     * TeamDesk linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private TeamDeskLinkedServiceTypeProperties innerTypeProperties = new TeamDeskLinkedServiceTypeProperties();

    /** Creates an instance of TeamDeskLinkedService class. */
    public TeamDeskLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: TeamDesk linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private TeamDeskLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public TeamDeskLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeamDeskLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeamDeskLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeamDeskLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to use.
     *
     * @return the authenticationType value.
     */
    public TeamDeskAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type to use.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService withAuthenticationType(TeamDeskAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new TeamDeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the url property: The url to connect TeamDesk source. Type: string (or Expression with resultType string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().url();
    }

    /**
     * Set the url property: The url to connect TeamDesk source. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService withUrl(Object url) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new TeamDeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUrl(url);
        return this;
    }

    /**
     * Get the username property: The username of the TeamDesk source. Type: string (or Expression with resultType
     * string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The username of the TeamDesk source. Type: string (or Expression with resultType
     * string).
     *
     * @param username the username value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new TeamDeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The password of the TeamDesk source.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: The password of the TeamDesk source.
     *
     * @param password the password value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new TeamDeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the apiToken property: The api token for the TeamDesk source.
     *
     * @return the apiToken value.
     */
    public SecretBase apiToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().apiToken();
    }

    /**
     * Set the apiToken property: The api token for the TeamDesk source.
     *
     * @param apiToken the apiToken value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService withApiToken(SecretBase apiToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new TeamDeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withApiToken(apiToken);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the TeamDeskLinkedService object itself.
     */
    public TeamDeskLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new TeamDeskLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model TeamDeskLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TeamDeskLinkedService.class);
}
