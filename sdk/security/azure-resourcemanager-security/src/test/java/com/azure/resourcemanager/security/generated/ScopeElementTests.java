// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ScopeElement;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScopeElementTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScopeElement model =
            BinaryData
                .fromString(
                    "{\"field\":\"oldweyuqdu\",\"\":{\"alywjhhgdn\":\"datannrwrbiork\",\"iqndieuzaofj\":\"dataxmsivfomiloxggdu\"}}")
                .toObject(ScopeElement.class);
        Assertions.assertEquals("oldweyuqdu", model.field());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScopeElement model = new ScopeElement().withField("oldweyuqdu").withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(ScopeElement.class);
        Assertions.assertEquals("oldweyuqdu", model.field());
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
