// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.models.ServiceLevelAgreement;

public final class ServiceLevelAgreementTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceLevelAgreement model =
            BinaryData
                .fromString(
                    "{\"startTime\":\"2021-07-27T17:19:12Z\",\"expirationTime\":\"2021-12-03T01:38:31Z\",\"slaMinutes\":1015475658}")
                .toObject(ServiceLevelAgreement.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceLevelAgreement model = new ServiceLevelAgreement();
        model = BinaryData.fromObject(model).toObject(ServiceLevelAgreement.class);
    }
}
