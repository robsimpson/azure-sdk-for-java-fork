// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.KeySetUserStatus;

public final class KeySetUserStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KeySetUserStatus model =
            BinaryData
                .fromString("{\"azureUserName\":\"zslzojhp\",\"status\":\"Active\",\"statusMessage\":\"mdxotngfdgu\"}")
                .toObject(KeySetUserStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KeySetUserStatus model = new KeySetUserStatus();
        model = BinaryData.fromObject(model).toObject(KeySetUserStatus.class);
    }
}
