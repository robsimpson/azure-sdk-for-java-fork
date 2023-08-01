// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.TrackBase;

public final class TrackBaseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrackBase model = BinaryData.fromString("{\"@odata.type\":\"TrackBase\"}").toObject(TrackBase.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrackBase model = new TrackBase();
        model = BinaryData.fromObject(model).toObject(TrackBase.class);
    }
}
