// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.StorageEditionCapability;

public final class StorageEditionCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageEditionCapability model =
            BinaryData
                .fromString(
                    "{\"name\":\"cspkwlhzdobpxjmf\",\"minStorageSize\":885653517533476770,\"maxStorageSize\":6115186458339394637,\"minBackupRetentionDays\":5158769929678256713,\"maxBackupRetentionDays\":8269509488732598965}")
                .toObject(StorageEditionCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageEditionCapability model = new StorageEditionCapability();
        model = BinaryData.fromObject(model).toObject(StorageEditionCapability.class);
    }
}
