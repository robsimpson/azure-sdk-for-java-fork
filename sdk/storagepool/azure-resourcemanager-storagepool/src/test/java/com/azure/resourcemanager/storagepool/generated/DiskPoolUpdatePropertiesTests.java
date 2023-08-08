// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagepool.fluent.models.DiskPoolUpdateProperties;
import com.azure.resourcemanager.storagepool.models.Disk;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiskPoolUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskPoolUpdateProperties model =
            BinaryData
                .fromString("{\"disks\":[{\"id\":\"cbonqvpk\"},{\"id\":\"lrxnjeaseiphe\"},{\"id\":\"f\"}]}")
                .toObject(DiskPoolUpdateProperties.class);
        Assertions.assertEquals("cbonqvpk", model.disks().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskPoolUpdateProperties model =
            new DiskPoolUpdateProperties()
                .withDisks(
                    Arrays
                        .asList(
                            new Disk().withId("cbonqvpk"), new Disk().withId("lrxnjeaseiphe"), new Disk().withId("f")));
        model = BinaryData.fromObject(model).toObject(DiskPoolUpdateProperties.class);
        Assertions.assertEquals("cbonqvpk", model.disks().get(0).id());
    }
}
