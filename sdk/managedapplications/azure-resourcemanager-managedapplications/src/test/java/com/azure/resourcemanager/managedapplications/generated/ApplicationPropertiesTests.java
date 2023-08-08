// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.fluent.models.ApplicationProperties;
import org.junit.jupiter.api.Assertions;

public final class ApplicationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationProperties model =
            BinaryData
                .fromString(
                    "{\"managedResourceGroupId\":\"tijbpzvgnwzsymgl\",\"applicationDefinitionId\":\"fcyzkohdbihanufh\",\"parameters\":\"databj\",\"outputs\":\"dataa\",\"provisioningState\":\"Updating\"}")
                .toObject(ApplicationProperties.class);
        Assertions.assertEquals("tijbpzvgnwzsymgl", model.managedResourceGroupId());
        Assertions.assertEquals("fcyzkohdbihanufh", model.applicationDefinitionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationProperties model =
            new ApplicationProperties()
                .withManagedResourceGroupId("tijbpzvgnwzsymgl")
                .withApplicationDefinitionId("fcyzkohdbihanufh")
                .withParameters("databj");
        model = BinaryData.fromObject(model).toObject(ApplicationProperties.class);
        Assertions.assertEquals("tijbpzvgnwzsymgl", model.managedResourceGroupId());
        Assertions.assertEquals("fcyzkohdbihanufh", model.applicationDefinitionId());
    }
}
