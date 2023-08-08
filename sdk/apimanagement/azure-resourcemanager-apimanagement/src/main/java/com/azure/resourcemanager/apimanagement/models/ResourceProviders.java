// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * Performs a connectivity check between the API Management service and a given destination, and returns metrics for
     * the connection, as well as errors encountered while trying to establish it.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param connectivityCheckRequestParams Connectivity Check request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the connectivity status.
     */
    ConnectivityCheckResponse performConnectivityCheckAsync(
        String resourceGroupName, String serviceName, ConnectivityCheckRequest connectivityCheckRequestParams);

    /**
     * Performs a connectivity check between the API Management service and a given destination, and returns metrics for
     * the connection, as well as errors encountered while trying to establish it.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param connectivityCheckRequestParams Connectivity Check request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information on the connectivity status.
     */
    ConnectivityCheckResponse performConnectivityCheckAsync(
        String resourceGroupName,
        String serviceName,
        ConnectivityCheckRequest connectivityCheckRequestParams,
        Context context);
}
