// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.cdn.fluent.models.UsageInner;
import com.azure.resourcemanager.cdn.models.CheckHostnameAvailabilityInput;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AfdProfilesClient. */
public interface AfdProfilesClient {
    /**
     * Checks the quota and actual usage of AzureFrontDoor endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<UsageInner> listResourceUsageAsync(String resourceGroupName, String profileName);

    /**
     * Checks the quota and actual usage of AzureFrontDoor endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageInner> listResourceUsage(String resourceGroupName, String profileName);

    /**
     * Checks the quota and actual usage of AzureFrontDoor endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list usages operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageInner> listResourceUsage(String resourceGroupName, String profileName, Context context);

    /**
     * Check the name availability of a host name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param checkHostnameAvailabilityInput Custom domain to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CheckNameAvailabilityOutputInner>> checkHostnameAvailabilityWithResponseAsync(
        String resourceGroupName, String profileName, CheckHostnameAvailabilityInput checkHostnameAvailabilityInput);

    /**
     * Check the name availability of a host name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param checkHostnameAvailabilityInput Custom domain to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CheckNameAvailabilityOutputInner> checkHostnameAvailabilityAsync(
        String resourceGroupName, String profileName, CheckHostnameAvailabilityInput checkHostnameAvailabilityInput);

    /**
     * Check the name availability of a host name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param checkHostnameAvailabilityInput Custom domain to be validated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityOutputInner checkHostnameAvailability(
        String resourceGroupName, String profileName, CheckHostnameAvailabilityInput checkHostnameAvailabilityInput);

    /**
     * Check the name availability of a host name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium or CDN profile which is
     *     unique within the resource group.
     * @param checkHostnameAvailabilityInput Custom domain to be validated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityOutputInner> checkHostnameAvailabilityWithResponse(
        String resourceGroupName,
        String profileName,
        CheckHostnameAvailabilityInput checkHostnameAvailabilityInput,
        Context context);
}
