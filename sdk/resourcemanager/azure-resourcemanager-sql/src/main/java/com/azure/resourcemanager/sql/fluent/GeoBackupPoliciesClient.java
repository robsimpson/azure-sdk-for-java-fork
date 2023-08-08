// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.GeoBackupPolicyInner;
import com.azure.resourcemanager.sql.models.GeoBackupPolicyName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GeoBackupPoliciesClient. */
public interface GeoBackupPoliciesClient {
    /**
     * Gets a list of Geo backup policies for the given database resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Geo backup policies for the given database resource as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<GeoBackupPolicyInner> listAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a list of Geo backup policies for the given database resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Geo backup policies for the given database resource as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GeoBackupPolicyInner> list(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a list of Geo backup policies for the given database resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Geo backup policies for the given database resource as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GeoBackupPolicyInner> list(
        String resourceGroupName, String serverName, String databaseName, Context context);

    /**
     * Gets a Geo backup policy for the given database resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the Geo backup policy. This should always be 'Default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Geo backup policy for the given database resource along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<GeoBackupPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, GeoBackupPolicyName geoBackupPolicyName);

    /**
     * Gets a Geo backup policy for the given database resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the Geo backup policy. This should always be 'Default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Geo backup policy for the given database resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<GeoBackupPolicyInner> getAsync(
        String resourceGroupName, String serverName, String databaseName, GeoBackupPolicyName geoBackupPolicyName);

    /**
     * Gets a Geo backup policy for the given database resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the Geo backup policy. This should always be 'Default'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Geo backup policy for the given database resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GeoBackupPolicyInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        GeoBackupPolicyName geoBackupPolicyName,
        Context context);

    /**
     * Gets a Geo backup policy for the given database resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the Geo backup policy. This should always be 'Default'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Geo backup policy for the given database resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GeoBackupPolicyInner get(
        String resourceGroupName, String serverName, String databaseName, GeoBackupPolicyName geoBackupPolicyName);

    /**
     * Create or update a database default Geo backup policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the Geo backup policy. This should always be 'Default'.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Geo backup policy along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<GeoBackupPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters);

    /**
     * Create or update a database default Geo backup policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the Geo backup policy. This should always be 'Default'.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Geo backup policy on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<GeoBackupPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters);

    /**
     * Create or update a database default Geo backup policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the Geo backup policy. This should always be 'Default'.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Geo backup policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GeoBackupPolicyInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters,
        Context context);

    /**
     * Create or update a database default Geo backup policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param geoBackupPolicyName The name of the Geo backup policy. This should always be 'Default'.
     * @param parameters The required parameters for creating or updating the geo backup policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Geo backup policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GeoBackupPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        GeoBackupPolicyName geoBackupPolicyName,
        GeoBackupPolicyInner parameters);
}
