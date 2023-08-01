// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.fluent.models.ChannelInner;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.models.ChannelUpdateParameters;

/** An instance of this class provides access to all the operations defined in ChannelsClient. */
public interface ChannelsClient {
    /**
     * Get a channel.
     *
     * <p>Get properties of a channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a channel along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ChannelInner> getWithResponse(
        String resourceGroupName, String partnerNamespaceName, String channelName, Context context);

    /**
     * Get a channel.
     *
     * <p>Get properties of a channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a channel.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ChannelInner get(String resourceGroupName, String partnerNamespaceName, String channelName);

    /**
     * Create or update a channel.
     *
     * <p>Synchronously creates or updates a new channel with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param channelInfo Channel information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return channel info along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ChannelInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String partnerNamespaceName,
        String channelName,
        ChannelInner channelInfo,
        Context context);

    /**
     * Create or update a channel.
     *
     * <p>Synchronously creates or updates a new channel with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param channelInfo Channel information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return channel info.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ChannelInner createOrUpdate(
        String resourceGroupName, String partnerNamespaceName, String channelName, ChannelInner channelInfo);

    /**
     * Delete a channel.
     *
     * <p>Delete an existing channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String partnerNamespaceName, String channelName);

    /**
     * Delete a channel.
     *
     * <p>Delete an existing channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String partnerNamespaceName, String channelName, Context context);

    /**
     * Delete a channel.
     *
     * <p>Delete an existing channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerNamespaceName, String channelName);

    /**
     * Delete a channel.
     *
     * <p>Delete an existing channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String partnerNamespaceName, String channelName, Context context);

    /**
     * Update a Channel.
     *
     * <p>Synchronously updates a channel with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param channelUpdateParameters Channel update information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> updateWithResponse(
        String resourceGroupName,
        String partnerNamespaceName,
        String channelName,
        ChannelUpdateParameters channelUpdateParameters,
        Context context);

    /**
     * Update a Channel.
     *
     * <p>Synchronously updates a channel with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the channel.
     * @param channelUpdateParameters Channel update information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void update(
        String resourceGroupName,
        String partnerNamespaceName,
        String channelName,
        ChannelUpdateParameters channelUpdateParameters);

    /**
     * List channels.
     *
     * <p>List all the channels in a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Channels operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ChannelInner> listByPartnerNamespace(String resourceGroupName, String partnerNamespaceName);

    /**
     * List channels.
     *
     * <p>List all the channels in a partner namespace.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Channels operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ChannelInner> listByPartnerNamespace(
        String resourceGroupName, String partnerNamespaceName, String filter, Integer top, Context context);

    /**
     * Get full URL of partner destination channel.
     *
     * <p>Get the full endpoint URL of a partner destination channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the Channel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL of a partner destination channel along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EventSubscriptionFullUrlInner> getFullUrlWithResponse(
        String resourceGroupName, String partnerNamespaceName, String channelName, Context context);

    /**
     * Get full URL of partner destination channel.
     *
     * <p>Get the full endpoint URL of a partner destination channel.
     *
     * @param resourceGroupName The name of the resource group within the partners subscription.
     * @param partnerNamespaceName Name of the partner namespace.
     * @param channelName Name of the Channel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL of a partner destination channel.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionFullUrlInner getFullUrl(String resourceGroupName, String partnerNamespaceName, String channelName);
}
