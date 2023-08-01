// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.PrefixListGlobalRulestackResourceInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrefixListGlobalRulestackResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrefixListGlobalRulestackResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"kdltfzxmhhvhg\",\"prefixList\":[\"eodkwobda\"],\"etag\":\"tibqdxbxwakb\",\"auditComment\":\"qxn\",\"provisioningState\":\"Failed\"},\"id\":\"gxhuriplbp\",\"name\":\"dxunkbebxmubyyn\",\"type\":\"wlrbqtkoievseo\"}")
                .toObject(PrefixListGlobalRulestackResourceInner.class);
        Assertions.assertEquals("kdltfzxmhhvhg", model.description());
        Assertions.assertEquals("eodkwobda", model.prefixList().get(0));
        Assertions.assertEquals("tibqdxbxwakb", model.etag());
        Assertions.assertEquals("qxn", model.auditComment());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrefixListGlobalRulestackResourceInner model =
            new PrefixListGlobalRulestackResourceInner()
                .withDescription("kdltfzxmhhvhg")
                .withPrefixList(Arrays.asList("eodkwobda"))
                .withEtag("tibqdxbxwakb")
                .withAuditComment("qxn");
        model = BinaryData.fromObject(model).toObject(PrefixListGlobalRulestackResourceInner.class);
        Assertions.assertEquals("kdltfzxmhhvhg", model.description());
        Assertions.assertEquals("eodkwobda", model.prefixList().get(0));
        Assertions.assertEquals("tibqdxbxwakb", model.etag());
        Assertions.assertEquals("qxn", model.auditComment());
    }
}
