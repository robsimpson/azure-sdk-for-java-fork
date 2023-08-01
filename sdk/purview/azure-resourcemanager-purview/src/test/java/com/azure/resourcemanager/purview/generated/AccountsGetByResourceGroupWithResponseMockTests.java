// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.purview.PurviewManager;
import com.azure.resourcemanager.purview.models.Account;
import com.azure.resourcemanager.purview.models.PublicNetworkAccess;
import com.azure.resourcemanager.purview.models.Type;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AccountsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"cloudConnectors\":{\"awsExternalId\":\"ucnapkteoellwp\"},\"createdAt\":\"2021-07-15T21:53:29Z\",\"createdBy\":\"gpfqbuace\",\"createdByObjectId\":\"zfq\",\"endpoints\":{\"catalog\":\"uaopppcqeq\",\"guardian\":\"lzdahzxctobgbkdm\",\"scan\":\"zpostmgrcfbu\"},\"friendlyName\":\"mfqjhhkxbp\",\"managedResourceGroupName\":\"ymjhxxjyngudivkr\",\"managedResources\":{\"eventHubNamespace\":\"bxqz\",\"resourceGroup\":\"zjf\",\"storageAccount\":\"vjfdx\"},\"privateEndpointConnections\":[],\"provisioningState\":\"Deleting\",\"publicNetworkAccess\":\"NotSpecified\"},\"sku\":{\"capacity\":393815457,\"name\":\"Standard\"},\"identity\":{\"principalId\":\"qmcbxvwvxyslqbhs\",\"tenantId\":\"obl\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"pe\",\"tags\":{\"q\":\"fbkrvrnsvs\",\"rruvwbhsq\":\"ohxcrsbfova\",\"gjb\":\"sub\"},\"id\":\"rxbpyb\",\"name\":\"rfbjf\",\"type\":\"twss\"}";

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

        PurviewManager manager =
            PurviewManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Account response =
            manager
                .accounts()
                .getByResourceGroupWithResponse("n", "wwncwzzhxgk", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("pe", response.location());
        Assertions.assertEquals("fbkrvrnsvs", response.tags().get("q"));
        Assertions.assertEquals(Type.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("ymjhxxjyngudivkr", response.managedResourceGroupName());
        Assertions.assertEquals(PublicNetworkAccess.NOT_SPECIFIED, response.publicNetworkAccess());
    }
}
