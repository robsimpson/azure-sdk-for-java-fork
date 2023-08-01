// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/** Samples for PartnerDestinations Activate. */
public final class PartnerDestinationsActivateSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-06-01-preview/examples/PartnerDestinations_Activate.json
     */
    /**
     * Sample code: PartnerDestinations_Activate.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerDestinationsActivate(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .partnerDestinations()
            .activateWithResponse("examplerg", "examplePartnerDestination1", com.azure.core.util.Context.NONE);
    }
}
