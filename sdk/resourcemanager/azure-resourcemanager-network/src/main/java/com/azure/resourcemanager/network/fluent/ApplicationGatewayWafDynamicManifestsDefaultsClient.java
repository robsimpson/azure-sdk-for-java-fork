// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayWafDynamicManifestResultInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ApplicationGatewayWafDynamicManifestsDefaultsClient.
 */
public interface ApplicationGatewayWafDynamicManifestsDefaultsClient {
    /**
     * Gets the regional application gateway waf manifest.
     *
     * @param location The region where the nrp are located at.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the regional application gateway waf manifest along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ApplicationGatewayWafDynamicManifestResultInner>> getWithResponseAsync(String location);

    /**
     * Gets the regional application gateway waf manifest.
     *
     * @param location The region where the nrp are located at.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the regional application gateway waf manifest on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ApplicationGatewayWafDynamicManifestResultInner> getAsync(String location);

    /**
     * Gets the regional application gateway waf manifest.
     *
     * @param location The region where the nrp are located at.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the regional application gateway waf manifest along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationGatewayWafDynamicManifestResultInner> getWithResponse(String location, Context context);

    /**
     * Gets the regional application gateway waf manifest.
     *
     * @param location The region where the nrp are located at.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the regional application gateway waf manifest.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationGatewayWafDynamicManifestResultInner get(String location);
}
