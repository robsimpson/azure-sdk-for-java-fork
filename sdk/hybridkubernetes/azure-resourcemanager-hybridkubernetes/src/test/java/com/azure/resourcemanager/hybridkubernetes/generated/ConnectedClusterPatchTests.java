// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedClusterPatch;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ConnectedClusterPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectedClusterPatch model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"ownoizhw\":\"htbmuf\",\"jgkdmbpazlobcu\":\"rxybqsoq\"},\"properties\":\"datadznrbtcqq\"}")
                .toObject(ConnectedClusterPatch.class);
        Assertions.assertEquals("htbmuf", model.tags().get("ownoizhw"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectedClusterPatch model =
            new ConnectedClusterPatch()
                .withTags(mapOf("ownoizhw", "htbmuf", "jgkdmbpazlobcu", "rxybqsoq"))
                .withProperties("datadznrbtcqq");
        model = BinaryData.fromObject(model).toObject(ConnectedClusterPatch.class);
        Assertions.assertEquals("htbmuf", model.tags().get("ownoizhw"));
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
