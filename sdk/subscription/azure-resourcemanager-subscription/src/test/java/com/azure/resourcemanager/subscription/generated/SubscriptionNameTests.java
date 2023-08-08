// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.subscription.models.SubscriptionName;
import org.junit.jupiter.api.Assertions;

public final class SubscriptionNameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubscriptionName model =
            BinaryData.fromString("{\"subscriptionName\":\"hsgcbacphejkot\"}").toObject(SubscriptionName.class);
        Assertions.assertEquals("hsgcbacphejkot", model.subscriptionName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubscriptionName model = new SubscriptionName().withSubscriptionName("hsgcbacphejkot");
        model = BinaryData.fromObject(model).toObject(SubscriptionName.class);
        Assertions.assertEquals("hsgcbacphejkot", model.subscriptionName());
    }
}
