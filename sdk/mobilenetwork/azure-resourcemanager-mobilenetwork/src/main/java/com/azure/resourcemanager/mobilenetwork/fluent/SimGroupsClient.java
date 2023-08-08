// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimGroupInner;
import com.azure.resourcemanager.mobilenetwork.models.IdentityAndTagsObject;

/** An instance of this class provides access to all the operations defined in SimGroupsClient. */
public interface SimGroupsClient {
    /**
     * Deletes the specified SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String simGroupName);

    /**
     * Deletes the specified SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String simGroupName, Context context);

    /**
     * Deletes the specified SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String simGroupName);

    /**
     * Deletes the specified SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String simGroupName, Context context);

    /**
     * Gets information about the specified SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified SIM group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SimGroupInner> getByResourceGroupWithResponse(
        String resourceGroupName, String simGroupName, Context context);

    /**
     * Gets information about the specified SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified SIM group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimGroupInner getByResourceGroup(String resourceGroupName, String simGroupName);

    /**
     * Creates or updates a SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param parameters Parameters supplied to the create or update SIM group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of sIM group resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SimGroupInner>, SimGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String simGroupName, SimGroupInner parameters);

    /**
     * Creates or updates a SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param parameters Parameters supplied to the create or update SIM group operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of sIM group resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SimGroupInner>, SimGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String simGroupName, SimGroupInner parameters, Context context);

    /**
     * Creates or updates a SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param parameters Parameters supplied to the create or update SIM group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sIM group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimGroupInner createOrUpdate(String resourceGroupName, String simGroupName, SimGroupInner parameters);

    /**
     * Creates or updates a SIM group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param parameters Parameters supplied to the create or update SIM group operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sIM group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimGroupInner createOrUpdate(
        String resourceGroupName, String simGroupName, SimGroupInner parameters, Context context);

    /**
     * Patch SIM group resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param parameters Parameters supplied to patch SIM group resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sIM group resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SimGroupInner> updateTagsWithResponse(
        String resourceGroupName, String simGroupName, IdentityAndTagsObject parameters, Context context);

    /**
     * Patch SIM group resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param simGroupName The name of the SIM Group.
     * @param parameters Parameters supplied to patch SIM group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sIM group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SimGroupInner updateTags(String resourceGroupName, String simGroupName, IdentityAndTagsObject parameters);

    /**
     * Gets all the SIM groups in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the SIM groups in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SimGroupInner> list();

    /**
     * Gets all the SIM groups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the SIM groups in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SimGroupInner> list(Context context);

    /**
     * Gets all the SIM groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the SIM groups in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SimGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the SIM groups in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the SIM groups in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SimGroupInner> listByResourceGroup(String resourceGroupName, Context context);
}
