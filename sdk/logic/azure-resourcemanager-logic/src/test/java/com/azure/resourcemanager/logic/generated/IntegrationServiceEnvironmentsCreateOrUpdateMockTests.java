// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.models.FlowEndpointsConfiguration;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmenEncryptionConfiguration;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironment;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentProperties;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSku;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSkuName;
import com.azure.resourcemanager.logic.models.ManagedServiceIdentity;
import com.azure.resourcemanager.logic.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.logic.models.NetworkConfiguration;
import com.azure.resourcemanager.logic.models.WorkflowProvisioningState;
import com.azure.resourcemanager.logic.models.WorkflowState;
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

public final class IntegrationServiceEnvironmentsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"state\":\"Enabled\",\"integrationServiceEnvironmentId\":\"uulriqbyokvj\",\"endpointsConfiguration\":{},\"networkConfiguration\":{\"virtualNetworkAddressSpace\":\"br\",\"subnets\":[]},\"encryptionConfiguration\":{}},\"sku\":{\"name\":\"Premium\",\"capacity\":766894527},\"identity\":{\"type\":\"UserAssigned\",\"tenantId\":\"50266bfe-ea3a-4f5b-afa7-bfb66125039a\",\"principalId\":\"8f5effba-ef0d-4382-bc25-0cfd0a9c6a59\",\"userAssignedIdentities\":{}},\"location\":\"d\",\"tags\":{\"bfwxiplkys\":\"ttpufpbpgnrholhu\",\"yjprxslw\":\"l\",\"hfvhuwzbxpcqz\":\"dmcvhtbbz\",\"lrrskap\":\"ihotjecohmxv\"},\"id\":\"xwieexuyade\",\"name\":\"ltfokyksyim\",\"type\":\"ccgrvkcxzznn\"}";

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

        LogicManager manager =
            LogicManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        IntegrationServiceEnvironment response =
            manager
                .integrationServiceEnvironments()
                .define("uxtndopgjttbasua")
                .withRegion("jmphfkyezolgj")
                .withExistingResourceGroup("lwixvtbou")
                .withTags(mapOf("uiadhbatecaatsdo", "cuydoccnxshanz", "ucbdaom", "zn", "tlepowavvqxua", "wiinjdllw"))
                .withProperties(
                    new IntegrationServiceEnvironmentProperties()
                        .withProvisioningState(WorkflowProvisioningState.DELETED)
                        .withState(WorkflowState.COMPLETED)
                        .withIntegrationServiceEnvironmentId("bea")
                        .withEndpointsConfiguration(new FlowEndpointsConfiguration())
                        .withNetworkConfiguration(
                            new NetworkConfiguration()
                                .withVirtualNetworkAddressSpace("vlwynpbbfq")
                                .withSubnets(Arrays.asList()))
                        .withEncryptionConfiguration(new IntegrationServiceEnvironmenEncryptionConfiguration()))
                .withSku(
                    new IntegrationServiceEnvironmentSku()
                        .withName(IntegrationServiceEnvironmentSkuName.PREMIUM)
                        .withCapacity(627917485))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.NONE)
                        .withUserAssignedIdentities(mapOf()))
                .create();

        Assertions.assertEquals("d", response.location());
        Assertions.assertEquals("ttpufpbpgnrholhu", response.tags().get("bfwxiplkys"));
        Assertions.assertEquals(WorkflowProvisioningState.SUCCEEDED, response.properties().provisioningState());
        Assertions.assertEquals(WorkflowState.ENABLED, response.properties().state());
        Assertions.assertEquals("uulriqbyokvj", response.properties().integrationServiceEnvironmentId());
        Assertions.assertEquals("br", response.properties().networkConfiguration().virtualNetworkAddressSpace());
        Assertions.assertEquals(IntegrationServiceEnvironmentSkuName.PREMIUM, response.sku().name());
        Assertions.assertEquals(766894527, response.sku().capacity());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.identity().type());
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
