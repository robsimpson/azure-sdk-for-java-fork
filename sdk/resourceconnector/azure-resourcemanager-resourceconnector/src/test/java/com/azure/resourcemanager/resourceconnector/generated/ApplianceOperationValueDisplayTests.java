// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourceconnector.fluent.models.ApplianceOperationValueDisplay;

public final class ApplianceOperationValueDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplianceOperationValueDisplay model =
            BinaryData
                .fromString(
                    "{\"description\":\"o\",\"operation\":\"dkfo\",\"provider\":\"nygj\",\"resource\":\"jddeqsrdeupewnw\"}")
                .toObject(ApplianceOperationValueDisplay.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplianceOperationValueDisplay model = new ApplianceOperationValueDisplay();
        model = BinaryData.fromObject(model).toObject(ApplianceOperationValueDisplay.class);
    }
}
