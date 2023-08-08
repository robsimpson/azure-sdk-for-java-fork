// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityReason;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityResponseInner model =
            BinaryData
                .fromString("{\"nameAvailable\":true,\"reason\":\"Invalid\",\"message\":\"ghkjeszzhbi\"}")
                .toObject(CheckNameAvailabilityResponseInner.class);
        Assertions.assertEquals(true, model.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.INVALID, model.reason());
        Assertions.assertEquals("ghkjeszzhbi", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityResponseInner model =
            new CheckNameAvailabilityResponseInner()
                .withNameAvailable(true)
                .withReason(CheckNameAvailabilityReason.INVALID)
                .withMessage("ghkjeszzhbi");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityResponseInner.class);
        Assertions.assertEquals(true, model.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.INVALID, model.reason());
        Assertions.assertEquals("ghkjeszzhbi", model.message());
    }
}
