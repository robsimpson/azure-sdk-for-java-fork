// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.BenefitUtilizationSummariesListResult;

public final class BenefitUtilizationSummariesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BenefitUtilizationSummariesListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"kind\":\"BenefitUtilizationSummary\",\"id\":\"thtywub\",\"name\":\"cbihwqk\",\"type\":\"fdntwjchrdgoih\"},{\"kind\":\"BenefitUtilizationSummary\",\"id\":\"umwctondz\",\"name\":\"luudfdlwggytsb\",\"type\":\"tov\"}],\"nextLink\":\"gseinq\"}")
                .toObject(BenefitUtilizationSummariesListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BenefitUtilizationSummariesListResult model = new BenefitUtilizationSummariesListResult();
        model = BinaryData.fromObject(model).toObject(BenefitUtilizationSummariesListResult.class);
    }
}
