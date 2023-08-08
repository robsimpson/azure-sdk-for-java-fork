// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpdate;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeSpec;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeType;
import org.junit.jupiter.api.Assertions;

public final class ManagedClusterUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedClusterUpdate model =
            BinaryData
                .fromString("{\"upgrade\":{\"type\":\"Full\",\"kubernetesVersion\":\"mdwzjeiachboo\"}}")
                .toObject(ManagedClusterUpdate.class);
        Assertions.assertEquals(ManagedClusterUpgradeType.FULL, model.upgrade().type());
        Assertions.assertEquals("mdwzjeiachboo", model.upgrade().kubernetesVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedClusterUpdate model =
            new ManagedClusterUpdate()
                .withUpgrade(
                    new ManagedClusterUpgradeSpec()
                        .withType(ManagedClusterUpgradeType.FULL)
                        .withKubernetesVersion("mdwzjeiachboo"));
        model = BinaryData.fromObject(model).toObject(ManagedClusterUpdate.class);
        Assertions.assertEquals(ManagedClusterUpgradeType.FULL, model.upgrade().type());
        Assertions.assertEquals("mdwzjeiachboo", model.upgrade().kubernetesVersion());
    }
}
