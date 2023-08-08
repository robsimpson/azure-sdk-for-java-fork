// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanSummaryCount;

public final class SavingsPlanSummaryCountTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SavingsPlanSummaryCount model =
            BinaryData
                .fromString(
                    "{\"succeededCount\":55.68268,\"failedCount\":26.599895,\"expiringCount\":49.174603,\"expiredCount\":96.57761,\"pendingCount\":46.781246,\"cancelledCount\":96.58485,\"processingCount\":13.069307,\"noBenefitCount\":35.734074,\"warningCount\":1.1998057}")
                .toObject(SavingsPlanSummaryCount.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SavingsPlanSummaryCount model = new SavingsPlanSummaryCount();
        model = BinaryData.fromObject(model).toObject(SavingsPlanSummaryCount.class);
    }
}
