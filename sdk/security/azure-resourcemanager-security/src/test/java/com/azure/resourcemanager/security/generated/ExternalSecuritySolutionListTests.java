// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ExternalSecuritySolutionInner;
import com.azure.resourcemanager.security.models.ExternalSecuritySolutionList;
import java.util.Arrays;

public final class ExternalSecuritySolutionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExternalSecuritySolutionList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"kind\":\"ExternalSecuritySolution\",\"location\":\"ozxwopd\",\"id\":\"yd\",\"name\":\"izqaclnapxbiyg\",\"type\":\"ugjknf\"},{\"kind\":\"ExternalSecuritySolution\",\"location\":\"fcttuxuuyilfl\",\"id\":\"oiquvrehmrnjhvs\",\"name\":\"jztczytqj\",\"type\":\"w\"}],\"nextLink\":\"uunfprnjletlxsm\"}")
                .toObject(ExternalSecuritySolutionList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExternalSecuritySolutionList model =
            new ExternalSecuritySolutionList()
                .withValue(Arrays.asList(new ExternalSecuritySolutionInner(), new ExternalSecuritySolutionInner()));
        model = BinaryData.fromObject(model).toObject(ExternalSecuritySolutionList.class);
    }
}
