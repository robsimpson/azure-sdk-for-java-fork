// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of UserSubscriptions. */
public interface UserSubscriptions {
    /**
     * Lists the collection of subscriptions of the specified user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Subscriptions list representation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SubscriptionContract> list(String resourceGroupName, String serviceName, String userId);

    /**
     * Lists the collection of subscriptions of the specified user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|------------------------|-----------------------------------|&lt;/br&gt;|name |
     *     filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;|displayName |
     *     filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;|stateComment |
     *     filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;|ownerId | filter |
     *     ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;|scope | filter | ge, le,
     *     eq, ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;|userId | filter | ge, le, eq, ne,
     *     gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;|productId | filter | ge, le, eq, ne, gt, lt
     *     | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Subscriptions list representation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SubscriptionContract> list(
        String resourceGroupName,
        String serviceName,
        String userId,
        String filter,
        Integer top,
        Integer skip,
        Context context);

    /**
     * Gets the specified Subscription entity associated with a particular user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param sid Subscription entity Identifier. The entity represents the association between a user and a product in
     *     API Management.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Subscription entity associated with a particular user.
     */
    SubscriptionContract get(String resourceGroupName, String serviceName, String userId, String sid);

    /**
     * Gets the specified Subscription entity associated with a particular user.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param sid Subscription entity Identifier. The entity represents the association between a user and a product in
     *     API Management.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Subscription entity associated with a particular user.
     */
    Response<SubscriptionContract> getWithResponse(
        String resourceGroupName, String serviceName, String userId, String sid, Context context);
}
