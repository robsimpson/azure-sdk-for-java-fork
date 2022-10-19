// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DrillDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class DrillDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        DrillDatasetTypeProperties model = BinaryData.fromString("{}").toObject(DrillDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        DrillDatasetTypeProperties model = new DrillDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(DrillDatasetTypeProperties.class);
    }
}