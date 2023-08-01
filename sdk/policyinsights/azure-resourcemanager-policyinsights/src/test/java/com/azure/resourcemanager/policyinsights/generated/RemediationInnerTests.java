// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.fluent.models.RemediationInner;
import com.azure.resourcemanager.policyinsights.models.RemediationFilters;
import com.azure.resourcemanager.policyinsights.models.RemediationPropertiesFailureThreshold;
import com.azure.resourcemanager.policyinsights.models.ResourceDiscoveryMode;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RemediationInnerTests {
    @Test
    public void testDeserialize() {
        RemediationInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"policyAssignmentId\":\"appd\",\"policyDefinitionReferenceId\":\"dkvwrwjfe\",\"resourceDiscoveryMode\":\"ReEvaluateCompliance\",\"provisioningState\":\"utjeltmrldhugj\",\"createdOn\":\"2021-10-02T10:39:21Z\",\"lastUpdatedOn\":\"2021-10-25T23:35:46Z\",\"filters\":{\"locations\":[\"oc\",\"geablgphuticndvk\"]},\"deploymentStatus\":{\"totalDeployments\":563001635,\"successfulDeployments\":191194169,\"failedDeployments\":629729450},\"statusMessage\":\"hxh\",\"correlationId\":\"okftyxolniwpwcuk\",\"resourceCount\":1720882214,\"parallelDeployments\":1945467900,\"failureThreshold\":{\"percentage\":40.293247}},\"id\":\"lryplwckbasyy\",\"name\":\"nddhsgcbacph\",\"type\":\"jkot\"}")
                .toObject(RemediationInner.class);
        Assertions.assertEquals("appd", model.policyAssignmentId());
        Assertions.assertEquals("dkvwrwjfe", model.policyDefinitionReferenceId());
        Assertions.assertEquals(ResourceDiscoveryMode.RE_EVALUATE_COMPLIANCE, model.resourceDiscoveryMode());
        Assertions.assertEquals("oc", model.filters().locations().get(0));
        Assertions.assertEquals(1720882214, model.resourceCount());
        Assertions.assertEquals(1945467900, model.parallelDeployments());
        Assertions.assertEquals(40.293247F, model.failureThreshold().percentage());
    }

    @Test
    public void testSerialize() {
        RemediationInner model =
            new RemediationInner()
                .withPolicyAssignmentId("appd")
                .withPolicyDefinitionReferenceId("dkvwrwjfe")
                .withResourceDiscoveryMode(ResourceDiscoveryMode.RE_EVALUATE_COMPLIANCE)
                .withFilters(new RemediationFilters().withLocations(Arrays.asList("oc", "geablgphuticndvk")))
                .withResourceCount(1720882214)
                .withParallelDeployments(1945467900)
                .withFailureThreshold(new RemediationPropertiesFailureThreshold().withPercentage(40.293247F));
        model = BinaryData.fromObject(model).toObject(RemediationInner.class);
        Assertions.assertEquals("appd", model.policyAssignmentId());
        Assertions.assertEquals("dkvwrwjfe", model.policyDefinitionReferenceId());
        Assertions.assertEquals(ResourceDiscoveryMode.RE_EVALUATE_COMPLIANCE, model.resourceDiscoveryMode());
        Assertions.assertEquals("oc", model.filters().locations().get(0));
        Assertions.assertEquals(1720882214, model.resourceCount());
        Assertions.assertEquals(1945467900, model.parallelDeployments());
        Assertions.assertEquals(40.293247F, model.failureThreshold().percentage());
    }
}
