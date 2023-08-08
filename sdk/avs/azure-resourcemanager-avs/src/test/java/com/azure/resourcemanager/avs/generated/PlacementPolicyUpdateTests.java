// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.AffinityStrength;
import com.azure.resourcemanager.avs.models.AzureHybridBenefitType;
import com.azure.resourcemanager.avs.models.PlacementPolicyState;
import com.azure.resourcemanager.avs.models.PlacementPolicyUpdate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PlacementPolicyUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PlacementPolicyUpdate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"state\":\"Enabled\",\"vmMembers\":[\"dsg\",\"a\"],\"hostMembers\":[\"yc\",\"rauwjuetaebu\",\"u\"],\"affinityStrength\":\"Must\",\"azureHybridBenefitType\":\"None\"}}")
                .toObject(PlacementPolicyUpdate.class);
        Assertions.assertEquals(PlacementPolicyState.ENABLED, model.state());
        Assertions.assertEquals("dsg", model.vmMembers().get(0));
        Assertions.assertEquals("yc", model.hostMembers().get(0));
        Assertions.assertEquals(AffinityStrength.MUST, model.affinityStrength());
        Assertions.assertEquals(AzureHybridBenefitType.NONE, model.azureHybridBenefitType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PlacementPolicyUpdate model =
            new PlacementPolicyUpdate()
                .withState(PlacementPolicyState.ENABLED)
                .withVmMembers(Arrays.asList("dsg", "a"))
                .withHostMembers(Arrays.asList("yc", "rauwjuetaebu", "u"))
                .withAffinityStrength(AffinityStrength.MUST)
                .withAzureHybridBenefitType(AzureHybridBenefitType.NONE);
        model = BinaryData.fromObject(model).toObject(PlacementPolicyUpdate.class);
        Assertions.assertEquals(PlacementPolicyState.ENABLED, model.state());
        Assertions.assertEquals("dsg", model.vmMembers().get(0));
        Assertions.assertEquals("yc", model.hostMembers().get(0));
        Assertions.assertEquals(AffinityStrength.MUST, model.affinityStrength());
        Assertions.assertEquals(AzureHybridBenefitType.NONE, model.azureHybridBenefitType());
    }
}
