// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.FlowEndpoints;
import com.azure.resourcemanager.logic.models.IpAddress;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FlowEndpointsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FlowEndpoints model =
            BinaryData
                .fromString(
                    "{\"outgoingIpAddresses\":[{\"address\":\"hmuouqfprwzwbn\"},{\"address\":\"itnwuizgazxufi\"},{\"address\":\"ckyfih\"}],\"accessEndpointIpAddresses\":[{\"address\":\"fvzwdzuhty\"}]}")
                .toObject(FlowEndpoints.class);
        Assertions.assertEquals("hmuouqfprwzwbn", model.outgoingIpAddresses().get(0).address());
        Assertions.assertEquals("fvzwdzuhty", model.accessEndpointIpAddresses().get(0).address());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FlowEndpoints model =
            new FlowEndpoints()
                .withOutgoingIpAddresses(
                    Arrays
                        .asList(
                            new IpAddress().withAddress("hmuouqfprwzwbn"),
                            new IpAddress().withAddress("itnwuizgazxufi"),
                            new IpAddress().withAddress("ckyfih")))
                .withAccessEndpointIpAddresses(Arrays.asList(new IpAddress().withAddress("fvzwdzuhty")));
        model = BinaryData.fromObject(model).toObject(FlowEndpoints.class);
        Assertions.assertEquals("hmuouqfprwzwbn", model.outgoingIpAddresses().get(0).address());
        Assertions.assertEquals("fvzwdzuhty", model.accessEndpointIpAddresses().get(0).address());
    }
}
