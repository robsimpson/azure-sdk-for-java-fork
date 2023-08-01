// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.PolicyEvent;
import com.azure.resourcemanager.policyinsights.models.PolicyEventsResourceType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PolicyEventsListQueryResultsForManagementGroupMockTests {
    @Test
    public void testListQueryResultsForManagementGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"@odata.id\":\"yxgtczh\",\"@odata.context\":\"dbsdshm\",\"timestamp\":\"2021-07-03T12:17:17Z\",\"resourceId\":\"ehvbbxurip\",\"policyAssignmentId\":\"fnhtbaxkgxyw\",\"policyDefinitionId\":\"kpyklyhp\",\"effectiveParameters\":\"odpvruudlgzib\",\"isCompliant\":false,\"subscriptionId\":\"tgk\",\"resourceType\":\"tvdxeclzedqb\",\"resourceLocation\":\"hzlhplodqkdlww\",\"resourceGroup\":\"bum\",\"resourceTags\":\"xtrqjfs\",\"policyAssignmentName\":\"mbtxhwgf\",\"policyAssignmentOwner\":\"rtawcoezb\",\"policyAssignmentParameters\":\"ubskhudygoookkq\",\"policyAssignmentScope\":\"jb\",\"policyDefinitionName\":\"eorfm\",\"policyDefinitionAction\":\"iqtqzfavyvnq\",\"policyDefinitionCategory\":\"bar\",\"policySetDefinitionId\":\"uayjkqa\",\"policySetDefinitionName\":\"gzslesjcbhernnti\",\"policySetDefinitionOwner\":\"djc\",\"policySetDefinitionCategory\":\"quwrbehwag\",\"policySetDefinitionParameters\":\"buffkmrqemvvhm\",\"managementGroupIds\":\"drjf\",\"policyDefinitionReferenceId\":\"acoebj\",\"complianceState\":\"wzcjznmwcpmgua\",\"tenantId\":\"raufactkahzova\",\"principalOid\":\"ziuxxpshnee\",\"components\":[{\"id\":\"gs\",\"type\":\"ubkwdle\",\"name\":\"d\",\"timestamp\":\"2021-03-05T15:56:58Z\",\"tenantId\":\"jbazpjuohminy\",\"principalOid\":\"norwmduvwpklvx\",\"policyDefinitionAction\":\"ygdxpgpqchis\",\"\":{}}],\"\":{}}]}";

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

        PolicyInsightsManager manager =
            PolicyInsightsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PolicyEvent> response =
            manager
                .policyEvents()
                .listQueryResultsForManagementGroup(
                    PolicyEventsResourceType.DEFAULT,
                    "mczuo",
                    289279485,
                    "jw",
                    "w",
                    OffsetDateTime.parse("2021-11-26T11:35:34Z"),
                    OffsetDateTime.parse("2021-10-13T19:06:04Z"),
                    "oknssxmojmsvpkjp",
                    "vk",
                    "cfzq",
                    Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-07-03T12:17:17Z"), response.iterator().next().timestamp());
        Assertions.assertEquals("ehvbbxurip", response.iterator().next().resourceId());
        Assertions.assertEquals("fnhtbaxkgxyw", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("kpyklyhp", response.iterator().next().policyDefinitionId());
        Assertions.assertEquals("odpvruudlgzib", response.iterator().next().effectiveParameters());
        Assertions.assertEquals(false, response.iterator().next().isCompliant());
        Assertions.assertEquals("tgk", response.iterator().next().subscriptionId());
        Assertions.assertEquals("tvdxeclzedqb", response.iterator().next().resourceType());
        Assertions.assertEquals("hzlhplodqkdlww", response.iterator().next().resourceLocation());
        Assertions.assertEquals("bum", response.iterator().next().resourceGroup());
        Assertions.assertEquals("xtrqjfs", response.iterator().next().resourceTags());
        Assertions.assertEquals("mbtxhwgf", response.iterator().next().policyAssignmentName());
        Assertions.assertEquals("rtawcoezb", response.iterator().next().policyAssignmentOwner());
        Assertions.assertEquals("ubskhudygoookkq", response.iterator().next().policyAssignmentParameters());
        Assertions.assertEquals("jb", response.iterator().next().policyAssignmentScope());
        Assertions.assertEquals("eorfm", response.iterator().next().policyDefinitionName());
        Assertions.assertEquals("iqtqzfavyvnq", response.iterator().next().policyDefinitionAction());
        Assertions.assertEquals("bar", response.iterator().next().policyDefinitionCategory());
        Assertions.assertEquals("uayjkqa", response.iterator().next().policySetDefinitionId());
        Assertions.assertEquals("gzslesjcbhernnti", response.iterator().next().policySetDefinitionName());
        Assertions.assertEquals("djc", response.iterator().next().policySetDefinitionOwner());
        Assertions.assertEquals("quwrbehwag", response.iterator().next().policySetDefinitionCategory());
        Assertions.assertEquals("buffkmrqemvvhm", response.iterator().next().policySetDefinitionParameters());
        Assertions.assertEquals("drjf", response.iterator().next().managementGroupIds());
        Assertions.assertEquals("acoebj", response.iterator().next().policyDefinitionReferenceId());
        Assertions.assertEquals("wzcjznmwcpmgua", response.iterator().next().complianceState());
        Assertions.assertEquals("raufactkahzova", response.iterator().next().tenantId());
        Assertions.assertEquals("ziuxxpshnee", response.iterator().next().principalOid());
        Assertions.assertEquals("gs", response.iterator().next().components().get(0).id());
        Assertions.assertEquals("ubkwdle", response.iterator().next().components().get(0).type());
        Assertions.assertEquals("d", response.iterator().next().components().get(0).name());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-05T15:56:58Z"),
                response.iterator().next().components().get(0).timestamp());
        Assertions.assertEquals("jbazpjuohminy", response.iterator().next().components().get(0).tenantId());
        Assertions.assertEquals("norwmduvwpklvx", response.iterator().next().components().get(0).principalOid());
        Assertions
            .assertEquals("ygdxpgpqchis", response.iterator().next().components().get(0).policyDefinitionAction());
    }
}
