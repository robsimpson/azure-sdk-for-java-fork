// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.AuthorizeRequest;
import org.junit.jupiter.api.Assertions;

public final class AuthorizeRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AuthorizeRequest model =
            BinaryData.fromString("{\"remoteVolumeResourceId\":\"dneu\"}").toObject(AuthorizeRequest.class);
        Assertions.assertEquals("dneu", model.remoteVolumeResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AuthorizeRequest model = new AuthorizeRequest().withRemoteVolumeResourceId("dneu");
        model = BinaryData.fromObject(model).toObject(AuthorizeRequest.class);
        Assertions.assertEquals("dneu", model.remoteVolumeResourceId());
    }
}
