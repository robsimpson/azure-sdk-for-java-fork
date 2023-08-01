// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.fluent.models.DiagnosticResourceInner;
import com.azure.resourcemanager.selfhelp.models.DiagnosticInvocation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"globalParameters\":{\"mjgr\":\"vd\"},\"insights\":[{\"solutionId\":\"ukxgaud\",\"additionalParameters\":{}},{\"solutionId\":\"nhsjcnyej\",\"additionalParameters\":{}}],\"acceptedAt\":\"yhtnapczwlokjye\",\"provisioningState\":\"Failed\",\"diagnostics\":[{\"solutionId\":\"pjoxzjnch\",\"status\":\"MissingInputs\",\"insights\":[]}]},\"id\":\"dmailzydehojw\",\"name\":\"ahuxinpm\",\"type\":\"njaqwixjspro\"}")
                .toObject(DiagnosticResourceInner.class);
        Assertions.assertEquals("vd", model.globalParameters().get("mjgr"));
        Assertions.assertEquals("ukxgaud", model.insights().get(0).solutionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticResourceInner model =
            new DiagnosticResourceInner()
                .withGlobalParameters(mapOf("mjgr", "vd"))
                .withInsights(
                    Arrays
                        .asList(
                            new DiagnosticInvocation().withSolutionId("ukxgaud").withAdditionalParameters(mapOf()),
                            new DiagnosticInvocation().withSolutionId("nhsjcnyej").withAdditionalParameters(mapOf())));
        model = BinaryData.fromObject(model).toObject(DiagnosticResourceInner.class);
        Assertions.assertEquals("vd", model.globalParameters().get("mjgr"));
        Assertions.assertEquals("ukxgaud", model.insights().get(0).solutionId());
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
