// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.ClusterInner;
import com.azure.resourcemanager.networkcloud.models.ClusterList;
import com.azure.resourcemanager.networkcloud.models.ClusterType;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterList model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"dhibnuq\",\"value\":[{\"extendedLocation\":{\"name\":\"ik\",\"type\":\"drgvtqagn\"},\"properties\":{\"analyticsWorkspaceId\":\"ynhijggme\",\"availableUpgradeVersions\":[],\"clusterConnectionStatus\":\"Connected\",\"clusterLocation\":\"utrc\",\"clusterManagerConnectionStatus\":\"Connected\",\"clusterManagerId\":\"zzmhjrunmpxttd\",\"clusterType\":\"MultiRack\",\"clusterVersion\":\"bnlankxmyskpb\",\"computeRackDefinitions\":[],\"detailedStatus\":\"Disconnected\",\"detailedStatusMessage\":\"cxy\",\"manualActionCount\":3361050620024364671,\"networkFabricId\":\"synlqidybyxczfc\",\"provisioningState\":\"Failed\",\"supportExpiryDate\":\"xdbabphlwr\",\"workloadResourceIds\":[]},\"location\":\"ktsthsucocmny\",\"tags\":{\"bt\":\"t\"},\"id\":\"wrqpue\",\"name\":\"ckzywbiexzfeyue\",\"type\":\"xibxujwbhqwalm\"},{\"extendedLocation\":{\"name\":\"zyoxaepdkzjan\",\"type\":\"ux\"},\"properties\":{\"analyticsWorkspaceId\":\"d\",\"availableUpgradeVersions\":[],\"clusterConnectionStatus\":\"Undefined\",\"clusterLocation\":\"iwdjswztsdbpgn\",\"clusterManagerConnectionStatus\":\"Connected\",\"clusterManagerId\":\"hpzxbzpfzab\",\"clusterType\":\"SingleRack\",\"clusterVersion\":\"uhxwtctyqiklbbov\",\"computeRackDefinitions\":[],\"detailedStatus\":\"Running\",\"detailedStatusMessage\":\"vgyuguos\",\"manualActionCount\":1888744128895186672,\"networkFabricId\":\"xquk\",\"provisioningState\":\"Accepted\",\"supportExpiryDate\":\"gmgsxnkjzkde\",\"workloadResourceIds\":[]},\"location\":\"vlopwiyighx\",\"tags\":{\"baumnyqupedeoj\":\"wzbaiue\",\"ckhsmtxpsieb\":\"a\"},\"id\":\"fhvpesaps\",\"name\":\"rdqmhjjdhtldwkyz\",\"type\":\"uutkncw\"}]}")
                .toObject(ClusterList.class);
        Assertions.assertEquals("dhibnuq", model.nextLink());
        Assertions.assertEquals("ktsthsucocmny", model.value().get(0).location());
        Assertions.assertEquals("t", model.value().get(0).tags().get("bt"));
        Assertions.assertEquals("ik", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("drgvtqagn", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals("ynhijggme", model.value().get(0).analyticsWorkspaceId());
        Assertions.assertEquals("utrc", model.value().get(0).clusterLocation());
        Assertions.assertEquals(ClusterType.MULTI_RACK, model.value().get(0).clusterType());
        Assertions.assertEquals("bnlankxmyskpb", model.value().get(0).clusterVersion());
        Assertions.assertEquals("synlqidybyxczfc", model.value().get(0).networkFabricId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterList model =
            new ClusterList()
                .withNextLink("dhibnuq")
                .withValue(
                    Arrays
                        .asList(
                            new ClusterInner()
                                .withLocation("ktsthsucocmny")
                                .withTags(mapOf("bt", "t"))
                                .withExtendedLocation(new ExtendedLocation().withName("ik").withType("drgvtqagn"))
                                .withAnalyticsWorkspaceId("ynhijggme")
                                .withClusterLocation("utrc")
                                .withClusterType(ClusterType.MULTI_RACK)
                                .withClusterVersion("bnlankxmyskpb")
                                .withComputeRackDefinitions(Arrays.asList())
                                .withNetworkFabricId("synlqidybyxczfc"),
                            new ClusterInner()
                                .withLocation("vlopwiyighx")
                                .withTags(mapOf("baumnyqupedeoj", "wzbaiue", "ckhsmtxpsieb", "a"))
                                .withExtendedLocation(new ExtendedLocation().withName("zyoxaepdkzjan").withType("ux"))
                                .withAnalyticsWorkspaceId("d")
                                .withClusterLocation("iwdjswztsdbpgn")
                                .withClusterType(ClusterType.SINGLE_RACK)
                                .withClusterVersion("uhxwtctyqiklbbov")
                                .withComputeRackDefinitions(Arrays.asList())
                                .withNetworkFabricId("xquk")));
        model = BinaryData.fromObject(model).toObject(ClusterList.class);
        Assertions.assertEquals("dhibnuq", model.nextLink());
        Assertions.assertEquals("ktsthsucocmny", model.value().get(0).location());
        Assertions.assertEquals("t", model.value().get(0).tags().get("bt"));
        Assertions.assertEquals("ik", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("drgvtqagn", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals("ynhijggme", model.value().get(0).analyticsWorkspaceId());
        Assertions.assertEquals("utrc", model.value().get(0).clusterLocation());
        Assertions.assertEquals(ClusterType.MULTI_RACK, model.value().get(0).clusterType());
        Assertions.assertEquals("bnlankxmyskpb", model.value().get(0).clusterVersion());
        Assertions.assertEquals("synlqidybyxczfc", model.value().get(0).networkFabricId());
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
