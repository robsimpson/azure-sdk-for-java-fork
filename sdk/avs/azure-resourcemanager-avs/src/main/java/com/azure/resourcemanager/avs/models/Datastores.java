// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Datastores. */
public interface Datastores {
    /**
     * List datastores in a private cloud cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of datastores as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Datastore> list(String resourceGroupName, String privateCloudName, String clusterName);

    /**
     * List datastores in a private cloud cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of datastores as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Datastore> list(
        String resourceGroupName, String privateCloudName, String clusterName, Context context);

    /**
     * Get a datastore in a private cloud cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param datastoreName Name of the datastore in the private cloud cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a datastore in a private cloud cluster along with {@link Response}.
     */
    Response<Datastore> getWithResponse(
        String resourceGroupName, String privateCloudName, String clusterName, String datastoreName, Context context);

    /**
     * Get a datastore in a private cloud cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param datastoreName Name of the datastore in the private cloud cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a datastore in a private cloud cluster.
     */
    Datastore get(String resourceGroupName, String privateCloudName, String clusterName, String datastoreName);

    /**
     * Delete a datastore in a private cloud cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param datastoreName Name of the datastore in the private cloud cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String privateCloudName, String clusterName, String datastoreName);

    /**
     * Delete a datastore in a private cloud cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param datastoreName Name of the datastore in the private cloud cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String privateCloudName, String clusterName, String datastoreName, Context context);

    /**
     * Get a datastore in a private cloud cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a datastore in a private cloud cluster along with {@link Response}.
     */
    Datastore getById(String id);

    /**
     * Get a datastore in a private cloud cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a datastore in a private cloud cluster along with {@link Response}.
     */
    Response<Datastore> getByIdWithResponse(String id, Context context);

    /**
     * Delete a datastore in a private cloud cluster.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a datastore in a private cloud cluster.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Datastore resource.
     *
     * @param name resource name.
     * @return the first stage of the new Datastore definition.
     */
    Datastore.DefinitionStages.Blank define(String name);
}
