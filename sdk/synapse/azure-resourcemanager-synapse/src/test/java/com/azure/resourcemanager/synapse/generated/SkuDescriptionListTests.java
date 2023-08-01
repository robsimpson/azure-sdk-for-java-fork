// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.SkuDescriptionList;

public final class SkuDescriptionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuDescriptionList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"resourceType\":\"zlwhhmemhooclu\",\"name\":\"pqmem\",\"size\":\"jk\",\"locations\":[\"kyujxsglhsrrr\",\"ejylmbkzu\"],\"locationInfo\":[],\"restrictions\":[\"datafihotj\"]},{\"resourceType\":\"lpxuzzjgnrefq\",\"name\":\"qotoihiqakydiwfb\",\"size\":\"wpzdqtvhcspo\",\"locations\":[\"axsipietgb\",\"bjfu\",\"bmoichd\",\"pnfpubntnbat\"],\"locationInfo\":[],\"restrictions\":[\"dataowsaaelcattcjuh\",\"datalrvkmjc\"]}]}")
                .toObject(SkuDescriptionList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuDescriptionList model = new SkuDescriptionList();
        model = BinaryData.fromObject(model).toObject(SkuDescriptionList.class);
    }
}
