// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.WatchersClient;
import com.azure.resourcemanager.automation.fluent.models.WatcherInner;
import com.azure.resourcemanager.automation.models.Watcher;
import com.azure.resourcemanager.automation.models.Watchers;

public final class WatchersImpl implements Watchers {
    private static final ClientLogger LOGGER = new ClientLogger(WatchersImpl.class);

    private final WatchersClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public WatchersImpl(
        WatchersClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Watcher get(String resourceGroupName, String automationAccountName, String watcherName) {
        WatcherInner inner = this.serviceClient().get(resourceGroupName, automationAccountName, watcherName);
        if (inner != null) {
            return new WatcherImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Watcher> getWithResponse(
        String resourceGroupName, String automationAccountName, String watcherName, Context context) {
        Response<WatcherInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, automationAccountName, watcherName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WatcherImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String automationAccountName, String watcherName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, watcherName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String watcherName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, automationAccountName, watcherName, context);
    }

    public void start(String resourceGroupName, String automationAccountName, String watcherName) {
        this.serviceClient().start(resourceGroupName, automationAccountName, watcherName);
    }

    public Response<Void> startWithResponse(
        String resourceGroupName, String automationAccountName, String watcherName, Context context) {
        return this.serviceClient().startWithResponse(resourceGroupName, automationAccountName, watcherName, context);
    }

    public void stop(String resourceGroupName, String automationAccountName, String watcherName) {
        this.serviceClient().stop(resourceGroupName, automationAccountName, watcherName);
    }

    public Response<Void> stopWithResponse(
        String resourceGroupName, String automationAccountName, String watcherName, Context context) {
        return this.serviceClient().stopWithResponse(resourceGroupName, automationAccountName, watcherName, context);
    }

    public PagedIterable<Watcher> listByAutomationAccount(String resourceGroupName, String automationAccountName) {
        PagedIterable<WatcherInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return Utils.mapPage(inner, inner1 -> new WatcherImpl(inner1, this.manager()));
    }

    public PagedIterable<Watcher> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, String filter, Context context) {
        PagedIterable<WatcherInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName, filter, context);
        return Utils.mapPage(inner, inner1 -> new WatcherImpl(inner1, this.manager()));
    }

    public Watcher getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String watcherName = Utils.getValueFromIdByName(id, "watchers");
        if (watcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'watchers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, watcherName, Context.NONE).getValue();
    }

    public Response<Watcher> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String watcherName = Utils.getValueFromIdByName(id, "watchers");
        if (watcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'watchers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, watcherName, context);
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
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String watcherName = Utils.getValueFromIdByName(id, "watchers");
        if (watcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'watchers'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, automationAccountName, watcherName, Context.NONE);
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
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String watcherName = Utils.getValueFromIdByName(id, "watchers");
        if (watcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'watchers'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, automationAccountName, watcherName, context);
    }

    private WatchersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public WatcherImpl define(String name) {
        return new WatcherImpl(name, this.manager());
    }
}
