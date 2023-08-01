// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.resourcemanager.iothub.models.Capabilities;
import com.azure.resourcemanager.iothub.models.CloudToDeviceProperties;
import com.azure.resourcemanager.iothub.models.DefaultAction;
import com.azure.resourcemanager.iothub.models.EventHubProperties;
import com.azure.resourcemanager.iothub.models.FallbackRouteProperties;
import com.azure.resourcemanager.iothub.models.FeedbackProperties;
import com.azure.resourcemanager.iothub.models.IotHubProperties;
import com.azure.resourcemanager.iothub.models.IotHubSku;
import com.azure.resourcemanager.iothub.models.IotHubSkuInfo;
import com.azure.resourcemanager.iothub.models.IpVersion;
import com.azure.resourcemanager.iothub.models.MessagingEndpointProperties;
import com.azure.resourcemanager.iothub.models.NetworkRuleIpAction;
import com.azure.resourcemanager.iothub.models.NetworkRuleSetIpRule;
import com.azure.resourcemanager.iothub.models.NetworkRuleSetProperties;
import com.azure.resourcemanager.iothub.models.RootCertificateProperties;
import com.azure.resourcemanager.iothub.models.RoutingEndpoints;
import com.azure.resourcemanager.iothub.models.RoutingProperties;
import com.azure.resourcemanager.iothub.models.RoutingSource;
import com.azure.resourcemanager.iothub.models.StorageEndpointProperties;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for IotHubResource CreateOrUpdate. */
public final class IotHubResourceCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/preview/2022-11-15-preview/examples/iothub_createOrUpdate.json
     */
    /**
     * Sample code: IotHubResource_CreateOrUpdate.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void iotHubResourceCreateOrUpdate(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager
            .iotHubResources()
            .define("testHub")
            .withRegion("centraluseuap")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new IotHubSkuInfo().withName(IotHubSku.S1).withCapacity(1L))
            .withTags(mapOf())
            .withEtag("AAAAAAFD6M4=")
            .withProperties(
                new IotHubProperties()
                    .withIpFilterRules(Arrays.asList())
                    .withNetworkRuleSets(
                        new NetworkRuleSetProperties()
                            .withDefaultAction(DefaultAction.DENY)
                            .withApplyToBuiltInEventHubEndpoint(true)
                            .withIpRules(
                                Arrays
                                    .asList(
                                        new NetworkRuleSetIpRule()
                                            .withFilterName("rule1")
                                            .withAction(NetworkRuleIpAction.ALLOW)
                                            .withIpMask("131.117.159.53"),
                                        new NetworkRuleSetIpRule()
                                            .withFilterName("rule2")
                                            .withAction(NetworkRuleIpAction.ALLOW)
                                            .withIpMask("157.55.59.128/25"))))
                    .withMinTlsVersion("1.2")
                    .withEventHubEndpoints(
                        mapOf("events", new EventHubProperties().withRetentionTimeInDays(1L).withPartitionCount(2)))
                    .withRouting(
                        new RoutingProperties()
                            .withEndpoints(
                                new RoutingEndpoints()
                                    .withServiceBusQueues(Arrays.asList())
                                    .withServiceBusTopics(Arrays.asList())
                                    .withEventHubs(Arrays.asList())
                                    .withStorageContainers(Arrays.asList()))
                            .withRoutes(Arrays.asList())
                            .withFallbackRoute(
                                new FallbackRouteProperties()
                                    .withName("$fallback")
                                    .withSource(RoutingSource.DEVICE_MESSAGES)
                                    .withCondition("true")
                                    .withEndpointNames(Arrays.asList("events"))
                                    .withIsEnabled(true)))
                    .withStorageEndpoints(
                        mapOf(
                            "$default",
                            new StorageEndpointProperties()
                                .withSasTtlAsIso8601(Duration.parse("PT1H"))
                                .withConnectionString("")
                                .withContainerName("")))
                    .withMessagingEndpoints(
                        mapOf(
                            "fileNotifications",
                            new MessagingEndpointProperties()
                                .withLockDurationAsIso8601(Duration.parse("PT1M"))
                                .withTtlAsIso8601(Duration.parse("PT1H"))
                                .withMaxDeliveryCount(10)))
                    .withEnableFileUploadNotifications(false)
                    .withCloudToDevice(
                        new CloudToDeviceProperties()
                            .withMaxDeliveryCount(10)
                            .withDefaultTtlAsIso8601(Duration.parse("PT1H"))
                            .withFeedback(
                                new FeedbackProperties()
                                    .withLockDurationAsIso8601(Duration.parse("PT1M"))
                                    .withTtlAsIso8601(Duration.parse("PT1H"))
                                    .withMaxDeliveryCount(10)))
                    .withFeatures(Capabilities.NONE)
                    .withEnableDataResidency(true)
                    .withRootCertificate(new RootCertificateProperties().withEnableRootCertificateV2(true))
                    .withIpVersion(IpVersion.IPV4IPV6))
            .create();
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
