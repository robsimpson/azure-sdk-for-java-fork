// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.PartnerClientAuthentication;
import com.azure.resourcemanager.eventgrid.models.WebhookUpdatePartnerDestinationInfo;
import org.junit.jupiter.api.Assertions;

public final class WebhookUpdatePartnerDestinationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebhookUpdatePartnerDestinationInfo model = BinaryData.fromString(
            "{\"endpointType\":\"WebHook\",\"properties\":{\"endpointUrl\":\"srhkhgsnxuwwkpph\",\"endpointBaseUrl\":\"sbzxl\",\"clientAuthentication\":{\"clientAuthenticationType\":\"PartnerClientAuthentication\"}}}")
            .toObject(WebhookUpdatePartnerDestinationInfo.class);
        Assertions.assertEquals("srhkhgsnxuwwkpph", model.endpointUrl());
        Assertions.assertEquals("sbzxl", model.endpointBaseUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebhookUpdatePartnerDestinationInfo model
            = new WebhookUpdatePartnerDestinationInfo().withEndpointUrl("srhkhgsnxuwwkpph")
                .withEndpointBaseUrl("sbzxl")
                .withClientAuthentication(new PartnerClientAuthentication());
        model = BinaryData.fromObject(model).toObject(WebhookUpdatePartnerDestinationInfo.class);
        Assertions.assertEquals("srhkhgsnxuwwkpph", model.endpointUrl());
        Assertions.assertEquals("sbzxl", model.endpointBaseUrl());
    }
}
