// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.DataContainerProperties;
import com.azure.resourcemanager.machinelearning.models.DataType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataContainerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataContainerProperties model =
            BinaryData
                .fromString(
                    "{\"dataType\":\"mltable\",\"isArchived\":false,\"latestVersion\":\"vwxnbkfe\",\"nextVersion\":\"xscyhwzdgirujbz\",\"description\":\"mvzzbtdcqvp\",\"properties\":{\"n\":\"ujviylwdshfs\",\"rymsgaojfmw\":\"bgye\",\"hirctymoxoftpipi\":\"cotmr\",\"lihhyuspskasdvlm\":\"yczuhxacpq\"},\"tags\":{\"ulucv\":\"gz\",\"urisjnhnytxifqj\":\"amrsreuzv\",\"esutrgjupauutpw\":\"gxmrhublwp\",\"jqgwzp\":\"qhih\"}}")
                .toObject(DataContainerProperties.class);
        Assertions.assertEquals("mvzzbtdcqvp", model.description());
        Assertions.assertEquals("ujviylwdshfs", model.properties().get("n"));
        Assertions.assertEquals("gz", model.tags().get("ulucv"));
        Assertions.assertEquals(false, model.isArchived());
        Assertions.assertEquals(DataType.MLTABLE, model.dataType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataContainerProperties model =
            new DataContainerProperties()
                .withDescription("mvzzbtdcqvp")
                .withProperties(
                    mapOf(
                        "n",
                        "ujviylwdshfs",
                        "rymsgaojfmw",
                        "bgye",
                        "hirctymoxoftpipi",
                        "cotmr",
                        "lihhyuspskasdvlm",
                        "yczuhxacpq"))
                .withTags(
                    mapOf(
                        "ulucv",
                        "gz",
                        "urisjnhnytxifqj",
                        "amrsreuzv",
                        "esutrgjupauutpw",
                        "gxmrhublwp",
                        "jqgwzp",
                        "qhih"))
                .withIsArchived(false)
                .withDataType(DataType.MLTABLE);
        model = BinaryData.fromObject(model).toObject(DataContainerProperties.class);
        Assertions.assertEquals("mvzzbtdcqvp", model.description());
        Assertions.assertEquals("ujviylwdshfs", model.properties().get("n"));
        Assertions.assertEquals("gz", model.tags().get("ulucv"));
        Assertions.assertEquals(false, model.isArchived());
        Assertions.assertEquals(DataType.MLTABLE, model.dataType());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
