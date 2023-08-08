// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.MoveErrorInfo;

public final class MoveErrorInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MoveErrorInfo model =
            BinaryData
                .fromString(
                    "{\"moveResources\":[{\"id\":\"ccsnhsjc\",\"sourceId\":\"ejhkry\",\"moveResources\":[]},{\"id\":\"pczwlo\",\"sourceId\":\"yemkkvnip\",\"moveResources\":[]},{\"id\":\"jnchgej\",\"sourceId\":\"odmailzyd\",\"moveResources\":[]}]}")
                .toObject(MoveErrorInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MoveErrorInfo model = new MoveErrorInfo();
        model = BinaryData.fromObject(model).toObject(MoveErrorInfo.class);
    }
}
