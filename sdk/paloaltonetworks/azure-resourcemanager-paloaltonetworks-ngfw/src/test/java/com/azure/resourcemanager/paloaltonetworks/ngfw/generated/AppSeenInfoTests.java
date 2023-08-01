// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.AppSeenInfo;
import org.junit.jupiter.api.Assertions;

public final class AppSeenInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AppSeenInfo model =
            BinaryData
                .fromString(
                    "{\"title\":\"qaqtdoqmcbxvwvxy\",\"category\":\"lqbhsf\",\"subCategory\":\"obl\",\"risk\":\"tkblmpewww\",\"tag\":\"bkrvrnsvshqj\",\"technology\":\"hxcr\",\"standardPorts\":\"bfovasrruvwbhsq\"}")
                .toObject(AppSeenInfo.class);
        Assertions.assertEquals("qaqtdoqmcbxvwvxy", model.title());
        Assertions.assertEquals("lqbhsf", model.category());
        Assertions.assertEquals("obl", model.subCategory());
        Assertions.assertEquals("tkblmpewww", model.risk());
        Assertions.assertEquals("bkrvrnsvshqj", model.tag());
        Assertions.assertEquals("hxcr", model.technology());
        Assertions.assertEquals("bfovasrruvwbhsq", model.standardPorts());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AppSeenInfo model =
            new AppSeenInfo()
                .withTitle("qaqtdoqmcbxvwvxy")
                .withCategory("lqbhsf")
                .withSubCategory("obl")
                .withRisk("tkblmpewww")
                .withTag("bkrvrnsvshqj")
                .withTechnology("hxcr")
                .withStandardPorts("bfovasrruvwbhsq");
        model = BinaryData.fromObject(model).toObject(AppSeenInfo.class);
        Assertions.assertEquals("qaqtdoqmcbxvwvxy", model.title());
        Assertions.assertEquals("lqbhsf", model.category());
        Assertions.assertEquals("obl", model.subCategory());
        Assertions.assertEquals("tkblmpewww", model.risk());
        Assertions.assertEquals("bkrvrnsvshqj", model.tag());
        Assertions.assertEquals("hxcr", model.technology());
        Assertions.assertEquals("bfovasrruvwbhsq", model.standardPorts());
    }
}
