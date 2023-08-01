// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.IotSecuritySolutionsAnalyticsRecommendationsClient;
import com.azure.resourcemanager.security.fluent.models.IoTSecurityAggregatedRecommendationInner;
import com.azure.resourcemanager.security.models.IoTSecurityAggregatedRecommendation;
import com.azure.resourcemanager.security.models.IotSecuritySolutionsAnalyticsRecommendations;

public final class IotSecuritySolutionsAnalyticsRecommendationsImpl
    implements IotSecuritySolutionsAnalyticsRecommendations {
    private static final ClientLogger LOGGER = new ClientLogger(IotSecuritySolutionsAnalyticsRecommendationsImpl.class);

    private final IotSecuritySolutionsAnalyticsRecommendationsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public IotSecuritySolutionsAnalyticsRecommendationsImpl(
        IotSecuritySolutionsAnalyticsRecommendationsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<IoTSecurityAggregatedRecommendation> getWithResponse(
        String resourceGroupName, String solutionName, String aggregatedRecommendationName, Context context) {
        Response<IoTSecurityAggregatedRecommendationInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, solutionName, aggregatedRecommendationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IoTSecurityAggregatedRecommendationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IoTSecurityAggregatedRecommendation get(
        String resourceGroupName, String solutionName, String aggregatedRecommendationName) {
        IoTSecurityAggregatedRecommendationInner inner =
            this.serviceClient().get(resourceGroupName, solutionName, aggregatedRecommendationName);
        if (inner != null) {
            return new IoTSecurityAggregatedRecommendationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<IoTSecurityAggregatedRecommendation> list(String resourceGroupName, String solutionName) {
        PagedIterable<IoTSecurityAggregatedRecommendationInner> inner =
            this.serviceClient().list(resourceGroupName, solutionName);
        return Utils.mapPage(inner, inner1 -> new IoTSecurityAggregatedRecommendationImpl(inner1, this.manager()));
    }

    public PagedIterable<IoTSecurityAggregatedRecommendation> list(
        String resourceGroupName, String solutionName, Integer top, Context context) {
        PagedIterable<IoTSecurityAggregatedRecommendationInner> inner =
            this.serviceClient().list(resourceGroupName, solutionName, top, context);
        return Utils.mapPage(inner, inner1 -> new IoTSecurityAggregatedRecommendationImpl(inner1, this.manager()));
    }

    private IotSecuritySolutionsAnalyticsRecommendationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
