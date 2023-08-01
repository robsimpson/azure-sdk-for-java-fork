// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.CloudServicesNetworkPatchProperties;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkEnableDefaultEgressEndpoints;
import com.azure.resourcemanager.networkcloud.models.EgressEndpoint;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CloudServicesNetworkPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudServicesNetworkPatchProperties model =
            BinaryData
                .fromString(
                    "{\"additionalEgressEndpoints\":[{\"category\":\"xvodhtnsir\",\"endpoints\":[]}],\"enableDefaultEgressEndpoints\":\"True\"}")
                .toObject(CloudServicesNetworkPatchProperties.class);
        Assertions.assertEquals("xvodhtnsir", model.additionalEgressEndpoints().get(0).category());
        Assertions
            .assertEquals(CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE, model.enableDefaultEgressEndpoints());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudServicesNetworkPatchProperties model =
            new CloudServicesNetworkPatchProperties()
                .withAdditionalEgressEndpoints(
                    Arrays.asList(new EgressEndpoint().withCategory("xvodhtnsir").withEndpoints(Arrays.asList())))
                .withEnableDefaultEgressEndpoints(CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE);
        model = BinaryData.fromObject(model).toObject(CloudServicesNetworkPatchProperties.class);
        Assertions.assertEquals("xvodhtnsir", model.additionalEgressEndpoints().get(0).category());
        Assertions
            .assertEquals(CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE, model.enableDefaultEgressEndpoints());
    }
}
