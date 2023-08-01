// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databricks.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.databricks.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.databricks.models.GroupIdInformation;
import com.azure.resourcemanager.databricks.models.PrivateLinkResources;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.databricks.AzureDatabricksManager serviceManager;

    public PrivateLinkResourcesImpl(
        PrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.databricks.AzureDatabricksManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GroupIdInformation> list(String resourceGroupName, String workspaceName) {
        PagedIterable<GroupIdInformationInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new GroupIdInformationImpl(inner1, this.manager()));
    }

    public PagedIterable<GroupIdInformation> list(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<GroupIdInformationInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new GroupIdInformationImpl(inner1, this.manager()));
    }

    public Response<GroupIdInformation> getWithResponse(
        String resourceGroupName, String workspaceName, String groupId, Context context) {
        Response<GroupIdInformationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, groupId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GroupIdInformationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GroupIdInformation get(String resourceGroupName, String workspaceName, String groupId) {
        GroupIdInformationInner inner = this.serviceClient().get(resourceGroupName, workspaceName, groupId);
        if (inner != null) {
            return new GroupIdInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databricks.AzureDatabricksManager manager() {
        return this.serviceManager;
    }
}
