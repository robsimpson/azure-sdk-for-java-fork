// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.redis.fluent.models.RedisFirewallRuleInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in FirewallRulesClient. */
public interface FirewallRulesClient {
    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all firewall rules in the specified redis cache as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RedisFirewallRuleInner> listAsync(String resourceGroupName, String cacheName);

    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all firewall rules in the specified redis cache as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RedisFirewallRuleInner> list(String resourceGroupName, String cacheName);

    /**
     * Gets all firewall rules in the specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all firewall rules in the specified redis cache as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RedisFirewallRuleInner> list(String resourceGroupName, String cacheName, Context context);

    /**
     * Create or update a redis cache firewall rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param parameters Parameters supplied to the create or update redis firewall rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a firewall rule on a redis cache has a name, and describes a contiguous range of IP addresses permitted
     *     to connect along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RedisFirewallRuleInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String cacheName, String ruleName, RedisFirewallRuleInner parameters);

    /**
     * Create or update a redis cache firewall rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param parameters Parameters supplied to the create or update redis firewall rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a firewall rule on a redis cache has a name, and describes a contiguous range of IP addresses permitted
     *     to connect on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RedisFirewallRuleInner> createOrUpdateAsync(
        String resourceGroupName, String cacheName, String ruleName, RedisFirewallRuleInner parameters);

    /**
     * Create or update a redis cache firewall rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param parameters Parameters supplied to the create or update redis firewall rule operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a firewall rule on a redis cache has a name, and describes a contiguous range of IP addresses permitted
     *     to connect along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RedisFirewallRuleInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String cacheName,
        String ruleName,
        RedisFirewallRuleInner parameters,
        Context context);

    /**
     * Create or update a redis cache firewall rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param parameters Parameters supplied to the create or update redis firewall rule operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a firewall rule on a redis cache has a name, and describes a contiguous range of IP addresses permitted
     *     to connect.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RedisFirewallRuleInner createOrUpdate(
        String resourceGroupName, String cacheName, String ruleName, RedisFirewallRuleInner parameters);

    /**
     * Gets a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single firewall rule in a specified redis cache along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RedisFirewallRuleInner>> getWithResponseAsync(
        String resourceGroupName, String cacheName, String ruleName);

    /**
     * Gets a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single firewall rule in a specified redis cache on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RedisFirewallRuleInner> getAsync(String resourceGroupName, String cacheName, String ruleName);

    /**
     * Gets a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single firewall rule in a specified redis cache along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RedisFirewallRuleInner> getWithResponse(
        String resourceGroupName, String cacheName, String ruleName, Context context);

    /**
     * Gets a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single firewall rule in a specified redis cache.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RedisFirewallRuleInner get(String resourceGroupName, String cacheName, String ruleName);

    /**
     * Deletes a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String cacheName, String ruleName);

    /**
     * Deletes a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String cacheName, String ruleName);

    /**
     * Deletes a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String cacheName, String ruleName, Context context);

    /**
     * Deletes a single firewall rule in a specified redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @param ruleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String cacheName, String ruleName);
}
