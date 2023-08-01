// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.models.ErrorInfo;

public final class ErrorInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ErrorInfo model = BinaryData.fromString("{\"innererror\":\"vfqawrlyxwjkcpr\"}").toObject(ErrorInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ErrorInfo model = new ErrorInfo();
        model = BinaryData.fromObject(model).toObject(ErrorInfo.class);
    }
}
