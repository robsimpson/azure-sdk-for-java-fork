// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.resourcemanager.devcenter.models.CheckNameAvailabilityRequest;

/** Samples for CheckNameAvailability Execute. */
public final class CheckNameAvailabilityExecuteSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2023-04-01/examples/CheckNameAvailability.json
     */
    /**
     * Sample code: NameAvailability.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void nameAvailability(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager
            .checkNameAvailabilities()
            .executeWithResponse(
                new CheckNameAvailabilityRequest().withName("name1").withType("Microsoft.DevCenter/devcenters"),
                com.azure.core.util.Context.NONE);
    }
}
