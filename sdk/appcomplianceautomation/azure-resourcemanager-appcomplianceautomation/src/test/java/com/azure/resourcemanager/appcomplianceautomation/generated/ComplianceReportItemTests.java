// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.ComplianceReportItem;
import org.junit.jupiter.api.Test;

public final class ComplianceReportItemTests {
    @Test
    public void testDeserialize() {
        ComplianceReportItem model =
            BinaryData
                .fromString(
                    "{\"categoryName\":\"pnazzm\",\"controlId\":\"runmp\",\"controlName\":\"tdbhrbnla\",\"controlType\":\"FullyAutomated\",\"complianceState\":\"Healthy\",\"policyId\":\"k\",\"policyDisplayName\":\"henbtkcxywnytn\",\"policyDescription\":\"yn\",\"subscriptionId\":\"idybyxczf\",\"resourceGroup\":\"haaxdbabphl\",\"resourceType\":\"qlfktsths\",\"resourceId\":\"ocmnyyazttbtwwrq\",\"statusChangeDate\":\"edckzywbiexzfey\"}")
                .toObject(ComplianceReportItem.class);
    }

    @Test
    public void testSerialize() {
        ComplianceReportItem model = new ComplianceReportItem();
        model = BinaryData.fromObject(model).toObject(ComplianceReportItem.class);
    }
}
