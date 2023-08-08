// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerGtidSetParameter;
import org.junit.jupiter.api.Assertions;

public final class ServerGtidSetParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerGtidSetParameter model =
            BinaryData.fromString("{\"gtidSet\":\"esnzwde\"}").toObject(ServerGtidSetParameter.class);
        Assertions.assertEquals("esnzwde", model.gtidSet());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerGtidSetParameter model = new ServerGtidSetParameter().withGtidSet("esnzwde");
        model = BinaryData.fromObject(model).toObject(ServerGtidSetParameter.class);
        Assertions.assertEquals("esnzwde", model.gtidSet());
    }
}
