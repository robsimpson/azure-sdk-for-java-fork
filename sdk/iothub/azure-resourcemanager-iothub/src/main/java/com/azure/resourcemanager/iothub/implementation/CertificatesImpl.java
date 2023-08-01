// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.fluent.CertificatesClient;
import com.azure.resourcemanager.iothub.fluent.models.CertificateDescriptionInner;
import com.azure.resourcemanager.iothub.fluent.models.CertificateListDescriptionInner;
import com.azure.resourcemanager.iothub.fluent.models.CertificateWithNonceDescriptionInner;
import com.azure.resourcemanager.iothub.models.CertificateDescription;
import com.azure.resourcemanager.iothub.models.CertificateListDescription;
import com.azure.resourcemanager.iothub.models.CertificateVerificationDescription;
import com.azure.resourcemanager.iothub.models.CertificateWithNonceDescription;
import com.azure.resourcemanager.iothub.models.Certificates;

public final class CertificatesImpl implements Certificates {
    private static final ClientLogger LOGGER = new ClientLogger(CertificatesImpl.class);

    private final CertificatesClient innerClient;

    private final com.azure.resourcemanager.iothub.IotHubManager serviceManager;

    public CertificatesImpl(
        CertificatesClient innerClient, com.azure.resourcemanager.iothub.IotHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CertificateListDescription> listByIotHubWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<CertificateListDescriptionInner> inner =
            this.serviceClient().listByIotHubWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateListDescriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CertificateListDescription listByIotHub(String resourceGroupName, String resourceName) {
        CertificateListDescriptionInner inner = this.serviceClient().listByIotHub(resourceGroupName, resourceName);
        if (inner != null) {
            return new CertificateListDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CertificateDescription> getWithResponse(
        String resourceGroupName, String resourceName, String certificateName, Context context) {
        Response<CertificateDescriptionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, certificateName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateDescriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CertificateDescription get(String resourceGroupName, String resourceName, String certificateName) {
        CertificateDescriptionInner inner = this.serviceClient().get(resourceGroupName, resourceName, certificateName);
        if (inner != null) {
            return new CertificateDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String certificateName, String ifMatch, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, resourceName, certificateName, ifMatch, context);
    }

    public void delete(String resourceGroupName, String resourceName, String certificateName, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, resourceName, certificateName, ifMatch);
    }

    public Response<CertificateWithNonceDescription> generateVerificationCodeWithResponse(
        String resourceGroupName, String resourceName, String certificateName, String ifMatch, Context context) {
        Response<CertificateWithNonceDescriptionInner> inner =
            this
                .serviceClient()
                .generateVerificationCodeWithResponse(
                    resourceGroupName, resourceName, certificateName, ifMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateWithNonceDescriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CertificateWithNonceDescription generateVerificationCode(
        String resourceGroupName, String resourceName, String certificateName, String ifMatch) {
        CertificateWithNonceDescriptionInner inner =
            this.serviceClient().generateVerificationCode(resourceGroupName, resourceName, certificateName, ifMatch);
        if (inner != null) {
            return new CertificateWithNonceDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CertificateDescription> verifyWithResponse(
        String resourceGroupName,
        String resourceName,
        String certificateName,
        String ifMatch,
        CertificateVerificationDescription certificateVerificationBody,
        Context context) {
        Response<CertificateDescriptionInner> inner =
            this
                .serviceClient()
                .verifyWithResponse(
                    resourceGroupName, resourceName, certificateName, ifMatch, certificateVerificationBody, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateDescriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CertificateDescription verify(
        String resourceGroupName,
        String resourceName,
        String certificateName,
        String ifMatch,
        CertificateVerificationDescription certificateVerificationBody) {
        CertificateDescriptionInner inner =
            this
                .serviceClient()
                .verify(resourceGroupName, resourceName, certificateName, ifMatch, certificateVerificationBody);
        if (inner != null) {
            return new CertificateDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CertificateDescription getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "certificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, certificateName, Context.NONE).getValue();
    }

    public Response<CertificateDescription> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "certificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, certificateName, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "certificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, resourceName, certificateName, localIfMatch, Context.NONE);
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
        String resourceName = Utils.getValueFromIdByName(id, "IotHubs");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IotHubs'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "certificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, resourceName, certificateName, ifMatch, context);
    }

    private CertificatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.iothub.IotHubManager manager() {
        return this.serviceManager;
    }

    public CertificateDescriptionImpl define(String name) {
        return new CertificateDescriptionImpl(name, this.manager());
    }
}
