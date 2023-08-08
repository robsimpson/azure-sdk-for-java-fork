// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.fluent.models.ManagedCcfInner;
import com.azure.resourcemanager.confidentialledger.models.ManagedCcfList;
import com.azure.resourcemanager.confidentialledger.models.ManagedCcfProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedCcfListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedCcfList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"appName\":\"wu\",\"appUri\":\"gazxuf\",\"identityServiceUri\":\"uckyf\",\"memberIdentityCertificates\":[],\"provisioningState\":\"Canceled\",\"nodeCount\":534635279},\"location\":\"zwdzuh\",\"tags\":{\"wxmnteiwao\":\"wisdkft\",\"fsrpymzidnse\":\"vkmijcmmxdcuf\",\"yc\":\"cxtbzsg\",\"mdwzjeiachboo\":\"sne\"},\"id\":\"flnrosfqpteehzz\",\"name\":\"ypyqrimzinp\",\"type\":\"swjdkirso\"},{\"properties\":{\"appName\":\"xhcr\",\"appUri\":\"ohjtckw\",\"identityServiceUri\":\"soifiyipjxsqw\",\"memberIdentityCertificates\":[],\"provisioningState\":\"Unknown\",\"nodeCount\":1837885218},\"location\":\"rcjxvsnbyxqabn\",\"tags\":{\"zafb\":\"pcyshu\"},\"id\":\"jjgpb\",\"name\":\"oq\",\"type\":\"jmkljavbqidtqajz\"},{\"properties\":{\"appName\":\"pku\",\"appUri\":\"krlkhbzhfepg\",\"identityServiceUri\":\"qex\",\"memberIdentityCertificates\":[],\"provisioningState\":\"Succeeded\",\"nodeCount\":149734817},\"location\":\"aierhhb\",\"tags\":{\"mmajtjaodx\":\"l\"},\"id\":\"bnbdxkqpxokajion\",\"name\":\"imexgstxgcpodgma\",\"type\":\"jrmvdjwzrlo\"},{\"properties\":{\"appName\":\"lwhijcoejctbzaq\",\"appUri\":\"sycbkbfk\",\"identityServiceUri\":\"kdkexxp\",\"memberIdentityCertificates\":[],\"provisioningState\":\"Creating\",\"nodeCount\":159547648},\"location\":\"fjpgddtocjjxhvp\",\"tags\":{\"xibqeojnx\":\"exhd\",\"dntwndeicbtw\":\"bzv\"},\"id\":\"pzaoqvuhr\",\"name\":\"cffcyddglmj\",\"type\":\"hjq\"}],\"nextLink\":\"pyeicxm\"}")
                .toObject(ManagedCcfList.class);
        Assertions.assertEquals("zwdzuh", model.value().get(0).location());
        Assertions.assertEquals("wisdkft", model.value().get(0).tags().get("wxmnteiwao"));
        Assertions.assertEquals(534635279, model.value().get(0).properties().nodeCount());
        Assertions.assertEquals("pyeicxm", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedCcfList model =
            new ManagedCcfList()
                .withValue(
                    Arrays
                        .asList(
                            new ManagedCcfInner()
                                .withLocation("zwdzuh")
                                .withTags(
                                    mapOf(
                                        "wxmnteiwao",
                                        "wisdkft",
                                        "fsrpymzidnse",
                                        "vkmijcmmxdcuf",
                                        "yc",
                                        "cxtbzsg",
                                        "mdwzjeiachboo",
                                        "sne"))
                                .withProperties(
                                    new ManagedCcfProperties()
                                        .withMemberIdentityCertificates(Arrays.asList())
                                        .withNodeCount(534635279)),
                            new ManagedCcfInner()
                                .withLocation("rcjxvsnbyxqabn")
                                .withTags(mapOf("zafb", "pcyshu"))
                                .withProperties(
                                    new ManagedCcfProperties()
                                        .withMemberIdentityCertificates(Arrays.asList())
                                        .withNodeCount(1837885218)),
                            new ManagedCcfInner()
                                .withLocation("aierhhb")
                                .withTags(mapOf("mmajtjaodx", "l"))
                                .withProperties(
                                    new ManagedCcfProperties()
                                        .withMemberIdentityCertificates(Arrays.asList())
                                        .withNodeCount(149734817)),
                            new ManagedCcfInner()
                                .withLocation("fjpgddtocjjxhvp")
                                .withTags(mapOf("xibqeojnx", "exhd", "dntwndeicbtw", "bzv"))
                                .withProperties(
                                    new ManagedCcfProperties()
                                        .withMemberIdentityCertificates(Arrays.asList())
                                        .withNodeCount(159547648))))
                .withNextLink("pyeicxm");
        model = BinaryData.fromObject(model).toObject(ManagedCcfList.class);
        Assertions.assertEquals("zwdzuh", model.value().get(0).location());
        Assertions.assertEquals("wisdkft", model.value().get(0).tags().get("wxmnteiwao"));
        Assertions.assertEquals(534635279, model.value().get(0).properties().nodeCount());
        Assertions.assertEquals("pyeicxm", model.nextLink());
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
