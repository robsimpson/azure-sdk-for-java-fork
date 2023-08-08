// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.models.CreateTrustedIdProviderWithAccountParameters;
import org.junit.jupiter.api.Assertions;

public final class CreateTrustedIdProviderWithAccountParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateTrustedIdProviderWithAccountParameters model =
            BinaryData
                .fromString("{\"name\":\"aeqjhqjbasvms\",\"properties\":{\"idProvider\":\"jqul\"}}")
                .toObject(CreateTrustedIdProviderWithAccountParameters.class);
        Assertions.assertEquals("aeqjhqjbasvms", model.name());
        Assertions.assertEquals("jqul", model.idProvider());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateTrustedIdProviderWithAccountParameters model =
            new CreateTrustedIdProviderWithAccountParameters().withName("aeqjhqjbasvms").withIdProvider("jqul");
        model = BinaryData.fromObject(model).toObject(CreateTrustedIdProviderWithAccountParameters.class);
        Assertions.assertEquals("aeqjhqjbasvms", model.name());
        Assertions.assertEquals("jqul", model.idProvider());
    }
}
