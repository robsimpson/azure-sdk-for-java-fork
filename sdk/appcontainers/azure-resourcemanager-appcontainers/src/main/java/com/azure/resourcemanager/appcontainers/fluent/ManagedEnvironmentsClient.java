// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appcontainers.fluent.models.EnvironmentAuthTokenInner;
import com.azure.resourcemanager.appcontainers.fluent.models.ManagedEnvironmentInner;
import com.azure.resourcemanager.appcontainers.fluent.models.WorkloadProfileStatesInner;

/** An instance of this class provides access to all the operations defined in ManagedEnvironmentsClient. */
public interface ManagedEnvironmentsClient {
    /**
     * Get all Environments for a subscription.
     *
     * <p>Get all Managed Environments for a subscription.
     *
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Managed Environments for a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedEnvironmentInner> list();

    /**
     * Get all Environments for a subscription.
     *
     * <p>Get all Managed Environments for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all Managed Environments for a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedEnvironmentInner> list(Context context);

    /**
     * Get all the Environments in a resource group.
     *
     * <p>Get all the Managed Environments in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Managed Environments in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedEnvironmentInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the Environments in a resource group.
     *
     * <p>Get all the Managed Environments in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Managed Environments in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedEnvironmentInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the properties of a Managed Environment.
     *
     * <p>Get the properties of a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Managed Environment used to host container apps along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedEnvironmentInner> getByResourceGroupWithResponse(
        String resourceGroupName, String environmentName, Context context);

    /**
     * Get the properties of a Managed Environment.
     *
     * <p>Get the properties of a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Managed Environment used to host container apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedEnvironmentInner getByResourceGroup(String resourceGroupName, String environmentName);

    /**
     * Creates or updates a Managed Environment.
     *
     * <p>Creates or updates a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param environmentEnvelope Configuration details of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an environment for hosting container apps.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedEnvironmentInner>, ManagedEnvironmentInner> beginCreateOrUpdate(
        String resourceGroupName, String environmentName, ManagedEnvironmentInner environmentEnvelope);

    /**
     * Creates or updates a Managed Environment.
     *
     * <p>Creates or updates a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param environmentEnvelope Configuration details of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an environment for hosting container apps.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedEnvironmentInner>, ManagedEnvironmentInner> beginCreateOrUpdate(
        String resourceGroupName, String environmentName, ManagedEnvironmentInner environmentEnvelope, Context context);

    /**
     * Creates or updates a Managed Environment.
     *
     * <p>Creates or updates a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param environmentEnvelope Configuration details of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment for hosting container apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedEnvironmentInner createOrUpdate(
        String resourceGroupName, String environmentName, ManagedEnvironmentInner environmentEnvelope);

    /**
     * Creates or updates a Managed Environment.
     *
     * <p>Creates or updates a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param environmentEnvelope Configuration details of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment for hosting container apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedEnvironmentInner createOrUpdate(
        String resourceGroupName, String environmentName, ManagedEnvironmentInner environmentEnvelope, Context context);

    /**
     * Delete a Managed Environment.
     *
     * <p>Delete a Managed Environment if it does not have any container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String environmentName);

    /**
     * Delete a Managed Environment.
     *
     * <p>Delete a Managed Environment if it does not have any container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String environmentName, Context context);

    /**
     * Delete a Managed Environment.
     *
     * <p>Delete a Managed Environment if it does not have any container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String environmentName);

    /**
     * Delete a Managed Environment.
     *
     * <p>Delete a Managed Environment if it does not have any container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String environmentName, Context context);

    /**
     * Update Managed Environment's properties.
     *
     * <p>Patches a Managed Environment using JSON Merge Patch.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param environmentEnvelope Configuration details of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an environment for hosting container apps.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedEnvironmentInner>, ManagedEnvironmentInner> beginUpdate(
        String resourceGroupName, String environmentName, ManagedEnvironmentInner environmentEnvelope);

    /**
     * Update Managed Environment's properties.
     *
     * <p>Patches a Managed Environment using JSON Merge Patch.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param environmentEnvelope Configuration details of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an environment for hosting container apps.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedEnvironmentInner>, ManagedEnvironmentInner> beginUpdate(
        String resourceGroupName, String environmentName, ManagedEnvironmentInner environmentEnvelope, Context context);

    /**
     * Update Managed Environment's properties.
     *
     * <p>Patches a Managed Environment using JSON Merge Patch.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param environmentEnvelope Configuration details of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment for hosting container apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedEnvironmentInner update(
        String resourceGroupName, String environmentName, ManagedEnvironmentInner environmentEnvelope);

    /**
     * Update Managed Environment's properties.
     *
     * <p>Patches a Managed Environment using JSON Merge Patch.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param environmentEnvelope Configuration details of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment for hosting container apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedEnvironmentInner update(
        String resourceGroupName, String environmentName, ManagedEnvironmentInner environmentEnvelope, Context context);

    /**
     * Get auth token for a managed environment
     *
     * <p>Checks if resource name is available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment Auth Token along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnvironmentAuthTokenInner> getAuthTokenWithResponse(
        String resourceGroupName, String environmentName, Context context);

    /**
     * Get auth token for a managed environment
     *
     * <p>Checks if resource name is available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment Auth Token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentAuthTokenInner getAuthToken(String resourceGroupName, String environmentName);

    /**
     * Get all workload Profile States for a Managed Environment..
     *
     * <p>Get all workload Profile States for a Managed Environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all workload Profile States for a Managed Environment as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkloadProfileStatesInner> listWorkloadProfileStates(
        String resourceGroupName, String environmentName);

    /**
     * Get all workload Profile States for a Managed Environment..
     *
     * <p>Get all workload Profile States for a Managed Environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all workload Profile States for a Managed Environment as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkloadProfileStatesInner> listWorkloadProfileStates(
        String resourceGroupName, String environmentName, Context context);
}
