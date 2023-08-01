// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.fluent.JobsClient;
import com.azure.resourcemanager.mediaservices.fluent.models.JobInner;
import com.azure.resourcemanager.mediaservices.models.Job;
import com.azure.resourcemanager.mediaservices.models.Jobs;

public final class JobsImpl implements Jobs {
    private static final ClientLogger LOGGER = new ClientLogger(JobsImpl.class);

    private final JobsClient innerClient;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public JobsImpl(
        JobsClient innerClient, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Job> list(String resourceGroupName, String accountName, String transformName) {
        PagedIterable<JobInner> inner = this.serviceClient().list(resourceGroupName, accountName, transformName);
        return Utils.mapPage(inner, inner1 -> new JobImpl(inner1, this.manager()));
    }

    public PagedIterable<Job> list(
        String resourceGroupName,
        String accountName,
        String transformName,
        String filter,
        String orderby,
        Context context) {
        PagedIterable<JobInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, transformName, filter, orderby, context);
        return Utils.mapPage(inner, inner1 -> new JobImpl(inner1, this.manager()));
    }

    public Response<Job> getWithResponse(
        String resourceGroupName, String accountName, String transformName, String jobName, Context context) {
        Response<JobInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, transformName, jobName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Job get(String resourceGroupName, String accountName, String transformName, String jobName) {
        JobInner inner = this.serviceClient().get(resourceGroupName, accountName, transformName, jobName);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String transformName, String jobName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, transformName, jobName, context);
    }

    public void delete(String resourceGroupName, String accountName, String transformName, String jobName) {
        this.serviceClient().delete(resourceGroupName, accountName, transformName, jobName);
    }

    public Response<Void> cancelJobWithResponse(
        String resourceGroupName, String accountName, String transformName, String jobName, Context context) {
        return this
            .serviceClient()
            .cancelJobWithResponse(resourceGroupName, accountName, transformName, jobName, context);
    }

    public void cancelJob(String resourceGroupName, String accountName, String transformName, String jobName) {
        this.serviceClient().cancelJob(resourceGroupName, accountName, transformName, jobName);
    }

    public Job getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String transformName = Utils.getValueFromIdByName(id, "transforms");
        if (transformName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'transforms'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, transformName, jobName, Context.NONE).getValue();
    }

    public Response<Job> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String transformName = Utils.getValueFromIdByName(id, "transforms");
        if (transformName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'transforms'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, transformName, jobName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String transformName = Utils.getValueFromIdByName(id, "transforms");
        if (transformName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'transforms'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, transformName, jobName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaServices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaServices'.", id)));
        }
        String transformName = Utils.getValueFromIdByName(id, "transforms");
        if (transformName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'transforms'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, transformName, jobName, context);
    }

    private JobsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }

    public JobImpl define(String name) {
        return new JobImpl(name, this.manager());
    }
}
