// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.RestorePointInner;

public final class RestorePointInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestorePointInner model =
            BinaryData
                .fromString(
                    "{\"location\":\"bpybsrfbjf\",\"properties\":{\"restorePointType\":\"CONTINUOUS\",\"earliestRestoreDate\":\"2021-01-25T00:48:06Z\",\"restorePointCreationDate\":\"2021-06-01T18:34:35Z\",\"restorePointLabel\":\"pvjzbe\"},\"id\":\"ilzznfqqnvwp\",\"name\":\"qtaruoujmkcjhwq\",\"type\":\"tjrybnwjewgdr\"}")
                .toObject(RestorePointInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestorePointInner model = new RestorePointInner();
        model = BinaryData.fromObject(model).toObject(RestorePointInner.class);
    }
}
