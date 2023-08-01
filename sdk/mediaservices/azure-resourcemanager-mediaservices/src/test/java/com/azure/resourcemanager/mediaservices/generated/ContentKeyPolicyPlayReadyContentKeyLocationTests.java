// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyPlayReadyContentKeyLocation;

public final class ContentKeyPolicyPlayReadyContentKeyLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContentKeyPolicyPlayReadyContentKeyLocation model =
            BinaryData
                .fromString("{\"@odata.type\":\"ContentKeyPolicyPlayReadyContentKeyLocation\"}")
                .toObject(ContentKeyPolicyPlayReadyContentKeyLocation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContentKeyPolicyPlayReadyContentKeyLocation model = new ContentKeyPolicyPlayReadyContentKeyLocation();
        model = BinaryData.fromObject(model).toObject(ContentKeyPolicyPlayReadyContentKeyLocation.class);
    }
}
