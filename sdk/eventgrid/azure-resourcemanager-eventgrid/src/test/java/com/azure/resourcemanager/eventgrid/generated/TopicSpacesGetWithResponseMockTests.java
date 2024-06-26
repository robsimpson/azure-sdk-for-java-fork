// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.TopicSpace;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TopicSpacesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"description\":\"wqxungrobgwfms\",\"topicTemplates\":[\"dylwx\",\"vzjowzug\",\"erclblt\",\"hpwachyeu\"],\"provisioningState\":\"Canceled\"},\"id\":\"vwryvd\",\"name\":\"fkiikgpruccwm\",\"type\":\"cbtxsytrtexegwmr\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        TopicSpace response = manager.topicSpaces()
            .getWithResponse("jiznioroofmftas", "mcreihu", "trnighm", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("wqxungrobgwfms", response.description());
        Assertions.assertEquals("dylwx", response.topicTemplates().get(0));
    }
}
