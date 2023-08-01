// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DeletedBackupInstances. */
public interface DeletedBackupInstances {
    /**
     * Gets deleted backup instances belonging to a backup vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the backup vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deleted backup instances belonging to a backup vault as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeletedBackupInstanceResource> list(String resourceGroupName, String vaultName);

    /**
     * Gets deleted backup instances belonging to a backup vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the backup vault.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deleted backup instances belonging to a backup vault as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeletedBackupInstanceResource> list(String resourceGroupName, String vaultName, Context context);

    /**
     * Gets a deleted backup instance with name in a backup vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the backup vault.
     * @param backupInstanceName The name of the deleted backup instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted backup instance with name in a backup vault along with {@link Response}.
     */
    Response<DeletedBackupInstanceResource> getWithResponse(
        String resourceGroupName, String vaultName, String backupInstanceName, Context context);

    /**
     * Gets a deleted backup instance with name in a backup vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the backup vault.
     * @param backupInstanceName The name of the deleted backup instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted backup instance with name in a backup vault.
     */
    DeletedBackupInstanceResource get(String resourceGroupName, String vaultName, String backupInstanceName);

    /**
     * The undelete operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the backup vault.
     * @param backupInstanceName The name of the deleted backup instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void undelete(String resourceGroupName, String vaultName, String backupInstanceName);

    /**
     * The undelete operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the backup vault.
     * @param backupInstanceName The name of the deleted backup instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void undelete(String resourceGroupName, String vaultName, String backupInstanceName, Context context);
}
