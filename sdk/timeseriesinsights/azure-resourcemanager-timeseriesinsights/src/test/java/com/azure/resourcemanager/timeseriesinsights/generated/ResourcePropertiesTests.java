// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.timeseriesinsights.models.ResourceProperties;

public final class ResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceProperties model =
            BinaryData
                .fromString("{\"provisioningState\":\"Failed\",\"creationTime\":\"2021-01-31T06:13:45Z\"}")
                .toObject(ResourceProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceProperties model = new ResourceProperties();
        model = BinaryData.fromObject(model).toObject(ResourceProperties.class);
    }
}
