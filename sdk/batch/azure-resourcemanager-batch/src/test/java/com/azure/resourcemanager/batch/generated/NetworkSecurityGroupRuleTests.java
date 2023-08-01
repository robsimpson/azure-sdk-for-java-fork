// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.NetworkSecurityGroupRule;
import com.azure.resourcemanager.batch.models.NetworkSecurityGroupRuleAccess;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkSecurityGroupRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkSecurityGroupRule model =
            BinaryData
                .fromString(
                    "{\"priority\":566556548,\"access\":\"Allow\",\"sourceAddressPrefix\":\"kallatmel\",\"sourcePortRanges\":[\"piccjzkzivgv\",\"c\"]}")
                .toObject(NetworkSecurityGroupRule.class);
        Assertions.assertEquals(566556548, model.priority());
        Assertions.assertEquals(NetworkSecurityGroupRuleAccess.ALLOW, model.access());
        Assertions.assertEquals("kallatmel", model.sourceAddressPrefix());
        Assertions.assertEquals("piccjzkzivgv", model.sourcePortRanges().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkSecurityGroupRule model =
            new NetworkSecurityGroupRule()
                .withPriority(566556548)
                .withAccess(NetworkSecurityGroupRuleAccess.ALLOW)
                .withSourceAddressPrefix("kallatmel")
                .withSourcePortRanges(Arrays.asList("piccjzkzivgv", "c"));
        model = BinaryData.fromObject(model).toObject(NetworkSecurityGroupRule.class);
        Assertions.assertEquals(566556548, model.priority());
        Assertions.assertEquals(NetworkSecurityGroupRuleAccess.ALLOW, model.access());
        Assertions.assertEquals("kallatmel", model.sourceAddressPrefix());
        Assertions.assertEquals("piccjzkzivgv", model.sourcePortRanges().get(0));
    }
}
