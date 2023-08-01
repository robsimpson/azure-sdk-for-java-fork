// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountMapInner;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerCallbackUrlInner;
import com.azure.resourcemanager.logic.models.GetCallbackUrlParameters;

/** An instance of this class provides access to all the operations defined in IntegrationAccountMapsClient. */
public interface IntegrationAccountMapsClient {
    /**
     * Gets a list of integration account maps.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration account maps as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IntegrationAccountMapInner> list(String resourceGroupName, String integrationAccountName);

    /**
     * Gets a list of integration account maps.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: MapType.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration account maps as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IntegrationAccountMapInner> list(
        String resourceGroupName, String integrationAccountName, Integer top, String filter, Context context);

    /**
     * Gets an integration account map.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration account map along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationAccountMapInner> getWithResponse(
        String resourceGroupName, String integrationAccountName, String mapName, Context context);

    /**
     * Gets an integration account map.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration account map.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationAccountMapInner get(String resourceGroupName, String integrationAccountName, String mapName);

    /**
     * Creates or updates an integration account map. If the map is larger than 4 MB, you need to store the map in an
     * Azure blob and use the blob's Shared Access Signature (SAS) URL as the 'contentLink' property value.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param map The integration account map.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration account map along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationAccountMapInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String integrationAccountName,
        String mapName,
        IntegrationAccountMapInner map,
        Context context);

    /**
     * Creates or updates an integration account map. If the map is larger than 4 MB, you need to store the map in an
     * Azure blob and use the blob's Shared Access Signature (SAS) URL as the 'contentLink' property value.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param map The integration account map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration account map.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationAccountMapInner createOrUpdate(
        String resourceGroupName, String integrationAccountName, String mapName, IntegrationAccountMapInner map);

    /**
     * Deletes an integration account map.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String integrationAccountName, String mapName, Context context);

    /**
     * Deletes an integration account map.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String integrationAccountName, String mapName);

    /**
     * Get the content callback url.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param listContentCallbackUrl The callback url parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowTriggerCallbackUrlInner> listContentCallbackUrlWithResponse(
        String resourceGroupName,
        String integrationAccountName,
        String mapName,
        GetCallbackUrlParameters listContentCallbackUrl,
        Context context);

    /**
     * Get the content callback url.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param mapName The integration account map name.
     * @param listContentCallbackUrl The callback url parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the content callback url.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowTriggerCallbackUrlInner listContentCallbackUrl(
        String resourceGroupName,
        String integrationAccountName,
        String mapName,
        GetCallbackUrlParameters listContentCallbackUrl);
}
