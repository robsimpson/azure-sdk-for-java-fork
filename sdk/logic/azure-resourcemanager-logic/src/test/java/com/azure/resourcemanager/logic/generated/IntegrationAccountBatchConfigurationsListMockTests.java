// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.models.BatchConfiguration;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IntegrationAccountBatchConfigurationsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"batchGroupName\":\"ylnkkbjpjvlywltm\",\"releaseCriteria\":{\"messageCount\":169385184,\"batchSize\":1853304262},\"createdTime\":\"2021-05-30T21:17:52Z\",\"changedTime\":\"2021-06-29T20:15:49Z\",\"metadata\":\"dataj\"},\"location\":\"nqzocrdzg\",\"tags\":{\"aqttiek\":\"untgxdn\",\"uvny\":\"i\",\"hlqtxnrflkn\":\"tzgixgyrihlgmgb\",\"hipx\":\"rndpgfjodhdaqotw\"},\"id\":\"gsabvcipowzafc\",\"name\":\"uumljcirvpefyc\",\"type\":\"veitit\"}]}";

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

        LogicManager manager =
            LogicManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<BatchConfiguration> response =
            manager.integrationAccountBatchConfigurations().list("syril", "hxdqaol", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("nqzocrdzg", response.iterator().next().location());
        Assertions.assertEquals("untgxdn", response.iterator().next().tags().get("aqttiek"));
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-05-30T21:17:52Z"), response.iterator().next().properties().createdTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-29T20:15:49Z"), response.iterator().next().properties().changedTime());
        Assertions.assertEquals("ylnkkbjpjvlywltm", response.iterator().next().properties().batchGroupName());
        Assertions.assertEquals(169385184, response.iterator().next().properties().releaseCriteria().messageCount());
        Assertions.assertEquals(1853304262, response.iterator().next().properties().releaseCriteria().batchSize());
    }
}
