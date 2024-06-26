// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.WorkloadItemResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadItem;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkloadItemResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadItemResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"workloadItemType\":\"WorkloadItem\",\"backupManagementType\":\"patdooaojkniodko\",\"workloadType\":\"bw\",\"friendlyName\":\"jhemms\",\"protectionState\":\"Protected\"},\"eTag\":\"c\",\"location\":\"odtji\",\"tags\":{\"akggkfpag\":\"jlfltkacjvefkdlf\"},\"id\":\"owpulpq\",\"name\":\"lyls\",\"type\":\"xkqjnsjervt\"}")
            .toObject(WorkloadItemResourceInner.class);
        Assertions.assertEquals("odtji", model.location());
        Assertions.assertEquals("jlfltkacjvefkdlf", model.tags().get("akggkfpag"));
        Assertions.assertEquals("patdooaojkniodko", model.properties().backupManagementType());
        Assertions.assertEquals("bw", model.properties().workloadType());
        Assertions.assertEquals("jhemms", model.properties().friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.properties().protectionState());
        Assertions.assertEquals("c", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadItemResourceInner model = new WorkloadItemResourceInner().withLocation("odtji")
            .withTags(mapOf("akggkfpag", "jlfltkacjvefkdlf"))
            .withProperties(new WorkloadItem().withBackupManagementType("patdooaojkniodko")
                .withWorkloadType("bw")
                .withFriendlyName("jhemms")
                .withProtectionState(ProtectionStatus.PROTECTED))
            .withEtag("c");
        model = BinaryData.fromObject(model).toObject(WorkloadItemResourceInner.class);
        Assertions.assertEquals("odtji", model.location());
        Assertions.assertEquals("jlfltkacjvefkdlf", model.tags().get("akggkfpag"));
        Assertions.assertEquals("patdooaojkniodko", model.properties().backupManagementType());
        Assertions.assertEquals("bw", model.properties().workloadType());
        Assertions.assertEquals("jhemms", model.properties().friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.properties().protectionState());
        Assertions.assertEquals("c", model.etag());
    }

    // Use "Map.of" if available
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
