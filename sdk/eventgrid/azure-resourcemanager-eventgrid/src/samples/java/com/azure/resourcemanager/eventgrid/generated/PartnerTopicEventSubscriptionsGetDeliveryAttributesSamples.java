// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/** Samples for PartnerTopicEventSubscriptions GetDeliveryAttributes. */
public final class PartnerTopicEventSubscriptionsGetDeliveryAttributesSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-06-01-preview/examples/PartnerTopicEventSubscriptions_GetDeliveryAttributes.json
     */
    /**
     * Sample code: PartnerTopicEventSubscriptions_GetDeliveryAttributes.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerTopicEventSubscriptionsGetDeliveryAttributes(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .partnerTopicEventSubscriptions()
            .getDeliveryAttributesWithResponse(
                "examplerg", "examplePartnerTopic1", "examplesubscription1", com.azure.core.util.Context.NONE);
    }
}
