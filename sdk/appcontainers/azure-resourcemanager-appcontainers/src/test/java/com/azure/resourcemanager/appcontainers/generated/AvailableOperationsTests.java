// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.OperationDetailInner;
import com.azure.resourcemanager.appcontainers.models.AvailableOperations;
import com.azure.resourcemanager.appcontainers.models.OperationDisplay;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AvailableOperationsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableOperations model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"cknfnwmbtmvpd\",\"isDataAction\":true,\"display\":{\"provider\":\"tzaefedx\",\"resource\":\"ch\",\"operation\":\"hk\",\"description\":\"rjdqnsdfzp\"},\"origin\":\"tg\"}],\"nextLink\":\"lkdghr\"}")
                .toObject(AvailableOperations.class);
        Assertions.assertEquals("cknfnwmbtmvpd", model.value().get(0).name());
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("tzaefedx", model.value().get(0).display().provider());
        Assertions.assertEquals("ch", model.value().get(0).display().resource());
        Assertions.assertEquals("hk", model.value().get(0).display().operation());
        Assertions.assertEquals("rjdqnsdfzp", model.value().get(0).display().description());
        Assertions.assertEquals("tg", model.value().get(0).origin());
        Assertions.assertEquals("lkdghr", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableOperations model =
            new AvailableOperations()
                .withValue(
                    Arrays
                        .asList(
                            new OperationDetailInner()
                                .withName("cknfnwmbtmvpd")
                                .withIsDataAction(true)
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("tzaefedx")
                                        .withResource("ch")
                                        .withOperation("hk")
                                        .withDescription("rjdqnsdfzp"))
                                .withOrigin("tg")))
                .withNextLink("lkdghr");
        model = BinaryData.fromObject(model).toObject(AvailableOperations.class);
        Assertions.assertEquals("cknfnwmbtmvpd", model.value().get(0).name());
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("tzaefedx", model.value().get(0).display().provider());
        Assertions.assertEquals("ch", model.value().get(0).display().resource());
        Assertions.assertEquals("hk", model.value().get(0).display().operation());
        Assertions.assertEquals("rjdqnsdfzp", model.value().get(0).display().description());
        Assertions.assertEquals("tg", model.value().get(0).origin());
        Assertions.assertEquals("lkdghr", model.nextLink());
    }
}
