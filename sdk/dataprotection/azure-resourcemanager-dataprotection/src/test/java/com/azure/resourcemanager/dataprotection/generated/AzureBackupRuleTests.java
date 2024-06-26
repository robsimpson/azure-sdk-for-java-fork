// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRule;
import com.azure.resourcemanager.dataprotection.models.BackupParameters;
import com.azure.resourcemanager.dataprotection.models.DataStoreInfoBase;
import com.azure.resourcemanager.dataprotection.models.DataStoreTypes;
import com.azure.resourcemanager.dataprotection.models.TriggerContext;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupRule model = BinaryData.fromString(
            "{\"objectType\":\"AzureBackupRule\",\"backupParameters\":{\"objectType\":\"BackupParameters\"},\"dataStore\":{\"dataStoreType\":\"ArchiveStore\",\"objectType\":\"nfdn\"},\"trigger\":{\"objectType\":\"TriggerContext\"},\"name\":\"wjchrdg\"}")
            .toObject(AzureBackupRule.class);
        Assertions.assertEquals("wjchrdg", model.name());
        Assertions.assertEquals(DataStoreTypes.ARCHIVE_STORE, model.dataStore().dataStoreType());
        Assertions.assertEquals("nfdn", model.dataStore().objectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupRule model = new AzureBackupRule().withName("wjchrdg").withBackupParameters(new BackupParameters())
            .withDataStore(
                new DataStoreInfoBase().withDataStoreType(DataStoreTypes.ARCHIVE_STORE).withObjectType("nfdn"))
            .withTrigger(new TriggerContext());
        model = BinaryData.fromObject(model).toObject(AzureBackupRule.class);
        Assertions.assertEquals("wjchrdg", model.name());
        Assertions.assertEquals(DataStoreTypes.ARCHIVE_STORE, model.dataStore().dataStoreType());
        Assertions.assertEquals("nfdn", model.dataStore().objectType());
    }
}
