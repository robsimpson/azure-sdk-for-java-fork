// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.operationsmanagement.fluent.models.OperationInner;
import com.azure.resourcemanager.operationsmanagement.models.OperationDisplay;
import com.azure.resourcemanager.operationsmanagement.models.OperationListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"kbasyypn\",\"display\":{\"provider\":\"sgcbac\",\"resource\":\"ejk\",\"operation\":\"ynqgoulzndlikwyq\"}},{\"name\":\"fgibmadgakeq\",\"display\":{\"provider\":\"yb\",\"resource\":\"qedqytbciqfoufl\",\"operation\":\"nkzsmodmglou\"}},{\"name\":\"b\",\"display\":{\"provider\":\"mutduqktaps\",\"resource\":\"gcue\",\"operation\":\"umkdosvqwhbmd\"}}]}")
                .toObject(OperationListResult.class);
        Assertions.assertEquals("kbasyypn", model.value().get(0).name());
        Assertions.assertEquals("sgcbac", model.value().get(0).display().provider());
        Assertions.assertEquals("ejk", model.value().get(0).display().resource());
        Assertions.assertEquals("ynqgoulzndlikwyq", model.value().get(0).display().operation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model =
            new OperationListResult()
                .withValue(
                    Arrays
                        .asList(
                            new OperationInner()
                                .withName("kbasyypn")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("sgcbac")
                                        .withResource("ejk")
                                        .withOperation("ynqgoulzndlikwyq")),
                            new OperationInner()
                                .withName("fgibmadgakeq")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("yb")
                                        .withResource("qedqytbciqfoufl")
                                        .withOperation("nkzsmodmglou")),
                            new OperationInner()
                                .withName("b")
                                .withDisplay(
                                    new OperationDisplay()
                                        .withProvider("mutduqktaps")
                                        .withResource("gcue")
                                        .withOperation("umkdosvqwhbmd"))));
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals("kbasyypn", model.value().get(0).name());
        Assertions.assertEquals("sgcbac", model.value().get(0).display().provider());
        Assertions.assertEquals("ejk", model.value().get(0).display().resource());
        Assertions.assertEquals("ynqgoulzndlikwyq", model.value().get(0).display().operation());
    }
}
