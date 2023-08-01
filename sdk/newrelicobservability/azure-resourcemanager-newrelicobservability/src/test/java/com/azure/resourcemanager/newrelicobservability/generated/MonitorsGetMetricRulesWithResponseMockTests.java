// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager;
import com.azure.resourcemanager.newrelicobservability.models.MetricRules;
import com.azure.resourcemanager.newrelicobservability.models.MetricsRequest;
import com.azure.resourcemanager.newrelicobservability.models.SendMetricsStatus;
import com.azure.resourcemanager.newrelicobservability.models.TagAction;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MonitorsGetMetricRulesWithResponseMockTests {
    @Test
    public void testGetMetricRulesWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sendMetrics\":\"Disabled\",\"filteringTags\":[{\"name\":\"bpbewtghfgb\",\"value\":\"gw\",\"action\":\"Exclude\"},{\"name\":\"v\",\"value\":\"jkbegibtnmxiebww\",\"action\":\"Include\"},{\"name\":\"yqcgwrtzjuzgwy\",\"value\":\"htxongmtsavjc\",\"action\":\"Exclude\"},{\"name\":\"qpsrknftguvri\",\"value\":\"prwmdyvxqt\",\"action\":\"Include\"}],\"userEmail\":\"ww\"}";

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

        NewRelicObservabilityManager manager =
            NewRelicObservabilityManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        MetricRules response =
            manager
                .monitors()
                .getMetricRulesWithResponse(
                    "przqlveu",
                    "lupj",
                    new MetricsRequest().withUserEmail("khfxobbcswsrt"),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals(SendMetricsStatus.DISABLED, response.sendMetrics());
        Assertions.assertEquals("bpbewtghfgb", response.filteringTags().get(0).name());
        Assertions.assertEquals("gw", response.filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, response.filteringTags().get(0).action());
        Assertions.assertEquals("ww", response.userEmail());
    }
}
