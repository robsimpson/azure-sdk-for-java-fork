// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateInVMValidator;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplateInVMValidatorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplateInVMValidator model =
            BinaryData
                .fromString("{\"type\":\"ImageTemplateInVMValidator\",\"name\":\"lthqtrgqjbp\"}")
                .toObject(ImageTemplateInVMValidator.class);
        Assertions.assertEquals("lthqtrgqjbp", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplateInVMValidator model = new ImageTemplateInVMValidator().withName("lthqtrgqjbp");
        model = BinaryData.fromObject(model).toObject(ImageTemplateInVMValidator.class);
        Assertions.assertEquals("lthqtrgqjbp", model.name());
    }
}
