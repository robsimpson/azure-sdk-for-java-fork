// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devhub.models.Operation;
import com.azure.resourcemanager.devhub.models.OperationDisplay;

public final class OperationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Operation model =
            BinaryData
                .fromString(
                    "{\"name\":\"usarhmofc\",\"isDataAction\":false,\"display\":{\"provider\":\"urkdtmlx\",\"resource\":\"kuksjtxukcdm\",\"operation\":\"rcryuanzwuxzdxta\",\"description\":\"lhmwhfpmrqobm\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}")
                .toObject(Operation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Operation model = new Operation().withDisplay(new OperationDisplay());
        model = BinaryData.fromObject(model).toObject(Operation.class);
    }
}
