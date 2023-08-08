// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.Reservation;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ReservationsListByBillingAccountMockTests {
    @Test
    public void testListByBillingAccount() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"id\":\"wpwerye\",\"name\":\"kdhmeottawjyosx\",\"type\":\"hnhjtfvpndpmi\",\"location\":\"pnwy\",\"sku\":{\"name\":\"qllzsauzpjlxeehu\"},\"properties\":{\"appliedScopes\":[\"zlrayme\",\"xls\",\"ihmxrfdsajredn\",\"yyshtuwgmevua\"],\"appliedScopeType\":\"wzyif\",\"reservedResourceType\":\"gwltxeqip\",\"quantity\":21.367962,\"provisioningState\":\"yimsfayorpr\",\"expiryDate\":\"kj\",\"provisioningSubState\":\"eslabnsmjkwynq\",\"displayName\":\"ekqsykvwjtqpkev\",\"displayProvisioningState\":\"ltjcrspxk\",\"userFriendlyRenewState\":\"r\",\"userFriendlyAppliedScopeType\":\"lfg\",\"effectiveDateTime\":\"nnnoytz\",\"skuDescription\":\"sewxigpxvkqm\",\"term\":\"pxvpifdfaif\",\"renew\":true,\"renewSource\":\"eyuubei\",\"utilization\":{\"trend\":\"l\",\"aggregates\":[]}}}]}";

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

        BillingManager manager =
            BillingManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Reservation> response =
            manager
                .reservations()
                .listByBillingAccount(
                    "yqwixvcpwnkwywzw",
                    "falickduoiqtamty",
                    "sknxrwzawnvsbcf",
                    "zagxnvhycvdi",
                    "wrzregzgyufu",
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zlrayme", response.iterator().next().appliedScopes().get(0));
    }
}
