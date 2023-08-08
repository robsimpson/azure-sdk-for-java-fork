// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.HybridComputePrivateLinkScopeInner;
import com.azure.resourcemanager.hybridcompute.models.HybridComputePrivateLinkScopeProperties;
import com.azure.resourcemanager.hybridcompute.models.PublicNetworkAccessType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HybridComputePrivateLinkScopeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HybridComputePrivateLinkScopeInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"publicNetworkAccess\":\"Disabled\",\"provisioningState\":\"kcglhslaz\",\"privateLinkScopeId\":\"yggdtjixh\"},\"location\":\"uofqwe\",\"tags\":{\"bcibvyvdcsitynn\":\"menevfyexfwh\",\"f\":\"amdecte\",\"eypvhezrkg\":\"qsc\",\"sle\":\"hcjrefovgmk\"},\"id\":\"yvxyqjp\",\"name\":\"cattpngjcrcczsq\",\"type\":\"jh\"}")
                .toObject(HybridComputePrivateLinkScopeInner.class);
        Assertions.assertEquals("uofqwe", model.location());
        Assertions.assertEquals("menevfyexfwh", model.tags().get("bcibvyvdcsitynn"));
        Assertions.assertEquals(PublicNetworkAccessType.DISABLED, model.properties().publicNetworkAccess());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HybridComputePrivateLinkScopeInner model =
            new HybridComputePrivateLinkScopeInner()
                .withLocation("uofqwe")
                .withTags(
                    mapOf("bcibvyvdcsitynn", "menevfyexfwh", "f", "amdecte", "eypvhezrkg", "qsc", "sle", "hcjrefovgmk"))
                .withProperties(
                    new HybridComputePrivateLinkScopeProperties()
                        .withPublicNetworkAccess(PublicNetworkAccessType.DISABLED));
        model = BinaryData.fromObject(model).toObject(HybridComputePrivateLinkScopeInner.class);
        Assertions.assertEquals("uofqwe", model.location());
        Assertions.assertEquals("menevfyexfwh", model.tags().get("bcibvyvdcsitynn"));
        Assertions.assertEquals(PublicNetworkAccessType.DISABLED, model.properties().publicNetworkAccess());
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
