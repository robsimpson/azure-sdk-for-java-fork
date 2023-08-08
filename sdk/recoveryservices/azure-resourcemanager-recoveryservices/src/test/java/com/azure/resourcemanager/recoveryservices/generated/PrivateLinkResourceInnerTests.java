// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.PrivateLinkResourceInner;

public final class PrivateLinkResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"groupId\":\"udccsnhsjc\",\"requiredMembers\":[\"j\",\"kryhtnapczwlokj\"],\"requiredZoneNames\":[\"kkvnipjox\",\"jnchgej\"]},\"id\":\"odmailzyd\",\"name\":\"o\",\"type\":\"yahux\"}")
                .toObject(PrivateLinkResourceInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceInner model = new PrivateLinkResourceInner();
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceInner.class);
    }
}
