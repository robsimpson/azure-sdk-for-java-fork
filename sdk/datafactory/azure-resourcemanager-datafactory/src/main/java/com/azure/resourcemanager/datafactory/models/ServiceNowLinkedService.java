// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ServiceNowLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** ServiceNow server linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ServiceNow")
@Fluent
public final class ServiceNowLinkedService extends LinkedService {
    /*
     * ServiceNow server linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ServiceNowLinkedServiceTypeProperties innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();

    /** Creates an instance of ServiceNowLinkedService class. */
    public ServiceNowLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: ServiceNow server linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private ServiceNowLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceNowLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceNowLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceNowLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceNowLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the endpoint property: The endpoint of the ServiceNow server. (i.e. &lt;instance&gt;.service-now.com).
     *
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().endpoint();
    }

    /**
     * Set the endpoint property: The endpoint of the ServiceNow server. (i.e. &lt;instance&gt;.service-now.com).
     *
     * @param endpoint the endpoint value to set.
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withEndpoint(Object endpoint) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEndpoint(endpoint);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to use.
     *
     * @return the authenticationType value.
     */
    public ServiceNowAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type to use.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withAuthenticationType(ServiceNowAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the username property: The user name used to connect to the ServiceNow server for Basic and OAuth2
     * authentication.
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The user name used to connect to the ServiceNow server for Basic and OAuth2
     * authentication.
     *
     * @param username the username value to set.
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name for Basic and OAuth2 authentication.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: The password corresponding to the user name for Basic and OAuth2 authentication.
     *
     * @param password the password value to set.
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the clientId property: The client id for OAuth2 authentication.
     *
     * @return the clientId value.
     */
    public Object clientId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientId();
    }

    /**
     * Set the clientId property: The client id for OAuth2 authentication.
     *
     * @param clientId the clientId value to set.
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withClientId(Object clientId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the clientSecret property: The client secret for OAuth2 authentication.
     *
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientSecret();
    }

    /**
     * Set the clientSecret property: The client secret for OAuth2 authentication.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withClientSecret(SecretBase clientSecret) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientSecret(clientSecret);
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useEncryptedEndpoints();
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     *
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseEncryptedEndpoints(useEncryptedEndpoints);
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useHostVerification();
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     *
     * @param useHostVerification the useHostVerification value to set.
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withUseHostVerification(Object useHostVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseHostVerification(useHostVerification);
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().usePeerVerification();
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting over
     * SSL. The default value is true.
     *
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withUsePeerVerification(Object usePeerVerification) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsePeerVerification(usePeerVerification);
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
     * @return the ServiceNowLinkedService object itself.
     */
    public ServiceNowLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ServiceNowLinkedServiceTypeProperties();
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
                        "Missing required property innerTypeProperties in model ServiceNowLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceNowLinkedService.class);
}
