// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.costmanagement.CostManagementManager;
import com.azure.resourcemanager.costmanagement.models.AccumulatedType;
import com.azure.resourcemanager.costmanagement.models.ChartType;
import com.azure.resourcemanager.costmanagement.models.MetricType;
import com.azure.resourcemanager.costmanagement.models.ReportTimeframeType;
import com.azure.resourcemanager.costmanagement.models.ReportType;
import com.azure.resourcemanager.costmanagement.models.View;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ViewsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"displayName\":\"cypsxjv\",\"scope\":\"imwkslircizj\",\"createdOn\":\"2021-01-01T11:30:07Z\",\"modifiedOn\":\"2021-08-31T12:53:55Z\",\"dateRange\":\"eacvl\",\"currency\":\"ygdyftumrtw\",\"query\":{\"type\":\"Usage\",\"timeframe\":\"WeekToDate\",\"includeMonetaryCommitment\":false},\"chart\":\"Table\",\"accumulated\":\"false\",\"metric\":\"AmortizedCost\",\"kpis\":[],\"pivots\":[]},\"eTag\":\"mznbaeqphch\",\"id\":\"nrnrp\",\"name\":\"ehuwrykqgaifmvik\",\"type\":\"bydvkhbejdz\"}]}";

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

        PagedIterable<View> response = manager.views().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("mznbaeqphch", response.iterator().next().etag());
        Assertions.assertEquals("cypsxjv", response.iterator().next().displayName());
        Assertions.assertEquals("imwkslircizj", response.iterator().next().scope());
        Assertions.assertEquals(ChartType.TABLE, response.iterator().next().chart());
        Assertions.assertEquals(AccumulatedType.FALSE, response.iterator().next().accumulated());
        Assertions.assertEquals(MetricType.AMORTIZED_COST, response.iterator().next().metric());
        Assertions.assertEquals(ReportType.USAGE, response.iterator().next().typePropertiesType());
        Assertions.assertEquals(ReportTimeframeType.WEEK_TO_DATE, response.iterator().next().timeframe());
        Assertions.assertEquals(false, response.iterator().next().includeMonetaryCommitment());
    }
}
