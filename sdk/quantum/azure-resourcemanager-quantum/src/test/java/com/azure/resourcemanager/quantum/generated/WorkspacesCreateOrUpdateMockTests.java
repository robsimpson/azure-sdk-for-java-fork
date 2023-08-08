// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.quantum.AzureQuantumManager;
import com.azure.resourcemanager.quantum.models.Provider;
import com.azure.resourcemanager.quantum.models.QuantumWorkspace;
import com.azure.resourcemanager.quantum.models.QuantumWorkspaceIdentity;
import com.azure.resourcemanager.quantum.models.ResourceIdentityType;
import com.azure.resourcemanager.quantum.models.Status;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkspacesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"providers\":[{\"providerId\":\"tncormrlxqtvco\",\"providerSku\":\"dflvkg\",\"instanceUri\":\"bgdknnqv\",\"applicationName\":\"znqntoru\",\"provisioningState\":\"Updating\",\"resourceUsageId\":\"a\"}],\"usable\":\"Partial\",\"provisioningState\":\"Succeeded\",\"storageAccount\":\"rauwjuetaebu\",\"endpointUri\":\"vdmovsmzlxwabm\"},\"identity\":{\"principalId\":\"fkifr\",\"tenantId\":\"puqujmqlgkfbtn\",\"type\":\"SystemAssigned\"},\"location\":\"n\",\"tags\":{\"ujitcjedftww\":\"cn\",\"foqouicybx\":\"ezkojvdcp\"},\"id\":\"rzgszufoxci\",\"name\":\"opidoamciodh\",\"type\":\"haz\"}";

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

        AzureQuantumManager manager =
            AzureQuantumManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        QuantumWorkspace response =
            manager
                .workspaces()
                .define("vfdnwnwmewzsyyce")
                .withRegion("yfzqwhxxbu")
                .withExistingResourceGroup("exn")
                .withTags(mapOf("ztppriolxorjalto", "xzfe"))
                .withIdentity(new QuantumWorkspaceIdentity().withType(ResourceIdentityType.NONE))
                .withProviders(
                    Arrays
                        .asList(
                            new Provider()
                                .withProviderId("bjudpfrxtrthzv")
                                .withProviderSku("tdwkqbrq")
                                .withInstanceUri("paxh")
                                .withApplicationName("iilivpdtiirqtd")
                                .withProvisioningState(Status.SUCCEEDED)
                                .withResourceUsageId("oruzfgsquyfxrxx"),
                            new Provider()
                                .withProviderId("ptramxj")
                                .withProviderSku("wlwnwxuqlcv")
                                .withInstanceUri("ypatdooaojkniod")
                                .withApplicationName("oebwnujhemms")
                                .withProvisioningState(Status.DELETING)
                                .withResourceUsageId("c"),
                            new Provider()
                                .withProviderId("dtjinfw")
                                .withProviderSku("fltkacjv")
                                .withInstanceUri("kdlfoa")
                                .withApplicationName("gkfpaga")
                                .withProvisioningState(Status.UPDATING)
                                .withResourceUsageId("lpqblylsyxk"),
                            new Provider()
                                .withProviderId("nsj")
                                .withProviderSku("vti")
                                .withInstanceUri("xsdszuempsb")
                                .withApplicationName("f")
                                .withProvisioningState(Status.FAILED)
                                .withResourceUsageId("v")))
                .withStorageAccount("invkjjxdxrbuu")
                .create();

        Assertions.assertEquals("n", response.location());
        Assertions.assertEquals("cn", response.tags().get("ujitcjedftww"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals("tncormrlxqtvco", response.providers().get(0).providerId());
        Assertions.assertEquals("dflvkg", response.providers().get(0).providerSku());
        Assertions.assertEquals("bgdknnqv", response.providers().get(0).instanceUri());
        Assertions.assertEquals("znqntoru", response.providers().get(0).applicationName());
        Assertions.assertEquals(Status.UPDATING, response.providers().get(0).provisioningState());
        Assertions.assertEquals("a", response.providers().get(0).resourceUsageId());
        Assertions.assertEquals("rauwjuetaebu", response.storageAccount());
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
