// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.advisor.models.ShortDescription;
import org.junit.jupiter.api.Assertions;

public final class ShortDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ShortDescription model =
            BinaryData
                .fromString("{\"problem\":\"hzgpphrcgyncocpe\",\"solution\":\"vmmcoofs\"}")
                .toObject(ShortDescription.class);
        Assertions.assertEquals("hzgpphrcgyncocpe", model.problem());
        Assertions.assertEquals("vmmcoofs", model.solution());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ShortDescription model = new ShortDescription().withProblem("hzgpphrcgyncocpe").withSolution("vmmcoofs");
        model = BinaryData.fromObject(model).toObject(ShortDescription.class);
        Assertions.assertEquals("hzgpphrcgyncocpe", model.problem());
        Assertions.assertEquals("vmmcoofs", model.solution());
    }
}
