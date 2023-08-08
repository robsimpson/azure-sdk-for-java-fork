// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Updating\",\"privateEndpoint\":{\"id\":\"fdatsc\"},\"groupIds\":[\"pjhulsuuvmkj\",\"zkrwfn\",\"iodjp\"],\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"jdpvwryo\",\"actionsRequired\":\"soacctazakl\"}},\"etag\":\"ahbc\",\"id\":\"yffdfdos\",\"name\":\"gexpaojakhmsbz\",\"type\":\"hcrzevd\"}")
                .toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("jdpvwryo", model.privateLinkServiceConnectionState().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionInner model =
            new PrivateEndpointConnectionInner()
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                        .withDescription("jdpvwryo"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("jdpvwryo", model.privateLinkServiceConnectionState().description());
    }
}
