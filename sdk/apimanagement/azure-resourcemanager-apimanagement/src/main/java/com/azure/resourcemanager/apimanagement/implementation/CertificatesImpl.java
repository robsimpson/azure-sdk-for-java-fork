// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.CertificatesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.CertificateContractInner;
import com.azure.resourcemanager.apimanagement.models.CertificateContract;
import com.azure.resourcemanager.apimanagement.models.Certificates;
import com.azure.resourcemanager.apimanagement.models.CertificatesGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.CertificatesGetResponse;
import com.azure.resourcemanager.apimanagement.models.CertificatesRefreshSecretResponse;

public final class CertificatesImpl implements Certificates {
    private static final ClientLogger LOGGER = new ClientLogger(CertificatesImpl.class);

    private final CertificatesClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public CertificatesImpl(
        CertificatesClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CertificateContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<CertificateContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new CertificateContractImpl(inner1, this.manager()));
    }

    public PagedIterable<CertificateContract> listByService(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        Boolean isKeyVaultRefreshFailed,
        Context context) {
        PagedIterable<CertificateContractInner> inner =
            this
                .serviceClient()
                .listByService(resourceGroupName, serviceName, filter, top, skip, isKeyVaultRefreshFailed, context);
        return Utils.mapPage(inner, inner1 -> new CertificateContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String certificateId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, certificateId);
    }

    public CertificatesGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String certificateId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, certificateId, context);
    }

    public CertificateContract get(String resourceGroupName, String serviceName, String certificateId) {
        CertificateContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, certificateId);
        if (inner != null) {
            return new CertificateContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CertificateContract> getWithResponse(
        String resourceGroupName, String serviceName, String certificateId, Context context) {
        CertificatesGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, certificateId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String certificateId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, certificateId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String certificateId, String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, certificateId, ifMatch, context);
    }

    public CertificateContract refreshSecret(String resourceGroupName, String serviceName, String certificateId) {
        CertificateContractInner inner =
            this.serviceClient().refreshSecret(resourceGroupName, serviceName, certificateId);
        if (inner != null) {
            return new CertificateContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CertificateContract> refreshSecretWithResponse(
        String resourceGroupName, String serviceName, String certificateId, Context context) {
        CertificatesRefreshSecretResponse inner =
            this.serviceClient().refreshSecretWithResponse(resourceGroupName, serviceName, certificateId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CertificateContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String certificateId = Utils.getValueFromIdByName(id, "certificates");
        if (certificateId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, certificateId, Context.NONE).getValue();
    }

    public Response<CertificateContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String certificateId = Utils.getValueFromIdByName(id, "certificates");
        if (certificateId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, certificateId, context);
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
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String certificateId = Utils.getValueFromIdByName(id, "certificates");
        if (certificateId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, serviceName, certificateId, localIfMatch, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String certificateId = Utils.getValueFromIdByName(id, "certificates");
        if (certificateId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, certificateId, ifMatch, context);
    }

    private CertificatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public CertificateContractImpl define(String name) {
        return new CertificateContractImpl(name, this.manager());
    }
}
