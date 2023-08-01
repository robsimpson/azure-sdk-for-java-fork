// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/** Samples for BillingPeriods Get. */
public final class BillingPeriodsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/preview/2018-03-01-preview/examples/BillingPeriodsGet.json
     */
    /**
     * Sample code: BillingPeriodsGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingPeriodsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingPeriods().getWithResponse("201702-1", com.azure.core.util.Context.NONE);
    }
}
