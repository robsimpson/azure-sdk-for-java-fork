// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datalakestore.fluent.models.TrustedIdProviderInner;
import com.azure.resourcemanager.datalakestore.models.CreateOrUpdateTrustedIdProviderParameters;
import com.azure.resourcemanager.datalakestore.models.TrustedIdProvider;
import com.azure.resourcemanager.datalakestore.models.UpdateTrustedIdProviderParameters;

public final class TrustedIdProviderImpl
    implements TrustedIdProvider, TrustedIdProvider.Definition, TrustedIdProvider.Update {
    private TrustedIdProviderInner innerObject;

    private final com.azure.resourcemanager.datalakestore.DataLakeStoreManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String idProvider() {
        return this.innerModel().idProvider();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public TrustedIdProviderInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datalakestore.DataLakeStoreManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String trustedIdProviderName;

    private CreateOrUpdateTrustedIdProviderParameters createParameters;

    private UpdateTrustedIdProviderParameters updateParameters;

    public TrustedIdProviderImpl withExistingAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public TrustedIdProvider create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTrustedIdProviders()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, trustedIdProviderName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public TrustedIdProvider create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTrustedIdProviders()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, trustedIdProviderName, createParameters, context)
                .getValue();
        return this;
    }

    TrustedIdProviderImpl(String name, com.azure.resourcemanager.datalakestore.DataLakeStoreManager serviceManager) {
        this.innerObject = new TrustedIdProviderInner();
        this.serviceManager = serviceManager;
        this.trustedIdProviderName = name;
        this.createParameters = new CreateOrUpdateTrustedIdProviderParameters();
    }

    public TrustedIdProviderImpl update() {
        this.updateParameters = new UpdateTrustedIdProviderParameters();
        return this;
    }

    public TrustedIdProvider apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTrustedIdProviders()
                .updateWithResponse(
                    resourceGroupName, accountName, trustedIdProviderName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public TrustedIdProvider apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTrustedIdProviders()
                .updateWithResponse(resourceGroupName, accountName, trustedIdProviderName, updateParameters, context)
                .getValue();
        return this;
    }

    TrustedIdProviderImpl(
        TrustedIdProviderInner innerObject,
        com.azure.resourcemanager.datalakestore.DataLakeStoreManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "accounts");
        this.trustedIdProviderName = Utils.getValueFromIdByName(innerObject.id(), "trustedIdProviders");
    }

    public TrustedIdProvider refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTrustedIdProviders()
                .getWithResponse(resourceGroupName, accountName, trustedIdProviderName, Context.NONE)
                .getValue();
        return this;
    }

    public TrustedIdProvider refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTrustedIdProviders()
                .getWithResponse(resourceGroupName, accountName, trustedIdProviderName, context)
                .getValue();
        return this;
    }

    public TrustedIdProviderImpl withIdProvider(String idProvider) {
        if (isInCreateMode()) {
            this.createParameters.withIdProvider(idProvider);
            return this;
        } else {
            this.updateParameters.withIdProvider(idProvider);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
