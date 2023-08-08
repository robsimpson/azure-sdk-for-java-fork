// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateLinkResources. */
public interface PrivateLinkResources {
    /**
     * Get list of group IDs for video analyzer account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of group IDs for video analyzer account.
     */
    PrivateLinkResourceListResult list(String resourceGroupName, String accountName);

    /**
     * Get list of group IDs for video analyzer account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of group IDs for video analyzer account along with {@link Response}.
     */
    Response<PrivateLinkResourceListResult> listWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * Get group ID for video analyzer account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param name Name of the private link resource (Group ID).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return group ID for video analyzer account.
     */
    PrivateLinkResource get(String resourceGroupName, String accountName, String name);

    /**
     * Get group ID for video analyzer account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Video Analyzer account name.
     * @param name Name of the private link resource (Group ID).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return group ID for video analyzer account along with {@link Response}.
     */
    Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName, String accountName, String name, Context context);
}
