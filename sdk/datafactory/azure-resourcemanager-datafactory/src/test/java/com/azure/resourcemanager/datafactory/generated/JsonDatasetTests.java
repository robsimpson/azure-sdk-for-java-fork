// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.JsonDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class JsonDatasetTests {
    @Test
    public void testDeserialize() {
        JsonDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"Json\",\"typeProperties\":{\"location\":{\"type\":\"DatasetLocation\",\"\":{}},\"compression\":{\"\":{}}},\"description\":\"brjtloqxfuoj\",\"linkedServiceName\":{\"referenceName\":\"iflrzpasccbiu\",\"parameters\":{}},\"parameters\":{\"dfqwmkyoq\":{\"type\":\"String\"},\"vruzslzojhpctfnm\":{\"type\":\"String\"}},\"annotations\":[],\"folder\":{\"name\":\"gfdgugeyzi\"},\"\":{}}")
                .toObject(JsonDataset.class);
        Assertions.assertEquals("brjtloqxfuoj", model.description());
        Assertions.assertEquals("iflrzpasccbiu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("dfqwmkyoq").type());
        Assertions.assertEquals("gfdgugeyzi", model.folder().name());
    }

    @Test
    public void testSerialize() {
        JsonDataset model =
            new JsonDataset()
                .withDescription("brjtloqxfuoj")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("iflrzpasccbiu").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "dfqwmkyoq",
                        new ParameterSpecification().withType(ParameterType.STRING),
                        "vruzslzojhpctfnm",
                        new ParameterSpecification().withType(ParameterType.STRING)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("gfdgugeyzi"))
                .withLocation(new DatasetLocation().withAdditionalProperties(mapOf("type", "DatasetLocation")))
                .withCompression(new DatasetCompression().withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(JsonDataset.class);
        Assertions.assertEquals("brjtloqxfuoj", model.description());
        Assertions.assertEquals("iflrzpasccbiu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("dfqwmkyoq").type());
        Assertions.assertEquals("gfdgugeyzi", model.folder().name());
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