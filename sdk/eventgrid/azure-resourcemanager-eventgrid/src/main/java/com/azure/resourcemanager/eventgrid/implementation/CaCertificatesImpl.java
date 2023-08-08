// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.CaCertificatesClient;
import com.azure.resourcemanager.eventgrid.fluent.models.CaCertificateInner;
import com.azure.resourcemanager.eventgrid.models.CaCertificate;
import com.azure.resourcemanager.eventgrid.models.CaCertificates;

public final class CaCertificatesImpl implements CaCertificates {
    private static final ClientLogger LOGGER = new ClientLogger(CaCertificatesImpl.class);

    private final CaCertificatesClient innerClient;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public CaCertificatesImpl(
        CaCertificatesClient innerClient, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CaCertificate> getWithResponse(
        String resourceGroupName, String namespaceName, String caCertificateName, Context context) {
        Response<CaCertificateInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, namespaceName, caCertificateName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CaCertificateImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CaCertificate get(String resourceGroupName, String namespaceName, String caCertificateName) {
        CaCertificateInner inner = this.serviceClient().get(resourceGroupName, namespaceName, caCertificateName);
        if (inner != null) {
            return new CaCertificateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String namespaceName, String caCertificateName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, caCertificateName);
    }

    public void delete(String resourceGroupName, String namespaceName, String caCertificateName, Context context) {
        this.serviceClient().delete(resourceGroupName, namespaceName, caCertificateName, context);
    }

    public PagedIterable<CaCertificate> listByNamespace(String resourceGroupName, String namespaceName) {
        PagedIterable<CaCertificateInner> inner =
            this.serviceClient().listByNamespace(resourceGroupName, namespaceName);
        return Utils.mapPage(inner, inner1 -> new CaCertificateImpl(inner1, this.manager()));
    }

    public PagedIterable<CaCertificate> listByNamespace(
        String resourceGroupName, String namespaceName, String filter, Integer top, Context context) {
        PagedIterable<CaCertificateInner> inner =
            this.serviceClient().listByNamespace(resourceGroupName, namespaceName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new CaCertificateImpl(inner1, this.manager()));
    }

    public CaCertificate getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String caCertificateName = Utils.getValueFromIdByName(id, "caCertificates");
        if (caCertificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'caCertificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, caCertificateName, Context.NONE).getValue();
    }

    public Response<CaCertificate> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String caCertificateName = Utils.getValueFromIdByName(id, "caCertificates");
        if (caCertificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'caCertificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, caCertificateName, context);
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
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String caCertificateName = Utils.getValueFromIdByName(id, "caCertificates");
        if (caCertificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'caCertificates'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, caCertificateName, Context.NONE);
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
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String caCertificateName = Utils.getValueFromIdByName(id, "caCertificates");
        if (caCertificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'caCertificates'.", id)));
        }
        this.delete(resourceGroupName, namespaceName, caCertificateName, context);
    }

    private CaCertificatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    public CaCertificateImpl define(String name) {
        return new CaCertificateImpl(name, this.manager());
    }
}
