// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.powerbidedicated.models.DedicatedCapacityAdministrators;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DedicatedCapacityAdministratorsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DedicatedCapacityAdministrators model =
            BinaryData
                .fromString(
                    "{\"members\":[\"cyzkohdbihanuf\",\"fcbjysagithxqha\",\"ifpikxwczby\",\"cnpqxuhivyqniwby\"]}")
                .toObject(DedicatedCapacityAdministrators.class);
        Assertions.assertEquals("cyzkohdbihanuf", model.members().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DedicatedCapacityAdministrators model =
            new DedicatedCapacityAdministrators()
                .withMembers(Arrays.asList("cyzkohdbihanuf", "fcbjysagithxqha", "ifpikxwczby", "cnpqxuhivyqniwby"));
        model = BinaryData.fromObject(model).toObject(DedicatedCapacityAdministrators.class);
        Assertions.assertEquals("cyzkohdbihanuf", model.members().get(0));
    }
}
