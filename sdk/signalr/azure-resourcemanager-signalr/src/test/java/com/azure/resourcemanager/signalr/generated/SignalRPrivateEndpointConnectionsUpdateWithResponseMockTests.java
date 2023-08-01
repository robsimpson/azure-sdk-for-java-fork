// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.signalr.SignalRManager;
import com.azure.resourcemanager.signalr.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.signalr.models.PrivateEndpoint;
import com.azure.resourcemanager.signalr.models.PrivateEndpointConnection;
import com.azure.resourcemanager.signalr.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.signalr.models.PrivateLinkServiceConnectionStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SignalRPrivateEndpointConnectionsUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Moving\",\"privateEndpoint\":{\"id\":\"kxw\"},\"groupIds\":[\"lbqpvuzlmvfelf\"],\"privateLinkServiceConnectionState\":{\"status\":\"Disconnected\",\"description\":\"crpw\",\"actionsRequired\":\"eznoig\"}},\"id\":\"rnjwmw\",\"name\":\"pn\",\"type\":\"saz\"}";

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

        SignalRManager manager =
            SignalRManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response =
            manager
                .signalRPrivateEndpointConnections()
                .updateWithResponse(
                    "wjygvjayvblmhvk",
                    "uhbxvvy",
                    "gsopbyrqufegxu",
                    new PrivateEndpointConnectionInner()
                        .withPrivateEndpoint(new PrivateEndpoint().withId("lmctlpd"))
                        .withPrivateLinkServiceConnectionState(
                            new PrivateLinkServiceConnectionState()
                                .withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                                .withDescription("ijnhyjsvfycxzbf")
                                .withActionsRequired("owvrvmtgjqppyos")),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("kxw", response.privateEndpoint().id());
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.DISCONNECTED, response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("crpw", response.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("eznoig", response.privateLinkServiceConnectionState().actionsRequired());
    }
}
