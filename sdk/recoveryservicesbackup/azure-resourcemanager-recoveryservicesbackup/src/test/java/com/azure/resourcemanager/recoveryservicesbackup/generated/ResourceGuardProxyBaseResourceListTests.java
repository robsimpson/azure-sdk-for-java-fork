// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ResourceGuardProxyBaseResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ResourceGuardProxyBase;
import com.azure.resourcemanager.recoveryservicesbackup.models.ResourceGuardProxyBaseResourceList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ResourceGuardProxyBaseResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGuardProxyBaseResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"resourceGuardResourceId\":\"ijnhyjsvfycxzbf\",\"resourceGuardOperationDetails\":[],\"lastUpdatedTime\":\"wvrvmtg\",\"description\":\"ppyostronzmyhgf\"},\"eTag\":\"nsxkmcwaekrrjr\",\"location\":\"afxtsgum\",\"tags\":{\"xwslolbqpv\":\"lik\",\"crpw\":\"zlmvfelfktgp\",\"brnjwmw\":\"xeznoi\"},\"id\":\"pn\",\"name\":\"saz\",\"type\":\"jjoqkagf\"},{\"properties\":{\"resourceGuardResourceId\":\"ttaugzxnfaazp\",\"resourceGuardOperationDetails\":[],\"lastUpdatedTime\":\"n\",\"description\":\"mkqjj\"},\"eTag\":\"uenvrkp\",\"location\":\"ou\",\"tags\":{\"xqtnq\":\"rebqaaysjk\"},\"id\":\"tezlwff\",\"name\":\"iakp\",\"type\":\"pqqmted\"}],\"nextLink\":\"mmji\"}")
                .toObject(ResourceGuardProxyBaseResourceList.class);
        Assertions.assertEquals("mmji", model.nextLink());
        Assertions.assertEquals("afxtsgum", model.value().get(0).location());
        Assertions.assertEquals("lik", model.value().get(0).tags().get("xwslolbqpv"));
        Assertions.assertEquals("ijnhyjsvfycxzbf", model.value().get(0).properties().resourceGuardResourceId());
        Assertions.assertEquals("wvrvmtg", model.value().get(0).properties().lastUpdatedTime());
        Assertions.assertEquals("ppyostronzmyhgf", model.value().get(0).properties().description());
        Assertions.assertEquals("nsxkmcwaekrrjr", model.value().get(0).etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceGuardProxyBaseResourceList model =
            new ResourceGuardProxyBaseResourceList()
                .withNextLink("mmji")
                .withValue(
                    Arrays
                        .asList(
                            new ResourceGuardProxyBaseResourceInner()
                                .withLocation("afxtsgum")
                                .withTags(mapOf("xwslolbqpv", "lik", "crpw", "zlmvfelfktgp", "brnjwmw", "xeznoi"))
                                .withProperties(
                                    new ResourceGuardProxyBase()
                                        .withResourceGuardResourceId("ijnhyjsvfycxzbf")
                                        .withResourceGuardOperationDetails(Arrays.asList())
                                        .withLastUpdatedTime("wvrvmtg")
                                        .withDescription("ppyostronzmyhgf"))
                                .withEtag("nsxkmcwaekrrjr"),
                            new ResourceGuardProxyBaseResourceInner()
                                .withLocation("ou")
                                .withTags(mapOf("xqtnq", "rebqaaysjk"))
                                .withProperties(
                                    new ResourceGuardProxyBase()
                                        .withResourceGuardResourceId("ttaugzxnfaazp")
                                        .withResourceGuardOperationDetails(Arrays.asList())
                                        .withLastUpdatedTime("n")
                                        .withDescription("mkqjj"))
                                .withEtag("uenvrkp")));
        model = BinaryData.fromObject(model).toObject(ResourceGuardProxyBaseResourceList.class);
        Assertions.assertEquals("mmji", model.nextLink());
        Assertions.assertEquals("afxtsgum", model.value().get(0).location());
        Assertions.assertEquals("lik", model.value().get(0).tags().get("xwslolbqpv"));
        Assertions.assertEquals("ijnhyjsvfycxzbf", model.value().get(0).properties().resourceGuardResourceId());
        Assertions.assertEquals("wvrvmtg", model.value().get(0).properties().lastUpdatedTime());
        Assertions.assertEquals("ppyostronzmyhgf", model.value().get(0).properties().description());
        Assertions.assertEquals("nsxkmcwaekrrjr", model.value().get(0).etag());
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
