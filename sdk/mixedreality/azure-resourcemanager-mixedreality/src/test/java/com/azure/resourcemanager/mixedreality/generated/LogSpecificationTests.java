// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mixedreality.models.LogSpecification;
import org.junit.jupiter.api.Assertions;

public final class LogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogSpecification model =
            BinaryData
                .fromString("{\"name\":\"dcuf\",\"displayName\":\"srp\",\"blobDuration\":\"zidnsezcxtbzsgfy\"}")
                .toObject(LogSpecification.class);
        Assertions.assertEquals("dcuf", model.name());
        Assertions.assertEquals("srp", model.displayName());
        Assertions.assertEquals("zidnsezcxtbzsgfy", model.blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogSpecification model =
            new LogSpecification().withName("dcuf").withDisplayName("srp").withBlobDuration("zidnsezcxtbzsgfy");
        model = BinaryData.fromObject(model).toObject(LogSpecification.class);
        Assertions.assertEquals("dcuf", model.name());
        Assertions.assertEquals("srp", model.displayName());
        Assertions.assertEquals("zidnsezcxtbzsgfy", model.blobDuration());
    }
}
