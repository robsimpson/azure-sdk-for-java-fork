// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.voiceservices.models.OperationListResult;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"quvgjxpybczme\",\"isDataAction\":true,\"display\":{\"provider\":\"pbsphrupidgs\",\"resource\":\"bejhphoycmsxa\",\"operation\":\"hdxbmtqio\",\"description\":\"zehtbmu\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"},{\"name\":\"izhwlrxy\",\"isDataAction\":false,\"display\":{\"provider\":\"ijgkdm\",\"resource\":\"azlobcufpdznrbt\",\"operation\":\"qjnqglhqgnufoooj\",\"description\":\"ifsqesaagdfmg\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"},{\"name\":\"rifkwm\",\"isDataAction\":true,\"display\":{\"provider\":\"izntocipao\",\"resource\":\"jpsq\",\"operation\":\"mpoyfd\",\"description\":\"ogknygjofjdd\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}],\"nextLink\":\"upewnwreitjzy\"}")
                .toObject(OperationListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model = new OperationListResult();
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
    }
}
