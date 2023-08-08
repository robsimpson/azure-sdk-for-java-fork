// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.AccessType;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceBackupRestoreParameters;

/** Samples for ApiManagementService Backup. */
public final class ApiManagementServiceBackupSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementBackupWithAccessKey.json
     */
    /**
     * Sample code: ApiManagementBackupWithAccessKey.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementBackupWithAccessKey(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .backup(
                "rg1",
                "apimService1",
                new ApiManagementServiceBackupRestoreParameters()
                    .withStorageAccount("teststorageaccount")
                    .withContainerName("backupContainer")
                    .withBackupName("apimService1backup_2017_03_19")
                    .withAccessType(AccessType.ACCESS_KEY)
                    .withAccessKey("**************************************************"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementBackupWithUserAssignedManagedIdentity.json
     */
    /**
     * Sample code: ApiManagementBackupWithUserAssignedManagedIdentity.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementBackupWithUserAssignedManagedIdentity(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .backup(
                "rg1",
                "apimService1",
                new ApiManagementServiceBackupRestoreParameters()
                    .withStorageAccount("contosorpstorage")
                    .withContainerName("apim-backups")
                    .withBackupName("backup5")
                    .withAccessType(AccessType.USER_ASSIGNED_MANAGED_IDENTITY)
                    .withClientId("XXXXX-a154-4830-XXXX-46a12da1a1e2"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2021-08-01/examples/ApiManagementBackupWithSystemManagedIdentity.json
     */
    /**
     * Sample code: ApiManagementBackupWithSystemManagedIdentity.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementBackupWithSystemManagedIdentity(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiManagementServices()
            .backup(
                "rg1",
                "apimService1",
                new ApiManagementServiceBackupRestoreParameters()
                    .withStorageAccount("contosorpstorage")
                    .withContainerName("apim-backups")
                    .withBackupName("backup5")
                    .withAccessType(AccessType.SYSTEM_ASSIGNED_MANAGED_IDENTITY),
                Context.NONE);
    }
}
