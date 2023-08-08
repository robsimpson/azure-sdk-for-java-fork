// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagemover.fluent.StorageMoversClient;
import com.azure.resourcemanager.storagemover.fluent.models.StorageMoverInner;
import com.azure.resourcemanager.storagemover.models.StorageMover;
import com.azure.resourcemanager.storagemover.models.StorageMovers;

public final class StorageMoversImpl implements StorageMovers {
    private static final ClientLogger LOGGER = new ClientLogger(StorageMoversImpl.class);

    private final StorageMoversClient innerClient;

    private final com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager;

    public StorageMoversImpl(
        StorageMoversClient innerClient, com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StorageMover> list() {
        PagedIterable<StorageMoverInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new StorageMoverImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageMover> list(Context context) {
        PagedIterable<StorageMoverInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new StorageMoverImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageMover> listByResourceGroup(String resourceGroupName) {
        PagedIterable<StorageMoverInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new StorageMoverImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageMover> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<StorageMoverInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new StorageMoverImpl(inner1, this.manager()));
    }

    public Response<StorageMover> getByResourceGroupWithResponse(
        String resourceGroupName, String storageMoverName, Context context) {
        Response<StorageMoverInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, storageMoverName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new StorageMoverImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StorageMover getByResourceGroup(String resourceGroupName, String storageMoverName) {
        StorageMoverInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, storageMoverName);
        if (inner != null) {
            return new StorageMoverImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String storageMoverName) {
        this.serviceClient().delete(resourceGroupName, storageMoverName);
    }

    public void delete(String resourceGroupName, String storageMoverName, Context context) {
        this.serviceClient().delete(resourceGroupName, storageMoverName, context);
    }

    public StorageMover getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, storageMoverName, Context.NONE).getValue();
    }

    public Response<StorageMover> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, storageMoverName, context);
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
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        this.delete(resourceGroupName, storageMoverName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        this.delete(resourceGroupName, storageMoverName, context);
    }

    private StorageMoversClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagemover.StorageMoverManager manager() {
        return this.serviceManager;
    }

    public StorageMoverImpl define(String name) {
        return new StorageMoverImpl(name, this.manager());
    }
}
