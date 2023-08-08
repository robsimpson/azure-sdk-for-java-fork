// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountSessionInner;

/** An instance of this class provides access to all the operations defined in IntegrationAccountSessionsClient. */
public interface IntegrationAccountSessionsClient {
    /**
     * Gets a list of integration account sessions.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration account sessions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IntegrationAccountSessionInner> list(String resourceGroupName, String integrationAccountName);

    /**
     * Gets a list of integration account sessions.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: ChangedTime.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration account sessions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IntegrationAccountSessionInner> list(
        String resourceGroupName, String integrationAccountName, Integer top, String filter, Context context);

    /**
     * Gets an integration account session.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param sessionName The integration account session name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration account session along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationAccountSessionInner> getWithResponse(
        String resourceGroupName, String integrationAccountName, String sessionName, Context context);

    /**
     * Gets an integration account session.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param sessionName The integration account session name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an integration account session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationAccountSessionInner get(String resourceGroupName, String integrationAccountName, String sessionName);

    /**
     * Creates or updates an integration account session.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param sessionName The integration account session name.
     * @param session The integration account session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration account session along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationAccountSessionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String integrationAccountName,
        String sessionName,
        IntegrationAccountSessionInner session,
        Context context);

    /**
     * Creates or updates an integration account session.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param sessionName The integration account session name.
     * @param session The integration account session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration account session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationAccountSessionInner createOrUpdate(
        String resourceGroupName,
        String integrationAccountName,
        String sessionName,
        IntegrationAccountSessionInner session);

    /**
     * Deletes an integration account session.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param sessionName The integration account session name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String integrationAccountName, String sessionName, Context context);

    /**
     * Deletes an integration account session.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param sessionName The integration account session name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String integrationAccountName, String sessionName);
}
