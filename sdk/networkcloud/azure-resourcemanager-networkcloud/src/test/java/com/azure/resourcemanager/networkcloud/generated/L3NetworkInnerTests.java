// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.L3NetworkInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksIpamEnabled;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.IpAllocationType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class L3NetworkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L3NetworkInner model =
            BinaryData
                .fromString(
                    "{\"extendedLocation\":{\"name\":\"zrncsdt\",\"type\":\"lusiy\"},\"properties\":{\"associatedResourceIds\":[\"fgytguslfeadcyg\",\"ukyhejhzis\",\"gfpelolppvksrpqv\",\"jzraehtwdwrf\"],\"clusterId\":\"wib\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"l\",\"hybridAksClustersAssociatedIds\":[\"hfwpracstwit\",\"khevxccedc\",\"nmdyodnwzxl\",\"jc\"],\"hybridAksIpamEnabled\":\"True\",\"hybridAksPluginType\":\"DPDK\",\"interfaceName\":\"ugcxnavvwxq\",\"ipAllocationType\":\"IPV6\",\"ipv4ConnectedPrefix\":\"unyowxwl\",\"ipv6ConnectedPrefix\":\"jrkvfgbvfvpdbo\",\"l3IsolationDomainId\":\"acizsjqlhkrr\",\"provisioningState\":\"Failed\",\"virtualMachinesAssociatedIds\":[\"b\",\"ipqkghvxndzwm\"],\"vlan\":7216876515794387050},\"location\":\"ajpjo\",\"tags\":{\"j\":\"qnyhgb\",\"ystawfsdjpvkvp\":\"jivfxzsjabib\"},\"id\":\"jxbkzbzkdvn\",\"name\":\"jabudurgkakmo\",\"type\":\"zhjjklffhmouwq\"}")
                .toObject(L3NetworkInner.class);
        Assertions.assertEquals("ajpjo", model.location());
        Assertions.assertEquals("qnyhgb", model.tags().get("j"));
        Assertions.assertEquals("zrncsdt", model.extendedLocation().name());
        Assertions.assertEquals("lusiy", model.extendedLocation().type());
        Assertions.assertEquals(HybridAksIpamEnabled.TRUE, model.hybridAksIpamEnabled());
        Assertions.assertEquals(HybridAksPluginType.DPDK, model.hybridAksPluginType());
        Assertions.assertEquals("ugcxnavvwxq", model.interfaceName());
        Assertions.assertEquals(IpAllocationType.IPV6, model.ipAllocationType());
        Assertions.assertEquals("unyowxwl", model.ipv4ConnectedPrefix());
        Assertions.assertEquals("jrkvfgbvfvpdbo", model.ipv6ConnectedPrefix());
        Assertions.assertEquals("acizsjqlhkrr", model.l3IsolationDomainId());
        Assertions.assertEquals(7216876515794387050L, model.vlan());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L3NetworkInner model =
            new L3NetworkInner()
                .withLocation("ajpjo")
                .withTags(mapOf("j", "qnyhgb", "ystawfsdjpvkvp", "jivfxzsjabib"))
                .withExtendedLocation(new ExtendedLocation().withName("zrncsdt").withType("lusiy"))
                .withHybridAksIpamEnabled(HybridAksIpamEnabled.TRUE)
                .withHybridAksPluginType(HybridAksPluginType.DPDK)
                .withInterfaceName("ugcxnavvwxq")
                .withIpAllocationType(IpAllocationType.IPV6)
                .withIpv4ConnectedPrefix("unyowxwl")
                .withIpv6ConnectedPrefix("jrkvfgbvfvpdbo")
                .withL3IsolationDomainId("acizsjqlhkrr")
                .withVlan(7216876515794387050L);
        model = BinaryData.fromObject(model).toObject(L3NetworkInner.class);
        Assertions.assertEquals("ajpjo", model.location());
        Assertions.assertEquals("qnyhgb", model.tags().get("j"));
        Assertions.assertEquals("zrncsdt", model.extendedLocation().name());
        Assertions.assertEquals("lusiy", model.extendedLocation().type());
        Assertions.assertEquals(HybridAksIpamEnabled.TRUE, model.hybridAksIpamEnabled());
        Assertions.assertEquals(HybridAksPluginType.DPDK, model.hybridAksPluginType());
        Assertions.assertEquals("ugcxnavvwxq", model.interfaceName());
        Assertions.assertEquals(IpAllocationType.IPV6, model.ipAllocationType());
        Assertions.assertEquals("unyowxwl", model.ipv4ConnectedPrefix());
        Assertions.assertEquals("jrkvfgbvfvpdbo", model.ipv6ConnectedPrefix());
        Assertions.assertEquals("acizsjqlhkrr", model.l3IsolationDomainId());
        Assertions.assertEquals(7216876515794387050L, model.vlan());
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
