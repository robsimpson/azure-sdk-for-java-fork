// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.costmanagement.CostManagementManager;
import com.azure.resourcemanager.costmanagement.models.Export;
import com.azure.resourcemanager.costmanagement.models.ExportType;
import com.azure.resourcemanager.costmanagement.models.FormatType;
import com.azure.resourcemanager.costmanagement.models.RecurrenceType;
import com.azure.resourcemanager.costmanagement.models.StatusType;
import com.azure.resourcemanager.costmanagement.models.TimeframeType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ExportsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"schedule\":{\"status\":\"Inactive\",\"recurrence\":\"Annually\"},\"format\":\"Csv\",\"deliveryInfo\":{},\"definition\":{\"type\":\"AmortizedCost\",\"timeframe\":\"WeekToDate\"},\"runHistory\":{\"value\":[]},\"partitionData\":true,\"nextRunTimeEstimate\":\"2021-03-23T12:57:57Z\"},\"eTag\":\"httz\",\"id\":\"efedxihchrphkm\",\"name\":\"rjdqnsdfzp\",\"type\":\"gtgkylkdghr\"}";

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

        CostManagementManager manager =
            CostManagementManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Export response =
            manager
                .exports()
                .getWithResponse("cdisd", "sfjbjsvg", "rwhryvycytd", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("httz", response.etag());
        Assertions.assertEquals(StatusType.INACTIVE, response.schedule().status());
        Assertions.assertEquals(RecurrenceType.ANNUALLY, response.schedule().recurrence());
        Assertions.assertEquals(FormatType.CSV, response.format());
        Assertions.assertEquals(ExportType.AMORTIZED_COST, response.definition().type());
        Assertions.assertEquals(TimeframeType.WEEK_TO_DATE, response.definition().timeframe());
        Assertions.assertEquals(true, response.partitionData());
    }
}
