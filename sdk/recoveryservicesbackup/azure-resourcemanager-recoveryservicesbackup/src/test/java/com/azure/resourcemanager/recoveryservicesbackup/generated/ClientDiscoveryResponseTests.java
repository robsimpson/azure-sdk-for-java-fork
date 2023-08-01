// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ClientDiscoveryValueForSingleApiInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ClientDiscoveryDisplay;
import com.azure.resourcemanager.recoveryservicesbackup.models.ClientDiscoveryForProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.ClientDiscoveryResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClientDiscoveryResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientDiscoveryResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"cph\",\"display\":{\"provider\":\"ot\",\"resource\":\"qgoulznd\",\"operation\":\"kwy\",\"description\":\"gfgibm\"},\"origin\":\"gakeqsr\",\"properties\":{}},{\"name\":\"qqedqytbciqfou\",\"display\":{\"provider\":\"mnkzsmod\",\"resource\":\"lougpbkw\",\"operation\":\"utduqktapspwgcu\",\"description\":\"tumkdosvqwhbm\"},\"origin\":\"bbjfddgmbmbexp\",\"properties\":{}},{\"name\":\"q\",\"display\":{\"provider\":\"lfp\",\"resource\":\"s\",\"operation\":\"gbquxigj\",\"description\":\"gzjaoyfhrtxilne\"},\"origin\":\"ujysvle\",\"properties\":{}}],\"nextLink\":\"qawrlyxwj\"}")
                .toObject(ClientDiscoveryResponse.class);
        Assertions.assertEquals("cph", model.value().get(0).name());
        Assertions.assertEquals("ot", model.value().get(0).display().provider());
        Assertions.assertEquals("qgoulznd", model.value().get(0).display().resource());
        Assertions.assertEquals("kwy", model.value().get(0).display().operation());
        Assertions.assertEquals("gfgibm", model.value().get(0).display().description());
        Assertions.assertEquals("gakeqsr", model.value().get(0).origin());
        Assertions.assertEquals("qawrlyxwj", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientDiscoveryResponse model =
            new ClientDiscoveryResponse()
                .withValue(
                    Arrays
                        .asList(
                            new ClientDiscoveryValueForSingleApiInner()
                                .withName("cph")
                                .withDisplay(
                                    new ClientDiscoveryDisplay()
                                        .withProvider("ot")
                                        .withResource("qgoulznd")
                                        .withOperation("kwy")
                                        .withDescription("gfgibm"))
                                .withOrigin("gakeqsr")
                                .withProperties(new ClientDiscoveryForProperties()),
                            new ClientDiscoveryValueForSingleApiInner()
                                .withName("qqedqytbciqfou")
                                .withDisplay(
                                    new ClientDiscoveryDisplay()
                                        .withProvider("mnkzsmod")
                                        .withResource("lougpbkw")
                                        .withOperation("utduqktapspwgcu")
                                        .withDescription("tumkdosvqwhbm"))
                                .withOrigin("bbjfddgmbmbexp")
                                .withProperties(new ClientDiscoveryForProperties()),
                            new ClientDiscoveryValueForSingleApiInner()
                                .withName("q")
                                .withDisplay(
                                    new ClientDiscoveryDisplay()
                                        .withProvider("lfp")
                                        .withResource("s")
                                        .withOperation("gbquxigj")
                                        .withDescription("gzjaoyfhrtxilne"))
                                .withOrigin("ujysvle")
                                .withProperties(new ClientDiscoveryForProperties())))
                .withNextLink("qawrlyxwj");
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryResponse.class);
        Assertions.assertEquals("cph", model.value().get(0).name());
        Assertions.assertEquals("ot", model.value().get(0).display().provider());
        Assertions.assertEquals("qgoulznd", model.value().get(0).display().resource());
        Assertions.assertEquals("kwy", model.value().get(0).display().operation());
        Assertions.assertEquals("gfgibm", model.value().get(0).display().description());
        Assertions.assertEquals("gakeqsr", model.value().get(0).origin());
        Assertions.assertEquals("qawrlyxwj", model.nextLink());
    }
}
