// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

/** Samples for QuotaRequestStatus Get. */
public final class QuotaRequestStatusGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getQuotaRequestStatusFailed.json
     */
    /**
     * Sample code: QuotaRequestFailed.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotaRequestFailed(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotaRequestStatus()
            .getWithResponse(
                "2B5C8515-37D8-4B6A-879B-CD641A2CF605",
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Compute/locations/eastus",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getQuotaRequestStatusById.json
     */
    /**
     * Sample code: QuotaRequestStatus.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotaRequestStatus(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotaRequestStatus()
            .getWithResponse(
                "2B5C8515-37D8-4B6A-879B-CD641A2CF605",
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Compute/locations/eastus",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getQuotaRequestStatusInProgress.json
     */
    /**
     * Sample code: QuotaRequestInProgress.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotaRequestInProgress(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotaRequestStatus()
            .getWithResponse(
                "2B5C8515-37D8-4B6A-879B-CD641A2CF605",
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Compute/locations/eastus",
                com.azure.core.util.Context.NONE);
    }
}
