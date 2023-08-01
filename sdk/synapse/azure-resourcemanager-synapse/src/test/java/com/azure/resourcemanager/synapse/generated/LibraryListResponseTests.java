// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.LibraryResourceInner;
import com.azure.resourcemanager.synapse.models.LibraryListResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LibraryListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LibraryListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"name\":\"fwyfwlwxjwet\",\"path\":\"sihclafzvaylp\",\"containerName\":\"sqqw\",\"uploadedTimestamp\":\"2021-10-08T01:02:03Z\",\"type\":\"w\",\"provisioningStatus\":\"chcxwaxfewzj\",\"creatorId\":\"exfdeqvhpsylk\"},\"etag\":\"hkbffmbm\",\"id\":\"zjrgyww\",\"name\":\"gjxsnptfu\",\"type\":\"gicgaaoepttaq\"},{\"properties\":{\"name\":\"dewemxswv\",\"path\":\"unzzjgehk\",\"containerName\":\"imrt\",\"uploadedTimestamp\":\"2021-10-31T23:30:22Z\",\"type\":\"fqyinljqepqw\",\"provisioningStatus\":\"xmonstshi\",\"creatorId\":\"gvelfc\"},\"etag\":\"uccbirdsvuw\",\"id\":\"o\",\"name\":\"iegstm\",\"type\":\"inwjizcilngh\"}],\"nextLink\":\"h\"}")
                .toObject(LibraryListResponse.class);
        Assertions.assertEquals("fwyfwlwxjwet", model.value().get(0).namePropertiesName());
        Assertions.assertEquals("sihclafzvaylp", model.value().get(0).path());
        Assertions.assertEquals("sqqw", model.value().get(0).containerName());
        Assertions.assertEquals("w", model.value().get(0).typePropertiesType());
        Assertions.assertEquals("h", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LibraryListResponse model =
            new LibraryListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new LibraryResourceInner()
                                .withNamePropertiesName("fwyfwlwxjwet")
                                .withPath("sihclafzvaylp")
                                .withContainerName("sqqw")
                                .withTypePropertiesType("w"),
                            new LibraryResourceInner()
                                .withNamePropertiesName("dewemxswv")
                                .withPath("unzzjgehk")
                                .withContainerName("imrt")
                                .withTypePropertiesType("fqyinljqepqw")))
                .withNextLink("h");
        model = BinaryData.fromObject(model).toObject(LibraryListResponse.class);
        Assertions.assertEquals("fwyfwlwxjwet", model.value().get(0).namePropertiesName());
        Assertions.assertEquals("sihclafzvaylp", model.value().get(0).path());
        Assertions.assertEquals("sqqw", model.value().get(0).containerName());
        Assertions.assertEquals("w", model.value().get(0).typePropertiesType());
        Assertions.assertEquals("h", model.nextLink());
    }
}
