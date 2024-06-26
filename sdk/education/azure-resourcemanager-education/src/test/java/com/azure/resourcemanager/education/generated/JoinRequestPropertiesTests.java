// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.education.fluent.models.JoinRequestProperties;
import com.azure.resourcemanager.education.models.JoinRequestStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class JoinRequestPropertiesTests {
    @Test
    public void testDeserialize() {
        JoinRequestProperties model =
            BinaryData
                .fromString(
                    "{\"firstName\":\"olniwpwcukjf\",\"lastName\":\"iawxklry\",\"email\":\"wckbasyypnd\",\"status\":\"Pending\"}")
                .toObject(JoinRequestProperties.class);
        Assertions.assertEquals("olniwpwcukjf", model.firstName());
        Assertions.assertEquals("iawxklry", model.lastName());
        Assertions.assertEquals("wckbasyypnd", model.email());
        Assertions.assertEquals(JoinRequestStatus.PENDING, model.status());
    }

    @Test
    public void testSerialize() {
        JoinRequestProperties model =
            new JoinRequestProperties()
                .withFirstName("olniwpwcukjf")
                .withLastName("iawxklry")
                .withEmail("wckbasyypnd")
                .withStatus(JoinRequestStatus.PENDING);
        model = BinaryData.fromObject(model).toObject(JoinRequestProperties.class);
        Assertions.assertEquals("olniwpwcukjf", model.firstName());
        Assertions.assertEquals("iawxklry", model.lastName());
        Assertions.assertEquals("wckbasyypnd", model.email());
        Assertions.assertEquals(JoinRequestStatus.PENDING, model.status());
    }
}
