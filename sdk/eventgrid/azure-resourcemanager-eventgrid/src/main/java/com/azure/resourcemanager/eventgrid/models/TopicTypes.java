// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TopicTypes. */
public interface TopicTypes {
    /**
     * List topic types.
     *
     * <p>List all registered topic types.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Topic Types operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TopicTypeInfo> list();

    /**
     * List topic types.
     *
     * <p>List all registered topic types.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Topic Types operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TopicTypeInfo> list(Context context);

    /**
     * Get a topic type.
     *
     * <p>Get information about a topic type.
     *
     * @param topicTypeName Name of the topic type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a topic type along with {@link Response}.
     */
    Response<TopicTypeInfo> getWithResponse(String topicTypeName, Context context);

    /**
     * Get a topic type.
     *
     * <p>Get information about a topic type.
     *
     * @param topicTypeName Name of the topic type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a topic type.
     */
    TopicTypeInfo get(String topicTypeName);

    /**
     * List event types.
     *
     * <p>List event types for a topic type.
     *
     * @param topicTypeName Name of the topic type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Event Types operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventType> listEventTypes(String topicTypeName);

    /**
     * List event types.
     *
     * <p>List event types for a topic type.
     *
     * @param topicTypeName Name of the topic type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Event Types operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<EventType> listEventTypes(String topicTypeName, Context context);
}
