/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for a
 * Microsoft.Resources.ResourceActionSuccess event. This is raised when a
 * resource action operation succeeds.
 */
public class ResourceActionSuccessData {
    /**
     * The tenant ID of the resource.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The subscription ID of the resource.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * The resource group of the resource.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * The resource provider performing the operation.
     */
    @JsonProperty(value = "resourceProvider")
    private String resourceProvider;

    /**
     * The URI of the resource in the operation.
     */
    @JsonProperty(value = "resourceUri")
    private String resourceUri;

    /**
     * The operation that was performed.
     */
    @JsonProperty(value = "operationName")
    private String operationName;

    /**
     * The status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The requested authorization for the operation.
     */
    @JsonProperty(value = "authorization")
    private String authorization;

    /**
     * The properties of the claims.
     */
    @JsonProperty(value = "claims")
    private String claims;

    /**
     * An operation ID used for troubleshooting.
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /**
     * The details of the operation.
     */
    @JsonProperty(value = "httpRequest")
    private String httpRequest;

    /**
     * Get the tenant ID of the resource.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenant ID of the resource.
     *
     * @param tenantId the tenantId value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the subscription ID of the resource.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscription ID of the resource.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resource group of the resource.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resource group of the resource.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the resource provider performing the operation.
     *
     * @return the resourceProvider value
     */
    public String resourceProvider() {
        return this.resourceProvider;
    }

    /**
     * Set the resource provider performing the operation.
     *
     * @param resourceProvider the resourceProvider value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
        return this;
    }

    /**
     * Get the URI of the resource in the operation.
     *
     * @return the resourceUri value
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the URI of the resource in the operation.
     *
     * @param resourceUri the resourceUri value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * Get the operation that was performed.
     *
     * @return the operationName value
     */
    public String operationName() {
        return this.operationName;
    }

    /**
     * Set the operation that was performed.
     *
     * @param operationName the operationName value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * Get the status of the operation.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status of the operation.
     *
     * @param status the status value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the requested authorization for the operation.
     *
     * @return the authorization value
     */
    public String authorization() {
        return this.authorization;
    }

    /**
     * Set the requested authorization for the operation.
     *
     * @param authorization the authorization value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * Get the properties of the claims.
     *
     * @return the claims value
     */
    public String claims() {
        return this.claims;
    }

    /**
     * Set the properties of the claims.
     *
     * @param claims the claims value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withClaims(String claims) {
        this.claims = claims;
        return this;
    }

    /**
     * Get an operation ID used for troubleshooting.
     *
     * @return the correlationId value
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set an operation ID used for troubleshooting.
     *
     * @param correlationId the correlationId value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the details of the operation.
     *
     * @return the httpRequest value
     */
    public String httpRequest() {
        return this.httpRequest;
    }

    /**
     * Set the details of the operation.
     *
     * @param httpRequest the httpRequest value to set
     * @return the ResourceActionSuccessData object itself.
     */
    public ResourceActionSuccessData withHttpRequest(String httpRequest) {
        this.httpRequest = httpRequest;
        return this;
    }

}
