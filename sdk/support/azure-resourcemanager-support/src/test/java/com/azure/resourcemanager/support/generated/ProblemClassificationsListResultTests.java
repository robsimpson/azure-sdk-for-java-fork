// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.ProblemClassificationInner;
import com.azure.resourcemanager.support.models.ProblemClassificationsListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ProblemClassificationsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProblemClassificationsListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"ozkrwfndiodjpslw\",\"name\":\"dpvwryoqpsoaccta\",\"type\":\"kljla\",\"properties\":{\"displayName\":\"ryffdfdosy\"}},{\"id\":\"xpaojakhmsbz\",\"name\":\"crzevdphlx\",\"type\":\"lthqtrgqjbp\",\"properties\":{\"displayName\":\"s\"}},{\"id\":\"zgvfcjrwz\",\"name\":\"xjtfelluwfzit\",\"type\":\"peqfpjkjl\",\"properties\":{\"displayName\":\"pdvhpfxxypin\"}}]}")
                .toObject(ProblemClassificationsListResult.class);
        Assertions.assertEquals("ryffdfdosy", model.value().get(0).displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProblemClassificationsListResult model =
            new ProblemClassificationsListResult()
                .withValue(
                    Arrays
                        .asList(
                            new ProblemClassificationInner().withDisplayName("ryffdfdosy"),
                            new ProblemClassificationInner().withDisplayName("s"),
                            new ProblemClassificationInner().withDisplayName("pdvhpfxxypin")));
        model = BinaryData.fromObject(model).toObject(ProblemClassificationsListResult.class);
        Assertions.assertEquals("ryffdfdosy", model.value().get(0).displayName());
    }
}
