// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.fluent.AccountFiltersClient;
import com.azure.resourcemanager.mediaservices.fluent.models.AccountFilterInner;
import com.azure.resourcemanager.mediaservices.models.AccountFilter;
import com.azure.resourcemanager.mediaservices.models.AccountFilters;

public final class AccountFiltersImpl implements AccountFilters {
    private static final ClientLogger LOGGER = new ClientLogger(AccountFiltersImpl.class);

    private final AccountFiltersClient innerClient;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public AccountFiltersImpl(
        AccountFiltersClient innerClient, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AccountFilter> list(String resourceGroupName, String accountName) {
        PagedIterable<AccountFilterInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new AccountFilterImpl(inner1, this.manager()));
    }

    public PagedIterable<AccountFilter> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<AccountFilterInner> inner = this.serviceClient().list(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new AccountFilterImpl(inner1, this.manager()));
    }

    public Response<AccountFilter> getWithResponse(
        String resourceGroupName, String accountName, String filterName, Context context) {
        Response<AccountFilterInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, filterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccountFilterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccountFilter get(String resourceGroupName, String accountName, String filterName) {
        AccountFilterInner inner = this.serviceClient().get(resourceGroupName, accountName, filterName);
        if (inner != null) {
            return new AccountFilterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String filterName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, filterName, context);
    }

    public void delete(String resourceGroupName, String accountName, String filterName) {
        this.serviceClient().delete(resourceGroupName, accountName, filterName);
    }

    public AccountFilter getById(String id) {
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
        String filterName = Utils.getValueFromIdByName(id, "accountFilters");
        if (filterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'accountFilters'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, filterName, Context.NONE).getValue();
    }

    public Response<AccountFilter> getByIdWithResponse(String id, Context context) {
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
        String filterName = Utils.getValueFromIdByName(id, "accountFilters");
        if (filterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'accountFilters'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, filterName, context);
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
        String filterName = Utils.getValueFromIdByName(id, "accountFilters");
        if (filterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'accountFilters'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, filterName, Context.NONE);
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
        String filterName = Utils.getValueFromIdByName(id, "accountFilters");
        if (filterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'accountFilters'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, filterName, context);
    }

    private AccountFiltersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }

    public AccountFilterImpl define(String name) {
        return new AccountFilterImpl(name, this.manager());
    }
}
