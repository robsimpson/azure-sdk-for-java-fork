// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.PrivateCloudIdentity;
import com.azure.resourcemanager.avs.models.ResourceIdentityType;
import org.junit.jupiter.api.Assertions;

public final class PrivateCloudIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateCloudIdentity model =
            BinaryData
                .fromString("{\"principalId\":\"a\",\"tenantId\":\"ae\",\"type\":\"None\"}")
                .toObject(PrivateCloudIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateCloudIdentity model = new PrivateCloudIdentity().withType(ResourceIdentityType.NONE);
        model = BinaryData.fromObject(model).toObject(PrivateCloudIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.type());
    }
}
