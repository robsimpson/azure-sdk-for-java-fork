// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.models.IdentityType;
import com.azure.resourcemanager.digitaltwins.models.ManagedIdentityReference;
import org.junit.jupiter.api.Assertions;

public final class ManagedIdentityReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedIdentityReference model =
            BinaryData
                .fromString("{\"type\":\"UserAssigned\",\"userAssignedIdentity\":\"hwxmnteiwa\"}")
                .toObject(ManagedIdentityReference.class);
        Assertions.assertEquals(IdentityType.USER_ASSIGNED, model.type());
        Assertions.assertEquals("hwxmnteiwa", model.userAssignedIdentity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedIdentityReference model =
            new ManagedIdentityReference().withType(IdentityType.USER_ASSIGNED).withUserAssignedIdentity("hwxmnteiwa");
        model = BinaryData.fromObject(model).toObject(ManagedIdentityReference.class);
        Assertions.assertEquals(IdentityType.USER_ASSIGNED, model.type());
        Assertions.assertEquals("hwxmnteiwa", model.userAssignedIdentity());
    }
}
