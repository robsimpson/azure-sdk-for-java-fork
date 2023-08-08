// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.fluent.RegisteredIdentitiesClient;
import com.azure.resourcemanager.recoveryservices.models.RegisteredIdentities;

public final class RegisteredIdentitiesImpl implements RegisteredIdentities {
    private static final ClientLogger LOGGER = new ClientLogger(RegisteredIdentitiesImpl.class);

    private final RegisteredIdentitiesClient innerClient;

    private final com.azure.resourcemanager.recoveryservices.RecoveryServicesManager serviceManager;

    public RegisteredIdentitiesImpl(
        RegisteredIdentitiesClient innerClient,
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String vaultName, String identityName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, vaultName, identityName, context);
    }

    public void delete(String resourceGroupName, String vaultName, String identityName) {
        this.serviceClient().delete(resourceGroupName, vaultName, identityName);
    }

    private RegisteredIdentitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager() {
        return this.serviceManager;
    }
}
