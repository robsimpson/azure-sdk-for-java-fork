// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeResourceInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"xlxqzvn\",\"\":{\"brqbsmswzi\":\"databycucrwnamikz\",\"vhczznvfby\":\"datagfuhokzrusw\",\"vumwmxqh\":\"datajsxjwwix\",\"hflzokxco\":\"datadvnoamldsehaohdj\"}},\"etag\":\"e\",\"id\":\"nje\",\"name\":\"agltsxoa\",\"type\":\"ftgz\"}")
                .toObject(IntegrationRuntimeResourceInner.class);
        Assertions.assertEquals("xlxqzvn", model.properties().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeResourceInner model =
            new IntegrationRuntimeResourceInner()
                .withProperties(
                    new IntegrationRuntime()
                        .withDescription("xlxqzvn")
                        .withAdditionalProperties(mapOf("type", "IntegrationRuntime")));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeResourceInner.class);
        Assertions.assertEquals("xlxqzvn", model.properties().description());
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
