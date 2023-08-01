// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeModelInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class SubvolumeModelInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumeModelInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"zronasxift\",\"name\":\"qyzhf\",\"type\":\"esgogc\",\"properties\":{\"path\":\"nnxk\",\"parentPath\":\"gnyhmossxkkg\",\"size\":9095187098736304822,\"bytesUsed\":2090164582842967702,\"permissions\":\"bdhqxvcxgf\",\"creationTimeStamp\":\"2021-06-30T13:21:57Z\",\"accessedTimeStamp\":\"2021-09-30T11:14:42Z\",\"modifiedTimeStamp\":\"2021-01-30T17:11:05Z\",\"changedTimeStamp\":\"2021-05-03T16:15:22Z\",\"provisioningState\":\"nsvbuswdv\"}}")
                .toObject(SubvolumeModelInner.class);
        Assertions.assertEquals("nnxk", model.path());
        Assertions.assertEquals("gnyhmossxkkg", model.parentPath());
        Assertions.assertEquals(9095187098736304822L, model.size());
        Assertions.assertEquals(2090164582842967702L, model.bytesUsed());
        Assertions.assertEquals("bdhqxvcxgf", model.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-30T13:21:57Z"), model.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-30T11:14:42Z"), model.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-30T17:11:05Z"), model.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-03T16:15:22Z"), model.changedTimestamp());
        Assertions.assertEquals("nsvbuswdv", model.provisioningState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumeModelInner model =
            new SubvolumeModelInner()
                .withPath("nnxk")
                .withParentPath("gnyhmossxkkg")
                .withSize(9095187098736304822L)
                .withBytesUsed(2090164582842967702L)
                .withPermissions("bdhqxvcxgf")
                .withCreationTimestamp(OffsetDateTime.parse("2021-06-30T13:21:57Z"))
                .withAccessedTimestamp(OffsetDateTime.parse("2021-09-30T11:14:42Z"))
                .withModifiedTimestamp(OffsetDateTime.parse("2021-01-30T17:11:05Z"))
                .withChangedTimestamp(OffsetDateTime.parse("2021-05-03T16:15:22Z"))
                .withProvisioningState("nsvbuswdv");
        model = BinaryData.fromObject(model).toObject(SubvolumeModelInner.class);
        Assertions.assertEquals("nnxk", model.path());
        Assertions.assertEquals("gnyhmossxkkg", model.parentPath());
        Assertions.assertEquals(9095187098736304822L, model.size());
        Assertions.assertEquals(2090164582842967702L, model.bytesUsed());
        Assertions.assertEquals("bdhqxvcxgf", model.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-30T13:21:57Z"), model.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-30T11:14:42Z"), model.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-30T17:11:05Z"), model.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-03T16:15:22Z"), model.changedTimestamp());
        Assertions.assertEquals("nsvbuswdv", model.provisioningState());
    }
}
