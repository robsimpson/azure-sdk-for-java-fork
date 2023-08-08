// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlInstanceSettings;
import org.junit.jupiter.api.Assertions;

public final class SqlInstanceSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlInstanceSettings model =
            BinaryData
                .fromString(
                    "{\"collation\":\"sqpjhvmdajvn\",\"maxDop\":179610144,\"isOptimizeForAdHocWorkloadsEnabled\":true,\"minServerMemoryMB\":104525492,\"maxServerMemoryMB\":97546857,\"isLpimEnabled\":true,\"isIfiEnabled\":true}")
                .toObject(SqlInstanceSettings.class);
        Assertions.assertEquals("sqpjhvmdajvn", model.collation());
        Assertions.assertEquals(179610144, model.maxDop());
        Assertions.assertEquals(true, model.isOptimizeForAdHocWorkloadsEnabled());
        Assertions.assertEquals(104525492, model.minServerMemoryMB());
        Assertions.assertEquals(97546857, model.maxServerMemoryMB());
        Assertions.assertEquals(true, model.isLpimEnabled());
        Assertions.assertEquals(true, model.isIfiEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlInstanceSettings model =
            new SqlInstanceSettings()
                .withCollation("sqpjhvmdajvn")
                .withMaxDop(179610144)
                .withIsOptimizeForAdHocWorkloadsEnabled(true)
                .withMinServerMemoryMB(104525492)
                .withMaxServerMemoryMB(97546857)
                .withIsLpimEnabled(true)
                .withIsIfiEnabled(true);
        model = BinaryData.fromObject(model).toObject(SqlInstanceSettings.class);
        Assertions.assertEquals("sqpjhvmdajvn", model.collation());
        Assertions.assertEquals(179610144, model.maxDop());
        Assertions.assertEquals(true, model.isOptimizeForAdHocWorkloadsEnabled());
        Assertions.assertEquals(104525492, model.minServerMemoryMB());
        Assertions.assertEquals(97546857, model.maxServerMemoryMB());
        Assertions.assertEquals(true, model.isLpimEnabled());
        Assertions.assertEquals(true, model.isIfiEnabled());
    }
}
