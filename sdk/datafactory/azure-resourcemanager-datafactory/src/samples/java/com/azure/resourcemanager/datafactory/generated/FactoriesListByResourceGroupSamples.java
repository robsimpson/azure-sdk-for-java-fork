// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/** Samples for Factories ListByResourceGroup. */
public final class FactoriesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/Factories_ListByResourceGroup.json
     */
    /**
     * Sample code: Factories_ListByResourceGroup.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void factoriesListByResourceGroup(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.factories().listByResourceGroup("exampleResourceGroup", com.azure.core.util.Context.NONE);
    }
}
