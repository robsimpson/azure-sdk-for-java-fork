// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cosmos.fluent.models.DataCenterResourceInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CassandraDataCentersClient. */
public interface CassandraDataCentersClient {
    /**
     * List all data centers in a particular managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed Cassandra data centers and their properties as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DataCenterResourceInner> listAsync(String resourceGroupName, String clusterName);

    /**
     * List all data centers in a particular managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed Cassandra data centers and their properties as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCenterResourceInner> list(String resourceGroupName, String clusterName);

    /**
     * List all data centers in a particular managed Cassandra cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed Cassandra data centers and their properties as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataCenterResourceInner> list(String resourceGroupName, String clusterName, Context context);

    /**
     * Get the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a managed Cassandra data center along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DataCenterResourceInner>> getWithResponseAsync(
        String resourceGroupName, String clusterName, String dataCenterName);

    /**
     * Get the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a managed Cassandra data center on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataCenterResourceInner> getAsync(String resourceGroupName, String clusterName, String dataCenterName);

    /**
     * Get the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a managed Cassandra data center along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataCenterResourceInner> getWithResponse(
        String resourceGroupName, String clusterName, String dataCenterName, Context context);

    /**
     * Get the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCenterResourceInner get(String resourceGroupName, String clusterName, String dataCenterName);

    /**
     * Delete a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String clusterName, String dataCenterName);

    /**
     * Delete a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String clusterName, String dataCenterName);

    /**
     * Delete a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String clusterName, String dataCenterName);

    /**
     * Delete a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String dataCenterName, Context context);

    /**
     * Delete a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String clusterName, String dataCenterName);

    /**
     * Delete a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String dataCenterName);

    /**
     * Delete a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String dataCenterName, Context context);

    /**
     * Create or update a managed Cassandra data center. When updating, overwrite all properties. To update only some
     * properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters specifying the managed Cassandra data center.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Cassandra data center along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createUpdateWithResponseAsync(
        String resourceGroupName, String clusterName, String dataCenterName, DataCenterResourceInner body);

    /**
     * Create or update a managed Cassandra data center. When updating, overwrite all properties. To update only some
     * properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters specifying the managed Cassandra data center.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<DataCenterResourceInner>, DataCenterResourceInner> beginCreateUpdateAsync(
        String resourceGroupName, String clusterName, String dataCenterName, DataCenterResourceInner body);

    /**
     * Create or update a managed Cassandra data center. When updating, overwrite all properties. To update only some
     * properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters specifying the managed Cassandra data center.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataCenterResourceInner>, DataCenterResourceInner> beginCreateUpdate(
        String resourceGroupName, String clusterName, String dataCenterName, DataCenterResourceInner body);

    /**
     * Create or update a managed Cassandra data center. When updating, overwrite all properties. To update only some
     * properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters specifying the managed Cassandra data center.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataCenterResourceInner>, DataCenterResourceInner> beginCreateUpdate(
        String resourceGroupName,
        String clusterName,
        String dataCenterName,
        DataCenterResourceInner body,
        Context context);

    /**
     * Create or update a managed Cassandra data center. When updating, overwrite all properties. To update only some
     * properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters specifying the managed Cassandra data center.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Cassandra data center on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataCenterResourceInner> createUpdateAsync(
        String resourceGroupName, String clusterName, String dataCenterName, DataCenterResourceInner body);

    /**
     * Create or update a managed Cassandra data center. When updating, overwrite all properties. To update only some
     * properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters specifying the managed Cassandra data center.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCenterResourceInner createUpdate(
        String resourceGroupName, String clusterName, String dataCenterName, DataCenterResourceInner body);

    /**
     * Create or update a managed Cassandra data center. When updating, overwrite all properties. To update only some
     * properties, use PATCH.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters specifying the managed Cassandra data center.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCenterResourceInner createUpdate(
        String resourceGroupName,
        String clusterName,
        String dataCenterName,
        DataCenterResourceInner body,
        Context context);

    /**
     * Update some of the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters to provide for specifying the managed Cassandra data center.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Cassandra data center along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName, String clusterName, String dataCenterName, DataCenterResourceInner body);

    /**
     * Update some of the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters to provide for specifying the managed Cassandra data center.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<DataCenterResourceInner>, DataCenterResourceInner> beginUpdateAsync(
        String resourceGroupName, String clusterName, String dataCenterName, DataCenterResourceInner body);

    /**
     * Update some of the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters to provide for specifying the managed Cassandra data center.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataCenterResourceInner>, DataCenterResourceInner> beginUpdate(
        String resourceGroupName, String clusterName, String dataCenterName, DataCenterResourceInner body);

    /**
     * Update some of the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters to provide for specifying the managed Cassandra data center.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataCenterResourceInner>, DataCenterResourceInner> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String dataCenterName,
        DataCenterResourceInner body,
        Context context);

    /**
     * Update some of the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters to provide for specifying the managed Cassandra data center.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Cassandra data center on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataCenterResourceInner> updateAsync(
        String resourceGroupName, String clusterName, String dataCenterName, DataCenterResourceInner body);

    /**
     * Update some of the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters to provide for specifying the managed Cassandra data center.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCenterResourceInner update(
        String resourceGroupName, String clusterName, String dataCenterName, DataCenterResourceInner body);

    /**
     * Update some of the properties of a managed Cassandra data center.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Managed Cassandra cluster name.
     * @param dataCenterName Data center name in a managed Cassandra cluster.
     * @param body Parameters to provide for specifying the managed Cassandra data center.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed Cassandra data center.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataCenterResourceInner update(
        String resourceGroupName,
        String clusterName,
        String dataCenterName,
        DataCenterResourceInner body,
        Context context);
}
