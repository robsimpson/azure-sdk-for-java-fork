// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.ImageProperties;
import com.azure.resourcemanager.sphere.models.RegionalDataBoundary;
import org.junit.jupiter.api.Assertions;

public final class ImagePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageProperties model =
            BinaryData
                .fromString(
                    "{\"image\":\"uhmuouqfprwzwbn\",\"imageId\":\"itnwuizgazxufi\",\"imageName\":\"ckyfih\",\"regionalDataBoundary\":\"None\",\"uri\":\"fvzwdzuhty\",\"description\":\"isdkfthwxmnteiw\",\"componentId\":\"pvkmijcmmxdcuf\",\"imageType\":\"FwConfig\",\"provisioningState\":\"Accepted\"}")
                .toObject(ImageProperties.class);
        Assertions.assertEquals("uhmuouqfprwzwbn", model.image());
        Assertions.assertEquals("itnwuizgazxufi", model.imageId());
        Assertions.assertEquals(RegionalDataBoundary.NONE, model.regionalDataBoundary());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageProperties model =
            new ImageProperties()
                .withImage("uhmuouqfprwzwbn")
                .withImageId("itnwuizgazxufi")
                .withRegionalDataBoundary(RegionalDataBoundary.NONE);
        model = BinaryData.fromObject(model).toObject(ImageProperties.class);
        Assertions.assertEquals("uhmuouqfprwzwbn", model.image());
        Assertions.assertEquals("itnwuizgazxufi", model.imageId());
        Assertions.assertEquals(RegionalDataBoundary.NONE, model.regionalDataBoundary());
    }
}
