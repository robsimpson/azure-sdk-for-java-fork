// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/** Samples for Products ListByBillingAccount. */
public final class ProductsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/ProductsListByBillingAccount.json
     */
    /**
     * Sample code: ProductsListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.products().listByBillingAccount("{billingAccountName}", null, com.azure.core.util.Context.NONE);
    }
}
