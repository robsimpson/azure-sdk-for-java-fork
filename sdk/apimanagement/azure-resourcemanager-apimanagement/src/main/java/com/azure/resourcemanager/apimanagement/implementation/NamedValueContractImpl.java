// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.NamedValueContractInner;
import com.azure.resourcemanager.apimanagement.models.KeyVaultContractCreateProperties;
import com.azure.resourcemanager.apimanagement.models.KeyVaultContractProperties;
import com.azure.resourcemanager.apimanagement.models.NamedValueContract;
import com.azure.resourcemanager.apimanagement.models.NamedValueCreateContract;
import com.azure.resourcemanager.apimanagement.models.NamedValueSecretContract;
import com.azure.resourcemanager.apimanagement.models.NamedValueUpdateParameters;
import java.util.Collections;
import java.util.List;

public final class NamedValueContractImpl
    implements NamedValueContract, NamedValueContract.Definition, NamedValueContract.Update {
    private NamedValueContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String value() {
        return this.innerModel().value();
    }

    public KeyVaultContractProperties keyVault() {
        return this.innerModel().keyVault();
    }

    public List<String> tags() {
        List<String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean secret() {
        return this.innerModel().secret();
    }

    public NamedValueContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String namedValueId;

    private String createIfMatch;

    private NamedValueCreateContract createParameters;

    private String updateIfMatch;

    private NamedValueUpdateParameters updateParameters;

    public NamedValueContractImpl withExistingService(String resourceGroupName, String serviceName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        return this;
    }

    public NamedValueContract create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamedValues()
                .createOrUpdate(
                    resourceGroupName, serviceName, namedValueId, createParameters, createIfMatch, Context.NONE);
        return this;
    }

    public NamedValueContract create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamedValues()
                .createOrUpdate(resourceGroupName, serviceName, namedValueId, createParameters, createIfMatch, context);
        return this;
    }

    NamedValueContractImpl(String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new NamedValueContractInner();
        this.serviceManager = serviceManager;
        this.namedValueId = name;
        this.createIfMatch = null;
        this.createParameters = new NamedValueCreateContract();
    }

    public NamedValueContractImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new NamedValueUpdateParameters();
        return this;
    }

    public NamedValueContract apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamedValues()
                .update(resourceGroupName, serviceName, namedValueId, updateIfMatch, updateParameters, Context.NONE);
        return this;
    }

    public NamedValueContract apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamedValues()
                .update(resourceGroupName, serviceName, namedValueId, updateIfMatch, updateParameters, context);
        return this;
    }

    NamedValueContractImpl(
        NamedValueContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "service");
        this.namedValueId = Utils.getValueFromIdByName(innerObject.id(), "namedValues");
    }

    public NamedValueContract refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamedValues()
                .getWithResponse(resourceGroupName, serviceName, namedValueId, Context.NONE)
                .getValue();
        return this;
    }

    public NamedValueContract refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNamedValues()
                .getWithResponse(resourceGroupName, serviceName, namedValueId, context)
                .getValue();
        return this;
    }

    public NamedValueSecretContract listValue() {
        return serviceManager.namedValues().listValue(resourceGroupName, serviceName, namedValueId);
    }

    public Response<NamedValueSecretContract> listValueWithResponse(Context context) {
        return serviceManager
            .namedValues()
            .listValueWithResponse(resourceGroupName, serviceName, namedValueId, context);
    }

    public NamedValueContract refreshSecret() {
        return serviceManager.namedValues().refreshSecret(resourceGroupName, serviceName, namedValueId);
    }

    public NamedValueContract refreshSecret(Context context) {
        return serviceManager.namedValues().refreshSecret(resourceGroupName, serviceName, namedValueId, context);
    }

    public NamedValueContractImpl withTags(List<String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NamedValueContractImpl withDisplayName(String displayName) {
        if (isInCreateMode()) {
            this.createParameters.withDisplayName(displayName);
            return this;
        } else {
            this.updateParameters.withDisplayName(displayName);
            return this;
        }
    }

    public NamedValueContractImpl withValue(String value) {
        if (isInCreateMode()) {
            this.createParameters.withValue(value);
            return this;
        } else {
            this.updateParameters.withValue(value);
            return this;
        }
    }

    public NamedValueContractImpl withKeyVault(KeyVaultContractCreateProperties keyVault) {
        if (isInCreateMode()) {
            this.createParameters.withKeyVault(keyVault);
            return this;
        } else {
            this.updateParameters.withKeyVault(keyVault);
            return this;
        }
    }

    public NamedValueContractImpl withSecret(Boolean secret) {
        if (isInCreateMode()) {
            this.createParameters.withSecret(secret);
            return this;
        } else {
            this.updateParameters.withSecret(secret);
            return this;
        }
    }

    public NamedValueContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
