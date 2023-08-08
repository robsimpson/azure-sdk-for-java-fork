// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.FrontDoorProperties;
import com.azure.resourcemanager.frontdoor.fluent.models.FrontendEndpointInner;
import com.azure.resourcemanager.frontdoor.models.BackendPool;
import com.azure.resourcemanager.frontdoor.models.BackendPoolsSettings;
import com.azure.resourcemanager.frontdoor.models.EnforceCertificateNameCheckEnabledState;
import com.azure.resourcemanager.frontdoor.models.FrontDoorEnabledState;
import com.azure.resourcemanager.frontdoor.models.FrontDoorHealthProbeMethod;
import com.azure.resourcemanager.frontdoor.models.FrontDoorProtocol;
import com.azure.resourcemanager.frontdoor.models.HealthProbeEnabled;
import com.azure.resourcemanager.frontdoor.models.HealthProbeSettingsModel;
import com.azure.resourcemanager.frontdoor.models.LoadBalancingSettingsModel;
import com.azure.resourcemanager.frontdoor.models.RoutingRule;
import com.azure.resourcemanager.frontdoor.models.RoutingRuleEnabledState;
import com.azure.resourcemanager.frontdoor.models.SessionAffinityEnabledState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FrontDoorPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FrontDoorProperties model =
            BinaryData
                .fromString(
                    "{\"resourceState\":\"Disabling\",\"provisioningState\":\"shxmzsbbzoggigrx\",\"cname\":\"ur\",\"frontdoorId\":\"xxjnspydptk\",\"rulesEngines\":[{\"properties\":{\"resourceState\":\"Disabled\",\"rules\":[]},\"id\":\"nvudwtiukb\",\"name\":\"dng\",\"type\":\"pocipazyxoegu\"},{\"properties\":{\"resourceState\":\"Migrated\",\"rules\":[]},\"id\":\"iucgygevqzn\",\"name\":\"yp\",\"type\":\"rbpizc\"}],\"extendedProperties\":{\"dpydn\":\"j\",\"sjttgzfbish\":\"yhxdeoejzicwi\",\"jdeyeamdpha\":\"bkh\",\"wkgshwa\":\"alpbuxwgipwhon\"},\"friendlyName\":\"ixzbinjeputtmryw\",\"routingRules\":[{\"properties\":{\"resourceState\":\"Deleting\",\"frontendEndpoints\":[],\"acceptedProtocols\":[],\"patternsToMatch\":[],\"enabledState\":\"Disabled\"},\"name\":\"qvyxlwhzlsicoho\",\"type\":\"nwvlryavwhheunmm\",\"id\":\"gyxzk\"},{\"properties\":{\"resourceState\":\"Migrating\",\"frontendEndpoints\":[],\"acceptedProtocols\":[],\"patternsToMatch\":[],\"enabledState\":\"Enabled\"},\"name\":\"conuqszfkbeype\",\"type\":\"mjmwvvjektcx\",\"id\":\"nhwlrsffrzpwvl\"},{\"properties\":{\"resourceState\":\"Deleting\",\"frontendEndpoints\":[],\"acceptedProtocols\":[],\"patternsToMatch\":[],\"enabledState\":\"Disabled\"},\"name\":\"etcktvfcivfsnk\",\"type\":\"uctqhjfbe\",\"id\":\"jcxerfuwu\"},{\"properties\":{\"resourceState\":\"Disabled\",\"frontendEndpoints\":[],\"acceptedProtocols\":[],\"patternsToMatch\":[],\"enabledState\":\"Disabled\"},\"name\":\"xepcyvahfn\",\"type\":\"kyqxjvuujqgidokg\",\"id\":\"jyoxgvclt\"}],\"loadBalancingSettings\":[{\"properties\":{\"resourceState\":\"Deleting\",\"sampleSize\":1435851366,\"successfulSamplesRequired\":630804167,\"additionalLatencyMilliseconds\":331647248},\"name\":\"hbijhtxfvgxb\",\"type\":\"mxnehmp\",\"id\":\"cxgod\"},{\"properties\":{\"resourceState\":\"Enabled\",\"sampleSize\":898595537,\"successfulSamplesRequired\":897407586,\"additionalLatencyMilliseconds\":1123544345},\"name\":\"kgriwflzlfbx\",\"type\":\"uzycispnqza\",\"id\":\"gkbrpyyd\"},{\"properties\":{\"resourceState\":\"Migrating\",\"sampleSize\":312010573,\"successfulSamplesRequired\":486608625,\"additionalLatencyMilliseconds\":500953055},\"name\":\"a\",\"type\":\"gvtqagnbuynh\",\"id\":\"gg\"}],\"healthProbeSettings\":[{\"properties\":{\"resourceState\":\"Deleting\",\"path\":\"rbu\",\"protocol\":\"Https\",\"intervalInSeconds\":1477198207,\"healthProbeMethod\":\"HEAD\",\"enabledState\":\"Disabled\"},\"name\":\"hj\",\"type\":\"nmpxttdb\",\"id\":\"bnlankxmyskpb\"}],\"backendPools\":[{\"properties\":{\"resourceState\":\"Disabling\",\"backends\":[]},\"name\":\"ny\",\"type\":\"rsyn\",\"id\":\"idybyxczf\"},{\"properties\":{\"resourceState\":\"Migrating\",\"backends\":[]},\"name\":\"abphlw\",\"type\":\"lfktsths\",\"id\":\"ocmnyyazttbtwwrq\"},{\"properties\":{\"resourceState\":\"Deleting\",\"backends\":[]},\"name\":\"wbiexzfey\",\"type\":\"axibxujw\",\"id\":\"qwalmuzyoxaepd\"},{\"properties\":{\"resourceState\":\"Disabling\",\"backends\":[]},\"name\":\"rhdwbavxbniw\",\"type\":\"swzts\",\"id\":\"pgn\"}],\"frontendEndpoints\":[{\"properties\":{\"resourceState\":\"Enabled\",\"customHttpsProvisioningState\":\"Enabling\",\"customHttpsProvisioningSubstate\":\"CertificateDeleted\",\"hostName\":\"zabglcuhxwt\",\"sessionAffinityEnabledState\":\"Disabled\",\"sessionAffinityTtlSeconds\":228169976},\"name\":\"bbovplwzbhvgyugu\",\"type\":\"vmkfssxqu\",\"id\":\"fpl\"}],\"backendPoolsSettings\":{\"enforceCertificateNameCheck\":\"Disabled\",\"sendRecvTimeoutSeconds\":1462188439},\"enabledState\":\"Disabled\"}")
                .toObject(FrontDoorProperties.class);
        Assertions.assertEquals("ixzbinjeputtmryw", model.friendlyName());
        Assertions.assertEquals("gyxzk", model.routingRules().get(0).id());
        Assertions.assertEquals("qvyxlwhzlsicoho", model.routingRules().get(0).name());
        Assertions.assertEquals(RoutingRuleEnabledState.DISABLED, model.routingRules().get(0).enabledState());
        Assertions.assertEquals("cxgod", model.loadBalancingSettings().get(0).id());
        Assertions.assertEquals("hbijhtxfvgxb", model.loadBalancingSettings().get(0).name());
        Assertions.assertEquals(1435851366, model.loadBalancingSettings().get(0).sampleSize());
        Assertions.assertEquals(630804167, model.loadBalancingSettings().get(0).successfulSamplesRequired());
        Assertions.assertEquals(331647248, model.loadBalancingSettings().get(0).additionalLatencyMilliseconds());
        Assertions.assertEquals("bnlankxmyskpb", model.healthProbeSettings().get(0).id());
        Assertions.assertEquals("hj", model.healthProbeSettings().get(0).name());
        Assertions.assertEquals("rbu", model.healthProbeSettings().get(0).path());
        Assertions.assertEquals(FrontDoorProtocol.HTTPS, model.healthProbeSettings().get(0).protocol());
        Assertions.assertEquals(1477198207, model.healthProbeSettings().get(0).intervalInSeconds());
        Assertions
            .assertEquals(FrontDoorHealthProbeMethod.HEAD, model.healthProbeSettings().get(0).healthProbeMethod());
        Assertions.assertEquals(HealthProbeEnabled.DISABLED, model.healthProbeSettings().get(0).enabledState());
        Assertions.assertEquals("idybyxczf", model.backendPools().get(0).id());
        Assertions.assertEquals("ny", model.backendPools().get(0).name());
        Assertions.assertEquals("fpl", model.frontendEndpoints().get(0).id());
        Assertions.assertEquals("bbovplwzbhvgyugu", model.frontendEndpoints().get(0).name());
        Assertions.assertEquals("zabglcuhxwt", model.frontendEndpoints().get(0).hostname());
        Assertions
            .assertEquals(
                SessionAffinityEnabledState.DISABLED, model.frontendEndpoints().get(0).sessionAffinityEnabledState());
        Assertions.assertEquals(228169976, model.frontendEndpoints().get(0).sessionAffinityTtlSeconds());
        Assertions
            .assertEquals(
                EnforceCertificateNameCheckEnabledState.DISABLED,
                model.backendPoolsSettings().enforceCertificateNameCheck());
        Assertions.assertEquals(1462188439, model.backendPoolsSettings().sendRecvTimeoutSeconds());
        Assertions.assertEquals(FrontDoorEnabledState.DISABLED, model.enabledState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FrontDoorProperties model =
            new FrontDoorProperties()
                .withFriendlyName("ixzbinjeputtmryw")
                .withRoutingRules(
                    Arrays
                        .asList(
                            new RoutingRule()
                                .withId("gyxzk")
                                .withName("qvyxlwhzlsicoho")
                                .withFrontendEndpoints(Arrays.asList())
                                .withAcceptedProtocols(Arrays.asList())
                                .withPatternsToMatch(Arrays.asList())
                                .withEnabledState(RoutingRuleEnabledState.DISABLED),
                            new RoutingRule()
                                .withId("nhwlrsffrzpwvl")
                                .withName("conuqszfkbeype")
                                .withFrontendEndpoints(Arrays.asList())
                                .withAcceptedProtocols(Arrays.asList())
                                .withPatternsToMatch(Arrays.asList())
                                .withEnabledState(RoutingRuleEnabledState.ENABLED),
                            new RoutingRule()
                                .withId("jcxerfuwu")
                                .withName("etcktvfcivfsnk")
                                .withFrontendEndpoints(Arrays.asList())
                                .withAcceptedProtocols(Arrays.asList())
                                .withPatternsToMatch(Arrays.asList())
                                .withEnabledState(RoutingRuleEnabledState.DISABLED),
                            new RoutingRule()
                                .withId("jyoxgvclt")
                                .withName("xepcyvahfn")
                                .withFrontendEndpoints(Arrays.asList())
                                .withAcceptedProtocols(Arrays.asList())
                                .withPatternsToMatch(Arrays.asList())
                                .withEnabledState(RoutingRuleEnabledState.DISABLED)))
                .withLoadBalancingSettings(
                    Arrays
                        .asList(
                            new LoadBalancingSettingsModel()
                                .withId("cxgod")
                                .withName("hbijhtxfvgxb")
                                .withSampleSize(1435851366)
                                .withSuccessfulSamplesRequired(630804167)
                                .withAdditionalLatencyMilliseconds(331647248),
                            new LoadBalancingSettingsModel()
                                .withId("gkbrpyyd")
                                .withName("kgriwflzlfbx")
                                .withSampleSize(898595537)
                                .withSuccessfulSamplesRequired(897407586)
                                .withAdditionalLatencyMilliseconds(1123544345),
                            new LoadBalancingSettingsModel()
                                .withId("gg")
                                .withName("a")
                                .withSampleSize(312010573)
                                .withSuccessfulSamplesRequired(486608625)
                                .withAdditionalLatencyMilliseconds(500953055)))
                .withHealthProbeSettings(
                    Arrays
                        .asList(
                            new HealthProbeSettingsModel()
                                .withId("bnlankxmyskpb")
                                .withName("hj")
                                .withPath("rbu")
                                .withProtocol(FrontDoorProtocol.HTTPS)
                                .withIntervalInSeconds(1477198207)
                                .withHealthProbeMethod(FrontDoorHealthProbeMethod.HEAD)
                                .withEnabledState(HealthProbeEnabled.DISABLED)))
                .withBackendPools(
                    Arrays
                        .asList(
                            new BackendPool().withId("idybyxczf").withName("ny").withBackends(Arrays.asList()),
                            new BackendPool()
                                .withId("ocmnyyazttbtwwrq")
                                .withName("abphlw")
                                .withBackends(Arrays.asList()),
                            new BackendPool()
                                .withId("qwalmuzyoxaepd")
                                .withName("wbiexzfey")
                                .withBackends(Arrays.asList()),
                            new BackendPool().withId("pgn").withName("rhdwbavxbniw").withBackends(Arrays.asList())))
                .withFrontendEndpoints(
                    Arrays
                        .asList(
                            new FrontendEndpointInner()
                                .withId("fpl")
                                .withName("bbovplwzbhvgyugu")
                                .withHostname("zabglcuhxwt")
                                .withSessionAffinityEnabledState(SessionAffinityEnabledState.DISABLED)
                                .withSessionAffinityTtlSeconds(228169976)))
                .withBackendPoolsSettings(
                    new BackendPoolsSettings()
                        .withEnforceCertificateNameCheck(EnforceCertificateNameCheckEnabledState.DISABLED)
                        .withSendRecvTimeoutSeconds(1462188439))
                .withEnabledState(FrontDoorEnabledState.DISABLED);
        model = BinaryData.fromObject(model).toObject(FrontDoorProperties.class);
        Assertions.assertEquals("ixzbinjeputtmryw", model.friendlyName());
        Assertions.assertEquals("gyxzk", model.routingRules().get(0).id());
        Assertions.assertEquals("qvyxlwhzlsicoho", model.routingRules().get(0).name());
        Assertions.assertEquals(RoutingRuleEnabledState.DISABLED, model.routingRules().get(0).enabledState());
        Assertions.assertEquals("cxgod", model.loadBalancingSettings().get(0).id());
        Assertions.assertEquals("hbijhtxfvgxb", model.loadBalancingSettings().get(0).name());
        Assertions.assertEquals(1435851366, model.loadBalancingSettings().get(0).sampleSize());
        Assertions.assertEquals(630804167, model.loadBalancingSettings().get(0).successfulSamplesRequired());
        Assertions.assertEquals(331647248, model.loadBalancingSettings().get(0).additionalLatencyMilliseconds());
        Assertions.assertEquals("bnlankxmyskpb", model.healthProbeSettings().get(0).id());
        Assertions.assertEquals("hj", model.healthProbeSettings().get(0).name());
        Assertions.assertEquals("rbu", model.healthProbeSettings().get(0).path());
        Assertions.assertEquals(FrontDoorProtocol.HTTPS, model.healthProbeSettings().get(0).protocol());
        Assertions.assertEquals(1477198207, model.healthProbeSettings().get(0).intervalInSeconds());
        Assertions
            .assertEquals(FrontDoorHealthProbeMethod.HEAD, model.healthProbeSettings().get(0).healthProbeMethod());
        Assertions.assertEquals(HealthProbeEnabled.DISABLED, model.healthProbeSettings().get(0).enabledState());
        Assertions.assertEquals("idybyxczf", model.backendPools().get(0).id());
        Assertions.assertEquals("ny", model.backendPools().get(0).name());
        Assertions.assertEquals("fpl", model.frontendEndpoints().get(0).id());
        Assertions.assertEquals("bbovplwzbhvgyugu", model.frontendEndpoints().get(0).name());
        Assertions.assertEquals("zabglcuhxwt", model.frontendEndpoints().get(0).hostname());
        Assertions
            .assertEquals(
                SessionAffinityEnabledState.DISABLED, model.frontendEndpoints().get(0).sessionAffinityEnabledState());
        Assertions.assertEquals(228169976, model.frontendEndpoints().get(0).sessionAffinityTtlSeconds());
        Assertions
            .assertEquals(
                EnforceCertificateNameCheckEnabledState.DISABLED,
                model.backendPoolsSettings().enforceCertificateNameCheck());
        Assertions.assertEquals(1462188439, model.backendPoolsSettings().sendRecvTimeoutSeconds());
        Assertions.assertEquals(FrontDoorEnabledState.DISABLED, model.enabledState());
    }
}
