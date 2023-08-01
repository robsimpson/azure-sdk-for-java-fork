// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.networkcloud.fluent.models.BareMetalMachineKeySetInner;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineKeySetPatchParameters;

/** An instance of this class provides access to all the operations defined in BareMetalMachineKeySetsClient. */
public interface BareMetalMachineKeySetsClient {
    /**
     * List bare metal machine key sets of the cluster.
     *
     * <p>Get a list of bare metal machine key sets for the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of bare metal machine key sets for the provided cluster as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BareMetalMachineKeySetInner> listByCluster(String resourceGroupName, String clusterName);

    /**
     * List bare metal machine key sets of the cluster.
     *
     * <p>Get a list of bare metal machine key sets for the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of bare metal machine key sets for the provided cluster as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BareMetalMachineKeySetInner> listByCluster(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Retrieve the bare metal machine key set of the cluster.
     *
     * <p>Get bare metal machine key set of the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bare metal machine key set of the provided cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BareMetalMachineKeySetInner> getWithResponse(
        String resourceGroupName, String clusterName, String bareMetalMachineKeySetName, Context context);

    /**
     * Retrieve the bare metal machine key set of the cluster.
     *
     * <p>Get bare metal machine key set of the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bare metal machine key set of the provided cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BareMetalMachineKeySetInner get(String resourceGroupName, String clusterName, String bareMetalMachineKeySetName);

    /**
     * Create or update the bare metal machine key set of the cluster.
     *
     * <p>Create a new bare metal machine key set or update the existing one for the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param bareMetalMachineKeySetParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of bareMetalMachineKeySet represents the bare metal machine key set.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BareMetalMachineKeySetInner>, BareMetalMachineKeySetInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String bareMetalMachineKeySetName,
        BareMetalMachineKeySetInner bareMetalMachineKeySetParameters);

    /**
     * Create or update the bare metal machine key set of the cluster.
     *
     * <p>Create a new bare metal machine key set or update the existing one for the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param bareMetalMachineKeySetParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of bareMetalMachineKeySet represents the bare metal machine key set.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BareMetalMachineKeySetInner>, BareMetalMachineKeySetInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String bareMetalMachineKeySetName,
        BareMetalMachineKeySetInner bareMetalMachineKeySetParameters,
        Context context);

    /**
     * Create or update the bare metal machine key set of the cluster.
     *
     * <p>Create a new bare metal machine key set or update the existing one for the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param bareMetalMachineKeySetParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bareMetalMachineKeySet represents the bare metal machine key set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BareMetalMachineKeySetInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String bareMetalMachineKeySetName,
        BareMetalMachineKeySetInner bareMetalMachineKeySetParameters);

    /**
     * Create or update the bare metal machine key set of the cluster.
     *
     * <p>Create a new bare metal machine key set or update the existing one for the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param bareMetalMachineKeySetParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bareMetalMachineKeySet represents the bare metal machine key set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BareMetalMachineKeySetInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String bareMetalMachineKeySetName,
        BareMetalMachineKeySetInner bareMetalMachineKeySetParameters,
        Context context);

    /**
     * Delete the bare metal machine key set of the cluster.
     *
     * <p>Delete the bare metal machine key set of the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String bareMetalMachineKeySetName);

    /**
     * Delete the bare metal machine key set of the cluster.
     *
     * <p>Delete the bare metal machine key set of the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String bareMetalMachineKeySetName, Context context);

    /**
     * Delete the bare metal machine key set of the cluster.
     *
     * <p>Delete the bare metal machine key set of the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String bareMetalMachineKeySetName);

    /**
     * Delete the bare metal machine key set of the cluster.
     *
     * <p>Delete the bare metal machine key set of the provided cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String bareMetalMachineKeySetName, Context context);

    /**
     * Patch bare metal machine key set of the cluster.
     *
     * <p>Patch properties of bare metal machine key set for the provided cluster, or update the tags associated with
     * it. Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of bareMetalMachineKeySet represents the bare metal machine key set.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BareMetalMachineKeySetInner>, BareMetalMachineKeySetInner> beginUpdate(
        String resourceGroupName, String clusterName, String bareMetalMachineKeySetName);

    /**
     * Patch bare metal machine key set of the cluster.
     *
     * <p>Patch properties of bare metal machine key set for the provided cluster, or update the tags associated with
     * it. Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param bareMetalMachineKeySetUpdateParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of bareMetalMachineKeySet represents the bare metal machine key set.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BareMetalMachineKeySetInner>, BareMetalMachineKeySetInner> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String bareMetalMachineKeySetName,
        BareMetalMachineKeySetPatchParameters bareMetalMachineKeySetUpdateParameters,
        Context context);

    /**
     * Patch bare metal machine key set of the cluster.
     *
     * <p>Patch properties of bare metal machine key set for the provided cluster, or update the tags associated with
     * it. Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bareMetalMachineKeySet represents the bare metal machine key set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BareMetalMachineKeySetInner update(String resourceGroupName, String clusterName, String bareMetalMachineKeySetName);

    /**
     * Patch bare metal machine key set of the cluster.
     *
     * <p>Patch properties of bare metal machine key set for the provided cluster, or update the tags associated with
     * it. Properties and tag updates can be done independently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the cluster.
     * @param bareMetalMachineKeySetName The name of the bare metal machine key set.
     * @param bareMetalMachineKeySetUpdateParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bareMetalMachineKeySet represents the bare metal machine key set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BareMetalMachineKeySetInner update(
        String resourceGroupName,
        String clusterName,
        String bareMetalMachineKeySetName,
        BareMetalMachineKeySetPatchParameters bareMetalMachineKeySetUpdateParameters,
        Context context);
}
