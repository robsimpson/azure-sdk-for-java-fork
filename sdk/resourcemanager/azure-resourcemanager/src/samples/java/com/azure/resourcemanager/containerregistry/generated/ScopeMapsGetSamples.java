// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/** Samples for ScopeMaps Get. */
public final class ScopeMapsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ScopeMapGet.json
     */
    /**
     * Sample code: ScopeMapGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void scopeMapGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getScopeMaps()
            .getWithResponse("myResourceGroup", "myRegistry", "myScopeMap", com.azure.core.util.Context.NONE);
    }
}
