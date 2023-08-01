// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Rest Service linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("RestService")
@JsonFlatten
@Fluent
public class RestServiceLinkedService extends LinkedService {
    /*
     * The base URL of the REST service.
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /*
     * Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.enableServerCertificateValidation")
    private Object enableServerCertificateValidation;

    /*
     * Type of authentication used to connect to the REST service.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private RestServiceAuthenticationType authenticationType;

    /*
     * The user name used in Basic authentication type.
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /*
     * The password used in Basic authentication type.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression
     * with resultType object).
     */
    @JsonProperty(value = "typeProperties.authHeaders")
    private Object authHeaders;

    /*
     * The application's client ID used in AadServicePrincipal authentication type.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The application's key used in AadServicePrincipal authentication type.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which
     * your application resides.
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /*
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina,
     * AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.azureCloudType")
    private Object azureCloudType;

    /*
     * The resource you are requesting authorization to use.
     */
    @JsonProperty(value = "typeProperties.aadResourceId")
    private Object aadResourceId;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "typeProperties.credential")
    private CredentialReference credential;

    /*
     * The client ID associated with your application. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.clientId")
    private Object clientId;

    /*
     * The client secret associated with your application.
     */
    @JsonProperty(value = "typeProperties.clientSecret")
    private SecretBase clientSecret;

    /*
     * The token endpoint of the authorization server to acquire access token. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.tokenEndpoint")
    private Object tokenEndpoint;

    /*
     * The target service or resource to which the access will be requested. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.resource")
    private Object resource;

    /*
     * The scope of the access required. It describes what kind of access will be requested. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.scope")
    private Object scope;

    /** Creates an instance of RestServiceLinkedService class. */
    public RestServiceLinkedService() {}

    /**
     * Get the url property: The base URL of the REST service.
     *
     * @return the url value.
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The base URL of the REST service.
     *
     * @param url the url value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the enableServerCertificateValidation property: Whether to validate server side SSL certificate when
     * connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableServerCertificateValidation value.
     */
    public Object getEnableServerCertificateValidation() {
        return this.enableServerCertificateValidation;
    }

    /**
     * Set the enableServerCertificateValidation property: Whether to validate server side SSL certificate when
     * connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableServerCertificateValidation the enableServerCertificateValidation value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setEnableServerCertificateValidation(Object enableServerCertificateValidation) {
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        return this;
    }

    /**
     * Get the authenticationType property: Type of authentication used to connect to the REST service.
     *
     * @return the authenticationType value.
     */
    public RestServiceAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Type of authentication used to connect to the REST service.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setAuthenticationType(RestServiceAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the userName property: The user name used in Basic authentication type.
     *
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: The user name used in Basic authentication type.
     *
     * @param userName the userName value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: The password used in Basic authentication type.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password used in Basic authentication type.
     *
     * @param password the password value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the authHeaders property: The additional HTTP headers in the request to RESTful API used for authorization.
     * Type: object (or Expression with resultType object).
     *
     * @return the authHeaders value.
     */
    public Object getAuthHeaders() {
        return this.authHeaders;
    }

    /**
     * Set the authHeaders property: The additional HTTP headers in the request to RESTful API used for authorization.
     * Type: object (or Expression with resultType object).
     *
     * @param authHeaders the authHeaders value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setAuthHeaders(Object authHeaders) {
        this.authHeaders = authHeaders;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The application's client ID used in AadServicePrincipal authentication type.
     *
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The application's client ID used in AadServicePrincipal authentication type.
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The application's key used in AadServicePrincipal authentication type.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The application's key used in AadServicePrincipal authentication type.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The tenant information (domain name or tenant ID) used in AadServicePrincipal
     * authentication type under which your application resides.
     *
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The tenant information (domain name or tenant ID) used in AadServicePrincipal
     * authentication type under which your application resides.
     *
     * @param tenant the tenant value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @return the azureCloudType value.
     */
    public Object getAzureCloudType() {
        return this.azureCloudType;
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @param azureCloudType the azureCloudType value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the aadResourceId property: The resource you are requesting authorization to use.
     *
     * @return the aadResourceId value.
     */
    public Object getAadResourceId() {
        return this.aadResourceId;
    }

    /**
     * Set the aadResourceId property: The resource you are requesting authorization to use.
     *
     * @param aadResourceId the aadResourceId value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setAadResourceId(Object aadResourceId) {
        this.aadResourceId = aadResourceId;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference getCredential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the clientId property: The client ID associated with your application. Type: string (or Expression with
     * resultType string).
     *
     * @return the clientId value.
     */
    public Object getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client ID associated with your application. Type: string (or Expression with
     * resultType string).
     *
     * @param clientId the clientId value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret associated with your application.
     *
     * @return the clientSecret value.
     */
    public SecretBase getClientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret associated with your application.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the tokenEndpoint property: The token endpoint of the authorization server to acquire access token. Type:
     * string (or Expression with resultType string).
     *
     * @return the tokenEndpoint value.
     */
    public Object getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * Set the tokenEndpoint property: The token endpoint of the authorization server to acquire access token. Type:
     * string (or Expression with resultType string).
     *
     * @param tokenEndpoint the tokenEndpoint value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setTokenEndpoint(Object tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    /**
     * Get the resource property: The target service or resource to which the access will be requested. Type: string (or
     * Expression with resultType string).
     *
     * @return the resource value.
     */
    public Object getResource() {
        return this.resource;
    }

    /**
     * Set the resource property: The target service or resource to which the access will be requested. Type: string (or
     * Expression with resultType string).
     *
     * @param resource the resource value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setResource(Object resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the scope property: The scope of the access required. It describes what kind of access will be requested.
     * Type: string (or Expression with resultType string).
     *
     * @return the scope value.
     */
    public Object getScope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of the access required. It describes what kind of access will be requested.
     * Type: string (or Expression with resultType string).
     *
     * @param scope the scope value to set.
     * @return the RestServiceLinkedService object itself.
     */
    public RestServiceLinkedService setScope(Object scope) {
        this.scope = scope;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestServiceLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestServiceLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestServiceLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestServiceLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
