// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.ContentKeyPolicyInner;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyOption;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ContentKeyPolicyInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContentKeyPolicyInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"policyId\":\"4da702f2-8c84-4f1a-a467-dfc67a48c0d7\",\"created\":\"2021-09-03T17:59:20Z\",\"lastModified\":\"2021-10-17T19:30:49Z\",\"description\":\"rts\",\"options\":[{\"policyOptionId\":\"5a7c4e55-9bc6-4d6f-9b4f-ccda1de8fd47\",\"name\":\"kdeemaofmxagkvtm\"},{\"policyOptionId\":\"d33a70ba-68d8-4f15-b495-65a6363e35ec\",\"name\":\"qkrhahvljua\"},{\"policyOptionId\":\"d933a30b-c3ef-4541-aba4-45be3c661f9f\",\"name\":\"uhcdhm\"}]},\"id\":\"alaexqpvfadmwsrc\",\"name\":\"gvxp\",\"type\":\"gomz\"}")
                .toObject(ContentKeyPolicyInner.class);
        Assertions.assertEquals("rts", model.description());
        Assertions.assertEquals("kdeemaofmxagkvtm", model.options().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContentKeyPolicyInner model =
            new ContentKeyPolicyInner()
                .withDescription("rts")
                .withOptions(
                    Arrays
                        .asList(
                            new ContentKeyPolicyOption().withName("kdeemaofmxagkvtm"),
                            new ContentKeyPolicyOption().withName("qkrhahvljua"),
                            new ContentKeyPolicyOption().withName("uhcdhm")));
        model = BinaryData.fromObject(model).toObject(ContentKeyPolicyInner.class);
        Assertions.assertEquals("rts", model.description());
        Assertions.assertEquals("kdeemaofmxagkvtm", model.options().get(0).name());
    }
}
