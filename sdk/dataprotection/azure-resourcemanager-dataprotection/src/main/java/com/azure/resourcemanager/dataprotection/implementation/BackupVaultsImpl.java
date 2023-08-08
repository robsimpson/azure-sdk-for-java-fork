// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.BackupVaultsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.BackupVaultResourceInner;
import com.azure.resourcemanager.dataprotection.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.dataprotection.models.BackupVaultResource;
import com.azure.resourcemanager.dataprotection.models.BackupVaults;
import com.azure.resourcemanager.dataprotection.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.dataprotection.models.CheckNameAvailabilityResult;

public final class BackupVaultsImpl implements BackupVaults {
    private static final ClientLogger LOGGER = new ClientLogger(BackupVaultsImpl.class);

    private final BackupVaultsClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public BackupVaultsImpl(
        BackupVaultsClient innerClient, com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BackupVaultResource> list() {
        PagedIterable<BackupVaultResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new BackupVaultResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<BackupVaultResource> list(Context context) {
        PagedIterable<BackupVaultResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new BackupVaultResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<BackupVaultResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<BackupVaultResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new BackupVaultResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<BackupVaultResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<BackupVaultResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new BackupVaultResourceImpl(inner1, this.manager()));
    }

    public Response<BackupVaultResource> getByResourceGroupWithResponse(
        String resourceGroupName, String vaultName, Context context) {
        Response<BackupVaultResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, vaultName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupVaultResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BackupVaultResource getByResourceGroup(String resourceGroupName, String vaultName) {
        BackupVaultResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, vaultName);
        if (inner != null) {
            return new BackupVaultResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String vaultName) {
        this.serviceClient().delete(resourceGroupName, vaultName);
    }

    public void delete(String resourceGroupName, String vaultName, Context context) {
        this.serviceClient().delete(resourceGroupName, vaultName, context);
    }

    public Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        String resourceGroupName, String location, CheckNameAvailabilityRequest parameters, Context context) {
        Response<CheckNameAvailabilityResultInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(resourceGroupName, location, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityResult checkNameAvailability(
        String resourceGroupName, String location, CheckNameAvailabilityRequest parameters) {
        CheckNameAvailabilityResultInner inner =
            this.serviceClient().checkNameAvailability(resourceGroupName, location, parameters);
        if (inner != null) {
            return new CheckNameAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BackupVaultResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = Utils.getValueFromIdByName(id, "backupVaults");
        if (vaultName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backupVaults'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vaultName, Context.NONE).getValue();
    }

    public Response<BackupVaultResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultName = Utils.getValueFromIdByName(id, "backupVaults");
        if (vaultName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backupVaults'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, vaultName, context);
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
        String vaultName = Utils.getValueFromIdByName(id, "backupVaults");
        if (vaultName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backupVaults'.", id)));
        }
        this.delete(resourceGroupName, vaultName, Context.NONE);
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
        String vaultName = Utils.getValueFromIdByName(id, "backupVaults");
        if (vaultName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backupVaults'.", id)));
        }
        this.delete(resourceGroupName, vaultName, context);
    }

    private BackupVaultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }

    public BackupVaultResourceImpl define(String name) {
        return new BackupVaultResourceImpl(name, this.manager());
    }
}
