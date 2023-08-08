// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ClusterZoneListInner;
import com.azure.resourcemanager.avs.models.ClusterZone;
import java.util.Arrays;

public final class ClusterZoneListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterZoneListInner model =
            BinaryData
                .fromString(
                    "{\"zones\":[{\"hosts\":[\"hwankixzbinjepu\",\"tmryw\",\"uzoqft\",\"yqzrnkcqvyxlw\"],\"zone\":\"lsicohoqqnwv\"},{\"hosts\":[\"avwhheunm\"],\"zone\":\"hgyxzkonoc\"}]}")
                .toObject(ClusterZoneListInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterZoneListInner model =
            new ClusterZoneListInner().withZones(Arrays.asList(new ClusterZone(), new ClusterZone()));
        model = BinaryData.fromObject(model).toObject(ClusterZoneListInner.class);
    }
}
