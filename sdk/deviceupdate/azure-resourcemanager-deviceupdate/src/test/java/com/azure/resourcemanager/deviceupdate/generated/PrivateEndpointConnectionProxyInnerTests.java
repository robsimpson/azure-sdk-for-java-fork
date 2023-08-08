// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.fluent.models.PrivateEndpointConnectionProxyInner;
import com.azure.resourcemanager.deviceupdate.models.ConnectionDetails;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkServiceConnection;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkServiceProxy;
import com.azure.resourcemanager.deviceupdate.models.RemotePrivateEndpoint;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionProxyInnerTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionProxyInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Creating\"},\"eTag\":\"aamdect\",\"remotePrivateEndpoint\":{\"id\":\"iqscjeypv\",\"location\":\"zrkgqhcjrefovg\",\"immutableSubscriptionId\":\"qsl\",\"immutableResourceId\":\"yvxyqjp\",\"vnetTrafficTag\":\"attpngjcrcczsq\",\"manualPrivateLinkServiceConnections\":[{\"name\":\"mdajv\",\"groupIds\":[],\"requestMessage\":\"ounqecano\"},{\"name\":\"upfh\",\"groupIds\":[],\"requestMessage\":\"trpmo\"},{\"name\":\"mcmatuokthfuiu\",\"groupIds\":[],\"requestMessage\":\"sfcpkvxodpuozm\"},{\"name\":\"ydagfuaxbe\",\"groupIds\":[],\"requestMessage\":\"uokktwhrdxwz\"}],\"privateLinkServiceConnections\":[{\"name\":\"mbsureximo\",\"groupIds\":[],\"requestMessage\":\"cfsf\"}],\"privateLinkServiceProxies\":[{\"id\":\"ddystkiiuxhqy\",\"groupConnectivityInformation\":[]},{\"id\":\"rq\",\"groupConnectivityInformation\":[]}],\"connectionDetails\":[{\"id\":\"yifqrvkdvjsllrmv\",\"privateIpAddress\":\"f\",\"linkIdentifier\":\"t\",\"groupId\":\"n\",\"memberName\":\"lexxbczwtru\"},{\"id\":\"qzbqjvsov\",\"privateIpAddress\":\"okacspk\",\"linkIdentifier\":\"hzdobpxjmflbvvnc\",\"groupId\":\"kcciwwzjuqkhr\",\"memberName\":\"jiwkuofoskghsau\"},{\"id\":\"mjmvxieduugidyjr\",\"privateIpAddress\":\"byao\",\"linkIdentifier\":\"e\",\"groupId\":\"sonpclhocohs\",\"memberName\":\"ev\"}]},\"status\":\"ggzfbu\",\"id\":\"fmvfaxkffeiit\",\"name\":\"lvmezyvshxmzsbbz\",\"type\":\"ggi\"}")
                .toObject(PrivateEndpointConnectionProxyInner.class);
        Assertions.assertEquals("iqscjeypv", model.remotePrivateEndpoint().id());
        Assertions.assertEquals("zrkgqhcjrefovg", model.remotePrivateEndpoint().location());
        Assertions.assertEquals("qsl", model.remotePrivateEndpoint().immutableSubscriptionId());
        Assertions.assertEquals("yvxyqjp", model.remotePrivateEndpoint().immutableResourceId());
        Assertions.assertEquals("attpngjcrcczsq", model.remotePrivateEndpoint().vnetTrafficTag());
        Assertions
            .assertEquals("mdajv", model.remotePrivateEndpoint().manualPrivateLinkServiceConnections().get(0).name());
        Assertions
            .assertEquals(
                "ounqecano",
                model.remotePrivateEndpoint().manualPrivateLinkServiceConnections().get(0).requestMessage());
        Assertions
            .assertEquals("mbsureximo", model.remotePrivateEndpoint().privateLinkServiceConnections().get(0).name());
        Assertions
            .assertEquals(
                "cfsf", model.remotePrivateEndpoint().privateLinkServiceConnections().get(0).requestMessage());
        Assertions.assertEquals("ddystkiiuxhqy", model.remotePrivateEndpoint().privateLinkServiceProxies().get(0).id());
        Assertions.assertEquals("ggzfbu", model.status());
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionProxyInner model =
            new PrivateEndpointConnectionProxyInner()
                .withRemotePrivateEndpoint(
                    new RemotePrivateEndpoint()
                        .withId("iqscjeypv")
                        .withLocation("zrkgqhcjrefovg")
                        .withImmutableSubscriptionId("qsl")
                        .withImmutableResourceId("yvxyqjp")
                        .withVnetTrafficTag("attpngjcrcczsq")
                        .withManualPrivateLinkServiceConnections(
                            Arrays
                                .asList(
                                    new PrivateLinkServiceConnection()
                                        .withName("mdajv")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("ounqecano"),
                                    new PrivateLinkServiceConnection()
                                        .withName("upfh")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("trpmo"),
                                    new PrivateLinkServiceConnection()
                                        .withName("mcmatuokthfuiu")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("sfcpkvxodpuozm"),
                                    new PrivateLinkServiceConnection()
                                        .withName("ydagfuaxbe")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("uokktwhrdxwz")))
                        .withPrivateLinkServiceConnections(
                            Arrays
                                .asList(
                                    new PrivateLinkServiceConnection()
                                        .withName("mbsureximo")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("cfsf")))
                        .withPrivateLinkServiceProxies(
                            Arrays
                                .asList(
                                    new PrivateLinkServiceProxy()
                                        .withId("ddystkiiuxhqy")
                                        .withGroupConnectivityInformation(Arrays.asList()),
                                    new PrivateLinkServiceProxy()
                                        .withId("rq")
                                        .withGroupConnectivityInformation(Arrays.asList())))
                        .withConnectionDetails(
                            Arrays.asList(new ConnectionDetails(), new ConnectionDetails(), new ConnectionDetails())))
                .withStatus("ggzfbu");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProxyInner.class);
        Assertions.assertEquals("iqscjeypv", model.remotePrivateEndpoint().id());
        Assertions.assertEquals("zrkgqhcjrefovg", model.remotePrivateEndpoint().location());
        Assertions.assertEquals("qsl", model.remotePrivateEndpoint().immutableSubscriptionId());
        Assertions.assertEquals("yvxyqjp", model.remotePrivateEndpoint().immutableResourceId());
        Assertions.assertEquals("attpngjcrcczsq", model.remotePrivateEndpoint().vnetTrafficTag());
        Assertions
            .assertEquals("mdajv", model.remotePrivateEndpoint().manualPrivateLinkServiceConnections().get(0).name());
        Assertions
            .assertEquals(
                "ounqecano",
                model.remotePrivateEndpoint().manualPrivateLinkServiceConnections().get(0).requestMessage());
        Assertions
            .assertEquals("mbsureximo", model.remotePrivateEndpoint().privateLinkServiceConnections().get(0).name());
        Assertions
            .assertEquals(
                "cfsf", model.remotePrivateEndpoint().privateLinkServiceConnections().get(0).requestMessage());
        Assertions.assertEquals("ddystkiiuxhqy", model.remotePrivateEndpoint().privateLinkServiceProxies().get(0).id());
        Assertions.assertEquals("ggzfbu", model.status());
    }
}
