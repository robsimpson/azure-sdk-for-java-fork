// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.models.IscsiTargetInfo;
import com.azure.resourcemanager.elasticsan.models.OperationalStatus;
import org.junit.jupiter.api.Assertions;

public final class IscsiTargetInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IscsiTargetInfo model =
            BinaryData
                .fromString(
                    "{\"targetIqn\":\"pnvjtoqnermclf\",\"targetPortalHostname\":\"phoxus\",\"targetPortalPort\":2041952882,\"provisioningState\":\"Canceled\",\"status\":\"Invalid\"}")
                .toObject(IscsiTargetInfo.class);
        Assertions.assertEquals(OperationalStatus.INVALID, model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IscsiTargetInfo model = new IscsiTargetInfo().withStatus(OperationalStatus.INVALID);
        model = BinaryData.fromObject(model).toObject(IscsiTargetInfo.class);
        Assertions.assertEquals(OperationalStatus.INVALID, model.status());
    }
}
