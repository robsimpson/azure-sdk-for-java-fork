// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.orbital.models.ContactProfileThirdPartyConfiguration;
import org.junit.jupiter.api.Assertions;

public final class ContactProfileThirdPartyConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContactProfileThirdPartyConfiguration model =
            BinaryData
                .fromString("{\"providerName\":\"zvdudgwdslfhotwm\",\"missionConfiguration\":\"ynpwlbj\"}")
                .toObject(ContactProfileThirdPartyConfiguration.class);
        Assertions.assertEquals("zvdudgwdslfhotwm", model.providerName());
        Assertions.assertEquals("ynpwlbj", model.missionConfiguration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContactProfileThirdPartyConfiguration model =
            new ContactProfileThirdPartyConfiguration()
                .withProviderName("zvdudgwdslfhotwm")
                .withMissionConfiguration("ynpwlbj");
        model = BinaryData.fromObject(model).toObject(ContactProfileThirdPartyConfiguration.class);
        Assertions.assertEquals("zvdudgwdslfhotwm", model.providerName());
        Assertions.assertEquals("ynpwlbj", model.missionConfiguration());
    }
}
