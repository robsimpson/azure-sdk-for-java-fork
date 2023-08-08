// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.orbital.OrbitalManager;
import com.azure.resourcemanager.orbital.models.AutoTrackingConfiguration;
import com.azure.resourcemanager.orbital.models.ContactProfile;
import com.azure.resourcemanager.orbital.models.ContactProfilesPropertiesProvisioningState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ContactProfilesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"creating\",\"minimumViableContactDuration\":\"bhhxsrzdzuc\",\"minimumElevationDegrees\":55.196796,\"autoTrackingConfiguration\":\"sBand\",\"eventHubUri\":\"t\",\"networkConfiguration\":{\"subnetId\":\"evfiwjmygt\"},\"thirdPartyConfigurations\":[],\"links\":[]},\"location\":\"wtmwerio\",\"tags\":{\"n\":\"yqsemwa\"},\"id\":\"tshhszhedp\",\"name\":\"vwiwubmwmbesld\",\"type\":\"k\"}";

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

        OrbitalManager manager =
            OrbitalManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ContactProfile response =
            manager
                .contactProfiles()
                .getByResourceGroupWithResponse("mnvdfzn", "daodvxzbncblyl", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("wtmwerio", response.location());
        Assertions.assertEquals("yqsemwa", response.tags().get("n"));
        Assertions.assertEquals(ContactProfilesPropertiesProvisioningState.CREATING, response.provisioningState());
        Assertions.assertEquals("bhhxsrzdzuc", response.minimumViableContactDuration());
        Assertions.assertEquals(55.196796F, response.minimumElevationDegrees());
        Assertions.assertEquals(AutoTrackingConfiguration.S_BAND, response.autoTrackingConfiguration());
        Assertions.assertEquals("t", response.eventHubUri());
        Assertions.assertEquals("evfiwjmygt", response.networkConfiguration().subnetId());
    }
}
