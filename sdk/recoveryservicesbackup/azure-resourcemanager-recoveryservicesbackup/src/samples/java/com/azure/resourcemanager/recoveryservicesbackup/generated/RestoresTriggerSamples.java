// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.resourcemanager.recoveryservicesbackup.models.EncryptionDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.IaasVMRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.IaasVMRestoreWithRehydrationRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.IdentityBasedRestoreDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.IdentityInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointRehydrationInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RehydrationPriority;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequestResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetDiskNetworkAccessOption;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetDiskNetworkAccessSettings;

/** Samples for Restores Trigger. */
public final class RestoresTriggerSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-02-01/examples/AzureIaasVm/TriggerRestore_ALR_IaasVMRestoreWithRehydrationRequest.json
     */
    /**
     * Sample code: Restore to New Azure IaasVm with IaasVMRestoreWithRehydrationRequest.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void restoreToNewAzureIaasVmWithIaasVMRestoreWithRehydrationRequest(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .restores()
            .trigger(
                "testVault",
                "netsdktestrg",
                "Azure",
                "IaasVMContainer;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "VM;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "348916168024334",
                new RestoreRequestResource()
                    .withProperties(
                        new IaasVMRestoreWithRehydrationRequest()
                            .withRecoveryPointId("348916168024334")
                            .withRecoveryType(RecoveryType.ALTERNATE_LOCATION)
                            .withSourceResourceId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg/providers/Microsoft.Compute/virtualMachines/netvmtestv2vm1")
                            .withTargetVirtualMachineId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg2/providers/Microsoft.Compute/virtualmachines/RSMDALRVM981435")
                            .withTargetResourceGroupId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg2")
                            .withStorageAccountId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Storage/storageAccounts/testingAccount")
                            .withVirtualNetworkId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Network/virtualNetworks/testNet")
                            .withSubnetId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Network/virtualNetworks/testNet/subnets/default")
                            .withRegion("southeastasia")
                            .withCreateNewCloudService(false)
                            .withOriginalStorageAccountOption(false)
                            .withEncryptionDetails(new EncryptionDetails().withEncryptionEnabled(false))
                            .withRecoveryPointRehydrationInfo(
                                new RecoveryPointRehydrationInfo()
                                    .withRehydrationRetentionDuration("P7D")
                                    .withRehydrationPriority(RehydrationPriority.HIGH))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-02-01/examples/AzureIaasVm/TriggerRestore_ALR_IaasVMRestoreRequest.json
     */
    /**
     * Sample code: Restore to New Azure IaasVm with IaasVMRestoreRequest.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void restoreToNewAzureIaasVmWithIaasVMRestoreRequest(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .restores()
            .trigger(
                "testVault",
                "netsdktestrg",
                "Azure",
                "IaasVMContainer;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "VM;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "348916168024334",
                new RestoreRequestResource()
                    .withProperties(
                        new IaasVMRestoreRequest()
                            .withRecoveryPointId("348916168024334")
                            .withRecoveryType(RecoveryType.ALTERNATE_LOCATION)
                            .withSourceResourceId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg/providers/Microsoft.Compute/virtualMachines/netvmtestv2vm1")
                            .withTargetVirtualMachineId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg2/providers/Microsoft.Compute/virtualmachines/RSMDALRVM981435")
                            .withTargetResourceGroupId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg2")
                            .withStorageAccountId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Storage/storageAccounts/testingAccount")
                            .withVirtualNetworkId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Network/virtualNetworks/testNet")
                            .withSubnetId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Network/virtualNetworks/testNet/subnets/default")
                            .withRegion("southeastasia")
                            .withCreateNewCloudService(false)
                            .withOriginalStorageAccountOption(false)
                            .withEncryptionDetails(new EncryptionDetails().withEncryptionEnabled(false))
                            .withIdentityInfo(new IdentityInfo().withIsSystemAssignedIdentity(true))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-02-01/examples/AzureIaasVm/TriggerRestore_RestoreDisks_IaasVMRestoreWithRehydrationRequest.json
     */
    /**
     * Sample code: Restore Disks with IaasVMRestoreWithRehydrationRequest.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void restoreDisksWithIaasVMRestoreWithRehydrationRequest(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .restores()
            .trigger(
                "testVault",
                "netsdktestrg",
                "Azure",
                "IaasVMContainer;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "VM;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "348916168024334",
                new RestoreRequestResource()
                    .withProperties(
                        new IaasVMRestoreWithRehydrationRequest()
                            .withRecoveryPointId("348916168024334")
                            .withRecoveryType(RecoveryType.RESTORE_DISKS)
                            .withSourceResourceId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg/providers/Microsoft.Compute/virtualMachines/netvmtestv2vm1")
                            .withStorageAccountId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testingRg/providers/Microsoft.Storage/storageAccounts/testAccount")
                            .withRegion("southeastasia")
                            .withCreateNewCloudService(true)
                            .withOriginalStorageAccountOption(false)
                            .withEncryptionDetails(new EncryptionDetails().withEncryptionEnabled(false))
                            .withRecoveryPointRehydrationInfo(
                                new RecoveryPointRehydrationInfo()
                                    .withRehydrationRetentionDuration("P7D")
                                    .withRehydrationPriority(RehydrationPriority.STANDARD))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-02-01/examples/AzureIaasVm/TriggerRestore_ALR_IaasVMRestoreRequest_IdentityBasedRestoreDetails.json
     */
    /**
     * Sample code: Restore to New Azure IaasVm with IaasVMRestoreRequest with identityBasedRestoreDetails.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void restoreToNewAzureIaasVmWithIaasVMRestoreRequestWithIdentityBasedRestoreDetails(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .restores()
            .trigger(
                "testVault",
                "netsdktestrg",
                "Azure",
                "IaasVMContainer;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "VM;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "348916168024334",
                new RestoreRequestResource()
                    .withProperties(
                        new IaasVMRestoreRequest()
                            .withRecoveryPointId("348916168024334")
                            .withRecoveryType(RecoveryType.ALTERNATE_LOCATION)
                            .withSourceResourceId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg/providers/Microsoft.Compute/virtualMachines/netvmtestv2vm1")
                            .withTargetVirtualMachineId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg2/providers/Microsoft.Compute/virtualmachines/RSMDALRVM981435")
                            .withTargetResourceGroupId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg2")
                            .withVirtualNetworkId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Network/virtualNetworks/testNet")
                            .withSubnetId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Network/virtualNetworks/testNet/subnets/default")
                            .withRegion("southeastasia")
                            .withCreateNewCloudService(false)
                            .withOriginalStorageAccountOption(false)
                            .withEncryptionDetails(new EncryptionDetails().withEncryptionEnabled(false))
                            .withIdentityInfo(new IdentityInfo().withIsSystemAssignedIdentity(true))
                            .withIdentityBasedRestoreDetails(
                                new IdentityBasedRestoreDetails()
                                    .withTargetStorageAccountId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Storage/storageAccounts/testingAccount"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-02-01/examples/AzureIaasVm/TriggerRestore_RestoreDisks_IaasVMRestoreRequest.json
     */
    /**
     * Sample code: Restore Disks with IaasVMRestoreRequest.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void restoreDisksWithIaasVMRestoreRequest(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .restores()
            .trigger(
                "testVault",
                "netsdktestrg",
                "Azure",
                "IaasVMContainer;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "VM;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "348916168024334",
                new RestoreRequestResource()
                    .withProperties(
                        new IaasVMRestoreRequest()
                            .withRecoveryPointId("348916168024334")
                            .withRecoveryType(RecoveryType.RESTORE_DISKS)
                            .withSourceResourceId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg/providers/Microsoft.Compute/virtualMachines/netvmtestv2vm1")
                            .withStorageAccountId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testingRg/providers/Microsoft.Storage/storageAccounts/testAccount")
                            .withRegion("southeastasia")
                            .withCreateNewCloudService(true)
                            .withOriginalStorageAccountOption(false)
                            .withEncryptionDetails(new EncryptionDetails().withEncryptionEnabled(false))
                            .withIdentityInfo(
                                new IdentityInfo()
                                    .withIsSystemAssignedIdentity(false)
                                    .withManagedIdentityResourceId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/asmaskarRG1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/asmaskartestmsi"))
                            .withTargetDiskNetworkAccessSettings(
                                new TargetDiskNetworkAccessSettings()
                                    .withTargetDiskNetworkAccessOption(
                                        TargetDiskNetworkAccessOption.ENABLE_PRIVATE_ACCESS_FOR_ALL_DISKS)
                                    .withTargetDiskAccessId(
                                        "/subscriptions/e7a191f5-713c-4bdb-b5e4-cf3dd90230ef/resourceGroups/arpja/providers/Microsoft.Compute/diskAccesses/arpja-diskaccess-ccy"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-02-01/examples/AzureIaasVm/TriggerRestore_RestoreDisks_IaasVMRestoreRequest_IdentityBasedRestoreDetails.json
     */
    /**
     * Sample code: Restore Disks with IaasVMRestoreRequest with IdentityBasedRestoreDetails.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void restoreDisksWithIaasVMRestoreRequestWithIdentityBasedRestoreDetails(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .restores()
            .trigger(
                "testVault",
                "netsdktestrg",
                "Azure",
                "IaasVMContainer;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "VM;iaasvmcontainerv2;netsdktestrg;netvmtestv2vm1",
                "348916168024334",
                new RestoreRequestResource()
                    .withProperties(
                        new IaasVMRestoreRequest()
                            .withRecoveryPointId("348916168024334")
                            .withRecoveryType(RecoveryType.RESTORE_DISKS)
                            .withSourceResourceId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg/providers/Microsoft.Compute/virtualMachines/netvmtestv2vm1")
                            .withRegion("southeastasia")
                            .withCreateNewCloudService(true)
                            .withOriginalStorageAccountOption(false)
                            .withEncryptionDetails(new EncryptionDetails().withEncryptionEnabled(false))
                            .withIdentityInfo(
                                new IdentityInfo()
                                    .withIsSystemAssignedIdentity(false)
                                    .withManagedIdentityResourceId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/asmaskarRG1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/asmaskartestmsi"))
                            .withIdentityBasedRestoreDetails(
                                new IdentityBasedRestoreDetails()
                                    .withTargetStorageAccountId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testingRg/providers/Microsoft.Storage/storageAccounts/testAccount"))),
                com.azure.core.util.Context.NONE);
    }
}
