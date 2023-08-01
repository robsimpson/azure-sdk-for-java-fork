// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.chaos.fluent.models.TargetInner;

/** Resource collection API of Targets. */
public interface Targets {
    /**
     * Get a list of Target resources that extend a tracked regional resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Target resources that extend a tracked regional resource as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<Target> list(
        String resourceGroupName, String parentProviderNamespace, String parentResourceType, String parentResourceName);

    /**
     * Get a list of Target resources that extend a tracked regional resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param continuationToken String that sets the continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Target resources that extend a tracked regional resource as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<Target> list(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String continuationToken,
        Context context);

    /**
     * Get a Target resource that extends a tracked regional resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Target resource that extends a tracked regional resource along with {@link Response}.
     */
    Response<Target> getWithResponse(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        Context context);

    /**
     * Get a Target resource that extends a tracked regional resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Target resource that extends a tracked regional resource.
     */
    Target get(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName);

    /**
     * Delete a Target resource that extends a tracked regional resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        Context context);

    /**
     * Delete a Target resource that extends a tracked regional resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName);

    /**
     * Create or update a Target resource that extends a tracked regional resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param target Target resource to be created or updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents a Target resource along with {@link Response}.
     */
    Response<Target> createOrUpdateWithResponse(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        TargetInner target,
        Context context);

    /**
     * Create or update a Target resource that extends a tracked regional resource.
     *
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param target Target resource to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents a Target resource.
     */
    Target createOrUpdate(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        TargetInner target);
}
