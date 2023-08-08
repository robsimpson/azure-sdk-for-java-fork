// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.Policy;
import com.azure.resourcemanager.devtestlabs.models.PolicyEvaluatorType;
import com.azure.resourcemanager.devtestlabs.models.PolicyFactName;
import com.azure.resourcemanager.devtestlabs.models.PolicyStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PoliciesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"description\":\"iotzbpdbollgryfq\",\"status\":\"Disabled\",\"factName\":\"EnvironmentTemplate\",\"factData\":\"rowsocnequy\",\"threshold\":\"jboq\",\"evaluatorType\":\"MaxValuePolicy\",\"createdDate\":\"2021-04-24T00:04:13Z\",\"provisioningState\":\"kqevadrmmw\",\"uniqueIdentifier\":\"awvcmjzkxiid\"},\"location\":\"scz\",\"tags\":{\"oqiqazugamx\":\"s\",\"cekuz\":\"krrcoiisbamnpp\",\"zxuizhyhnepkpe\":\"dsbezaxyfu\",\"xdazv\":\"iarxqiubxdukec\"},\"id\":\"hctmmkosz\",\"name\":\"dblnsntrp\",\"type\":\"aqkiofkb\"}";

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

        DevTestLabsManager manager =
            DevTestLabsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Policy response =
            manager
                .policies()
                .getWithResponse("znv", "l", "jrhuzgf", "on", "tpusllywp", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("scz", response.location());
        Assertions.assertEquals("s", response.tags().get("oqiqazugamx"));
        Assertions.assertEquals("iotzbpdbollgryfq", response.description());
        Assertions.assertEquals(PolicyStatus.DISABLED, response.status());
        Assertions.assertEquals(PolicyFactName.ENVIRONMENT_TEMPLATE, response.factName());
        Assertions.assertEquals("rowsocnequy", response.factData());
        Assertions.assertEquals("jboq", response.threshold());
        Assertions.assertEquals(PolicyEvaluatorType.MAX_VALUE_POLICY, response.evaluatorType());
    }
}
