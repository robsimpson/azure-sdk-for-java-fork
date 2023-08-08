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
import com.azure.resourcemanager.appcontainers.fluent.models.SourceControlInner;

/** An instance of this class provides access to all the operations defined in ContainerAppsSourceControlsClient. */
public interface ContainerAppsSourceControlsClient {
    /**
     * Get the Container App SourceControls in a given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container App SourceControls in a given resource group as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SourceControlInner> listByContainerApp(String resourceGroupName, String containerAppName);

    /**
     * Get the Container App SourceControls in a given resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Container App SourceControls in a given resource group as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SourceControlInner> listByContainerApp(
        String resourceGroupName, String containerAppName, Context context);

    /**
     * Get a SourceControl of a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SourceControl of a Container App along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SourceControlInner> getWithResponse(
        String resourceGroupName, String containerAppName, String sourceControlName, Context context);

    /**
     * Get a SourceControl of a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SourceControl of a Container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlInner get(String resourceGroupName, String containerAppName, String sourceControlName);

    /**
     * Create or update the SourceControl for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @param sourceControlEnvelope Properties used to create a Container App SourceControl.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of container App SourceControl.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SourceControlInner>, SourceControlInner> beginCreateOrUpdate(
        String resourceGroupName,
        String containerAppName,
        String sourceControlName,
        SourceControlInner sourceControlEnvelope);

    /**
     * Create or update the SourceControl for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @param sourceControlEnvelope Properties used to create a Container App SourceControl.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of container App SourceControl.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SourceControlInner>, SourceControlInner> beginCreateOrUpdate(
        String resourceGroupName,
        String containerAppName,
        String sourceControlName,
        SourceControlInner sourceControlEnvelope,
        Context context);

    /**
     * Create or update the SourceControl for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @param sourceControlEnvelope Properties used to create a Container App SourceControl.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App SourceControl.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlInner createOrUpdate(
        String resourceGroupName,
        String containerAppName,
        String sourceControlName,
        SourceControlInner sourceControlEnvelope);

    /**
     * Create or update the SourceControl for a Container App.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @param sourceControlEnvelope Properties used to create a Container App SourceControl.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return container App SourceControl.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlInner createOrUpdate(
        String resourceGroupName,
        String containerAppName,
        String sourceControlName,
        SourceControlInner sourceControlEnvelope,
        Context context);

    /**
     * Delete a Container App SourceControl.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String containerAppName, String sourceControlName);

    /**
     * Delete a Container App SourceControl.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String containerAppName, String sourceControlName, Context context);

    /**
     * Delete a Container App SourceControl.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String containerAppName, String sourceControlName);

    /**
     * Delete a Container App SourceControl.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param sourceControlName Name of the Container App SourceControl.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String containerAppName, String sourceControlName, Context context);
}
