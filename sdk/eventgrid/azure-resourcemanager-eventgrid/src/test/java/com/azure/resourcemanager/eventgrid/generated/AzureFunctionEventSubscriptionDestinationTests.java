// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.AzureFunctionEventSubscriptionDestination;
import com.azure.resourcemanager.eventgrid.models.DeliveryAttributeMapping;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureFunctionEventSubscriptionDestinationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFunctionEventSubscriptionDestination model = BinaryData.fromString(
            "{\"endpointType\":\"AzureFunction\",\"properties\":{\"resourceId\":\"yao\",\"maxEventsPerBatch\":1884688953,\"preferredBatchSizeInKilobytes\":292024569,\"deliveryAttributeMappings\":[{\"type\":\"DeliveryAttributeMapping\",\"name\":\"hdkcprgu\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"rztiochlutixmqr\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"jizcbfzmcrunfhiu\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"mfbcpaqktkrum\"}]}}")
            .toObject(AzureFunctionEventSubscriptionDestination.class);
        Assertions.assertEquals("yao", model.resourceId());
        Assertions.assertEquals(1884688953, model.maxEventsPerBatch());
        Assertions.assertEquals(292024569, model.preferredBatchSizeInKilobytes());
        Assertions.assertEquals("hdkcprgu", model.deliveryAttributeMappings().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFunctionEventSubscriptionDestination model
            = new AzureFunctionEventSubscriptionDestination().withResourceId("yao")
                .withMaxEventsPerBatch(1884688953)
                .withPreferredBatchSizeInKilobytes(292024569)
                .withDeliveryAttributeMappings(Arrays.asList(new DeliveryAttributeMapping().withName("hdkcprgu"),
                    new DeliveryAttributeMapping().withName("rztiochlutixmqr"),
                    new DeliveryAttributeMapping().withName("jizcbfzmcrunfhiu"),
                    new DeliveryAttributeMapping().withName("mfbcpaqktkrum")));
        model = BinaryData.fromObject(model).toObject(AzureFunctionEventSubscriptionDestination.class);
        Assertions.assertEquals("yao", model.resourceId());
        Assertions.assertEquals(1884688953, model.maxEventsPerBatch());
        Assertions.assertEquals(292024569, model.preferredBatchSizeInKilobytes());
        Assertions.assertEquals("hdkcprgu", model.deliveryAttributeMappings().get(0).name());
    }
}
