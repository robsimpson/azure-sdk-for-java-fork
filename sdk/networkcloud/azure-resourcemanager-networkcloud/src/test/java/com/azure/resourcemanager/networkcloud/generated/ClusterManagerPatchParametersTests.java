// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.ClusterManagerPatchParameters;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterManagerPatchParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterManagerPatchParameters model =
            BinaryData.fromString("{\"tags\":{\"kdlpa\":\"es\"}}").toObject(ClusterManagerPatchParameters.class);
        Assertions.assertEquals("es", model.tags().get("kdlpa"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterManagerPatchParameters model = new ClusterManagerPatchParameters().withTags(mapOf("kdlpa", "es"));
        model = BinaryData.fromObject(model).toObject(ClusterManagerPatchParameters.class);
        Assertions.assertEquals("es", model.tags().get("kdlpa"));
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
