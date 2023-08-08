// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/** Samples for NamespaceTopicEventSubscriptions Get. */
public final class NamespaceTopicEventSubscriptionsGetSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-06-01-preview/examples/NamespaceTopicEventSubscriptions_Get.json
     */
    /**
     * Sample code: NamespaceTopicEventSubscriptions_Get.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void namespaceTopicEventSubscriptionsGet(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .namespaceTopicEventSubscriptions()
            .getWithResponse(
                "examplerg",
                "examplenamespace2",
                "examplenamespacetopic2",
                "examplenamespacetopicEventSub1",
                com.azure.core.util.Context.NONE);
    }
}
