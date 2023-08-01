// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.RouteFilterRuleInner;
import com.azure.resourcemanager.network.models.PatchRouteFilterRule;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RouteFilterRulesClient. */
public interface RouteFilterRulesClient {
    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String routeFilterName, String ruleName, Context context);

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Deletes the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String routeFilterName, String ruleName, Context context);

    /**
     * Gets the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified rule from a route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RouteFilterRuleInner>> getWithResponseAsync(
        String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Gets the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified rule from a route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteFilterRuleInner> getAsync(String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Gets the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified rule from a route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteFilterRuleInner get(String resourceGroupName, String routeFilterName, String ruleName);

    /**
     * Gets the specified rule from a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified rule from a route filter.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RouteFilterRuleInner> getWithResponse(
        String resourceGroupName, String routeFilterName, String ruleName, Context context);

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the create or update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters);

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the create or update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<RouteFilterRuleInner>, RouteFilterRuleInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters);

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the create or update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteFilterRuleInner>, RouteFilterRuleInner> beginCreateOrUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters);

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the create or update route filter rule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteFilterRuleInner>, RouteFilterRuleInner> beginCreateOrUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters,
        Context context);

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the create or update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteFilterRuleInner> createOrUpdateAsync(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters);

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the create or update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteFilterRuleInner createOrUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters);

    /**
     * Creates or updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the create or update route filter rule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteFilterRuleInner createOrUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        RouteFilterRuleInner routeFilterRuleParameters,
        Context context);

    /**
     * Updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        PatchRouteFilterRule routeFilterRuleParameters);

    /**
     * Updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<RouteFilterRuleInner>, RouteFilterRuleInner> beginUpdateAsync(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        PatchRouteFilterRule routeFilterRuleParameters);

    /**
     * Updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteFilterRuleInner>, RouteFilterRuleInner> beginUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        PatchRouteFilterRule routeFilterRuleParameters);

    /**
     * Updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the update route filter rule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<RouteFilterRuleInner>, RouteFilterRuleInner> beginUpdate(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        PatchRouteFilterRule routeFilterRuleParameters,
        Context context);

    /**
     * Updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RouteFilterRuleInner> updateAsync(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        PatchRouteFilterRule routeFilterRuleParameters);

    /**
     * Updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the update route filter rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteFilterRuleInner update(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        PatchRouteFilterRule routeFilterRuleParameters);

    /**
     * Updates a route in the specified route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param ruleName The name of the route filter rule.
     * @param routeFilterRuleParameters Parameters supplied to the update route filter rule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return route Filter Rule Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RouteFilterRuleInner update(
        String resourceGroupName,
        String routeFilterName,
        String ruleName,
        PatchRouteFilterRule routeFilterRuleParameters,
        Context context);

    /**
     * Gets all RouteFilterRules in a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all RouteFilterRules in a route filter.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RouteFilterRuleInner> listByRouteFilterAsync(String resourceGroupName, String routeFilterName);

    /**
     * Gets all RouteFilterRules in a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all RouteFilterRules in a route filter.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteFilterRuleInner> listByRouteFilter(String resourceGroupName, String routeFilterName);

    /**
     * Gets all RouteFilterRules in a route filter.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeFilterName The name of the route filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all RouteFilterRules in a route filter.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RouteFilterRuleInner> listByRouteFilter(
        String resourceGroupName, String routeFilterName, Context context);
}
