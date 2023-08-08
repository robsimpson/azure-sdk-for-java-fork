// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.TrailingSeparatorPolicy;
import com.azure.resourcemanager.logic.models.X12ValidationSettings;
import org.junit.jupiter.api.Assertions;

public final class X12ValidationSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        X12ValidationSettings model =
            BinaryData
                .fromString(
                    "{\"validateCharacterSet\":true,\"checkDuplicateInterchangeControlNumber\":true,\"interchangeControlNumberValidityDays\":2106515877,\"checkDuplicateGroupControlNumber\":true,\"checkDuplicateTransactionSetControlNumber\":false,\"validateEDITypes\":true,\"validateXSDTypes\":true,\"allowLeadingAndTrailingSpacesAndZeroes\":false,\"trimLeadingAndTrailingSpacesAndZeroes\":true,\"trailingSeparatorPolicy\":\"NotSpecified\"}")
                .toObject(X12ValidationSettings.class);
        Assertions.assertEquals(true, model.validateCharacterSet());
        Assertions.assertEquals(true, model.checkDuplicateInterchangeControlNumber());
        Assertions.assertEquals(2106515877, model.interchangeControlNumberValidityDays());
        Assertions.assertEquals(true, model.checkDuplicateGroupControlNumber());
        Assertions.assertEquals(false, model.checkDuplicateTransactionSetControlNumber());
        Assertions.assertEquals(true, model.validateEdiTypes());
        Assertions.assertEquals(true, model.validateXsdTypes());
        Assertions.assertEquals(false, model.allowLeadingAndTrailingSpacesAndZeroes());
        Assertions.assertEquals(true, model.trimLeadingAndTrailingSpacesAndZeroes());
        Assertions.assertEquals(TrailingSeparatorPolicy.NOT_SPECIFIED, model.trailingSeparatorPolicy());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        X12ValidationSettings model =
            new X12ValidationSettings()
                .withValidateCharacterSet(true)
                .withCheckDuplicateInterchangeControlNumber(true)
                .withInterchangeControlNumberValidityDays(2106515877)
                .withCheckDuplicateGroupControlNumber(true)
                .withCheckDuplicateTransactionSetControlNumber(false)
                .withValidateEdiTypes(true)
                .withValidateXsdTypes(true)
                .withAllowLeadingAndTrailingSpacesAndZeroes(false)
                .withTrimLeadingAndTrailingSpacesAndZeroes(true)
                .withTrailingSeparatorPolicy(TrailingSeparatorPolicy.NOT_SPECIFIED);
        model = BinaryData.fromObject(model).toObject(X12ValidationSettings.class);
        Assertions.assertEquals(true, model.validateCharacterSet());
        Assertions.assertEquals(true, model.checkDuplicateInterchangeControlNumber());
        Assertions.assertEquals(2106515877, model.interchangeControlNumberValidityDays());
        Assertions.assertEquals(true, model.checkDuplicateGroupControlNumber());
        Assertions.assertEquals(false, model.checkDuplicateTransactionSetControlNumber());
        Assertions.assertEquals(true, model.validateEdiTypes());
        Assertions.assertEquals(true, model.validateXsdTypes());
        Assertions.assertEquals(false, model.allowLeadingAndTrailingSpacesAndZeroes());
        Assertions.assertEquals(true, model.trimLeadingAndTrailingSpacesAndZeroes());
        Assertions.assertEquals(TrailingSeparatorPolicy.NOT_SPECIFIED, model.trailingSeparatorPolicy());
    }
}
