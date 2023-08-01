// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.OperationResultsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.OperationJobExtendedInfoInner;
import com.azure.resourcemanager.dataprotection.models.OperationJobExtendedInfo;
import com.azure.resourcemanager.dataprotection.models.OperationResults;
import com.azure.resourcemanager.dataprotection.models.OperationResultsGetResponse;

public final class OperationResultsImpl implements OperationResults {
    private static final ClientLogger LOGGER = new ClientLogger(OperationResultsImpl.class);

    private final OperationResultsClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public OperationResultsImpl(
        OperationResultsClient innerClient,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperationJobExtendedInfo> getWithResponse(String operationId, String location, Context context) {
        OperationResultsGetResponse inner = this.serviceClient().getWithResponse(operationId, location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationJobExtendedInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperationJobExtendedInfo get(String operationId, String location) {
        OperationJobExtendedInfoInner inner = this.serviceClient().get(operationId, location);
        if (inner != null) {
            return new OperationJobExtendedInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
