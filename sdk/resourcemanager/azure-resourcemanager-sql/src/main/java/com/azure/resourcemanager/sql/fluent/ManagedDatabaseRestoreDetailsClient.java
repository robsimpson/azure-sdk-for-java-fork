// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.ManagedDatabaseRestoreDetailsResultInner;
import com.azure.resourcemanager.sql.models.RestoreDetailsName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ManagedDatabaseRestoreDetailsClient. */
public interface ManagedDatabaseRestoreDetailsClient {
    /**
     * Gets managed database restore details.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param restoreDetailsName The name of the restore details to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database restore details along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ManagedDatabaseRestoreDetailsResultInner>> getWithResponseAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        RestoreDetailsName restoreDetailsName);

    /**
     * Gets managed database restore details.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param restoreDetailsName The name of the restore details to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database restore details on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ManagedDatabaseRestoreDetailsResultInner> getAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        RestoreDetailsName restoreDetailsName);

    /**
     * Gets managed database restore details.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param restoreDetailsName The name of the restore details to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database restore details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedDatabaseRestoreDetailsResultInner> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        RestoreDetailsName restoreDetailsName,
        Context context);

    /**
     * Gets managed database restore details.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the database.
     * @param restoreDetailsName The name of the restore details to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed database restore details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedDatabaseRestoreDetailsResultInner get(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        RestoreDetailsName restoreDetailsName);
}
