// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.resourcehealth.ResourceHealthManager;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStateValues;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatus;
import com.azure.resourcemanager.resourcehealth.models.ReasonChronicityTypes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AvailabilityStatusesListBySubscriptionIdMockTests {
    @Test
    public void testListBySubscriptionId() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"id\":\"rvnaenqpeh\",\"name\":\"doy\",\"type\":\"ifthnz\",\"location\":\"dslgnayqigynduh\",\"properties\":{\"availabilityState\":\"Unavailable\",\"title\":\"kthumaqolbgycdui\",\"summary\":\"tgccymvaolpss\",\"detailedStatus\":\"lfmmdnbbglzpswi\",\"reasonType\":\"mcwyhzdxssadb\",\"context\":\"nvdfznuda\",\"category\":\"vxzbncb\",\"articleId\":\"lpstdbhhxsrzdz\",\"rootCauseAttributionTime\":\"2021-10-15T02:58:18Z\",\"healthEventType\":\"scdntnevf\",\"healthEventCause\":\"jmygtdsslswtmwer\",\"healthEventCategory\":\"fzp\",\"healthEventId\":\"semwabnet\",\"resolutionETA\":\"2021-07-19T10:32:31Z\",\"occuredTime\":\"2021-08-31T12:26:12Z\",\"reasonChronicity\":\"Persistent\",\"reportedTime\":\"2021-01-02T19:13:53Z\",\"recentlyResolved\":{\"unavailableOccuredTime\":\"2021-10-13T23:51:57Z\",\"resolvedTime\":\"2021-09-12T04:45:44Z\",\"unavailableSummary\":\"bmwmbesldnkw\"},\"recommendedActions\":[],\"serviceImpactingEvents\":[]}}]}";

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

        ResourceHealthManager manager =
            ResourceHealthManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AvailabilityStatus> response =
            manager
                .availabilityStatuses()
                .listBySubscriptionId("qtaruoujmkcjhwq", "tjrybnwjewgdr", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("rvnaenqpeh", response.iterator().next().id());
        Assertions.assertEquals("doy", response.iterator().next().name());
        Assertions.assertEquals("ifthnz", response.iterator().next().type());
        Assertions.assertEquals("dslgnayqigynduh", response.iterator().next().location());
        Assertions
            .assertEquals(
                AvailabilityStateValues.UNAVAILABLE, response.iterator().next().properties().availabilityState());
        Assertions.assertEquals("kthumaqolbgycdui", response.iterator().next().properties().title());
        Assertions.assertEquals("tgccymvaolpss", response.iterator().next().properties().summary());
        Assertions.assertEquals("lfmmdnbbglzpswi", response.iterator().next().properties().detailedStatus());
        Assertions.assertEquals("mcwyhzdxssadb", response.iterator().next().properties().reasonType());
        Assertions.assertEquals("nvdfznuda", response.iterator().next().properties().context());
        Assertions.assertEquals("vxzbncb", response.iterator().next().properties().category());
        Assertions.assertEquals("lpstdbhhxsrzdz", response.iterator().next().properties().articleId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-15T02:58:18Z"),
                response.iterator().next().properties().rootCauseAttributionTime());
        Assertions.assertEquals("scdntnevf", response.iterator().next().properties().healthEventType());
        Assertions.assertEquals("jmygtdsslswtmwer", response.iterator().next().properties().healthEventCause());
        Assertions.assertEquals("fzp", response.iterator().next().properties().healthEventCategory());
        Assertions.assertEquals("semwabnet", response.iterator().next().properties().healthEventId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-07-19T10:32:31Z"), response.iterator().next().properties().resolutionEta());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-08-31T12:26:12Z"), response.iterator().next().properties().occuredTime());
        Assertions
            .assertEquals(ReasonChronicityTypes.PERSISTENT, response.iterator().next().properties().reasonChronicity());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-01-02T19:13:53Z"), response.iterator().next().properties().reportedTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-13T23:51:57Z"),
                response.iterator().next().properties().recentlyResolved().unavailableOccuredTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-09-12T04:45:44Z"),
                response.iterator().next().properties().recentlyResolved().resolvedTime());
        Assertions
            .assertEquals(
                "bmwmbesldnkw", response.iterator().next().properties().recentlyResolved().unavailableSummary());
    }
}
