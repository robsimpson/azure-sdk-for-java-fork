// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.ValidationError;

public final class ValidationErrorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidationError model =
            BinaryData
                .fromString("{\"text\":\"uunnoxyhkxgqdd\",\"severity\":\"Warning\"}")
                .toObject(ValidationError.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidationError model = new ValidationError();
        model = BinaryData.fromObject(model).toObject(ValidationError.class);
    }
}
