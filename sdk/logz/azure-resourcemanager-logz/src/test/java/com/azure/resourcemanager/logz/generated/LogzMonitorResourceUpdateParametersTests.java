// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logz.models.LogzMonitorResourceUpdateParameters;
import com.azure.resourcemanager.logz.models.MonitorUpdateProperties;
import com.azure.resourcemanager.logz.models.MonitoringStatus;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LogzMonitorResourceUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogzMonitorResourceUpdateParameters model =
            BinaryData
                .fromString("{\"properties\":{\"monitoringStatus\":\"Enabled\"},\"tags\":{\"z\":\"i\"}}")
                .toObject(LogzMonitorResourceUpdateParameters.class);
        Assertions.assertEquals(MonitoringStatus.ENABLED, model.properties().monitoringStatus());
        Assertions.assertEquals("i", model.tags().get("z"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogzMonitorResourceUpdateParameters model =
            new LogzMonitorResourceUpdateParameters()
                .withProperties(new MonitorUpdateProperties().withMonitoringStatus(MonitoringStatus.ENABLED))
                .withTags(mapOf("z", "i"));
        model = BinaryData.fromObject(model).toObject(LogzMonitorResourceUpdateParameters.class);
        Assertions.assertEquals(MonitoringStatus.ENABLED, model.properties().monitoringStatus());
        Assertions.assertEquals("i", model.tags().get("z"));
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
