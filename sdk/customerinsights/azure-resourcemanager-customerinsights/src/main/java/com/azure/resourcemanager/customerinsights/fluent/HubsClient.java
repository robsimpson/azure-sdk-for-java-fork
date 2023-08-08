// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.customerinsights.fluent.models.HubInner;

/** An instance of this class provides access to all the operations defined in HubsClient. */
public interface HubsClient {
    /**
     * Creates a hub, or updates an existing hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the Hub.
     * @param parameters Parameters supplied to the CreateOrUpdate Hub operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hub resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HubInner> createOrUpdateWithResponse(
        String resourceGroupName, String hubName, HubInner parameters, Context context);

    /**
     * Creates a hub, or updates an existing hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the Hub.
     * @param parameters Parameters supplied to the CreateOrUpdate Hub operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HubInner createOrUpdate(String resourceGroupName, String hubName, HubInner parameters);

    /**
     * Updates a Hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the Hub.
     * @param parameters Parameters supplied to the Update Hub operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hub resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HubInner> updateWithResponse(
        String resourceGroupName, String hubName, HubInner parameters, Context context);

    /**
     * Updates a Hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the Hub.
     * @param parameters Parameters supplied to the Update Hub operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HubInner update(String resourceGroupName, String hubName, HubInner parameters);

    /**
     * Deletes the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String hubName);

    /**
     * Deletes the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String hubName, Context context);

    /**
     * Deletes the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hubName);

    /**
     * Deletes the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hubName, Context context);

    /**
     * Gets information about the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified hub along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HubInner> getByResourceGroupWithResponse(String resourceGroupName, String hubName, Context context);

    /**
     * Gets information about the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HubInner getByResourceGroup(String resourceGroupName, String hubName);

    /**
     * Gets all the hubs in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the hubs in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HubInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the hubs in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the hubs in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HubInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all hubs in the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all hubs in the specified subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HubInner> list();

    /**
     * Gets all hubs in the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all hubs in the specified subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HubInner> list(Context context);
}
