// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeVersionResourceInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeVersionResourceListInner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ApplicationTypeVersionResourceListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationTypeVersionResourceListInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"nbpoczvyifqrvkdv\",\"appPackageUrl\":\"sllr\",\"defaultParameterList\":{}},\"location\":\"d\",\"tags\":{\"pnpulexxbczwtru\":\"t\",\"vsovmyokac\":\"iqzbq\"},\"etag\":\"kwlhzdo\",\"id\":\"xjmflbvv\",\"name\":\"chrkcciwwzjuqk\",\"type\":\"rsa\"},{\"properties\":{\"provisioningState\":\"ku\",\"appPackageUrl\":\"foskghsauuimj\",\"defaultParameterList\":{}},\"location\":\"ied\",\"tags\":{\"onpc\":\"idyjrrfbyaosvexc\",\"eggzfb\":\"hocohslkev\"},\"etag\":\"fmvfaxkffeiit\",\"id\":\"vmezy\",\"name\":\"shxmzsbbzoggigrx\",\"type\":\"burvjxxjnspy\"},{\"properties\":{\"provisioningState\":\"koen\",\"appPackageUrl\":\"ou\",\"defaultParameterList\":{}},\"location\":\"udwtiukbl\",\"tags\":{\"pazyxoegukg\":\"kpoc\",\"mrbpizcdrqj\":\"npiucgygevqznty\",\"yhxdeoejzicwi\":\"dpydn\",\"bkh\":\"sjttgzfbish\"},\"etag\":\"deyeamdphagalpbu\",\"id\":\"gipwhonowkg\",\"name\":\"hwankixzbinjepu\",\"type\":\"tmryw\"},{\"properties\":{\"provisioningState\":\"oqftiyqzrnkcq\",\"appPackageUrl\":\"yx\",\"defaultParameterList\":{}},\"location\":\"zlsico\",\"tags\":{\"w\":\"qnwvlrya\"},\"etag\":\"eun\",\"id\":\"qhgyxzkonocukok\",\"name\":\"yaxuconuqszfkb\",\"type\":\"ypewrmjmwvvjekt\"}],\"nextLink\":\"senhwlrs\"}")
                .toObject(ApplicationTypeVersionResourceListInner.class);
        Assertions.assertEquals("d", model.value().get(0).location());
        Assertions.assertEquals("t", model.value().get(0).tags().get("pnpulexxbczwtru"));
        Assertions.assertEquals("sllr", model.value().get(0).appPackageUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationTypeVersionResourceListInner model =
            new ApplicationTypeVersionResourceListInner()
                .withValue(
                    Arrays
                        .asList(
                            new ApplicationTypeVersionResourceInner()
                                .withLocation("d")
                                .withTags(mapOf("pnpulexxbczwtru", "t", "vsovmyokac", "iqzbq"))
                                .withAppPackageUrl("sllr"),
                            new ApplicationTypeVersionResourceInner()
                                .withLocation("ied")
                                .withTags(mapOf("onpc", "idyjrrfbyaosvexc", "eggzfb", "hocohslkev"))
                                .withAppPackageUrl("foskghsauuimj"),
                            new ApplicationTypeVersionResourceInner()
                                .withLocation("udwtiukbl")
                                .withTags(
                                    mapOf(
                                        "pazyxoegukg",
                                        "kpoc",
                                        "mrbpizcdrqj",
                                        "npiucgygevqznty",
                                        "yhxdeoejzicwi",
                                        "dpydn",
                                        "bkh",
                                        "sjttgzfbish"))
                                .withAppPackageUrl("ou"),
                            new ApplicationTypeVersionResourceInner()
                                .withLocation("zlsico")
                                .withTags(mapOf("w", "qnwvlrya"))
                                .withAppPackageUrl("yx")));
        model = BinaryData.fromObject(model).toObject(ApplicationTypeVersionResourceListInner.class);
        Assertions.assertEquals("d", model.value().get(0).location());
        Assertions.assertEquals("t", model.value().get(0).tags().get("pnpulexxbczwtru"));
        Assertions.assertEquals("sllr", model.value().get(0).appPackageUrl());
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
