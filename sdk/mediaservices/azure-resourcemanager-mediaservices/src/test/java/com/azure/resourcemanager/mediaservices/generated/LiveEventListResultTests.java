// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventInner;
import com.azure.resourcemanager.mediaservices.models.LiveEventListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LiveEventListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveEventListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"description\":\"opcjwvnhd\",\"transcriptions\":[],\"provisioningState\":\"xcxrsl\",\"resourceState\":\"StandBy\",\"useStaticHostname\":true,\"hostnamePrefix\":\"egrpkhj\",\"streamOptions\":[],\"created\":\"2021-07-28T08:27Z\",\"lastModified\":\"2021-11-05T08:24:08Z\"},\"location\":\"uicpd\",\"tags\":{\"efyw\":\"zzlvmbmpaxmodfv\",\"yhrfouyftaakcpw\":\"bpfvm\",\"nubexk\":\"yzvqt\",\"quxvypomgkop\":\"zksmondj\"},\"id\":\"whojvp\",\"name\":\"jqg\",\"type\":\"ysmocmbqfqvmkcxo\"},{\"properties\":{\"description\":\"vhelxprglyatdd\",\"transcriptions\":[],\"provisioningState\":\"uejrjxgc\",\"resourceState\":\"Running\",\"useStaticHostname\":false,\"hostnamePrefix\":\"sxsdqrhzoymibm\",\"streamOptions\":[],\"created\":\"2021-01-01T16:44:16Z\",\"lastModified\":\"2021-02-21T21:27:59Z\"},\"location\":\"wfluszdt\",\"tags\":{\"cpi\":\"kwofyyvoq\",\"nwashrtd\":\"xpbtgiwbwo\",\"ulpiuj\":\"kcnqxwbpo\"},\"id\":\"aasipqi\",\"name\":\"obyu\",\"type\":\"erpqlpqwcciuqg\"}],\"@odata.count\":1924773766,\"@odata.nextLink\":\"t\"}")
                .toObject(LiveEventListResult.class);
        Assertions.assertEquals("uicpd", model.value().get(0).location());
        Assertions.assertEquals("zzlvmbmpaxmodfv", model.value().get(0).tags().get("efyw"));
        Assertions.assertEquals("opcjwvnhd", model.value().get(0).description());
        Assertions.assertEquals(true, model.value().get(0).useStaticHostname());
        Assertions.assertEquals("egrpkhj", model.value().get(0).hostnamePrefix());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveEventListResult model =
            new LiveEventListResult()
                .withValue(
                    Arrays
                        .asList(
                            new LiveEventInner()
                                .withLocation("uicpd")
                                .withTags(
                                    mapOf(
                                        "efyw",
                                        "zzlvmbmpaxmodfv",
                                        "yhrfouyftaakcpw",
                                        "bpfvm",
                                        "nubexk",
                                        "yzvqt",
                                        "quxvypomgkop",
                                        "zksmondj"))
                                .withDescription("opcjwvnhd")
                                .withTranscriptions(Arrays.asList())
                                .withUseStaticHostname(true)
                                .withHostnamePrefix("egrpkhj")
                                .withStreamOptions(Arrays.asList()),
                            new LiveEventInner()
                                .withLocation("wfluszdt")
                                .withTags(mapOf("cpi", "kwofyyvoq", "nwashrtd", "xpbtgiwbwo", "ulpiuj", "kcnqxwbpo"))
                                .withDescription("vhelxprglyatdd")
                                .withTranscriptions(Arrays.asList())
                                .withUseStaticHostname(false)
                                .withHostnamePrefix("sxsdqrhzoymibm")
                                .withStreamOptions(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(LiveEventListResult.class);
        Assertions.assertEquals("uicpd", model.value().get(0).location());
        Assertions.assertEquals("zzlvmbmpaxmodfv", model.value().get(0).tags().get("efyw"));
        Assertions.assertEquals("opcjwvnhd", model.value().get(0).description());
        Assertions.assertEquals(true, model.value().get(0).useStaticHostname());
        Assertions.assertEquals("egrpkhj", model.value().get(0).hostnamePrefix());
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
