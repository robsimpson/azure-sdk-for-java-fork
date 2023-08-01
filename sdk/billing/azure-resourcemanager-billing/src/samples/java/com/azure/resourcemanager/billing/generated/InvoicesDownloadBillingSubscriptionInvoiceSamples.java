// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/** Samples for Invoices DownloadBillingSubscriptionInvoice. */
public final class InvoicesDownloadBillingSubscriptionInvoiceSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/BillingSubscriptionInvoiceDownload.json
     */
    /**
     * Sample code: BillingSubscriptionInvoiceDownload.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionInvoiceDownload(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .downloadBillingSubscriptionInvoice("{invoiceName}", "DRS_12345", com.azure.core.util.Context.NONE);
    }
}
