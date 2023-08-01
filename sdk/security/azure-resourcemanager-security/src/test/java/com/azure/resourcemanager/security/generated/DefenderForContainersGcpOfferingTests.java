// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForContainersGcpOffering;
import com.azure.resourcemanager.security.models.DefenderForContainersGcpOfferingDataPipelineNativeCloudConnection;
import com.azure.resourcemanager.security.models.DefenderForContainersGcpOfferingNativeCloudConnection;
import org.junit.jupiter.api.Assertions;

public final class DefenderForContainersGcpOfferingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForContainersGcpOffering model =
            BinaryData
                .fromString(
                    "{\"offeringType\":\"DefenderForContainersGcp\",\"nativeCloudConnection\":{\"serviceAccountEmailAddress\":\"anfbc\",\"workloadIdentityProviderId\":\"qagywvtxig\"},\"dataPipelineNativeCloudConnection\":{\"serviceAccountEmailAddress\":\"ktpgaeukyawohp\",\"workloadIdentityProviderId\":\"hqnucs\"},\"auditLogsAutoProvisioningFlag\":true,\"defenderAgentAutoProvisioningFlag\":false,\"policyAgentAutoProvisioningFlag\":false,\"description\":\"tdlpbn\"}")
                .toObject(DefenderForContainersGcpOffering.class);
        Assertions.assertEquals("anfbc", model.nativeCloudConnection().serviceAccountEmailAddress());
        Assertions.assertEquals("qagywvtxig", model.nativeCloudConnection().workloadIdentityProviderId());
        Assertions
            .assertEquals("ktpgaeukyawohp", model.dataPipelineNativeCloudConnection().serviceAccountEmailAddress());
        Assertions.assertEquals("hqnucs", model.dataPipelineNativeCloudConnection().workloadIdentityProviderId());
        Assertions.assertEquals(true, model.auditLogsAutoProvisioningFlag());
        Assertions.assertEquals(false, model.defenderAgentAutoProvisioningFlag());
        Assertions.assertEquals(false, model.policyAgentAutoProvisioningFlag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForContainersGcpOffering model =
            new DefenderForContainersGcpOffering()
                .withNativeCloudConnection(
                    new DefenderForContainersGcpOfferingNativeCloudConnection()
                        .withServiceAccountEmailAddress("anfbc")
                        .withWorkloadIdentityProviderId("qagywvtxig"))
                .withDataPipelineNativeCloudConnection(
                    new DefenderForContainersGcpOfferingDataPipelineNativeCloudConnection()
                        .withServiceAccountEmailAddress("ktpgaeukyawohp")
                        .withWorkloadIdentityProviderId("hqnucs"))
                .withAuditLogsAutoProvisioningFlag(true)
                .withDefenderAgentAutoProvisioningFlag(false)
                .withPolicyAgentAutoProvisioningFlag(false);
        model = BinaryData.fromObject(model).toObject(DefenderForContainersGcpOffering.class);
        Assertions.assertEquals("anfbc", model.nativeCloudConnection().serviceAccountEmailAddress());
        Assertions.assertEquals("qagywvtxig", model.nativeCloudConnection().workloadIdentityProviderId());
        Assertions
            .assertEquals("ktpgaeukyawohp", model.dataPipelineNativeCloudConnection().serviceAccountEmailAddress());
        Assertions.assertEquals("hqnucs", model.dataPipelineNativeCloudConnection().workloadIdentityProviderId());
        Assertions.assertEquals(true, model.auditLogsAutoProvisioningFlag());
        Assertions.assertEquals(false, model.defenderAgentAutoProvisioningFlag());
        Assertions.assertEquals(false, model.policyAgentAutoProvisioningFlag());
    }
}
