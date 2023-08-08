// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/** Samples for PartnerRegistrations Delete. */
public final class PartnerRegistrationsDeleteSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-06-01-preview/examples/PartnerRegistrations_Delete.json
     */
    /**
     * Sample code: PartnerRegistrations_Delete.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerRegistrationsDelete(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .partnerRegistrations()
            .delete("examplerg", "examplePartnerRegistrationName1", com.azure.core.util.Context.NONE);
    }
}
