// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.changeanalysis.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.changeanalysis.fluent.OperationsClient;
import com.azure.resourcemanager.changeanalysis.fluent.models.ResourceProviderOperationDefinitionInner;
import com.azure.resourcemanager.changeanalysis.models.Operations;
import com.azure.resourcemanager.changeanalysis.models.ResourceProviderOperationDefinition;

public final class OperationsImpl implements Operations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.changeanalysis.AzureChangeAnalysisManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient,
        com.azure.resourcemanager.changeanalysis.AzureChangeAnalysisManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceProviderOperationDefinition> list() {
        PagedIterable<ResourceProviderOperationDefinitionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ResourceProviderOperationDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceProviderOperationDefinition> list(String skipToken, Context context) {
        PagedIterable<ResourceProviderOperationDefinitionInner> inner = this.serviceClient().list(skipToken, context);
        return Utils.mapPage(inner, inner1 -> new ResourceProviderOperationDefinitionImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.changeanalysis.AzureChangeAnalysisManager manager() {
        return this.serviceManager;
    }
}
