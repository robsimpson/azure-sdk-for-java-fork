// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AlertSimulatorRequestBody;
import com.azure.resourcemanager.security.models.AlertSimulatorRequestProperties;
import java.util.HashMap;
import java.util.Map;

public final class AlertSimulatorRequestBodyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AlertSimulatorRequestBody model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"kind\":\"AlertSimulatorRequestProperties\",\"\":{\"gddeimaw\":\"datarhpw\"}}}")
                .toObject(AlertSimulatorRequestBody.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AlertSimulatorRequestBody model =
            new AlertSimulatorRequestBody()
                .withProperties(
                    new AlertSimulatorRequestProperties()
                        .withAdditionalProperties(mapOf("kind", "AlertSimulatorRequestProperties")));
        model = BinaryData.fromObject(model).toObject(AlertSimulatorRequestBody.class);
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
