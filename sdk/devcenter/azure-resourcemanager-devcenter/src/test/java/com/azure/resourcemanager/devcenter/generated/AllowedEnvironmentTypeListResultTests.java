// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.AllowedEnvironmentTypeListResult;

public final class AllowedEnvironmentTypeListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllowedEnvironmentTypeListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Creating\"},\"id\":\"hcbkhajde\",\"name\":\"eamdp\",\"type\":\"agalpbuxwgipwhon\"},{\"properties\":{\"provisioningState\":\"Succeeded\"},\"id\":\"hwankixzbinjepu\",\"name\":\"tmryw\",\"type\":\"uzoqft\"},{\"properties\":{\"provisioningState\":\"Canceled\"},\"id\":\"n\",\"name\":\"cqvyxlwhzlsico\",\"type\":\"oqqnwvlryav\"}],\"nextLink\":\"heun\"}")
                .toObject(AllowedEnvironmentTypeListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllowedEnvironmentTypeListResult model = new AllowedEnvironmentTypeListResult();
        model = BinaryData.fromObject(model).toObject(AllowedEnvironmentTypeListResult.class);
    }
}
