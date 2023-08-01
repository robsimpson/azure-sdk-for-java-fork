// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.timeseriesinsights.models.CreateOrUpdateTrackedResourceProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CreateOrUpdateTrackedResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateOrUpdateTrackedResourceProperties model =
            BinaryData
                .fromString("{\"location\":\"b\",\"tags\":{\"wgcu\":\"mutduqktaps\"}}")
                .toObject(CreateOrUpdateTrackedResourceProperties.class);
        Assertions.assertEquals("b", model.location());
        Assertions.assertEquals("mutduqktaps", model.tags().get("wgcu"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateOrUpdateTrackedResourceProperties model =
            new CreateOrUpdateTrackedResourceProperties().withLocation("b").withTags(mapOf("wgcu", "mutduqktaps"));
        model = BinaryData.fromObject(model).toObject(CreateOrUpdateTrackedResourceProperties.class);
        Assertions.assertEquals("b", model.location());
        Assertions.assertEquals("mutduqktaps", model.tags().get("wgcu"));
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
