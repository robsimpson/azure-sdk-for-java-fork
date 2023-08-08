// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.ExternalNetworkInner;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.ExternalNetworkPropertiesOptionAProperties;
import com.azure.resourcemanager.managednetworkfabric.models.ExternalNetworksList;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.L3OptionBProperties;
import com.azure.resourcemanager.managednetworkfabric.models.PeeringOption;
import com.azure.resourcemanager.managednetworkfabric.models.RouteTargetInformation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ExternalNetworksListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExternalNetworksList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"networkToNetworkInterconnectId\":\"wjxildfkcefeyg\",\"peeringOption\":\"OptionA\",\"optionBProperties\":{\"importRouteTargets\":[\"isf\",\"naybdjnxu\",\"entq\"],\"exportRouteTargets\":[\"why\"],\"routeTargets\":{\"importIpv4RouteTargets\":[\"ulwivqtowlhlsy\"],\"importIpv6RouteTargets\":[\"bajasqubfajcy\",\"hjqwmchqoh\",\"fxcpupukiym\"],\"exportIpv4RouteTargets\":[\"wdlvwtiwsmosaon\",\"qnamppultassa\"],\"exportIpv6RouteTargets\":[\"wnaze\",\"jb\",\"aj\",\"cyizy\"]}},\"optionAProperties\":{\"mtu\":189759629,\"vlanId\":450716443,\"fabricASN\":3845239989402943033,\"peerASN\":5873155808619890798,\"bfdConfiguration\":{\"administrativeState\":\"MAT\",\"intervalInMilliSeconds\":1751656917,\"multiplier\":990264400},\"ingressAclId\":\"lvgecpwgoljtz\",\"egressAclId\":\"mxsdobygoog\",\"primaryIpv4Prefix\":\"apjxvazyjfucsao\",\"primaryIpv6Prefix\":\"nosdkvi\",\"secondaryIpv4Prefix\":\"asgmatrnzpd\",\"secondaryIpv6Prefix\":\"daaktuj\"},\"configurationState\":\"ErrorProvisioning\",\"provisioningState\":\"Canceled\",\"administrativeState\":\"Enabled\",\"importRoutePolicyId\":\"fpqdow\",\"exportRoutePolicyId\":\"pnw\",\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"fvpctfji\",\"importIpv6RoutePolicyId\":\"ff\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"uhznwhvuldbk\",\"exportIpv6RoutePolicyId\":\"jjkj\"},\"annotation\":\"awgazmxjqifh\"},\"id\":\"jjsbcmlzaahzbhur\",\"name\":\"olk\",\"type\":\"lirh\"},{\"properties\":{\"networkToNetworkInterconnectId\":\"ojusuzgfjzcva\",\"peeringOption\":\"OptionA\",\"optionBProperties\":{\"importRouteTargets\":[\"lahfxwccokdxk\",\"kmkcz\"],\"exportRouteTargets\":[\"h\",\"oq\",\"qshavlj\",\"k\"],\"routeTargets\":{\"importIpv4RouteTargets\":[\"olnthb\",\"nkgzukwdr\",\"zkjthfceyjn\"],\"importIpv6RouteTargets\":[\"lfuyfjbpfiddhlr\",\"fz\",\"qyjmqrfuioc\"],\"exportIpv4RouteTargets\":[\"lqkrs\"],\"exportIpv6RouteTargets\":[\"hxuddqm\",\"tffisjmr\",\"khmwdmd\"]}},\"optionAProperties\":{\"mtu\":265964449,\"vlanId\":2087425437,\"fabricASN\":655413510150403056,\"peerASN\":4600830996687692127,\"bfdConfiguration\":{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":1605627169,\"multiplier\":1087757375},\"ingressAclId\":\"qqdlcvmyolcay\",\"egressAclId\":\"chtvsnvlaqd\",\"primaryIpv4Prefix\":\"yzawatu\",\"primaryIpv6Prefix\":\"kokb\",\"secondaryIpv4Prefix\":\"othymgobl\",\"secondaryIpv6Prefix\":\"snwgwimaa\"},\"configurationState\":\"Succeeded\",\"provisioningState\":\"Accepted\",\"administrativeState\":\"Disabled\",\"importRoutePolicyId\":\"obcyanrfvqtvk\",\"exportRoutePolicyId\":\"voogxkfna\",\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"ymhcctopuo\",\"importIpv6RoutePolicyId\":\"rnskby\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"hczygxvhajpxe\",\"exportIpv6RoutePolicyId\":\"qnwhscozawmvg\"},\"annotation\":\"mpk\"},\"id\":\"pwirfljfewxqouo\",\"name\":\"ud\",\"type\":\"mckaprh\"}],\"nextLink\":\"qiijgenc\"}")
                .toObject(ExternalNetworksList.class);
        Assertions.assertEquals(PeeringOption.OPTIONA, model.value().get(0).peeringOption());
        Assertions.assertEquals("isf", model.value().get(0).optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("why", model.value().get(0).optionBProperties().exportRouteTargets().get(0));
        Assertions
            .assertEquals(
                "ulwivqtowlhlsy",
                model.value().get(0).optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions
            .assertEquals(
                "bajasqubfajcy",
                model.value().get(0).optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions
            .assertEquals(
                "wdlvwtiwsmosaon",
                model.value().get(0).optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions
            .assertEquals(
                "wnaze", model.value().get(0).optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals("apjxvazyjfucsao", model.value().get(0).optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("nosdkvi", model.value().get(0).optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("asgmatrnzpd", model.value().get(0).optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("daaktuj", model.value().get(0).optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals(189759629, model.value().get(0).optionAProperties().mtu());
        Assertions.assertEquals(450716443, model.value().get(0).optionAProperties().vlanId());
        Assertions.assertEquals(5873155808619890798L, model.value().get(0).optionAProperties().peerAsn());
        Assertions
            .assertEquals(
                1751656917, model.value().get(0).optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(990264400, model.value().get(0).optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("lvgecpwgoljtz", model.value().get(0).optionAProperties().ingressAclId());
        Assertions.assertEquals("mxsdobygoog", model.value().get(0).optionAProperties().egressAclId());
        Assertions.assertEquals("fpqdow", model.value().get(0).importRoutePolicyId());
        Assertions.assertEquals("pnw", model.value().get(0).exportRoutePolicyId());
        Assertions.assertEquals("fvpctfji", model.value().get(0).importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("ff", model.value().get(0).importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("uhznwhvuldbk", model.value().get(0).exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("jjkj", model.value().get(0).exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("awgazmxjqifh", model.value().get(0).annotation());
        Assertions.assertEquals("qiijgenc", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExternalNetworksList model =
            new ExternalNetworksList()
                .withValue(
                    Arrays
                        .asList(
                            new ExternalNetworkInner()
                                .withPeeringOption(PeeringOption.OPTIONA)
                                .withOptionBProperties(
                                    new L3OptionBProperties()
                                        .withImportRouteTargets(Arrays.asList("isf", "naybdjnxu", "entq"))
                                        .withExportRouteTargets(Arrays.asList("why"))
                                        .withRouteTargets(
                                            new RouteTargetInformation()
                                                .withImportIpv4RouteTargets(Arrays.asList("ulwivqtowlhlsy"))
                                                .withImportIpv6RouteTargets(
                                                    Arrays.asList("bajasqubfajcy", "hjqwmchqoh", "fxcpupukiym"))
                                                .withExportIpv4RouteTargets(
                                                    Arrays.asList("wdlvwtiwsmosaon", "qnamppultassa"))
                                                .withExportIpv6RouteTargets(
                                                    Arrays.asList("wnaze", "jb", "aj", "cyizy"))))
                                .withOptionAProperties(
                                    new ExternalNetworkPropertiesOptionAProperties()
                                        .withPrimaryIpv4Prefix("apjxvazyjfucsao")
                                        .withPrimaryIpv6Prefix("nosdkvi")
                                        .withSecondaryIpv4Prefix("asgmatrnzpd")
                                        .withSecondaryIpv6Prefix("daaktuj")
                                        .withMtu(189759629)
                                        .withVlanId(450716443)
                                        .withPeerAsn(5873155808619890798L)
                                        .withBfdConfiguration(
                                            new BfdConfiguration()
                                                .withIntervalInMilliSeconds(1751656917)
                                                .withMultiplier(990264400))
                                        .withIngressAclId("lvgecpwgoljtz")
                                        .withEgressAclId("mxsdobygoog"))
                                .withImportRoutePolicyId("fpqdow")
                                .withExportRoutePolicyId("pnw")
                                .withImportRoutePolicy(
                                    new ImportRoutePolicy()
                                        .withImportIpv4RoutePolicyId("fvpctfji")
                                        .withImportIpv6RoutePolicyId("ff"))
                                .withExportRoutePolicy(
                                    new ExportRoutePolicy()
                                        .withExportIpv4RoutePolicyId("uhznwhvuldbk")
                                        .withExportIpv6RoutePolicyId("jjkj"))
                                .withAnnotation("awgazmxjqifh"),
                            new ExternalNetworkInner()
                                .withPeeringOption(PeeringOption.OPTIONA)
                                .withOptionBProperties(
                                    new L3OptionBProperties()
                                        .withImportRouteTargets(Arrays.asList("lahfxwccokdxk", "kmkcz"))
                                        .withExportRouteTargets(Arrays.asList("h", "oq", "qshavlj", "k"))
                                        .withRouteTargets(
                                            new RouteTargetInformation()
                                                .withImportIpv4RouteTargets(
                                                    Arrays.asList("olnthb", "nkgzukwdr", "zkjthfceyjn"))
                                                .withImportIpv6RouteTargets(
                                                    Arrays.asList("lfuyfjbpfiddhlr", "fz", "qyjmqrfuioc"))
                                                .withExportIpv4RouteTargets(Arrays.asList("lqkrs"))
                                                .withExportIpv6RouteTargets(
                                                    Arrays.asList("hxuddqm", "tffisjmr", "khmwdmd"))))
                                .withOptionAProperties(
                                    new ExternalNetworkPropertiesOptionAProperties()
                                        .withPrimaryIpv4Prefix("yzawatu")
                                        .withPrimaryIpv6Prefix("kokb")
                                        .withSecondaryIpv4Prefix("othymgobl")
                                        .withSecondaryIpv6Prefix("snwgwimaa")
                                        .withMtu(265964449)
                                        .withVlanId(2087425437)
                                        .withPeerAsn(4600830996687692127L)
                                        .withBfdConfiguration(
                                            new BfdConfiguration()
                                                .withIntervalInMilliSeconds(1605627169)
                                                .withMultiplier(1087757375))
                                        .withIngressAclId("qqdlcvmyolcay")
                                        .withEgressAclId("chtvsnvlaqd"))
                                .withImportRoutePolicyId("obcyanrfvqtvk")
                                .withExportRoutePolicyId("voogxkfna")
                                .withImportRoutePolicy(
                                    new ImportRoutePolicy()
                                        .withImportIpv4RoutePolicyId("ymhcctopuo")
                                        .withImportIpv6RoutePolicyId("rnskby"))
                                .withExportRoutePolicy(
                                    new ExportRoutePolicy()
                                        .withExportIpv4RoutePolicyId("hczygxvhajpxe")
                                        .withExportIpv6RoutePolicyId("qnwhscozawmvg"))
                                .withAnnotation("mpk")))
                .withNextLink("qiijgenc");
        model = BinaryData.fromObject(model).toObject(ExternalNetworksList.class);
        Assertions.assertEquals(PeeringOption.OPTIONA, model.value().get(0).peeringOption());
        Assertions.assertEquals("isf", model.value().get(0).optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("why", model.value().get(0).optionBProperties().exportRouteTargets().get(0));
        Assertions
            .assertEquals(
                "ulwivqtowlhlsy",
                model.value().get(0).optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions
            .assertEquals(
                "bajasqubfajcy",
                model.value().get(0).optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions
            .assertEquals(
                "wdlvwtiwsmosaon",
                model.value().get(0).optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions
            .assertEquals(
                "wnaze", model.value().get(0).optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals("apjxvazyjfucsao", model.value().get(0).optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("nosdkvi", model.value().get(0).optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("asgmatrnzpd", model.value().get(0).optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("daaktuj", model.value().get(0).optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals(189759629, model.value().get(0).optionAProperties().mtu());
        Assertions.assertEquals(450716443, model.value().get(0).optionAProperties().vlanId());
        Assertions.assertEquals(5873155808619890798L, model.value().get(0).optionAProperties().peerAsn());
        Assertions
            .assertEquals(
                1751656917, model.value().get(0).optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(990264400, model.value().get(0).optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("lvgecpwgoljtz", model.value().get(0).optionAProperties().ingressAclId());
        Assertions.assertEquals("mxsdobygoog", model.value().get(0).optionAProperties().egressAclId());
        Assertions.assertEquals("fpqdow", model.value().get(0).importRoutePolicyId());
        Assertions.assertEquals("pnw", model.value().get(0).exportRoutePolicyId());
        Assertions.assertEquals("fvpctfji", model.value().get(0).importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("ff", model.value().get(0).importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("uhznwhvuldbk", model.value().get(0).exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("jjkj", model.value().get(0).exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("awgazmxjqifh", model.value().get(0).annotation());
        Assertions.assertEquals("qiijgenc", model.nextLink());
    }
}
