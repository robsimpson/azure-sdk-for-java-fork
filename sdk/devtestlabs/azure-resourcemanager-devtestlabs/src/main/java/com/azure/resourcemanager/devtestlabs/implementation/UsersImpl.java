// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.fluent.UsersClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.UserInner;
import com.azure.resourcemanager.devtestlabs.models.User;
import com.azure.resourcemanager.devtestlabs.models.Users;

public final class UsersImpl implements Users {
    private static final ClientLogger LOGGER = new ClientLogger(UsersImpl.class);

    private final UsersClient innerClient;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public UsersImpl(UsersClient innerClient, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<User> list(String resourceGroupName, String labName) {
        PagedIterable<UserInner> inner = this.serviceClient().list(resourceGroupName, labName);
        return Utils.mapPage(inner, inner1 -> new UserImpl(inner1, this.manager()));
    }

    public PagedIterable<User> list(
        String resourceGroupName,
        String labName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        PagedIterable<UserInner> inner =
            this.serviceClient().list(resourceGroupName, labName, expand, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new UserImpl(inner1, this.manager()));
    }

    public Response<User> getWithResponse(
        String resourceGroupName, String labName, String name, String expand, Context context) {
        Response<UserInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, labName, name, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UserImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public User get(String resourceGroupName, String labName, String name) {
        UserInner inner = this.serviceClient().get(resourceGroupName, labName, name);
        if (inner != null) {
            return new UserImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String labName, String name) {
        this.serviceClient().delete(resourceGroupName, labName, name);
    }

    public void delete(String resourceGroupName, String labName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, labName, name, context);
    }

    public User getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "users");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String localExpand = null;
        return this.getWithResponse(resourceGroupName, labName, name, localExpand, Context.NONE).getValue();
    }

    public Response<User> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "users");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, name, expand, context);
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
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "users");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        this.delete(resourceGroupName, labName, name, Context.NONE);
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
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "users");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        this.delete(resourceGroupName, labName, name, context);
    }

    private UsersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    public UserImpl define(String name) {
        return new UserImpl(name, this.manager());
    }
}
