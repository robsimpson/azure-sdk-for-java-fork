// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.SchemaComparisonValidationResultType;

public final class SchemaComparisonValidationResultTypeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SchemaComparisonValidationResultType model =
            BinaryData
                .fromString(
                    "{\"objectName\":\"rpgogtqxep\",\"objectType\":\"StoredProcedures\",\"updateAction\":\"ChangedOnTarget\"}")
                .toObject(SchemaComparisonValidationResultType.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SchemaComparisonValidationResultType model = new SchemaComparisonValidationResultType();
        model = BinaryData.fromObject(model).toObject(SchemaComparisonValidationResultType.class);
    }
}
