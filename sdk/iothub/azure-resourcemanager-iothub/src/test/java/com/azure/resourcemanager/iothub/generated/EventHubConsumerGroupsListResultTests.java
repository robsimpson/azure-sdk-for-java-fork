// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.fluent.models.EventHubConsumerGroupInfoInner;
import com.azure.resourcemanager.iothub.models.EventHubConsumerGroupsListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class EventHubConsumerGroupsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventHubConsumerGroupsListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"aex\":\"datamdua\",\"vxpvgomz\":\"datapvfadmwsrcr\"},\"etag\":\"misgwbnb\",\"id\":\"e\",\"name\":\"dawkzbali\",\"type\":\"urqhaka\"}],\"nextLink\":\"ashsfwxos\"}")
                .toObject(EventHubConsumerGroupsListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventHubConsumerGroupsListResult model =
            new EventHubConsumerGroupsListResult()
                .withValue(
                    Arrays
                        .asList(
                            new EventHubConsumerGroupInfoInner()
                                .withProperties(mapOf("aex", "datamdua", "vxpvgomz", "datapvfadmwsrcr"))));
        model = BinaryData.fromObject(model).toObject(EventHubConsumerGroupsListResult.class);
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
