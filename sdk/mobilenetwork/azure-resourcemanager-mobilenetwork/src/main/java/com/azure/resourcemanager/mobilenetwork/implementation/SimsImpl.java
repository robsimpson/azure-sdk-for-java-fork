// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.SimsClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AsyncOperationStatusInner;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimInner;
import com.azure.resourcemanager.mobilenetwork.models.AsyncOperationStatus;
import com.azure.resourcemanager.mobilenetwork.models.EncryptedSimUploadList;
import com.azure.resourcemanager.mobilenetwork.models.Sim;
import com.azure.resourcemanager.mobilenetwork.models.SimDeleteList;
import com.azure.resourcemanager.mobilenetwork.models.SimUploadList;
import com.azure.resourcemanager.mobilenetwork.models.Sims;

public final class SimsImpl implements Sims {
    private static final ClientLogger LOGGER = new ClientLogger(SimsImpl.class);

    private final SimsClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public SimsImpl(
        SimsClient innerClient, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String simGroupName, String simName) {
        this.serviceClient().delete(resourceGroupName, simGroupName, simName);
    }

    public void delete(String resourceGroupName, String simGroupName, String simName, Context context) {
        this.serviceClient().delete(resourceGroupName, simGroupName, simName, context);
    }

    public Response<Sim> getWithResponse(
        String resourceGroupName, String simGroupName, String simName, Context context) {
        Response<SimInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, simGroupName, simName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SimImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Sim get(String resourceGroupName, String simGroupName, String simName) {
        SimInner inner = this.serviceClient().get(resourceGroupName, simGroupName, simName);
        if (inner != null) {
            return new SimImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Sim> listByGroup(String resourceGroupName, String simGroupName) {
        PagedIterable<SimInner> inner = this.serviceClient().listByGroup(resourceGroupName, simGroupName);
        return Utils.mapPage(inner, inner1 -> new SimImpl(inner1, this.manager()));
    }

    public PagedIterable<Sim> listByGroup(String resourceGroupName, String simGroupName, Context context) {
        PagedIterable<SimInner> inner = this.serviceClient().listByGroup(resourceGroupName, simGroupName, context);
        return Utils.mapPage(inner, inner1 -> new SimImpl(inner1, this.manager()));
    }

    public AsyncOperationStatus bulkUpload(String resourceGroupName, String simGroupName, SimUploadList parameters) {
        AsyncOperationStatusInner inner = this.serviceClient().bulkUpload(resourceGroupName, simGroupName, parameters);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus bulkUpload(
        String resourceGroupName, String simGroupName, SimUploadList parameters, Context context) {
        AsyncOperationStatusInner inner =
            this.serviceClient().bulkUpload(resourceGroupName, simGroupName, parameters, context);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus bulkDelete(String resourceGroupName, String simGroupName, SimDeleteList parameters) {
        AsyncOperationStatusInner inner = this.serviceClient().bulkDelete(resourceGroupName, simGroupName, parameters);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus bulkDelete(
        String resourceGroupName, String simGroupName, SimDeleteList parameters, Context context) {
        AsyncOperationStatusInner inner =
            this.serviceClient().bulkDelete(resourceGroupName, simGroupName, parameters, context);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus bulkUploadEncrypted(
        String resourceGroupName, String simGroupName, EncryptedSimUploadList parameters) {
        AsyncOperationStatusInner inner =
            this.serviceClient().bulkUploadEncrypted(resourceGroupName, simGroupName, parameters);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus bulkUploadEncrypted(
        String resourceGroupName, String simGroupName, EncryptedSimUploadList parameters, Context context) {
        AsyncOperationStatusInner inner =
            this.serviceClient().bulkUploadEncrypted(resourceGroupName, simGroupName, parameters, context);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Sim getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String simGroupName = Utils.getValueFromIdByName(id, "simGroups");
        if (simGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'simGroups'.", id)));
        }
        String simName = Utils.getValueFromIdByName(id, "sims");
        if (simName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sims'.", id)));
        }
        return this.getWithResponse(resourceGroupName, simGroupName, simName, Context.NONE).getValue();
    }

    public Response<Sim> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String simGroupName = Utils.getValueFromIdByName(id, "simGroups");
        if (simGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'simGroups'.", id)));
        }
        String simName = Utils.getValueFromIdByName(id, "sims");
        if (simName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sims'.", id)));
        }
        return this.getWithResponse(resourceGroupName, simGroupName, simName, context);
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
        String simGroupName = Utils.getValueFromIdByName(id, "simGroups");
        if (simGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'simGroups'.", id)));
        }
        String simName = Utils.getValueFromIdByName(id, "sims");
        if (simName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sims'.", id)));
        }
        this.delete(resourceGroupName, simGroupName, simName, Context.NONE);
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
        String simGroupName = Utils.getValueFromIdByName(id, "simGroups");
        if (simGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'simGroups'.", id)));
        }
        String simName = Utils.getValueFromIdByName(id, "sims");
        if (simName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sims'.", id)));
        }
        this.delete(resourceGroupName, simGroupName, simName, context);
    }

    private SimsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public SimImpl define(String name) {
        return new SimImpl(name, this.manager());
    }
}
