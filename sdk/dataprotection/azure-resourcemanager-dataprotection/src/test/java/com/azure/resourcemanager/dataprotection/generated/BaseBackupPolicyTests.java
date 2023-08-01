// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.BaseBackupPolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BaseBackupPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BaseBackupPolicy model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"BaseBackupPolicy\",\"datasourceTypes\":[\"vmezy\",\"shxmzsbbzoggigrx\",\"burvjxxjnspy\",\"ptkoenkoukn\"]}")
                .toObject(BaseBackupPolicy.class);
        Assertions.assertEquals("vmezy", model.datasourceTypes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BaseBackupPolicy model =
            new BaseBackupPolicy()
                .withDatasourceTypes(Arrays.asList("vmezy", "shxmzsbbzoggigrx", "burvjxxjnspy", "ptkoenkoukn"));
        model = BinaryData.fromObject(model).toObject(BaseBackupPolicy.class);
        Assertions.assertEquals("vmezy", model.datasourceTypes().get(0));
    }
}
