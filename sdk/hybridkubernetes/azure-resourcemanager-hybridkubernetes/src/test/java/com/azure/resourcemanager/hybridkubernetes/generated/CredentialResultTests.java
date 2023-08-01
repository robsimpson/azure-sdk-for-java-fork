// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridkubernetes.models.CredentialResult;

public final class CredentialResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CredentialResult model = BinaryData.fromString("{\"name\":\"ajpsquc\"}").toObject(CredentialResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CredentialResult model = new CredentialResult();
        model = BinaryData.fromObject(model).toObject(CredentialResult.class);
    }
}
