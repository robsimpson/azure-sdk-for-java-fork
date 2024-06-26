// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.Schedule;
import com.azure.resourcemanager.machinelearning.models.ScheduleActionBase;
import com.azure.resourcemanager.machinelearning.models.ScheduleProperties;
import com.azure.resourcemanager.machinelearning.models.TriggerBase;
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

public final class SchedulesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"action\":{\"actionType\":\"ScheduleActionBase\"},\"displayName\":\"j\",\"isEnabled\":false,\"provisioningState\":\"Succeeded\",\"trigger\":{\"triggerType\":\"TriggerBase\",\"endTime\":\"nxqpwnikxkcajgrb\",\"startTime\":\"tsvgoocqs\",\"timeZone\":\"mzlpcx\"},\"description\":\"mhxxrqicfzfvwjd\",\"properties\":{\"dkjrzfwkyluobdx\":\"vpyeyoafinmpnqu\",\"p\":\"hqdcclcvqsr\"},\"tags\":{\"fxl\":\"cvwbz\",\"iywqnpfydrfbgcny\":\"ymfjxl\",\"styygjq\":\"byxmkhmqyncgaull\"}},\"id\":\"lmwqg\",\"name\":\"hmqmiwxzf\",\"type\":\"vzucqfgufjnb\"}";

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

        MachineLearningManager manager =
            MachineLearningManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Schedule response =
            manager
                .schedules()
                .define("xaravwwuasnjeglh")
                .withExistingWorkspace("zyq", "brnxhjtlxfikj")
                .withProperties(
                    new ScheduleProperties()
                        .withDescription("fhjxsawo")
                        .withProperties(mapOf("qkmwzrdqyoybmrno", "ffhx", "qphkv", "ocjnzdaiovrbhr"))
                        .withTags(mapOf("yp", "adcrxyl", "iwhjdfrwpsshrmn", "tyzvelffohu", "ogkscxj", "cclpct"))
                        .withAction(new ScheduleActionBase())
                        .withDisplayName("xbozpcjcnwjz")
                        .withIsEnabled(false)
                        .withTrigger(new TriggerBase().withEndTime("nw").withStartTime("svoqiza").withTimeZone("sdso")))
                .create();

        Assertions.assertEquals("mhxxrqicfzfvwjd", response.properties().description());
        Assertions.assertEquals("vpyeyoafinmpnqu", response.properties().properties().get("dkjrzfwkyluobdx"));
        Assertions.assertEquals("cvwbz", response.properties().tags().get("fxl"));
        Assertions.assertEquals("j", response.properties().displayName());
        Assertions.assertEquals(false, response.properties().isEnabled());
        Assertions.assertEquals("nxqpwnikxkcajgrb", response.properties().trigger().endTime());
        Assertions.assertEquals("tsvgoocqs", response.properties().trigger().startTime());
        Assertions.assertEquals("mzlpcx", response.properties().trigger().timeZone());
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
