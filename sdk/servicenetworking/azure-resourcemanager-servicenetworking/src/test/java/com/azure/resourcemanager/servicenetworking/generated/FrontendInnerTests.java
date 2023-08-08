// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.fluent.models.FrontendInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FrontendInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FrontendInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"fqdn\":\"tqxln\",\"provisioningState\":\"Deleting\"},\"location\":\"fgugnxkrxdqmid\",\"tags\":{\"bhj\":\"zrvqdr\",\"h\":\"big\"},\"id\":\"qfbow\",\"name\":\"kanyktzlcuiywg\",\"type\":\"ywgndrv\"}")
                .toObject(FrontendInner.class);
        Assertions.assertEquals("fgugnxkrxdqmid", model.location());
        Assertions.assertEquals("zrvqdr", model.tags().get("bhj"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FrontendInner model =
            new FrontendInner().withLocation("fgugnxkrxdqmid").withTags(mapOf("bhj", "zrvqdr", "h", "big"));
        model = BinaryData.fromObject(model).toObject(FrontendInner.class);
        Assertions.assertEquals("fgugnxkrxdqmid", model.location());
        Assertions.assertEquals("zrvqdr", model.tags().get("bhj"));
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
