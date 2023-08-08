// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupFindRestorableTimeRangesResponseResourceInner;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesResponse;
import com.azure.resourcemanager.dataprotection.models.RestorableTimeRange;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupFindRestorableTimeRangesResponseResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupFindRestorableTimeRangesResponseResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"restorableTimeRanges\":[{\"startTime\":\"thnzd\",\"endTime\":\"dslgnayqigynduh\",\"objectType\":\"hqlkthumaqo\"},{\"startTime\":\"bgycduiertgccym\",\"endTime\":\"aolps\",\"objectType\":\"qlfmmdnbb\"}],\"objectType\":\"zpswiydmc\"},\"id\":\"hzdxssadbzm\",\"name\":\"vdfznudaodvxzb\",\"type\":\"cblylpstdbhhxsr\"}")
                .toObject(AzureBackupFindRestorableTimeRangesResponseResourceInner.class);
        Assertions.assertEquals("thnzd", model.properties().restorableTimeRanges().get(0).startTime());
        Assertions.assertEquals("dslgnayqigynduh", model.properties().restorableTimeRanges().get(0).endTime());
        Assertions.assertEquals("hqlkthumaqo", model.properties().restorableTimeRanges().get(0).objectType());
        Assertions.assertEquals("zpswiydmc", model.properties().objectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupFindRestorableTimeRangesResponseResourceInner model =
            new AzureBackupFindRestorableTimeRangesResponseResourceInner()
                .withProperties(
                    new AzureBackupFindRestorableTimeRangesResponse()
                        .withRestorableTimeRanges(
                            Arrays
                                .asList(
                                    new RestorableTimeRange()
                                        .withStartTime("thnzd")
                                        .withEndTime("dslgnayqigynduh")
                                        .withObjectType("hqlkthumaqo"),
                                    new RestorableTimeRange()
                                        .withStartTime("bgycduiertgccym")
                                        .withEndTime("aolps")
                                        .withObjectType("qlfmmdnbb")))
                        .withObjectType("zpswiydmc"));
        model = BinaryData.fromObject(model).toObject(AzureBackupFindRestorableTimeRangesResponseResourceInner.class);
        Assertions.assertEquals("thnzd", model.properties().restorableTimeRanges().get(0).startTime());
        Assertions.assertEquals("dslgnayqigynduh", model.properties().restorableTimeRanges().get(0).endTime());
        Assertions.assertEquals("hqlkthumaqo", model.properties().restorableTimeRanges().get(0).objectType());
        Assertions.assertEquals("zpswiydmc", model.properties().objectType());
    }
}
