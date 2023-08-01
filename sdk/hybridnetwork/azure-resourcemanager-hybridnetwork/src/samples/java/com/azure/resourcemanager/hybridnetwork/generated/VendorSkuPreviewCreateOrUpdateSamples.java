// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

/** Samples for VendorSkuPreview CreateOrUpdate. */
public final class VendorSkuPreviewCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2021-05-01/examples/VendorSkuPreviewCreate.json
     */
    /**
     * Sample code: Create or update preview subscription of vendor sku sub resource.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void createOrUpdatePreviewSubscriptionOfVendorSkuSubResource(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.vendorSkuPreviews().define("previewSub").withExistingVendorSku("TestVendor", "TestSku").create();
    }
}
