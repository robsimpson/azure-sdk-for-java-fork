// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managementgroups.fluent.models.AzureAsyncOperationResultsInner;
import org.junit.jupiter.api.Assertions;

public final class AzureAsyncOperationResultsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureAsyncOperationResultsInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"wpyeicxmqciwqvh\",\"type\":\"ixuigdtopbobj\",\"name\":\"hm\",\"status\":\"u\",\"properties\":{\"tenantId\":\"uhrzayvvt\",\"displayName\":\"vdfgiotk\"}}")
                .toObject(AzureAsyncOperationResultsInner.class);
        Assertions.assertEquals("uhrzayvvt", model.tenantId());
        Assertions.assertEquals("vdfgiotk", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureAsyncOperationResultsInner model =
            new AzureAsyncOperationResultsInner().withTenantId("uhrzayvvt").withDisplayName("vdfgiotk");
        model = BinaryData.fromObject(model).toObject(AzureAsyncOperationResultsInner.class);
        Assertions.assertEquals("uhrzayvvt", model.tenantId());
        Assertions.assertEquals("vdfgiotk", model.displayName());
    }
}
