// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtectionForUpdate;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtectionState;
import org.junit.jupiter.api.Assertions;

public final class AdvancedThreatProtectionForUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdvancedThreatProtectionForUpdate model = BinaryData.fromString("{\"properties\":{\"state\":\"Enabled\"}}")
            .toObject(AdvancedThreatProtectionForUpdate.class);
        Assertions.assertEquals(AdvancedThreatProtectionState.ENABLED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdvancedThreatProtectionForUpdate model
            = new AdvancedThreatProtectionForUpdate().withState(AdvancedThreatProtectionState.ENABLED);
        model = BinaryData.fromObject(model).toObject(AdvancedThreatProtectionForUpdate.class);
        Assertions.assertEquals(AdvancedThreatProtectionState.ENABLED, model.state());
    }
}
