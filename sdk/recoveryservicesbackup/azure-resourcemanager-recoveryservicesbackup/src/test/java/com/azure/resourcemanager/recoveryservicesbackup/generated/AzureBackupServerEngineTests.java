// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureBackupServerEngine;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupEngineExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupServerEngineTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupServerEngine model =
            BinaryData
                .fromString(
                    "{\"backupEngineType\":\"AzureBackupServerEngine\",\"friendlyName\":\"xxdtddmflh\",\"backupManagementType\":\"Invalid\",\"registrationStatus\":\"zv\",\"backupEngineState\":\"napxbannovv\",\"healthStatus\":\"czytprwn\",\"canReRegister\":false,\"backupEngineId\":\"ev\",\"dpmVersion\":\"lyokrrrou\",\"azureBackupAgentVersion\":\"vnsasbcrymodi\",\"isAzureBackupAgentUpgradeAvailable\":false,\"isDpmUpgradeAvailable\":false,\"extendedInfo\":{\"databaseName\":\"d\",\"protectedItemsCount\":61809023,\"protectedServersCount\":634519314,\"diskCount\":552291505,\"usedDiskSpace\":18.533334244602006,\"availableDiskSpace\":95.21524083718487,\"refreshedAt\":\"2021-05-19T01:27:19Z\",\"azureProtectedInstances\":343155487}}")
                .toObject(AzureBackupServerEngine.class);
        Assertions.assertEquals("xxdtddmflh", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.INVALID, model.backupManagementType());
        Assertions.assertEquals("zv", model.registrationStatus());
        Assertions.assertEquals("napxbannovv", model.backupEngineState());
        Assertions.assertEquals("czytprwn", model.healthStatus());
        Assertions.assertEquals(false, model.canReRegister());
        Assertions.assertEquals("ev", model.backupEngineId());
        Assertions.assertEquals("lyokrrrou", model.dpmVersion());
        Assertions.assertEquals("vnsasbcrymodi", model.azureBackupAgentVersion());
        Assertions.assertEquals(false, model.isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(false, model.isDpmUpgradeAvailable());
        Assertions.assertEquals("d", model.extendedInfo().databaseName());
        Assertions.assertEquals(61809023, model.extendedInfo().protectedItemsCount());
        Assertions.assertEquals(634519314, model.extendedInfo().protectedServersCount());
        Assertions.assertEquals(552291505, model.extendedInfo().diskCount());
        Assertions.assertEquals(18.533334244602006D, model.extendedInfo().usedDiskSpace());
        Assertions.assertEquals(95.21524083718487D, model.extendedInfo().availableDiskSpace());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-19T01:27:19Z"), model.extendedInfo().refreshedAt());
        Assertions.assertEquals(343155487, model.extendedInfo().azureProtectedInstances());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupServerEngine model =
            new AzureBackupServerEngine()
                .withFriendlyName("xxdtddmflh")
                .withBackupManagementType(BackupManagementType.INVALID)
                .withRegistrationStatus("zv")
                .withBackupEngineState("napxbannovv")
                .withHealthStatus("czytprwn")
                .withCanReRegister(false)
                .withBackupEngineId("ev")
                .withDpmVersion("lyokrrrou")
                .withAzureBackupAgentVersion("vnsasbcrymodi")
                .withIsAzureBackupAgentUpgradeAvailable(false)
                .withIsDpmUpgradeAvailable(false)
                .withExtendedInfo(
                    new BackupEngineExtendedInfo()
                        .withDatabaseName("d")
                        .withProtectedItemsCount(61809023)
                        .withProtectedServersCount(634519314)
                        .withDiskCount(552291505)
                        .withUsedDiskSpace(18.533334244602006D)
                        .withAvailableDiskSpace(95.21524083718487D)
                        .withRefreshedAt(OffsetDateTime.parse("2021-05-19T01:27:19Z"))
                        .withAzureProtectedInstances(343155487));
        model = BinaryData.fromObject(model).toObject(AzureBackupServerEngine.class);
        Assertions.assertEquals("xxdtddmflh", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.INVALID, model.backupManagementType());
        Assertions.assertEquals("zv", model.registrationStatus());
        Assertions.assertEquals("napxbannovv", model.backupEngineState());
        Assertions.assertEquals("czytprwn", model.healthStatus());
        Assertions.assertEquals(false, model.canReRegister());
        Assertions.assertEquals("ev", model.backupEngineId());
        Assertions.assertEquals("lyokrrrou", model.dpmVersion());
        Assertions.assertEquals("vnsasbcrymodi", model.azureBackupAgentVersion());
        Assertions.assertEquals(false, model.isAzureBackupAgentUpgradeAvailable());
        Assertions.assertEquals(false, model.isDpmUpgradeAvailable());
        Assertions.assertEquals("d", model.extendedInfo().databaseName());
        Assertions.assertEquals(61809023, model.extendedInfo().protectedItemsCount());
        Assertions.assertEquals(634519314, model.extendedInfo().protectedServersCount());
        Assertions.assertEquals(552291505, model.extendedInfo().diskCount());
        Assertions.assertEquals(18.533334244602006D, model.extendedInfo().usedDiskSpace());
        Assertions.assertEquals(95.21524083718487D, model.extendedInfo().availableDiskSpace());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-19T01:27:19Z"), model.extendedInfo().refreshedAt());
        Assertions.assertEquals(343155487, model.extendedInfo().azureProtectedInstances());
    }
}
