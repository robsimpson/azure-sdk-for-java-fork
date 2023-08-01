// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.IpGroupInner;
import com.azure.resourcemanager.network.models.TagsObject;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in IpGroupsClient. */
public interface IpGroupsClient
    extends InnerSupportsGet<IpGroupInner>, InnerSupportsListing<IpGroupInner>, InnerSupportsDelete<Void> {
    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param expand Expands resourceIds (of Firewalls/Network Security Groups etc.) back referenced by the IpGroups
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<IpGroupInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String ipGroupsName, String expand);

    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IpGroupInner> getByResourceGroupAsync(String resourceGroupName, String ipGroupsName);

    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param expand Expands resourceIds (of Firewalls/Network Security Groups etc.) back referenced by the IpGroups
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IpGroupInner> getByResourceGroupWithResponse(
        String resourceGroupName, String ipGroupsName, String expand, Context context);

    /**
     * Gets the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ipGroups.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpGroupInner getByResourceGroup(String resourceGroupName, String ipGroupsName);

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the create or update IpGroups operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String ipGroupsName, IpGroupInner parameters);

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the create or update IpGroups operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<IpGroupInner>, IpGroupInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String ipGroupsName, IpGroupInner parameters);

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the create or update IpGroups operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpGroupInner>, IpGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String ipGroupsName, IpGroupInner parameters);

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the create or update IpGroups operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<IpGroupInner>, IpGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String ipGroupsName, IpGroupInner parameters, Context context);

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the create or update IpGroups operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IpGroupInner> createOrUpdateAsync(String resourceGroupName, String ipGroupsName, IpGroupInner parameters);

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the create or update IpGroups operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpGroupInner createOrUpdate(String resourceGroupName, String ipGroupsName, IpGroupInner parameters);

    /**
     * Creates or updates an ipGroups in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the create or update IpGroups operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpGroupInner createOrUpdate(
        String resourceGroupName, String ipGroupsName, IpGroupInner parameters, Context context);

    /**
     * Updates tags of an IpGroups resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the update ipGroups operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<IpGroupInner>> updateGroupsWithResponseAsync(
        String resourceGroupName, String ipGroupsName, TagsObject parameters);

    /**
     * Updates tags of an IpGroups resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the update ipGroups operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IpGroupInner> updateGroupsAsync(String resourceGroupName, String ipGroupsName, TagsObject parameters);

    /**
     * Updates tags of an IpGroups resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the update ipGroups operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IpGroupInner> updateGroupsWithResponse(
        String resourceGroupName, String ipGroupsName, TagsObject parameters, Context context);

    /**
     * Updates tags of an IpGroups resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param parameters Parameters supplied to the update ipGroups operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IpGroups resource information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpGroupInner updateGroups(String resourceGroupName, String ipGroupsName, TagsObject parameters);

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String ipGroupsName);

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String ipGroupsName);

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String ipGroupsName);

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String ipGroupsName, Context context);

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String ipGroupsName);

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ipGroupsName);

    /**
     * Deletes the specified ipGroups.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ipGroupsName The name of the ipGroups.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ipGroupsName, Context context);

    /**
     * Gets all IpGroups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a resource group as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<IpGroupInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all IpGroups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all IpGroups in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpGroupInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all IpGroups in a subscription.
     *
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<IpGroupInner> listAsync();

    /**
     * Gets all IpGroups in a subscription.
     *
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpGroupInner> list();

    /**
     * Gets all IpGroups in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all IpGroups in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IpGroupInner> list(Context context);
}
