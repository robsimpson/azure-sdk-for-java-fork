// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.support.SupportManager;
import com.azure.resourcemanager.support.models.ContactProfile;
import com.azure.resourcemanager.support.models.PreferredContactMethod;
import com.azure.resourcemanager.support.models.QuotaTicketDetails;
import com.azure.resourcemanager.support.models.ServiceLevelAgreement;
import com.azure.resourcemanager.support.models.SeverityLevel;
import com.azure.resourcemanager.support.models.SupportEngineer;
import com.azure.resourcemanager.support.models.SupportTicketDetails;
import com.azure.resourcemanager.support.models.TechnicalTicketDetails;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SupportTicketsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"supportTicketId\":\"bvmeuecivy\",\"description\":\"zceuojgjrw\",\"problemClassificationId\":\"ueiotwmcdyt\",\"problemClassificationDisplayName\":\"wit\",\"severity\":\"critical\",\"enrollmentId\":\"jawgqwg\",\"require24X7Response\":false,\"contactDetails\":{\"firstName\":\"isk\",\"lastName\":\"fbkp\",\"preferredContactMethod\":\"email\",\"primaryEmailAddress\":\"gklwn\",\"additionalEmailAddresses\":[],\"phoneNumber\":\"jdauwhvy\",\"preferredTimeZone\":\"wzbtdhxu\",\"country\":\"znbmpowuwprzq\",\"preferredSupportLanguage\":\"veual\"},\"serviceLevelAgreement\":{\"startTime\":\"2021-01-10T15:16:49Z\",\"expirationTime\":\"2021-04-21T08:53:38Z\",\"slaMinutes\":396810634},\"supportEngineer\":{\"emailAddress\":\"bcswsrt\"},\"supportPlanType\":\"iplrbpbewtghfgb\",\"title\":\"c\",\"problemStartTime\":\"2021-02-14T22:48:14Z\",\"serviceId\":\"zvlvqhjkbegib\",\"serviceDisplayName\":\"mxiebw\",\"status\":\"loayqcgw\",\"createdDate\":\"2021-06-14T10:56:53Z\",\"modifiedDate\":\"2021-07-21T21:53:41Z\",\"technicalTicketDetails\":{\"resourceId\":\"wyzmhtxon\"},\"quotaTicketDetails\":{\"quotaChangeRequestSubType\":\"savjcbpwxqps\",\"quotaChangeRequestVersion\":\"nftguvriuhpr\",\"quotaChangeRequests\":[]}},\"id\":\"dyvxqtayriww\",\"name\":\"oyq\",\"type\":\"exrmcqibycnojvk\"}";

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

        SupportManager manager =
            SupportManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SupportTicketDetails response =
            manager
                .supportTickets()
                .define("tazqugxywpmueefj")
                .withSupportTicketId("qkqujidsu")
                .withDescription("onobglaocqx")
                .withProblemClassificationId("ccm")
                .withSeverity(SeverityLevel.HIGHESTCRITICALIMPACT)
                .withRequire24X7Response(false)
                .withContactDetails(
                    new ContactProfile()
                        .withFirstName("zntxhdz")
                        .withLastName("lrqjbhckfr")
                        .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                        .withPrimaryEmailAddress("rxsbkyvp")
                        .withAdditionalEmailAddresses(Arrays.asList())
                        .withPhoneNumber("n")
                        .withPreferredTimeZone("z")
                        .withCountry("p")
                        .withPreferredSupportLanguage("kafkuwbcrnwbm"))
                .withServiceLevelAgreement(new ServiceLevelAgreement())
                .withSupportEngineer(new SupportEngineer())
                .withTitle("aofmxagkvtme")
                .withProblemStartTime(OffsetDateTime.parse("2020-12-28T20:08:12Z"))
                .withServiceId("krh")
                .withTechnicalTicketDetails(new TechnicalTicketDetails().withResourceId("dmwsrcrgvxpvgomz"))
                .withQuotaTicketDetails(
                    new QuotaTicketDetails()
                        .withQuotaChangeRequestSubType("isgwbnbbeldawkz")
                        .withQuotaChangeRequestVersion("liourqhak")
                        .withQuotaChangeRequests(Arrays.asList()))
                .create();

        Assertions.assertEquals("bvmeuecivy", response.supportTicketId());
        Assertions.assertEquals("zceuojgjrw", response.description());
        Assertions.assertEquals("ueiotwmcdyt", response.problemClassificationId());
        Assertions.assertEquals(SeverityLevel.CRITICAL, response.severity());
        Assertions.assertEquals(false, response.require24X7Response());
        Assertions.assertEquals("isk", response.contactDetails().firstName());
        Assertions.assertEquals("fbkp", response.contactDetails().lastName());
        Assertions.assertEquals(PreferredContactMethod.EMAIL, response.contactDetails().preferredContactMethod());
        Assertions.assertEquals("gklwn", response.contactDetails().primaryEmailAddress());
        Assertions.assertEquals("jdauwhvy", response.contactDetails().phoneNumber());
        Assertions.assertEquals("wzbtdhxu", response.contactDetails().preferredTimeZone());
        Assertions.assertEquals("znbmpowuwprzq", response.contactDetails().country());
        Assertions.assertEquals("veual", response.contactDetails().preferredSupportLanguage());
        Assertions.assertEquals("c", response.title());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-14T22:48:14Z"), response.problemStartTime());
        Assertions.assertEquals("zvlvqhjkbegib", response.serviceId());
        Assertions.assertEquals("wyzmhtxon", response.technicalTicketDetails().resourceId());
        Assertions.assertEquals("savjcbpwxqps", response.quotaTicketDetails().quotaChangeRequestSubType());
        Assertions.assertEquals("nftguvriuhpr", response.quotaTicketDetails().quotaChangeRequestVersion());
    }
}
