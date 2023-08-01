// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DiskPools. */
public interface DiskPools {
    /**
     * Gets a list of Disk Pools in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Disk Pools in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskPool> list();

    /**
     * Gets a list of Disk Pools in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Disk Pools in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskPool> list(Context context);

    /**
     * Gets a list of DiskPools in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of DiskPools in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskPool> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of DiskPools in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of DiskPools in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DiskPool> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Delete a Disk pool; attached disks are not affected. This delete operation can take 10 minutes to complete. This
     * is expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String diskPoolName);

    /**
     * Delete a Disk pool; attached disks are not affected. This delete operation can take 10 minutes to complete. This
     * is expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String diskPoolName, Context context);

    /**
     * Get a Disk pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Disk pool along with {@link Response}.
     */
    Response<DiskPool> getByResourceGroupWithResponse(String resourceGroupName, String diskPoolName, Context context);

    /**
     * Get a Disk pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Disk pool.
     */
    DiskPool getByResourceGroup(String resourceGroupName, String diskPoolName);

    /**
     * Gets the network endpoints of all outbound dependencies of a Disk Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network endpoints of all outbound dependencies of a Disk Pool as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<OutboundEnvironmentEndpoint> listOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String diskPoolName);

    /**
     * Gets the network endpoints of all outbound dependencies of a Disk Pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network endpoints of all outbound dependencies of a Disk Pool as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<OutboundEnvironmentEndpoint> listOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String diskPoolName, Context context);

    /**
     * The operation to start a Disk Pool. This start operation can take 10 minutes to complete. This is expected
     * service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String diskPoolName);

    /**
     * The operation to start a Disk Pool. This start operation can take 10 minutes to complete. This is expected
     * service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String diskPoolName, Context context);

    /**
     * Shuts down the Disk Pool and releases the compute resources. You are not billed for the compute resources that
     * this Disk Pool uses. This operation can take 10 minutes to complete. This is expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deallocate(String resourceGroupName, String diskPoolName);

    /**
     * Shuts down the Disk Pool and releases the compute resources. You are not billed for the compute resources that
     * this Disk Pool uses. This operation can take 10 minutes to complete. This is expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deallocate(String resourceGroupName, String diskPoolName, Context context);

    /**
     * Upgrade replaces the underlying virtual machine hosts one at a time. This operation can take 10-15 minutes to
     * complete. This is expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upgrade(String resourceGroupName, String diskPoolName);

    /**
     * Upgrade replaces the underlying virtual machine hosts one at a time. This operation can take 10-15 minutes to
     * complete. This is expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param diskPoolName The name of the Disk Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upgrade(String resourceGroupName, String diskPoolName, Context context);

    /**
     * Get a Disk pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Disk pool along with {@link Response}.
     */
    DiskPool getById(String id);

    /**
     * Get a Disk pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Disk pool along with {@link Response}.
     */
    Response<DiskPool> getByIdWithResponse(String id, Context context);

    /**
     * Delete a Disk pool; attached disks are not affected. This delete operation can take 10 minutes to complete. This
     * is expected service behavior.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a Disk pool; attached disks are not affected. This delete operation can take 10 minutes to complete. This
     * is expected service behavior.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DiskPool resource.
     *
     * @param name resource name.
     * @return the first stage of the new DiskPool definition.
     */
    DiskPool.DefinitionStages.Blank define(String name);
}
