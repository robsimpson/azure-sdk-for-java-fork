// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SliceInner;
import com.azure.resourcemanager.mobilenetwork.models.Snssai;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SliceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SliceInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Deleted\",\"snssai\":{\"sst\":1622525022,\"sd\":\"fminsgowzf\"},\"description\":\"sttktlahbqa\"},\"location\":\"xtgzukxitmmqtgqq\",\"tags\":{\"isavok\":\"rnxrxcpj\",\"azivjlfrqttbajl\":\"dzf\"},\"id\":\"atnwxyiopi\",\"name\":\"kqqfk\",\"type\":\"vscx\"}")
            .toObject(SliceInner.class);
        Assertions.assertEquals("xtgzukxitmmqtgqq", model.location());
        Assertions.assertEquals("rnxrxcpj", model.tags().get("isavok"));
        Assertions.assertEquals(1622525022, model.snssai().sst());
        Assertions.assertEquals("fminsgowzf", model.snssai().sd());
        Assertions.assertEquals("sttktlahbqa", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SliceInner model = new SliceInner().withLocation("xtgzukxitmmqtgqq")
            .withTags(mapOf("isavok", "rnxrxcpj", "azivjlfrqttbajl", "dzf"))
            .withSnssai(new Snssai().withSst(1622525022).withSd("fminsgowzf")).withDescription("sttktlahbqa");
        model = BinaryData.fromObject(model).toObject(SliceInner.class);
        Assertions.assertEquals("xtgzukxitmmqtgqq", model.location());
        Assertions.assertEquals("rnxrxcpj", model.tags().get("isavok"));
        Assertions.assertEquals(1622525022, model.snssai().sst());
        Assertions.assertEquals("fminsgowzf", model.snssai().sd());
        Assertions.assertEquals("sttktlahbqa", model.description());
    }

    // Use "Map.of" if available
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
