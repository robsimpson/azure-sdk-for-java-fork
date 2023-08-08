// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.StorageEditionCapability;

public final class StorageEditionCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageEditionCapability model =
            BinaryData
                .fromString(
                    "{\"name\":\"ndlik\",\"defaultStorageSizeMb\":1140250228405168,\"supportedStorageMb\":[{\"supportedIops\":1579471908,\"storageSizeMb\":5040157276386873949,\"defaultIopsTier\":\"gakeqsr\",\"supportedIopsTiers\":[],\"status\":\"Disabled\",\"reason\":\"e\"},{\"supportedIops\":792536973,\"storageSizeMb\":2124589833110260151,\"defaultIopsTier\":\"qfou\",\"supportedIopsTiers\":[],\"status\":\"Default\",\"reason\":\"zsm\"},{\"supportedIops\":269319267,\"storageSizeMb\":8123559733432006834,\"defaultIopsTier\":\"gpbkwtmut\",\"supportedIopsTiers\":[],\"status\":\"Visible\",\"reason\":\"pspwgcuertu\"}],\"status\":\"Disabled\",\"reason\":\"svqwhbmdgbbjfd\"}")
                .toObject(StorageEditionCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageEditionCapability model = new StorageEditionCapability();
        model = BinaryData.fromObject(model).toObject(StorageEditionCapability.class);
    }
}
