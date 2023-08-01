// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.models.ScopeProperties;
import com.azure.resourcemanager.reservations.models.SubscriptionScopeProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SubscriptionScopePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubscriptionScopeProperties model =
            BinaryData
                .fromString(
                    "{\"scopes\":[{\"scope\":\"qsoqijgkd\",\"valid\":true},{\"scope\":\"zlobcufpd\",\"valid\":false},{\"scope\":\"t\",\"valid\":true}]}")
                .toObject(SubscriptionScopeProperties.class);
        Assertions.assertEquals("qsoqijgkd", model.scopes().get(0).scope());
        Assertions.assertEquals(true, model.scopes().get(0).valid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubscriptionScopeProperties model =
            new SubscriptionScopeProperties()
                .withScopes(
                    Arrays
                        .asList(
                            new ScopeProperties().withScope("qsoqijgkd").withValid(true),
                            new ScopeProperties().withScope("zlobcufpd").withValid(false),
                            new ScopeProperties().withScope("t").withValid(true)));
        model = BinaryData.fromObject(model).toObject(SubscriptionScopeProperties.class);
        Assertions.assertEquals("qsoqijgkd", model.scopes().get(0).scope());
        Assertions.assertEquals(true, model.scopes().get(0).valid());
    }
}
