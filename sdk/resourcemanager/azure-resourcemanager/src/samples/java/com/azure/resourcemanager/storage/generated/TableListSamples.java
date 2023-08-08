// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;

/** Samples for Table List. */
public final class TableListSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2022-09-01/examples/TableOperationList.json
     */
    /**
     * Sample code: TableOperationList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void tableOperationList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.storageAccounts().manager().serviceClient().getTables().list("res9290", "sto328", Context.NONE);
    }
}
