// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.models.QuotaChangeRequest;
import com.azure.resourcemanager.support.models.QuotaTicketDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class QuotaTicketDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaTicketDetails model = BinaryData.fromString(
            "{\"quotaChangeRequestSubType\":\"exq\",\"quotaChangeRequestVersion\":\"fadmws\",\"quotaChangeRequests\":[{\"region\":\"vxpvgomz\",\"payload\":\"misgwbnb\"}]}")
            .toObject(QuotaTicketDetails.class);
        Assertions.assertEquals("exq", model.quotaChangeRequestSubType());
        Assertions.assertEquals("fadmws", model.quotaChangeRequestVersion());
        Assertions.assertEquals("vxpvgomz", model.quotaChangeRequests().get(0).region());
        Assertions.assertEquals("misgwbnb", model.quotaChangeRequests().get(0).payload());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuotaTicketDetails model = new QuotaTicketDetails().withQuotaChangeRequestSubType("exq")
            .withQuotaChangeRequestVersion("fadmws")
            .withQuotaChangeRequests(
                Arrays.asList(new QuotaChangeRequest().withRegion("vxpvgomz").withPayload("misgwbnb")));
        model = BinaryData.fromObject(model).toObject(QuotaTicketDetails.class);
        Assertions.assertEquals("exq", model.quotaChangeRequestSubType());
        Assertions.assertEquals("fadmws", model.quotaChangeRequestVersion());
        Assertions.assertEquals("vxpvgomz", model.quotaChangeRequests().get(0).region());
        Assertions.assertEquals("misgwbnb", model.quotaChangeRequests().get(0).payload());
    }
}
