// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devhub.fluent.models.WorkflowInner;
import com.azure.resourcemanager.devhub.models.WorkflowListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WorkflowListResultTests {
    @Test
    public void testDeserialize() {
        WorkflowListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{},\"location\":\"ejhkry\",\"tags\":{\"lokjyemkk\":\"apcz\",\"joxzjnchgejspodm\":\"ni\",\"h\":\"ilzyd\"},\"id\":\"jwyahuxinpmqnja\",\"name\":\"wixjsprozvcp\",\"type\":\"tegjvwmf\"},{\"properties\":{},\"location\":\"scmdvpjhulsuu\",\"tags\":{\"pslwejdpvw\":\"jozkrwfndiod\",\"akl\":\"yoqpsoaccta\",\"fdosyg\":\"lahbcryff\"},\"id\":\"xpaojakhmsbz\",\"name\":\"hcrzevd\",\"type\":\"hlxaolthqtr\"},{\"properties\":{},\"location\":\"bpf\",\"tags\":{\"wzo\":\"inzgvfcj\"},\"id\":\"xjtfelluwfzit\",\"name\":\"np\",\"type\":\"qfpjk\"},{\"properties\":{},\"location\":\"ofpdvh\",\"tags\":{\"odepoogin\":\"xypininmayhuybbk\",\"ognarxzxtheotus\":\"vamih\",\"nhungbw\":\"vyevcciqi\"},\"id\":\"zrnf\",\"name\":\"gxg\",\"type\":\"spemvtzfk\"}],\"nextLink\":\"ubljofxqe\"}")
                .toObject(WorkflowListResult.class);
        Assertions.assertEquals("ejhkry", model.value().get(0).location());
        Assertions.assertEquals("apcz", model.value().get(0).tags().get("lokjyemkk"));
    }

    @Test
    public void testSerialize() {
        WorkflowListResult model =
            new WorkflowListResult()
                .withValue(
                    Arrays
                        .asList(
                            new WorkflowInner()
                                .withLocation("ejhkry")
                                .withTags(mapOf("lokjyemkk", "apcz", "joxzjnchgejspodm", "ni", "h", "ilzyd")),
                            new WorkflowInner()
                                .withLocation("scmdvpjhulsuu")
                                .withTags(
                                    mapOf("pslwejdpvw", "jozkrwfndiod", "akl", "yoqpsoaccta", "fdosyg", "lahbcryff")),
                            new WorkflowInner().withLocation("bpf").withTags(mapOf("wzo", "inzgvfcj")),
                            new WorkflowInner()
                                .withLocation("ofpdvh")
                                .withTags(
                                    mapOf(
                                        "odepoogin",
                                        "xypininmayhuybbk",
                                        "ognarxzxtheotus",
                                        "vamih",
                                        "nhungbw",
                                        "vyevcciqi"))));
        model = BinaryData.fromObject(model).toObject(WorkflowListResult.class);
        Assertions.assertEquals("ejhkry", model.value().get(0).location());
        Assertions.assertEquals("apcz", model.value().get(0).tags().get("lokjyemkk"));
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