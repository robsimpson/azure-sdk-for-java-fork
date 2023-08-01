// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.JobExecutionBase;
import com.azure.resourcemanager.appcontainers.models.JobExecutionContainer;
import com.azure.resourcemanager.appcontainers.models.JobExecutionTemplate;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class JobsStartMockTests {
    @Test
    public void testStart() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr = "{\"name\":\"lhuytxzvtznap\",\"id\":\"annovvoxczytpr\"}";

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

        ContainerAppsApiManager manager =
            ContainerAppsApiManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        JobExecutionBase response =
            manager
                .jobs()
                .start(
                    "ab",
                    "dujtmvcope",
                    new JobExecutionTemplate()
                        .withContainers(
                            Arrays
                                .asList(
                                    new JobExecutionContainer()
                                        .withImage("urbuhhlkyqltq")
                                        .withName("ogtu")
                                        .withCommand(Arrays.asList("fdjktsysidfvclgl", "n", "uijtkbu", "qogsfikayian"))
                                        .withArgs(Arrays.asList("rujtjiqxfzyjq", "tvwkpqhjpenu"))
                                        .withEnv(Arrays.asList())))
                        .withInitContainers(
                            Arrays
                                .asList(
                                    new JobExecutionContainer()
                                        .withImage("ekewvnqvcdlguauc")
                                        .withName("djwnlaxpunjqi")
                                        .withCommand(Arrays.asList("vvi", "acgxmfcsse", "x", "tvsoxhlwntsj"))
                                        .withArgs(Arrays.asList("sxypruuu", "bnchrsziz", "yuel"))
                                        .withEnv(Arrays.asList()),
                                    new JobExecutionContainer()
                                        .withImage("nb")
                                        .withName("yggagflnlgmt")
                                        .withCommand(Arrays.asList("hzjmucftbyrp", "rohkpigqfusu", "kzmkwklsnoxaxmqe"))
                                        .withArgs(Arrays.asList("h", "jnhgwydyyn"))
                                        .withEnv(Arrays.asList()),
                                    new JobExecutionContainer()
                                        .withImage("gbv")
                                        .withName("anarfdlpukhpyrne")
                                        .withCommand(Arrays.asList("cpeogkhnmgbrou", "ddbhf", "pfpazjzoywjxhpdu"))
                                        .withArgs(Arrays.asList("tacnpqwtehtuev", "hrljy"))
                                        .withEnv(Arrays.asList()),
                                    new JobExecutionContainer()
                                        .withImage("hnsduugwbsreur")
                                        .withName("kfuarenlv")
                                        .withCommand(
                                            Arrays
                                                .asList(
                                                    "klnvnafvvkyfede", "jboslcqxypok", "hminqcymczngnbdx", "ewuninvud"))
                                        .withArgs(Arrays.asList("aqdtvqecrqctmxxd"))
                                        .withEnv(Arrays.asList()))),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("lhuytxzvtznap", response.name());
        Assertions.assertEquals("annovvoxczytpr", response.id());
    }
}
