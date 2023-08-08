// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionContainerResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DeletedProtectionContainersListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"containerType\":\"ProtectionContainer\",\"friendlyName\":\"xqabckmzeoxi\",\"backupManagementType\":\"DPM\",\"registrationStatus\":\"eoh\",\"healthStatus\":\"h\",\"protectableObjectType\":\"uz\"},\"eTag\":\"ceezn\",\"location\":\"angp\",\"tags\":{\"exroqrndkt\":\"axyxzlbciphm\"},\"id\":\"fvo\",\"name\":\"feeqgpkrietbgnix\",\"type\":\"owwzkyfwnwpi\"}]}";

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

        RecoveryServicesBackupManager manager =
            RecoveryServicesBackupManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ProtectionContainerResource> response =
            manager
                .deletedProtectionContainers()
                .list("tagfyvrtpqp", "mhzcgkrepdqh", "yhwqw", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("angp", response.iterator().next().location());
        Assertions.assertEquals("axyxzlbciphm", response.iterator().next().tags().get("exroqrndkt"));
        Assertions.assertEquals("xqabckmzeoxi", response.iterator().next().properties().friendlyName());
        Assertions
            .assertEquals(BackupManagementType.DPM, response.iterator().next().properties().backupManagementType());
        Assertions.assertEquals("eoh", response.iterator().next().properties().registrationStatus());
        Assertions.assertEquals("h", response.iterator().next().properties().healthStatus());
        Assertions.assertEquals("uz", response.iterator().next().properties().protectableObjectType());
        Assertions.assertEquals("ceezn", response.iterator().next().etag());
    }
}
