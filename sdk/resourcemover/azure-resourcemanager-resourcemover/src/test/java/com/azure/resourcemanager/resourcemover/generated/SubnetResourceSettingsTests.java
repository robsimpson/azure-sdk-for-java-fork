// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.NsgReference;
import com.azure.resourcemanager.resourcemover.models.SubnetResourceSettings;
import org.junit.jupiter.api.Assertions;

public final class SubnetResourceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubnetResourceSettings model =
            BinaryData
                .fromString(
                    "{\"name\":\"lvmezyvshxmzsbbz\",\"addressPrefix\":\"gigr\",\"networkSecurityGroup\":{\"sourceArmResourceId\":\"burvjxxjnspy\"}}")
                .toObject(SubnetResourceSettings.class);
        Assertions.assertEquals("lvmezyvshxmzsbbz", model.name());
        Assertions.assertEquals("gigr", model.addressPrefix());
        Assertions.assertEquals("burvjxxjnspy", model.networkSecurityGroup().sourceArmResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubnetResourceSettings model =
            new SubnetResourceSettings()
                .withName("lvmezyvshxmzsbbz")
                .withAddressPrefix("gigr")
                .withNetworkSecurityGroup(new NsgReference().withSourceArmResourceId("burvjxxjnspy"));
        model = BinaryData.fromObject(model).toObject(SubnetResourceSettings.class);
        Assertions.assertEquals("lvmezyvshxmzsbbz", model.name());
        Assertions.assertEquals("gigr", model.addressPrefix());
        Assertions.assertEquals("burvjxxjnspy", model.networkSecurityGroup().sourceArmResourceId());
    }
}
