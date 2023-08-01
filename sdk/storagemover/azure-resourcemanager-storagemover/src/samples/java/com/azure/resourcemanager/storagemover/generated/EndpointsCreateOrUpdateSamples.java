// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.resourcemanager.storagemover.models.EndpointBaseProperties;

/** Samples for Endpoints CreateOrUpdate. */
public final class EndpointsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/preview/2023-07-01-preview/examples/Endpoints_CreateOrUpdate_AzureStorageBlobContainer.json
     */
    /**
     * Sample code: Endpoints_CreateOrUpdate_AzureStorageBlobContainer.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void endpointsCreateOrUpdateAzureStorageBlobContainer(
        com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager
            .endpoints()
            .define("examples-endpointName")
            .withExistingStorageMover("examples-rg", "examples-storageMoverName")
            .withProperties((EndpointBaseProperties) null)
            .create();
    }

    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/preview/2023-07-01-preview/examples/Endpoints_CreateOrUpdate_NfsMount.json
     */
    /**
     * Sample code: Endpoints_CreateOrUpdate_NfsMount.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void endpointsCreateOrUpdateNfsMount(
        com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager
            .endpoints()
            .define("examples-endpointName")
            .withExistingStorageMover("examples-rg", "examples-storageMoverName")
            .withProperties((EndpointBaseProperties) null)
            .create();
    }

    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/preview/2023-07-01-preview/examples/Endpoints_CreateOrUpdate_AzureStorageSmbFileShare.json
     */
    /**
     * Sample code: Endpoints_CreateOrUpdate_AzureStorageSmbFileShare.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void endpointsCreateOrUpdateAzureStorageSmbFileShare(
        com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager
            .endpoints()
            .define("examples-endpointName")
            .withExistingStorageMover("examples-rg", "examples-storageMoverName")
            .withProperties((EndpointBaseProperties) null)
            .create();
    }

    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/preview/2023-07-01-preview/examples/Endpoints_CreateOrUpdate_SmbMount.json
     */
    /**
     * Sample code: Endpoints_CreateOrUpdate_SmbMount.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void endpointsCreateOrUpdateSmbMount(
        com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager
            .endpoints()
            .define("examples-endpointName")
            .withExistingStorageMover("examples-rg", "examples-storageMoverName")
            .withProperties((EndpointBaseProperties) null)
            .create();
    }
}
