// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkPacketBroker;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkPacketBrokersCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"networkFabricId\":\"bncdrchuew\",\"networkDeviceIds\":[\"qcbonqjoekcjcgl\",\"obctit\",\"xrbalvkfdq\",\"lprqhxfq\"],\"sourceInterfaceIds\":[\"dyrqlazfjltckb\",\"vdxhyfv\",\"tde\"],\"networkTapIds\":[\"zpxalkqlvbkz\"],\"neighborGroupIds\":[\"rnwwoiviniyoizuw\",\"zcri\"],\"provisioningState\":\"Succeeded\"},\"location\":\"elnqalbsoqxajs\",\"tags\":{\"zbwxuypcuri\":\"aibqjb\",\"qdqtz\":\"llxtclv\",\"rymi\":\"hwlwj\",\"wbd\":\"sghhcmqdlk\"},\"id\":\"kbv\",\"name\":\"ulmka\",\"type\":\"dnxbssatpialrq\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ManagedNetworkFabricManager manager =
            ManagedNetworkFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        NetworkPacketBroker response =
            manager
                .networkPacketBrokers()
                .define("qczzscgrop")
                .withRegion("wvkuhtdxdcodzdh")
                .withExistingResourceGroup("bsjtfqwlb")
                .withNetworkFabricId("q")
                .withTags(mapOf("vmxiundifuahtk", "m", "ayxnlvt", "ccrusrzsfoqodya", "o", "p"))
                .create();

        Assertions.assertEquals("elnqalbsoqxajs", response.location());
        Assertions.assertEquals("aibqjb", response.tags().get("zbwxuypcuri"));
        Assertions.assertEquals("bncdrchuew", response.networkFabricId());
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
