// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.EnvironmentDetails;
import org.junit.jupiter.api.Assertions;

public final class EnvironmentDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnvironmentDetails model =
            BinaryData
                .fromString(
                    "{\"nativeResourceId\":\"lohap\",\"environmentHierarchyId\":\"nfszpyglqdhmrjz\",\"organizationalHierarchyId\":\"l\",\"subscriptionId\":\"pjby\",\"tenantId\":\"sjoqcjenkyhfqzvs\"}")
                .toObject(EnvironmentDetails.class);
        Assertions.assertEquals("lohap", model.nativeResourceId());
        Assertions.assertEquals("nfszpyglqdhmrjz", model.environmentHierarchyId());
        Assertions.assertEquals("l", model.organizationalHierarchyId());
        Assertions.assertEquals("pjby", model.subscriptionId());
        Assertions.assertEquals("sjoqcjenkyhfqzvs", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnvironmentDetails model =
            new EnvironmentDetails()
                .withNativeResourceId("lohap")
                .withEnvironmentHierarchyId("nfszpyglqdhmrjz")
                .withOrganizationalHierarchyId("l")
                .withSubscriptionId("pjby")
                .withTenantId("sjoqcjenkyhfqzvs");
        model = BinaryData.fromObject(model).toObject(EnvironmentDetails.class);
        Assertions.assertEquals("lohap", model.nativeResourceId());
        Assertions.assertEquals("nfszpyglqdhmrjz", model.environmentHierarchyId());
        Assertions.assertEquals("l", model.organizationalHierarchyId());
        Assertions.assertEquals("pjby", model.subscriptionId());
        Assertions.assertEquals("sjoqcjenkyhfqzvs", model.tenantId());
    }
}
