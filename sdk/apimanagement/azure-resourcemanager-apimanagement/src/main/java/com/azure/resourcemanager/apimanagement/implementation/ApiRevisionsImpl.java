// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ApiRevisionsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiRevisionContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiRevisionContract;
import com.azure.resourcemanager.apimanagement.models.ApiRevisions;

public final class ApiRevisionsImpl implements ApiRevisions {
    private static final ClientLogger LOGGER = new ClientLogger(ApiRevisionsImpl.class);

    private final ApiRevisionsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ApiRevisionsImpl(
        ApiRevisionsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApiRevisionContract> listByService(
        String resourceGroupName, String serviceName, String apiId) {
        PagedIterable<ApiRevisionContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, apiId);
        return Utils.mapPage(inner, inner1 -> new ApiRevisionContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ApiRevisionContract> listByService(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<ApiRevisionContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, apiId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new ApiRevisionContractImpl(inner1, this.manager()));
    }

    private ApiRevisionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
