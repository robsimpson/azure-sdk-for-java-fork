// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.notificationhubs.fluent.NamespacesClient;
import com.azure.resourcemanager.notificationhubs.fluent.models.CheckAvailabilityResultInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.NamespaceResourceInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.ResourceListKeysInner;
import com.azure.resourcemanager.notificationhubs.fluent.models.SharedAccessAuthorizationRuleResourceInner;
import com.azure.resourcemanager.notificationhubs.models.CheckAvailabilityParameters;
import com.azure.resourcemanager.notificationhubs.models.CheckAvailabilityResult;
import com.azure.resourcemanager.notificationhubs.models.NamespaceResource;
import com.azure.resourcemanager.notificationhubs.models.Namespaces;
import com.azure.resourcemanager.notificationhubs.models.PolicykeyResource;
import com.azure.resourcemanager.notificationhubs.models.ResourceListKeys;
import com.azure.resourcemanager.notificationhubs.models.SharedAccessAuthorizationRuleResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NamespacesImpl implements Namespaces {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NamespacesImpl.class);

    private final NamespacesClient innerClient;

    private final com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager;

    public NamespacesImpl(
        NamespacesClient innerClient,
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckAvailabilityResult checkAvailability(CheckAvailabilityParameters parameters) {
        CheckAvailabilityResultInner inner = this.serviceClient().checkAvailability(parameters);
        if (inner != null) {
            return new CheckAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckAvailabilityResult> checkAvailabilityWithResponse(
        CheckAvailabilityParameters parameters, Context context) {
        Response<CheckAvailabilityResultInner> inner =
            this.serviceClient().checkAvailabilityWithResponse(parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String namespaceName) {
        this.serviceClient().delete(resourceGroupName, namespaceName);
    }

    public void delete(String resourceGroupName, String namespaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, namespaceName, context);
    }

    public NamespaceResource getByResourceGroup(String resourceGroupName, String namespaceName) {
        NamespaceResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, namespaceName);
        if (inner != null) {
            return new NamespaceResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NamespaceResource> getByResourceGroupWithResponse(
        String resourceGroupName, String namespaceName, Context context) {
        Response<NamespaceResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NamespaceResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        this.serviceClient().deleteAuthorizationRule(resourceGroupName, namespaceName, authorizationRuleName);
    }

    public Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context) {
        return this
            .serviceClient()
            .deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
    }

    public SharedAccessAuthorizationRuleResource getAuthorizationRule(
        String resourceGroupName, String namespaceName, String authorizationRuleName) {
        SharedAccessAuthorizationRuleResourceInner inner =
            this.serviceClient().getAuthorizationRule(resourceGroupName, namespaceName, authorizationRuleName);
        if (inner != null) {
            return new SharedAccessAuthorizationRuleResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SharedAccessAuthorizationRuleResource> getAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context) {
        Response<SharedAccessAuthorizationRuleResourceInner> inner =
            this
                .serviceClient()
                .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SharedAccessAuthorizationRuleResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<NamespaceResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NamespaceResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NamespaceResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<NamespaceResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NamespaceResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NamespaceResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<NamespaceResource> list() {
        PagedIterable<NamespaceResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NamespaceResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<NamespaceResource> list(Context context) {
        PagedIterable<NamespaceResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NamespaceResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SharedAccessAuthorizationRuleResource> listAuthorizationRules(
        String resourceGroupName, String namespaceName) {
        PagedIterable<SharedAccessAuthorizationRuleResourceInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName);
        return Utils.mapPage(inner, inner1 -> new SharedAccessAuthorizationRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SharedAccessAuthorizationRuleResource> listAuthorizationRules(
        String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<SharedAccessAuthorizationRuleResourceInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, context);
        return Utils.mapPage(inner, inner1 -> new SharedAccessAuthorizationRuleResourceImpl(inner1, this.manager()));
    }

    public ResourceListKeys listKeys(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        ResourceListKeysInner inner =
            this.serviceClient().listKeys(resourceGroupName, namespaceName, authorizationRuleName);
        if (inner != null) {
            return new ResourceListKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourceListKeys> listKeysWithResponse(
        String resourceGroupName, String namespaceName, String authorizationRuleName, Context context) {
        Response<ResourceListKeysInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourceListKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ResourceListKeys regenerateKeys(
        String resourceGroupName, String namespaceName, String authorizationRuleName, PolicykeyResource parameters) {
        ResourceListKeysInner inner =
            this.serviceClient().regenerateKeys(resourceGroupName, namespaceName, authorizationRuleName, parameters);
        if (inner != null) {
            return new ResourceListKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourceListKeys> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String authorizationRuleName,
        PolicykeyResource parameters,
        Context context) {
        Response<ResourceListKeysInner> inner =
            this
                .serviceClient()
                .regenerateKeysWithResponse(
                    resourceGroupName, namespaceName, authorizationRuleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourceListKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NamespaceResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, namespaceName, Context.NONE).getValue();
    }

    public Response<NamespaceResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, namespaceName, context);
    }

    public SharedAccessAuthorizationRuleResource getAuthorizationRuleById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String authorizationRuleName = Utils.getValueFromIdByName(id, "AuthorizationRules");
        if (authorizationRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'AuthorizationRules'.", id)));
        }
        return this
            .getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, Context.NONE)
            .getValue();
    }

    public Response<SharedAccessAuthorizationRuleResource> getAuthorizationRuleByIdWithResponse(
        String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String authorizationRuleName = Utils.getValueFromIdByName(id, "AuthorizationRules");
        if (authorizationRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'AuthorizationRules'.", id)));
        }
        return this.getAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, context);
    }

    public void deleteAuthorizationRuleById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String authorizationRuleName = Utils.getValueFromIdByName(id, "AuthorizationRules");
        if (authorizationRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'AuthorizationRules'.", id)));
        }
        this.deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, Context.NONE);
    }

    public Response<Void> deleteAuthorizationRuleByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String authorizationRuleName = Utils.getValueFromIdByName(id, "AuthorizationRules");
        if (authorizationRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'AuthorizationRules'.", id)));
        }
        return this
            .deleteAuthorizationRuleWithResponse(resourceGroupName, namespaceName, authorizationRuleName, context);
    }

    private NamespacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager() {
        return this.serviceManager;
    }

    public NamespaceResourceImpl define(String name) {
        return new NamespaceResourceImpl(name, this.manager());
    }

    public SharedAccessAuthorizationRuleResourceImpl defineAuthorizationRule(String name) {
        return new SharedAccessAuthorizationRuleResourceImpl(name, this.manager());
    }
}
