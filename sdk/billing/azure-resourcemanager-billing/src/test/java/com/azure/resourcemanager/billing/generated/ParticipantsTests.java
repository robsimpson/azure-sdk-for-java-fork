// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.Participants;

public final class ParticipantsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Participants model =
            BinaryData
                .fromString("{\"status\":\"ork\",\"statusDate\":\"2021-07-22T12:33Z\",\"email\":\"wjhhgdnhxmsivf\"}")
                .toObject(Participants.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Participants model = new Participants();
        model = BinaryData.fromObject(model).toObject(Participants.class);
    }
}
