// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessRequestInner;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyVirtualMachine;
import com.azure.resourcemanager.security.models.JitNetworkAccessPortRule;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestPort;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestVirtualMachine;
import com.azure.resourcemanager.security.models.Protocol;
import com.azure.resourcemanager.security.models.Status;
import com.azure.resourcemanager.security.models.StatusReason;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for JitNetworkAccessPolicies CreateOrUpdate. */
public final class JitNetworkAccessPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/JitNetworkAccessPolicies/CreateJitNetworkAccessPolicy_example.json
     */
    /**
     * Sample code: Create JIT network access policy.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void createJITNetworkAccessPolicy(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .jitNetworkAccessPolicies()
            .define("default")
            .withExistingLocation("myRg1", "westeurope")
            .withVirtualMachines(
                Arrays
                    .asList(
                        new JitNetworkAccessPolicyVirtualMachine()
                            .withId(
                                "/subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myRg1/providers/Microsoft.Compute/virtualMachines/vm1")
                            .withPorts(
                                Arrays
                                    .asList(
                                        new JitNetworkAccessPortRule()
                                            .withNumber(22)
                                            .withProtocol(Protocol.ASTERISK)
                                            .withAllowedSourceAddressPrefix("*")
                                            .withMaxRequestAccessDuration("PT3H"),
                                        new JitNetworkAccessPortRule()
                                            .withNumber(3389)
                                            .withProtocol(Protocol.ASTERISK)
                                            .withAllowedSourceAddressPrefix("*")
                                            .withMaxRequestAccessDuration("PT3H")))))
            .withKind("Basic")
            .withRequests(
                Arrays
                    .asList(
                        new JitNetworkAccessRequestInner()
                            .withVirtualMachines(
                                Arrays
                                    .asList(
                                        new JitNetworkAccessRequestVirtualMachine()
                                            .withId(
                                                "/subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myRg1/providers/Microsoft.Compute/virtualMachines/vm1")
                                            .withPorts(
                                                Arrays
                                                    .asList(
                                                        new JitNetworkAccessRequestPort()
                                                            .withNumber(3389)
                                                            .withAllowedSourceAddressPrefix("192.127.0.2")
                                                            .withEndTimeUtc(
                                                                OffsetDateTime.parse("2018-05-17T09:06:45.5691611Z"))
                                                            .withStatus(Status.INITIATED)
                                                            .withStatusReason(StatusReason.USER_REQUESTED)))))
                            .withStartTimeUtc(OffsetDateTime.parse("2018-05-17T08:06:45.5691611Z"))
                            .withRequestor("barbara@contoso.com")))
            .create();
    }
}
