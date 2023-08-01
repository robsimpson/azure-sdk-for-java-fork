// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.InstanceTypeSchema;
import com.azure.resourcemanager.machinelearning.models.InstanceTypeSchemaResources;
import com.azure.resourcemanager.machinelearning.models.KubernetesProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class KubernetesPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KubernetesProperties model =
            BinaryData
                .fromString(
                    "{\"relayConnectionString\":\"oyuelyetn\",\"serviceBusConnectionString\":\"bf\",\"extensionPrincipalId\":\"ggagfln\",\"extensionInstanceReleaseTrain\":\"mtrwah\",\"vcName\":\"mu\",\"namespace\":\"tb\",\"defaultInstanceType\":\"plrohkpigq\",\"instanceTypes\":{\"nmg\":{\"nodeSelector\":{\"alhhjnhgwydyynfs\":\"kzmkwklsnoxaxmqe\",\"qtanarfdlpuk\":\"khgb\",\"neizjcpe\":\"py\"},\"resources\":{\"requests\":{},\"limits\":{}}},\"f\":{\"nodeSelector\":{\"fpazjzoywjxhpd\":\"uxddbhfh\",\"tehtuevrhrljyoog\":\"lontacnpq\",\"sd\":\"xh\",\"arenlvhhtklnvnaf\":\"ugwbsreurfqkf\"},\"resources\":{\"requests\":{},\"limits\":{}}}}}")
                .toObject(KubernetesProperties.class);
        Assertions.assertEquals("oyuelyetn", model.relayConnectionString());
        Assertions.assertEquals("bf", model.serviceBusConnectionString());
        Assertions.assertEquals("ggagfln", model.extensionPrincipalId());
        Assertions.assertEquals("mtrwah", model.extensionInstanceReleaseTrain());
        Assertions.assertEquals("mu", model.vcName());
        Assertions.assertEquals("tb", model.namespace());
        Assertions.assertEquals("plrohkpigq", model.defaultInstanceType());
        Assertions
            .assertEquals("kzmkwklsnoxaxmqe", model.instanceTypes().get("nmg").nodeSelector().get("alhhjnhgwydyynfs"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KubernetesProperties model =
            new KubernetesProperties()
                .withRelayConnectionString("oyuelyetn")
                .withServiceBusConnectionString("bf")
                .withExtensionPrincipalId("ggagfln")
                .withExtensionInstanceReleaseTrain("mtrwah")
                .withVcName("mu")
                .withNamespace("tb")
                .withDefaultInstanceType("plrohkpigq")
                .withInstanceTypes(
                    mapOf(
                        "nmg",
                        new InstanceTypeSchema()
                            .withNodeSelector(
                                mapOf("alhhjnhgwydyynfs", "kzmkwklsnoxaxmqe", "qtanarfdlpuk", "khgb", "neizjcpe", "py"))
                            .withResources(new InstanceTypeSchemaResources().withRequests(mapOf()).withLimits(mapOf())),
                        "f",
                        new InstanceTypeSchema()
                            .withNodeSelector(
                                mapOf(
                                    "fpazjzoywjxhpd",
                                    "uxddbhfh",
                                    "tehtuevrhrljyoog",
                                    "lontacnpq",
                                    "sd",
                                    "xh",
                                    "arenlvhhtklnvnaf",
                                    "ugwbsreurfqkf"))
                            .withResources(
                                new InstanceTypeSchemaResources().withRequests(mapOf()).withLimits(mapOf()))));
        model = BinaryData.fromObject(model).toObject(KubernetesProperties.class);
        Assertions.assertEquals("oyuelyetn", model.relayConnectionString());
        Assertions.assertEquals("bf", model.serviceBusConnectionString());
        Assertions.assertEquals("ggagfln", model.extensionPrincipalId());
        Assertions.assertEquals("mtrwah", model.extensionInstanceReleaseTrain());
        Assertions.assertEquals("mu", model.vcName());
        Assertions.assertEquals("tb", model.namespace());
        Assertions.assertEquals("plrohkpigq", model.defaultInstanceType());
        Assertions
            .assertEquals("kzmkwklsnoxaxmqe", model.instanceTypes().get("nmg").nodeSelector().get("alhhjnhgwydyynfs"));
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
