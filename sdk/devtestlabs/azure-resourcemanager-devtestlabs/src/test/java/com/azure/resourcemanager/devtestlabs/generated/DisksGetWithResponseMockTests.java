// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.Disk;
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

public final class DisksGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"diskType\":\"Premium\",\"diskSizeGiB\":1907280030,\"leasedByLabVmId\":\"coibicziuswswjrk\",\"diskBlobName\":\"sjhbtq\",\"diskUri\":\"yfscyrfwbivqvo\",\"storageAccountId\":\"uyzwvbhlimbyqecr\",\"createdDate\":\"2021-11-15T20:33:50Z\",\"hostCaching\":\"ikcdrdaasax\",\"managedDiskId\":\"bsmfkwiyjvz\",\"provisioningState\":\"osrnawnvzmlnkoy\",\"uniqueIdentifier\":\"xvjabjq\"},\"location\":\"axuyvymcnud\",\"tags\":{\"xqweu\":\"abhjx\",\"itnsqxtltc\":\"pmpvks\",\"kkld\":\"krdpqgfhyrfr\",\"atxjtiel\":\"rcwfcmfcnrjajq\"},\"id\":\"zqgxx\",\"name\":\"fbbmtlp\",\"type\":\"agynoi\"}";

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

        Disk response =
            manager
                .disks()
                .getWithResponse(
                    "p", "ujd", "gatolekscbctnan", "imwbzxpdcldpk", "wnsnlaimouxwks", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("axuyvymcnud", response.location());
        Assertions.assertEquals("abhjx", response.tags().get("xqweu"));
        Assertions.assertEquals(StorageType.PREMIUM, response.diskType());
        Assertions.assertEquals(1907280030, response.diskSizeGiB());
        Assertions.assertEquals("coibicziuswswjrk", response.leasedByLabVmId());
        Assertions.assertEquals("sjhbtq", response.diskBlobName());
        Assertions.assertEquals("yfscyrfwbivqvo", response.diskUri());
        Assertions.assertEquals("uyzwvbhlimbyqecr", response.storageAccountId());
        Assertions.assertEquals("ikcdrdaasax", response.hostCaching());
        Assertions.assertEquals("bsmfkwiyjvz", response.managedDiskId());
    }
}
