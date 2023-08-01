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

/** Azure Data Lake Analytics linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeAnalytics")
@JsonFlatten
@Fluent
public class AzureDataLakeAnalyticsLinkedService extends LinkedService {
    /*
     * The Azure Data Lake Analytics account name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.accountName", required = true)
    private Object accountName;

    /*
     * The ID of the application used to authenticate against the Azure Data Lake Analytics account. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The Key of the application used to authenticate against the Azure Data Lake Analytics account.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.tenant", required = true)
    private Object tenant;

    /*
     * Data Lake Analytics account subscription ID (if different from Data Factory account). Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.subscriptionId")
    private Object subscriptionId;

    /*
     * Data Lake Analytics account resource group name (if different from Data Factory account). Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.resourceGroupName")
    private Object resourceGroupName;

    /*
     * Azure Data Lake Analytics URI Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.dataLakeAnalyticsUri")
    private Object dataLakeAnalyticsUri;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /** Creates an instance of AzureDataLakeAnalyticsLinkedService class. */
    public AzureDataLakeAnalyticsLinkedService() {}

    /**
     * Get the accountName property: The Azure Data Lake Analytics account name. Type: string (or Expression with
     * resultType string).
     *
     * @return the accountName value.
     */
    public Object getAccountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The Azure Data Lake Analytics account name. Type: string (or Expression with
     * resultType string).
     *
     * @param accountName the accountName value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setAccountName(Object accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Analytics account. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Analytics account. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Analytics account.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Analytics account.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the subscriptionId property: Data Lake Analytics account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     *
     * @return the subscriptionId value.
     */
    public Object getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Data Lake Analytics account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Data Lake Analytics account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     *
     * @return the resourceGroupName value.
     */
    public Object getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Data Lake Analytics account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setResourceGroupName(Object resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the dataLakeAnalyticsUri property: Azure Data Lake Analytics URI Type: string (or Expression with resultType
     * string).
     *
     * @return the dataLakeAnalyticsUri value.
     */
    public Object getDataLakeAnalyticsUri() {
        return this.dataLakeAnalyticsUri;
    }

    /**
     * Set the dataLakeAnalyticsUri property: Azure Data Lake Analytics URI Type: string (or Expression with resultType
     * string).
     *
     * @param dataLakeAnalyticsUri the dataLakeAnalyticsUri value to set.
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setDataLakeAnalyticsUri(Object dataLakeAnalyticsUri) {
        this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
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
     * @return the AzureDataLakeAnalyticsLinkedService object itself.
     */
    public AzureDataLakeAnalyticsLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeAnalyticsLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeAnalyticsLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeAnalyticsLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeAnalyticsLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
