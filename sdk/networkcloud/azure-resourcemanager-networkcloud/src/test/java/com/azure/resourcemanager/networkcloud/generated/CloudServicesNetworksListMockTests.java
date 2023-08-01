// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetwork;
import com.azure.resourcemanager.networkcloud.models.CloudServicesNetworkEnableDefaultEgressEndpoints;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CloudServicesNetworksListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"extendedLocation\":{\"name\":\"mfsvbpav\",\"type\":\"opfppdbwnupgah\"},\"properties\":{\"additionalEgressEndpoints\":[],\"associatedResourceIds\":[\"jcaacfdmmcpugm\",\"hqepvufhbzehewh\",\"qhnlbqnbld\",\"eaclgschorimk\"],\"clusterId\":\"r\",\"detailedStatus\":\"Available\",\"detailedStatusMessage\":\"cso\",\"enableDefaultEgressEndpoints\":\"True\",\"enabledEgressEndpoints\":[],\"hybridAksClustersAssociatedIds\":[\"yfcaabeolhbhlvbm\"],\"interfaceName\":\"qi\",\"provisioningState\":\"Failed\",\"virtualMachinesAssociatedIds\":[\"cudfbsfarfsiowl\",\"jxnqp\",\"wgfstmhqykizm\",\"ksaoafcluqvox\"]},\"location\":\"cjimryvwgcwwpbmz\",\"tags\":{\"bvopwndyqle\":\"sydsxwefohe\",\"lowkxxpvb\":\"llklmtk\"},\"id\":\"dfjmzsyzfhotlh\",\"name\":\"k\",\"type\":\"yych\"}]}";

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

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<CloudServicesNetwork> response =
            manager.cloudServicesNetworks().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("cjimryvwgcwwpbmz", response.iterator().next().location());
        Assertions.assertEquals("sydsxwefohe", response.iterator().next().tags().get("bvopwndyqle"));
        Assertions.assertEquals("mfsvbpav", response.iterator().next().extendedLocation().name());
        Assertions.assertEquals("opfppdbwnupgah", response.iterator().next().extendedLocation().type());
        Assertions
            .assertEquals(
                CloudServicesNetworkEnableDefaultEgressEndpoints.TRUE,
                response.iterator().next().enableDefaultEgressEndpoints());
    }
}
