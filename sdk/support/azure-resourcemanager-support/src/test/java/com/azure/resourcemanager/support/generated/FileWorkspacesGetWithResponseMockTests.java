// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.support.SupportManager;
import com.azure.resourcemanager.support.models.FileWorkspaceDetails;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FileWorkspacesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"createdOn\":\"2021-07-04T04:35:49Z\",\"expirationTime\":\"2021-03-05T05:54Z\"},\"id\":\"ffukiscvw\",\"name\":\"zhwplefaxvxilc\",\"type\":\"tg\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SupportManager manager = SupportManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FileWorkspaceDetails response
            = manager.fileWorkspaces().getWithResponse("jnaeois", com.azure.core.util.Context.NONE).getValue();

    }
}
