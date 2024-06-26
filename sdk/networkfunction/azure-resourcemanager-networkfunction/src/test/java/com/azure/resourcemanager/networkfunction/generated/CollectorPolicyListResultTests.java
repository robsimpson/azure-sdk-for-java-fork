// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkfunction.fluent.models.CollectorPolicyInner;
import com.azure.resourcemanager.networkfunction.models.CollectorPolicyListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CollectorPolicyListResultTests {
    @Test
    public void testDeserialize() {
        CollectorPolicyListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"emissionPolicies\":[],\"provisioningState\":\"Updating\"},\"etag\":\"fxqeof\",\"location\":\"e\",\"tags\":{\"jqul\":\"qjbasvms\",\"clxxwrljdo\":\"gsntnbybkzgcwr\",\"wtnhxbnjbiksqr\":\"skcqvkocrcjd\"},\"id\":\"lssai\",\"name\":\"qpjwnzlljfm\",\"type\":\"pee\"},{\"properties\":{\"emissionPolicies\":[],\"provisioningState\":\"Failed\"},\"etag\":\"bkyqduu\",\"location\":\"tcj\",\"tags\":{\"dkvwrwjfe\":\"zevndhkrwpdappds\",\"je\":\"snhu\",\"hocdgeab\":\"tmrldhugjzzdatq\"},\"id\":\"gphuticndvka\",\"name\":\"zwyiftyhxhur\",\"type\":\"k\"}],\"nextLink\":\"yxolniwp\"}")
                .toObject(CollectorPolicyListResult.class);
        Assertions.assertEquals("e", model.value().get(0).location());
        Assertions.assertEquals("qjbasvms", model.value().get(0).tags().get("jqul"));
    }

    @Test
    public void testSerialize() {
        CollectorPolicyListResult model =
            new CollectorPolicyListResult()
                .withValue(
                    Arrays
                        .asList(
                            new CollectorPolicyInner()
                                .withLocation("e")
                                .withTags(
                                    mapOf(
                                        "jqul",
                                        "qjbasvms",
                                        "clxxwrljdo",
                                        "gsntnbybkzgcwr",
                                        "wtnhxbnjbiksqr",
                                        "skcqvkocrcjd"))
                                .withEmissionPolicies(Arrays.asList()),
                            new CollectorPolicyInner()
                                .withLocation("tcj")
                                .withTags(
                                    mapOf("dkvwrwjfe", "zevndhkrwpdappds", "je", "snhu", "hocdgeab", "tmrldhugjzzdatq"))
                                .withEmissionPolicies(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(CollectorPolicyListResult.class);
        Assertions.assertEquals("e", model.value().get(0).location());
        Assertions.assertEquals("qjbasvms", model.value().get(0).tags().get("jqul"));
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
