// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.BackupVaultResourceInner;
import com.azure.resourcemanager.dataprotection.models.AlertsState;
import com.azure.resourcemanager.dataprotection.models.AzureMonitorAlertSettings;
import com.azure.resourcemanager.dataprotection.models.BackupVault;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreState;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreState;
import com.azure.resourcemanager.dataprotection.models.DppIdentityDetails;
import com.azure.resourcemanager.dataprotection.models.FeatureSettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilitySettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilityState;
import com.azure.resourcemanager.dataprotection.models.MonitoringSettings;
import com.azure.resourcemanager.dataprotection.models.SecuritySettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteSettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteState;
import com.azure.resourcemanager.dataprotection.models.StorageSetting;
import com.azure.resourcemanager.dataprotection.models.StorageSettingStoreTypes;
import com.azure.resourcemanager.dataprotection.models.StorageSettingTypes;
import com.azure.resourcemanager.dataprotection.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupVaultResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupVaultResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"monitoringSettings\":{\"azureMonitorAlertSettings\":{\"alertsForAllJobFailures\":\"Disabled\"}},\"provisioningState\":\"Failed\",\"resourceMoveState\":\"PrepareTimedout\",\"resourceMoveDetails\":{\"operationId\":\"v\",\"startTimeUtc\":\"mjqulngsn\",\"completionTimeUtc\":\"bybkzgcwrwclxx\",\"sourceResourcePath\":\"ljdousk\",\"targetResourcePath\":\"vkocrcjdkwtn\"},\"securitySettings\":{\"softDeleteSettings\":{\"state\":\"AlwaysOn\",\"retentionDurationInDays\":30.743644504476197},\"immutabilitySettings\":{\"state\":\"Disabled\"}},\"storageSettings\":[{\"datastoreType\":\"ArchiveStore\",\"type\":\"LocallyRedundant\"}],\"isVaultProtectedByResourceGuard\":true,\"featureSettings\":{\"crossSubscriptionRestoreSettings\":{\"state\":\"PermanentlyDisabled\"},\"crossRegionRestoreSettings\":{\"state\":\"Enabled\"}},\"secureScore\":\"Maximum\"},\"identity\":{\"principalId\":\"ppeebvmgxsab\",\"tenantId\":\"qduujitcjczdz\",\"type\":\"ndhkrw\",\"userAssignedIdentities\":{\"dsbdkvwrwjf\":{\"principalId\":\"31776e23-8c83-4449-96f9-1cf2a857ddc1\",\"clientId\":\"b575cc54-aa3b-408a-b375-706c48648f79\"}}},\"eTag\":\"snhu\",\"location\":\"eltmrldhugjzzdat\",\"tags\":{\"geablgphuticndvk\":\"oc\",\"ftyxolniw\":\"ozwyiftyhxhuro\"},\"id\":\"wcukjfkgiawxk\",\"name\":\"ryplwckbasyypn\",\"type\":\"dhsgcba\"}")
                .toObject(BackupVaultResourceInner.class);
        Assertions.assertEquals("eltmrldhugjzzdat", model.location());
        Assertions.assertEquals("oc", model.tags().get("geablgphuticndvk"));
        Assertions.assertEquals("snhu", model.etag());
        Assertions.assertEquals("ndhkrw", model.identity().type());
        Assertions
            .assertEquals(
                AlertsState.DISABLED,
                model.properties().monitoringSettings().azureMonitorAlertSettings().alertsForAllJobFailures());
        Assertions
            .assertEquals(
                SoftDeleteState.ALWAYS_ON, model.properties().securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(
                30.743644504476197D,
                model.properties().securitySettings().softDeleteSettings().retentionDurationInDays());
        Assertions
            .assertEquals(
                ImmutabilityState.DISABLED, model.properties().securitySettings().immutabilitySettings().state());
        Assertions
            .assertEquals(
                StorageSettingStoreTypes.ARCHIVE_STORE, model.properties().storageSettings().get(0).datastoreType());
        Assertions
            .assertEquals(StorageSettingTypes.LOCALLY_REDUNDANT, model.properties().storageSettings().get(0).type());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.PERMANENTLY_DISABLED,
                model.properties().featureSettings().crossSubscriptionRestoreSettings().state());
        Assertions
            .assertEquals(
                CrossRegionRestoreState.ENABLED,
                model.properties().featureSettings().crossRegionRestoreSettings().state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupVaultResourceInner model =
            new BackupVaultResourceInner()
                .withLocation("eltmrldhugjzzdat")
                .withTags(mapOf("geablgphuticndvk", "oc", "ftyxolniw", "ozwyiftyhxhuro"))
                .withEtag("snhu")
                .withIdentity(
                    new DppIdentityDetails()
                        .withType("ndhkrw")
                        .withUserAssignedIdentities(mapOf("dsbdkvwrwjf", new UserAssignedIdentity())))
                .withProperties(
                    new BackupVault()
                        .withMonitoringSettings(
                            new MonitoringSettings()
                                .withAzureMonitorAlertSettings(
                                    new AzureMonitorAlertSettings().withAlertsForAllJobFailures(AlertsState.DISABLED)))
                        .withSecuritySettings(
                            new SecuritySettings()
                                .withSoftDeleteSettings(
                                    new SoftDeleteSettings()
                                        .withState(SoftDeleteState.ALWAYS_ON)
                                        .withRetentionDurationInDays(30.743644504476197D))
                                .withImmutabilitySettings(
                                    new ImmutabilitySettings().withState(ImmutabilityState.DISABLED)))
                        .withStorageSettings(
                            Arrays
                                .asList(
                                    new StorageSetting()
                                        .withDatastoreType(StorageSettingStoreTypes.ARCHIVE_STORE)
                                        .withType(StorageSettingTypes.LOCALLY_REDUNDANT)))
                        .withFeatureSettings(
                            new FeatureSettings()
                                .withCrossSubscriptionRestoreSettings(
                                    new CrossSubscriptionRestoreSettings()
                                        .withState(CrossSubscriptionRestoreState.PERMANENTLY_DISABLED))
                                .withCrossRegionRestoreSettings(
                                    new CrossRegionRestoreSettings().withState(CrossRegionRestoreState.ENABLED))));
        model = BinaryData.fromObject(model).toObject(BackupVaultResourceInner.class);
        Assertions.assertEquals("eltmrldhugjzzdat", model.location());
        Assertions.assertEquals("oc", model.tags().get("geablgphuticndvk"));
        Assertions.assertEquals("snhu", model.etag());
        Assertions.assertEquals("ndhkrw", model.identity().type());
        Assertions
            .assertEquals(
                AlertsState.DISABLED,
                model.properties().monitoringSettings().azureMonitorAlertSettings().alertsForAllJobFailures());
        Assertions
            .assertEquals(
                SoftDeleteState.ALWAYS_ON, model.properties().securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(
                30.743644504476197D,
                model.properties().securitySettings().softDeleteSettings().retentionDurationInDays());
        Assertions
            .assertEquals(
                ImmutabilityState.DISABLED, model.properties().securitySettings().immutabilitySettings().state());
        Assertions
            .assertEquals(
                StorageSettingStoreTypes.ARCHIVE_STORE, model.properties().storageSettings().get(0).datastoreType());
        Assertions
            .assertEquals(StorageSettingTypes.LOCALLY_REDUNDANT, model.properties().storageSettings().get(0).type());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.PERMANENTLY_DISABLED,
                model.properties().featureSettings().crossSubscriptionRestoreSettings().state());
        Assertions
            .assertEquals(
                CrossRegionRestoreState.ENABLED,
                model.properties().featureSettings().crossRegionRestoreSettings().state());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
