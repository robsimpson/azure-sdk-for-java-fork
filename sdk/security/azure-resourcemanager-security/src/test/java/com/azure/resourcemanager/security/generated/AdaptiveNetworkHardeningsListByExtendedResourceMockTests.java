// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.AdaptiveNetworkHardening;
import com.azure.resourcemanager.security.models.Direction;
import com.azure.resourcemanager.security.models.TransportProtocol;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AdaptiveNetworkHardeningsListByExtendedResourceMockTests {
    @Test
    public void testListByExtendedResource() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"rules\":[{\"name\":\"eegxbnj\",\"direction\":\"Outbound\",\"destinationPort\":1739345332,\"protocols\":[\"UDP\"],\"ipAddresses\":[\"g\"]},{\"name\":\"mdquyyaescjxnavp\",\"direction\":\"Outbound\",\"destinationPort\":1683737670,\"protocols\":[\"UDP\"],\"ipAddresses\":[\"kihai\",\"zkefkzlxv\"]},{\"name\":\"zcg\",\"direction\":\"Outbound\",\"destinationPort\":587017547,\"protocols\":[\"UDP\",\"UDP\"],\"ipAddresses\":[\"nz\",\"ysajvvqlhonyonel\"]},{\"name\":\"gt\",\"direction\":\"Inbound\",\"destinationPort\":2113164712,\"protocols\":[\"UDP\",\"TCP\"],\"ipAddresses\":[\"go\",\"y\"]}],\"rulesCalculationTime\":\"2021-05-03T19:35:56Z\",\"effectiveNetworkSecurityGroups\":[{\"networkInterface\":\"mrvkxeojtdyulglh\",\"networkSecurityGroups\":[\"ru\",\"lfqfxspxgogypbzt\"]},{\"networkInterface\":\"exjnskvctv\",\"networkSecurityGroups\":[\"mb\"]}]},\"id\":\"ttmhlvr\",\"name\":\"cyxrn\",\"type\":\"ukfaj\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AdaptiveNetworkHardening> response = manager.adaptiveNetworkHardenings()
            .listByExtendedResource("et", "zfppvolzayjwdu", "jh", "prklatwiuujxsuj", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("eegxbnj", response.iterator().next().rules().get(0).name());
        Assertions.assertEquals(Direction.OUTBOUND, response.iterator().next().rules().get(0).direction());
        Assertions.assertEquals(1739345332, response.iterator().next().rules().get(0).destinationPort());
        Assertions.assertEquals(TransportProtocol.UDP, response.iterator().next().rules().get(0).protocols().get(0));
        Assertions.assertEquals("g", response.iterator().next().rules().get(0).ipAddresses().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-03T19:35:56Z"),
            response.iterator().next().rulesCalculationTime());
        Assertions.assertEquals("mrvkxeojtdyulglh",
            response.iterator().next().effectiveNetworkSecurityGroups().get(0).networkInterface());
        Assertions.assertEquals("ru",
            response.iterator().next().effectiveNetworkSecurityGroups().get(0).networkSecurityGroups().get(0));
    }
}
