// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.SkipFileShareConfiguration;

public final class SkipFileShareConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkipFileShareConfiguration model =
            BinaryData.fromString("{\"configurationType\":\"Skip\"}").toObject(SkipFileShareConfiguration.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkipFileShareConfiguration model = new SkipFileShareConfiguration();
        model = BinaryData.fromObject(model).toObject(SkipFileShareConfiguration.class);
    }
}
