// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maintenance.fluent.models.UpdateProperties;
import org.junit.jupiter.api.Assertions;

public final class UpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateProperties model = BinaryData.fromString("{\"resourceId\":\"ohjtckw\"}").toObject(UpdateProperties.class);
        Assertions.assertEquals("ohjtckw", model.resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateProperties model = new UpdateProperties().withResourceId("ohjtckw");
        model = BinaryData.fromObject(model).toObject(UpdateProperties.class);
        Assertions.assertEquals("ohjtckw", model.resourceId());
    }
}
