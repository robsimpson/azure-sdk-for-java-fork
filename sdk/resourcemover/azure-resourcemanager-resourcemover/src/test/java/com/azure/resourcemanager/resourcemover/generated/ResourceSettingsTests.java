// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.ResourceSettings;
import org.junit.jupiter.api.Assertions;

public final class ResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSettings model =
            BinaryData
                .fromString("{\"resourceType\":\"ResourceSettings\",\"targetResourceName\":\"mocpc\"}")
                .toObject(ResourceSettings.class);
        Assertions.assertEquals("mocpc", model.targetResourceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceSettings model = new ResourceSettings().withTargetResourceName("mocpc");
        model = BinaryData.fromObject(model).toObject(ResourceSettings.class);
        Assertions.assertEquals("mocpc", model.targetResourceName());
    }
}
