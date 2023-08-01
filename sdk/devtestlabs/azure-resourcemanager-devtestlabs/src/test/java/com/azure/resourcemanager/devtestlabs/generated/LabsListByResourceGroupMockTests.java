// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentPermission;
import com.azure.resourcemanager.devtestlabs.models.Lab;
import com.azure.resourcemanager.devtestlabs.models.PremiumDataDisk;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LabsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"defaultStorageAccount\":\"cnwfepbnwgfmxjg\",\"defaultPremiumStorageAccount\":\"bjb\",\"artifactsStorageAccount\":\"lfgtdysnaquflqbc\",\"premiumDataDiskStorageAccount\":\"hamzjrwdkqze\",\"vaultName\":\"jleziunjx\",\"labStorageType\":\"StandardSSD\",\"mandatoryArtifactsResourceIdsLinux\":[\"tkw\",\"eg\"],\"mandatoryArtifactsResourceIdsWindows\":[\"lbnseqac\",\"jvpilguooqja\"],\"createdDate\":\"2021-08-17T16:01:08Z\",\"premiumDataDisks\":\"Disabled\",\"environmentPermission\":\"Reader\",\"announcement\":{\"title\":\"ookjbsahrtdtpde\",\"markdown\":\"ac\",\"enabled\":\"Enabled\",\"expirationDate\":\"2021-11-21T17:56:26Z\",\"expired\":true,\"provisioningState\":\"nfxofvcj\",\"uniqueIdentifier\":\"dirazf\"},\"support\":{\"enabled\":\"Enabled\",\"markdown\":\"ab\"},\"vmCreationResourceGroup\":\"ujtmvcopexcmjurb\",\"publicIpId\":\"hlkyqltqsrog\",\"loadBalancerId\":\"wkffdjkt\",\"networkSecurityGroupId\":\"sidfv\",\"extendedProperties\":{\"ikayiansharuj\":\"lxnfuijtkbusqogs\"},\"provisioningState\":\"iqxf\",\"uniqueIdentifier\":\"j\"},\"location\":\"ttvwkpqh\",\"tags\":{\"cdlguauc\":\"nuygbqeqqekewvnq\",\"jwnlax\":\"f\"},\"id\":\"un\",\"name\":\"qikczvvita\",\"type\":\"gx\"}]}";

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

        DevTestLabsManager manager =
            DevTestLabsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Lab> response =
            manager.labs().listByResourceGroup("dohzjq", "tu", "o", 808082616, "e", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ttvwkpqh", response.iterator().next().location());
        Assertions.assertEquals("nuygbqeqqekewvnq", response.iterator().next().tags().get("cdlguauc"));
        Assertions.assertEquals(StorageType.STANDARD_SSD, response.iterator().next().labStorageType());
        Assertions.assertEquals("tkw", response.iterator().next().mandatoryArtifactsResourceIdsLinux().get(0));
        Assertions.assertEquals("lbnseqac", response.iterator().next().mandatoryArtifactsResourceIdsWindows().get(0));
        Assertions.assertEquals(PremiumDataDisk.DISABLED, response.iterator().next().premiumDataDisks());
        Assertions.assertEquals(EnvironmentPermission.READER, response.iterator().next().environmentPermission());
        Assertions.assertEquals("ookjbsahrtdtpde", response.iterator().next().announcement().title());
        Assertions.assertEquals("ac", response.iterator().next().announcement().markdown());
        Assertions.assertEquals(EnableStatus.ENABLED, response.iterator().next().announcement().enabled());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-11-21T17:56:26Z"),
                response.iterator().next().announcement().expirationDate());
        Assertions.assertEquals(true, response.iterator().next().announcement().expired());
        Assertions.assertEquals(EnableStatus.ENABLED, response.iterator().next().support().enabled());
        Assertions.assertEquals("ab", response.iterator().next().support().markdown());
        Assertions
            .assertEquals("lxnfuijtkbusqogs", response.iterator().next().extendedProperties().get("ikayiansharuj"));
    }
}
