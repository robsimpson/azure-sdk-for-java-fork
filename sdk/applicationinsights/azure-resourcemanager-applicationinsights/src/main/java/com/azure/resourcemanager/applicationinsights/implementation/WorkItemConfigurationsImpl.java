// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.applicationinsights.fluent.WorkItemConfigurationsClient;
import com.azure.resourcemanager.applicationinsights.fluent.models.WorkItemConfigurationInner;
import com.azure.resourcemanager.applicationinsights.models.WorkItemConfiguration;
import com.azure.resourcemanager.applicationinsights.models.WorkItemConfigurations;
import com.azure.resourcemanager.applicationinsights.models.WorkItemCreateConfiguration;

public final class WorkItemConfigurationsImpl implements WorkItemConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(WorkItemConfigurationsImpl.class);

    private final WorkItemConfigurationsClient innerClient;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    public WorkItemConfigurationsImpl(
        WorkItemConfigurationsClient innerClient,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WorkItemConfiguration> list(String resourceGroupName, String resourceName) {
        PagedIterable<WorkItemConfigurationInner> inner = this.serviceClient().list(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new WorkItemConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkItemConfiguration> list(String resourceGroupName, String resourceName, Context context) {
        PagedIterable<WorkItemConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new WorkItemConfigurationImpl(inner1, this.manager()));
    }

    public WorkItemConfiguration create(
        String resourceGroupName, String resourceName, WorkItemCreateConfiguration workItemConfigurationProperties) {
        WorkItemConfigurationInner inner =
            this.serviceClient().create(resourceGroupName, resourceName, workItemConfigurationProperties);
        if (inner != null) {
            return new WorkItemConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkItemConfiguration> createWithResponse(
        String resourceGroupName,
        String resourceName,
        WorkItemCreateConfiguration workItemConfigurationProperties,
        Context context) {
        Response<WorkItemConfigurationInner> inner =
            this
                .serviceClient()
                .createWithResponse(resourceGroupName, resourceName, workItemConfigurationProperties, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkItemConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkItemConfiguration getDefault(String resourceGroupName, String resourceName) {
        WorkItemConfigurationInner inner = this.serviceClient().getDefault(resourceGroupName, resourceName);
        if (inner != null) {
            return new WorkItemConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkItemConfiguration> getDefaultWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<WorkItemConfigurationInner> inner =
            this.serviceClient().getDefaultWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkItemConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String resourceName, String workItemConfigId) {
        this.serviceClient().delete(resourceGroupName, resourceName, workItemConfigId);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String workItemConfigId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, workItemConfigId, context);
    }

    public WorkItemConfiguration getItem(String resourceGroupName, String resourceName, String workItemConfigId) {
        WorkItemConfigurationInner inner =
            this.serviceClient().getItem(resourceGroupName, resourceName, workItemConfigId);
        if (inner != null) {
            return new WorkItemConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkItemConfiguration> getItemWithResponse(
        String resourceGroupName, String resourceName, String workItemConfigId, Context context) {
        Response<WorkItemConfigurationInner> inner =
            this.serviceClient().getItemWithResponse(resourceGroupName, resourceName, workItemConfigId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkItemConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkItemConfiguration updateItem(
        String resourceGroupName,
        String resourceName,
        String workItemConfigId,
        WorkItemCreateConfiguration workItemConfigurationProperties) {
        WorkItemConfigurationInner inner =
            this
                .serviceClient()
                .updateItem(resourceGroupName, resourceName, workItemConfigId, workItemConfigurationProperties);
        if (inner != null) {
            return new WorkItemConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkItemConfiguration> updateItemWithResponse(
        String resourceGroupName,
        String resourceName,
        String workItemConfigId,
        WorkItemCreateConfiguration workItemConfigurationProperties,
        Context context) {
        Response<WorkItemConfigurationInner> inner =
            this
                .serviceClient()
                .updateItemWithResponse(
                    resourceGroupName, resourceName, workItemConfigId, workItemConfigurationProperties, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkItemConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private WorkItemConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
