// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.models.UserInfo;
import org.junit.jupiter.api.Assertions;

public final class UserInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserInfo model =
            BinaryData
                .fromString(
                    "{\"firstName\":\"fvzwdzuhty\",\"lastName\":\"isdkfthwxmnteiw\",\"emailAddress\":\"pvkmijcmmxdcuf\",\"phoneNumber\":\"srp\",\"country\":\"zidnsezcxtbzsgfy\"}")
                .toObject(UserInfo.class);
        Assertions.assertEquals("fvzwdzuhty", model.firstName());
        Assertions.assertEquals("isdkfthwxmnteiw", model.lastName());
        Assertions.assertEquals("pvkmijcmmxdcuf", model.emailAddress());
        Assertions.assertEquals("srp", model.phoneNumber());
        Assertions.assertEquals("zidnsezcxtbzsgfy", model.country());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserInfo model =
            new UserInfo()
                .withFirstName("fvzwdzuhty")
                .withLastName("isdkfthwxmnteiw")
                .withEmailAddress("pvkmijcmmxdcuf")
                .withPhoneNumber("srp")
                .withCountry("zidnsezcxtbzsgfy");
        model = BinaryData.fromObject(model).toObject(UserInfo.class);
        Assertions.assertEquals("fvzwdzuhty", model.firstName());
        Assertions.assertEquals("isdkfthwxmnteiw", model.lastName());
        Assertions.assertEquals("pvkmijcmmxdcuf", model.emailAddress());
        Assertions.assertEquals("srp", model.phoneNumber());
        Assertions.assertEquals("zidnsezcxtbzsgfy", model.country());
    }
}
