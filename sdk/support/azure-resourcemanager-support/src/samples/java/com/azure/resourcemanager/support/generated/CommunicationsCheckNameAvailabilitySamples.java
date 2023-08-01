// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.resourcemanager.support.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.support.models.Type;

/** Samples for Communications CheckNameAvailability. */
public final class CommunicationsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/CheckNameAvailabilityForSupportTicketCommunication.json
     */
    /**
     * Sample code: Checks whether name is available for Communication resource.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void checksWhetherNameIsAvailableForCommunicationResource(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .communications()
            .checkNameAvailabilityWithResponse(
                "testticket",
                new CheckNameAvailabilityInput().withName("sampleName").withType(Type.MICROSOFT_SUPPORT_COMMUNICATIONS),
                com.azure.core.util.Context.NONE);
    }
}
