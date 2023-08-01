// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.DscNodeConfigurationsClient;
import com.azure.resourcemanager.automation.fluent.models.DscNodeConfigurationInner;
import com.azure.resourcemanager.automation.models.DscNodeConfiguration;
import com.azure.resourcemanager.automation.models.DscNodeConfigurations;

public final class DscNodeConfigurationsImpl implements DscNodeConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(DscNodeConfigurationsImpl.class);

    private final DscNodeConfigurationsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public DscNodeConfigurationsImpl(
        DscNodeConfigurationsClient innerClient,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String automationAccountName, String nodeConfigurationName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, nodeConfigurationName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String nodeConfigurationName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, automationAccountName, nodeConfigurationName, context);
    }

    public DscNodeConfiguration get(
        String resourceGroupName, String automationAccountName, String nodeConfigurationName) {
        DscNodeConfigurationInner inner =
            this.serviceClient().get(resourceGroupName, automationAccountName, nodeConfigurationName);
        if (inner != null) {
            return new DscNodeConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DscNodeConfiguration> getWithResponse(
        String resourceGroupName, String automationAccountName, String nodeConfigurationName, Context context) {
        Response<DscNodeConfigurationInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, automationAccountName, nodeConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DscNodeConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DscNodeConfiguration> listByAutomationAccount(
        String resourceGroupName, String automationAccountName) {
        PagedIterable<DscNodeConfigurationInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return Utils.mapPage(inner, inner1 -> new DscNodeConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<DscNodeConfiguration> listByAutomationAccount(
        String resourceGroupName,
        String automationAccountName,
        String filter,
        Integer skip,
        Integer top,
        String inlinecount,
        Context context) {
        PagedIterable<DscNodeConfigurationInner> inner =
            this
                .serviceClient()
                .listByAutomationAccount(
                    resourceGroupName, automationAccountName, filter, skip, top, inlinecount, context);
        return Utils.mapPage(inner, inner1 -> new DscNodeConfigurationImpl(inner1, this.manager()));
    }

    public DscNodeConfiguration getById(String id) {
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
        String nodeConfigurationName = Utils.getValueFromIdByName(id, "nodeConfigurations");
        if (nodeConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'nodeConfigurations'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, automationAccountName, nodeConfigurationName, Context.NONE)
            .getValue();
    }

    public Response<DscNodeConfiguration> getByIdWithResponse(String id, Context context) {
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
        String nodeConfigurationName = Utils.getValueFromIdByName(id, "nodeConfigurations");
        if (nodeConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'nodeConfigurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, nodeConfigurationName, context);
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
        String nodeConfigurationName = Utils.getValueFromIdByName(id, "nodeConfigurations");
        if (nodeConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'nodeConfigurations'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, automationAccountName, nodeConfigurationName, Context.NONE);
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
        String nodeConfigurationName = Utils.getValueFromIdByName(id, "nodeConfigurations");
        if (nodeConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'nodeConfigurations'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, automationAccountName, nodeConfigurationName, context);
    }

    private DscNodeConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public DscNodeConfigurationImpl define(String name) {
        return new DscNodeConfigurationImpl(name, this.manager());
    }
}
