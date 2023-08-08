// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/** Samples for EnvironmentTypes ListByDevCenter. */
public final class EnvironmentTypesListByDevCenterSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2023-04-01/examples/EnvironmentTypes_List.json
     */
    /**
     * Sample code: EnvironmentTypes_ListByDevCenter.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void environmentTypesListByDevCenter(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.environmentTypes().listByDevCenter("rg1", "Contoso", null, com.azure.core.util.Context.NONE);
    }
}
