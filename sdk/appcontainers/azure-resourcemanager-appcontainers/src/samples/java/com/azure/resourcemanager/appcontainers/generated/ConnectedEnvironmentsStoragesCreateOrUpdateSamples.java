// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.resourcemanager.appcontainers.models.AccessMode;
import com.azure.resourcemanager.appcontainers.models.AzureFileProperties;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentStorageProperties;

/** Samples for ConnectedEnvironmentsStorages CreateOrUpdate. */
public final class ConnectedEnvironmentsStoragesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-11-01-preview/examples/ConnectedEnvironmentsStorages_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update environments storage.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateEnvironmentsStorage(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsStorages()
            .define("jlaw-demo1")
            .withExistingConnectedEnvironment("examplerg", "env")
            .withProperties(
                new ConnectedEnvironmentStorageProperties()
                    .withAzureFile(
                        new AzureFileProperties()
                            .withAccountName("account1")
                            .withAccountKey("fakeTokenPlaceholder")
                            .withAccessMode(AccessMode.READ_ONLY)
                            .withShareName("share1")))
            .create();
    }
}
