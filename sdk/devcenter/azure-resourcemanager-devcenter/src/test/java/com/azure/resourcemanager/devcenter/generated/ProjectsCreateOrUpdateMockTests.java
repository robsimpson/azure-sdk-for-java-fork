// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.Project;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProjectsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"devCenterUri\":\"nu\",\"devCenterId\":\"jsrtk\",\"description\":\"wnopqgikyzirtx\",\"maxDevBoxesPerUser\":543574693},\"location\":\"zejntps\",\"tags\":{\"ieoxorggufhyaomt\":\"ioilqukrydxtq\",\"jzhpjbibgjmfx\":\"ghhavgrvkffo\"},\"id\":\"mv\",\"name\":\"cluyovwxnbkf\",\"type\":\"zzxscyhwzdgiruj\"}";

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

        DevCenterManager manager =
            DevCenterManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Project response =
            manager
                .projects()
                .define("fcdmqnrojlpijn")
                .withRegion("krlgnyhm")
                .withExistingResourceGroup("nepttwqmsni")
                .withTags(mapOf("thrrgh", "xkk", "gf", "jbdhqxvc"))
                .withDevCenterId("asxifto")
                .withDescription("yzhftwesgogczh")
                .withMaxDevBoxesPerUser(1907577103)
                .create();

        Assertions.assertEquals("zejntps", response.location());
        Assertions.assertEquals("ioilqukrydxtq", response.tags().get("ieoxorggufhyaomt"));
        Assertions.assertEquals("jsrtk", response.devCenterId());
        Assertions.assertEquals("wnopqgikyzirtx", response.description());
        Assertions.assertEquals(543574693, response.maxDevBoxesPerUser());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
