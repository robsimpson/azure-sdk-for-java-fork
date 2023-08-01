// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerregistry.fluent.models.CallbackConfigInner;
import com.azure.resourcemanager.containerregistry.fluent.models.EventInfoInner;
import com.azure.resourcemanager.containerregistry.fluent.models.EventInner;
import com.azure.resourcemanager.containerregistry.fluent.models.WebhookInner;
import com.azure.resourcemanager.containerregistry.models.WebhookCreateParameters;
import com.azure.resourcemanager.containerregistry.models.WebhookUpdateParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in WebhooksClient. */
public interface WebhooksClient {
    /**
     * Lists all the webhooks for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list webhooks for a container registry as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<WebhookInner> listAsync(String resourceGroupName, String registryName);

    /**
     * Lists all the webhooks for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list webhooks for a container registry as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebhookInner> list(String resourceGroupName, String registryName);

    /**
     * Lists all the webhooks for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list webhooks for a container registry as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebhookInner> list(String resourceGroupName, String registryName, Context context);

    /**
     * Gets the properties of the specified webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified webhook along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<WebhookInner>> getWithResponseAsync(
        String resourceGroupName, String registryName, String webhookName);

    /**
     * Gets the properties of the specified webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified webhook on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<WebhookInner> getAsync(String resourceGroupName, String registryName, String webhookName);

    /**
     * Gets the properties of the specified webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified webhook along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WebhookInner> getWithResponse(
        String resourceGroupName, String registryName, String webhookName, Context context);

    /**
     * Gets the properties of the specified webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified webhook.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebhookInner get(String resourceGroupName, String registryName, String webhookName);

    /**
     * Creates a webhook for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookCreateParameters The parameters for creating a webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a webhook for a container registry along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookCreateParameters webhookCreateParameters);

    /**
     * Creates a webhook for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookCreateParameters The parameters for creating a webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of an object that represents a webhook for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<WebhookInner>, WebhookInner> beginCreateAsync(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookCreateParameters webhookCreateParameters);

    /**
     * Creates a webhook for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookCreateParameters The parameters for creating a webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a webhook for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WebhookInner>, WebhookInner> beginCreate(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookCreateParameters webhookCreateParameters);

    /**
     * Creates a webhook for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookCreateParameters The parameters for creating a webhook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a webhook for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WebhookInner>, WebhookInner> beginCreate(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookCreateParameters webhookCreateParameters,
        Context context);

    /**
     * Creates a webhook for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookCreateParameters The parameters for creating a webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a webhook for a container registry on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<WebhookInner> createAsync(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookCreateParameters webhookCreateParameters);

    /**
     * Creates a webhook for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookCreateParameters The parameters for creating a webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a webhook for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebhookInner create(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookCreateParameters webhookCreateParameters);

    /**
     * Creates a webhook for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookCreateParameters The parameters for creating a webhook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a webhook for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebhookInner create(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookCreateParameters webhookCreateParameters,
        Context context);

    /**
     * Deletes a webhook from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String registryName, String webhookName);

    /**
     * Deletes a webhook from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String registryName, String webhookName);

    /**
     * Deletes a webhook from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName, String webhookName);

    /**
     * Deletes a webhook from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String registryName, String webhookName, Context context);

    /**
     * Deletes a webhook from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String registryName, String webhookName);

    /**
     * Deletes a webhook from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String webhookName);

    /**
     * Deletes a webhook from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String webhookName, Context context);

    /**
     * Updates a webhook with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookUpdateParameters The parameters for updating a webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a webhook for a container registry along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookUpdateParameters webhookUpdateParameters);

    /**
     * Updates a webhook with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookUpdateParameters The parameters for updating a webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of an object that represents a webhook for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<WebhookInner>, WebhookInner> beginUpdateAsync(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookUpdateParameters webhookUpdateParameters);

    /**
     * Updates a webhook with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookUpdateParameters The parameters for updating a webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a webhook for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WebhookInner>, WebhookInner> beginUpdate(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookUpdateParameters webhookUpdateParameters);

    /**
     * Updates a webhook with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookUpdateParameters The parameters for updating a webhook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a webhook for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WebhookInner>, WebhookInner> beginUpdate(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookUpdateParameters webhookUpdateParameters,
        Context context);

    /**
     * Updates a webhook with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookUpdateParameters The parameters for updating a webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a webhook for a container registry on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<WebhookInner> updateAsync(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookUpdateParameters webhookUpdateParameters);

    /**
     * Updates a webhook with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookUpdateParameters The parameters for updating a webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a webhook for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebhookInner update(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookUpdateParameters webhookUpdateParameters);

    /**
     * Updates a webhook with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param webhookUpdateParameters The parameters for updating a webhook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a webhook for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebhookInner update(
        String resourceGroupName,
        String registryName,
        String webhookName,
        WebhookUpdateParameters webhookUpdateParameters,
        Context context);

    /**
     * Triggers a ping event to be sent to the webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the basic information of an event along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<EventInfoInner>> pingWithResponseAsync(
        String resourceGroupName, String registryName, String webhookName);

    /**
     * Triggers a ping event to be sent to the webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the basic information of an event on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<EventInfoInner> pingAsync(String resourceGroupName, String registryName, String webhookName);

    /**
     * Triggers a ping event to be sent to the webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the basic information of an event along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EventInfoInner> pingWithResponse(
        String resourceGroupName, String registryName, String webhookName, Context context);

    /**
     * Triggers a ping event to be sent to the webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the basic information of an event.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventInfoInner ping(String resourceGroupName, String registryName, String webhookName);

    /**
     * Lists recent events for the specified webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list events for a webhook as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<EventInner> listEventsAsync(String resourceGroupName, String registryName, String webhookName);

    /**
     * Lists recent events for the specified webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list events for a webhook as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventInner> listEvents(String resourceGroupName, String registryName, String webhookName);

    /**
     * Lists recent events for the specified webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list events for a webhook as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventInner> listEvents(
        String resourceGroupName, String registryName, String webhookName, Context context);

    /**
     * Gets the configuration of service URI and custom headers for the webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration of service URI and custom headers for the webhook along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CallbackConfigInner>> getCallbackConfigWithResponseAsync(
        String resourceGroupName, String registryName, String webhookName);

    /**
     * Gets the configuration of service URI and custom headers for the webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration of service URI and custom headers for the webhook on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CallbackConfigInner> getCallbackConfigAsync(String resourceGroupName, String registryName, String webhookName);

    /**
     * Gets the configuration of service URI and custom headers for the webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration of service URI and custom headers for the webhook along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CallbackConfigInner> getCallbackConfigWithResponse(
        String resourceGroupName, String registryName, String webhookName, Context context);

    /**
     * Gets the configuration of service URI and custom headers for the webhook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the configuration of service URI and custom headers for the webhook.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CallbackConfigInner getCallbackConfig(String resourceGroupName, String registryName, String webhookName);
}
