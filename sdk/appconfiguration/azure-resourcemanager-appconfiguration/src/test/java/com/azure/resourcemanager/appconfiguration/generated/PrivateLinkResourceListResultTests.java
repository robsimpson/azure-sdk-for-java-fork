// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appconfiguration.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.appconfiguration.models.PrivateLinkResourceListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"hrdxwzywqsmbs\",\"name\":\"exim\",\"type\":\"yocf\",\"properties\":{\"groupId\":\"s\",\"requiredMembers\":[],\"requiredZoneNames\":[]}},{\"id\":\"ys\",\"name\":\"i\",\"type\":\"xhqyudxorrqnb\",\"properties\":{\"groupId\":\"zvyifqrvkdvj\",\"requiredMembers\":[],\"requiredZoneNames\":[]}},{\"id\":\"mvvd\",\"name\":\"atkpnp\",\"type\":\"exxbczwtr\",\"properties\":{\"groupId\":\"qzbqjvsov\",\"requiredMembers\":[],\"requiredZoneNames\":[]}},{\"id\":\"acspkwl\",\"name\":\"dobpxjmflbvvn\",\"type\":\"rkcciwwzjuqk\",\"properties\":{\"groupId\":\"ajiwkuo\",\"requiredMembers\":[],\"requiredZoneNames\":[]}}],\"nextLink\":\"ghsauuimjmvxied\"}")
                .toObject(PrivateLinkResourceListResult.class);
        Assertions.assertEquals("ghsauuimjmvxied", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceListResult model =
            new PrivateLinkResourceListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResourceInner(),
                            new PrivateLinkResourceInner(),
                            new PrivateLinkResourceInner(),
                            new PrivateLinkResourceInner()))
                .withNextLink("ghsauuimjmvxied");
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceListResult.class);
        Assertions.assertEquals("ghsauuimjmvxied", model.nextLink());
    }
}
