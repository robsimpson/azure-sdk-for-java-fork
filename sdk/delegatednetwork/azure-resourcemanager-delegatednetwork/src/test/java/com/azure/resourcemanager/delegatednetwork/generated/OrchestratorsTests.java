// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.delegatednetwork.fluent.models.OrchestratorInner;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorIdentity;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorKind;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorResourceProperties;
import com.azure.resourcemanager.delegatednetwork.models.Orchestrators;
import com.azure.resourcemanager.delegatednetwork.models.ResourceIdentityType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class OrchestratorsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Orchestrators model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"resourceGuid\":\"mrldhu\",\"provisioningState\":\"Deleting\",\"orchestratorAppId\":\"datqxhocdgeabl\",\"orchestratorTenantId\":\"huticndvkao\",\"clusterRootCA\":\"yiftyhxhuro\",\"apiServerEndpoint\":\"tyxolniwpwc\",\"privateLinkResourceId\":\"jfkgiawxk\"},\"kind\":\"Kubernetes\",\"identity\":{\"principalId\":\"lwckbasyypnddhs\",\"tenantId\":\"bacphejko\",\"type\":\"None\"},\"location\":\"qgoulznd\",\"tags\":{\"dgak\":\"wyqkgfgibm\"},\"id\":\"qsrxybzqqed\",\"name\":\"ytb\",\"type\":\"iqfouflmmnkz\"},{\"properties\":{\"resourceGuid\":\"dmgloug\",\"provisioningState\":\"Provisioning\",\"orchestratorAppId\":\"tmut\",\"orchestratorTenantId\":\"qktapspwgcuert\",\"clusterRootCA\":\"kdosvqw\",\"apiServerEndpoint\":\"mdgbbjfdd\",\"privateLinkResourceId\":\"bmbexppbhtqqro\"},\"kind\":\"Kubernetes\",\"identity\":{\"principalId\":\"psalgbqux\",\"tenantId\":\"jyj\",\"type\":\"None\"},\"location\":\"aoyfhrtxilnerkuj\",\"tags\":{\"juvf\":\"l\",\"jkcpr\":\"awrlyx\",\"nruj\":\"nwbxgjvtbvpyssz\"},\"id\":\"guhmuouqfpr\",\"name\":\"zw\",\"type\":\"nguitnwuizgazxu\"},{\"properties\":{\"resourceGuid\":\"uckyf\",\"provisioningState\":\"Failed\",\"orchestratorAppId\":\"idf\",\"orchestratorTenantId\":\"wdzuhtymwisd\",\"clusterRootCA\":\"thwxmnteiwaopvkm\",\"apiServerEndpoint\":\"c\",\"privateLinkResourceId\":\"xdcu\"},\"kind\":\"Kubernetes\",\"identity\":{\"principalId\":\"rpymzidnsez\",\"tenantId\":\"tbzsgfyccs\",\"type\":\"None\"},\"location\":\"mdwzjeiachboo\",\"tags\":{\"hzzvypyq\":\"nrosfqpte\",\"z\":\"i\"},\"id\":\"npvswjdkirso\",\"name\":\"dqxhcrmnohjtckwh\",\"type\":\"soifiyipjxsqw\"},{\"properties\":{\"resourceGuid\":\"jbznorc\",\"provisioningState\":\"Deleting\",\"orchestratorAppId\":\"nb\",\"orchestratorTenantId\":\"qabnmoc\",\"clusterRootCA\":\"ysh\",\"apiServerEndpoint\":\"zafb\",\"privateLinkResourceId\":\"j\"},\"kind\":\"Kubernetes\",\"identity\":{\"principalId\":\"oq\",\"tenantId\":\"mkljavb\",\"type\":\"None\"},\"location\":\"tqajzyulpkudjkrl\",\"tags\":{\"fepgzgq\":\"z\",\"ierhhbcsglummaj\":\"xzlocxscp\",\"odxobnbdxkqpxok\":\"j\",\"odgmaajrmvdjwz\":\"jionpimexgstxgc\"},\"id\":\"lovmclwhijcoe\",\"name\":\"ctbzaq\",\"type\":\"qsycbkbfkgu\"}],\"nextLink\":\"kexxppof\"}")
                .toObject(Orchestrators.class);
        Assertions.assertEquals("qgoulznd", model.value().get(0).location());
        Assertions.assertEquals("wyqkgfgibm", model.value().get(0).tags().get("dgak"));
        Assertions.assertEquals(OrchestratorKind.KUBERNETES, model.value().get(0).kind());
        Assertions.assertEquals(ResourceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("datqxhocdgeabl", model.value().get(0).properties().orchestratorAppId());
        Assertions.assertEquals("huticndvkao", model.value().get(0).properties().orchestratorTenantId());
        Assertions.assertEquals("yiftyhxhuro", model.value().get(0).properties().clusterRootCA());
        Assertions.assertEquals("tyxolniwpwc", model.value().get(0).properties().apiServerEndpoint());
        Assertions.assertEquals("jfkgiawxk", model.value().get(0).properties().privateLinkResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Orchestrators model =
            new Orchestrators()
                .withValue(
                    Arrays
                        .asList(
                            new OrchestratorInner()
                                .withLocation("qgoulznd")
                                .withTags(mapOf("dgak", "wyqkgfgibm"))
                                .withKind(OrchestratorKind.KUBERNETES)
                                .withIdentity(new OrchestratorIdentity().withType(ResourceIdentityType.NONE))
                                .withProperties(
                                    new OrchestratorResourceProperties()
                                        .withOrchestratorAppId("datqxhocdgeabl")
                                        .withOrchestratorTenantId("huticndvkao")
                                        .withClusterRootCA("yiftyhxhuro")
                                        .withApiServerEndpoint("tyxolniwpwc")
                                        .withPrivateLinkResourceId("jfkgiawxk")),
                            new OrchestratorInner()
                                .withLocation("aoyfhrtxilnerkuj")
                                .withTags(mapOf("juvf", "l", "jkcpr", "awrlyx", "nruj", "nwbxgjvtbvpyssz"))
                                .withKind(OrchestratorKind.KUBERNETES)
                                .withIdentity(new OrchestratorIdentity().withType(ResourceIdentityType.NONE))
                                .withProperties(
                                    new OrchestratorResourceProperties()
                                        .withOrchestratorAppId("tmut")
                                        .withOrchestratorTenantId("qktapspwgcuert")
                                        .withClusterRootCA("kdosvqw")
                                        .withApiServerEndpoint("mdgbbjfdd")
                                        .withPrivateLinkResourceId("bmbexppbhtqqro")),
                            new OrchestratorInner()
                                .withLocation("mdwzjeiachboo")
                                .withTags(mapOf("hzzvypyq", "nrosfqpte", "z", "i"))
                                .withKind(OrchestratorKind.KUBERNETES)
                                .withIdentity(new OrchestratorIdentity().withType(ResourceIdentityType.NONE))
                                .withProperties(
                                    new OrchestratorResourceProperties()
                                        .withOrchestratorAppId("idf")
                                        .withOrchestratorTenantId("wdzuhtymwisd")
                                        .withClusterRootCA("thwxmnteiwaopvkm")
                                        .withApiServerEndpoint("c")
                                        .withPrivateLinkResourceId("xdcu")),
                            new OrchestratorInner()
                                .withLocation("tqajzyulpkudjkrl")
                                .withTags(
                                    mapOf(
                                        "fepgzgq",
                                        "z",
                                        "ierhhbcsglummaj",
                                        "xzlocxscp",
                                        "odxobnbdxkqpxok",
                                        "j",
                                        "odgmaajrmvdjwz",
                                        "jionpimexgstxgc"))
                                .withKind(OrchestratorKind.KUBERNETES)
                                .withIdentity(new OrchestratorIdentity().withType(ResourceIdentityType.NONE))
                                .withProperties(
                                    new OrchestratorResourceProperties()
                                        .withOrchestratorAppId("nb")
                                        .withOrchestratorTenantId("qabnmoc")
                                        .withClusterRootCA("ysh")
                                        .withApiServerEndpoint("zafb")
                                        .withPrivateLinkResourceId("j"))));
        model = BinaryData.fromObject(model).toObject(Orchestrators.class);
        Assertions.assertEquals("qgoulznd", model.value().get(0).location());
        Assertions.assertEquals("wyqkgfgibm", model.value().get(0).tags().get("dgak"));
        Assertions.assertEquals(OrchestratorKind.KUBERNETES, model.value().get(0).kind());
        Assertions.assertEquals(ResourceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("datqxhocdgeabl", model.value().get(0).properties().orchestratorAppId());
        Assertions.assertEquals("huticndvkao", model.value().get(0).properties().orchestratorTenantId());
        Assertions.assertEquals("yiftyhxhuro", model.value().get(0).properties().clusterRootCA());
        Assertions.assertEquals("tyxolniwpwc", model.value().get(0).properties().apiServerEndpoint());
        Assertions.assertEquals("jfkgiawxk", model.value().get(0).properties().privateLinkResourceId());
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
