// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.SecureScoreControlDefinitionList;

public final class SecureScoreControlDefinitionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecureScoreControlDefinitionList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"displayName\":\"cwv\",\"description\":\"mdqntycnaw\",\"maxScore\":504224699,\"source\":{\"sourceType\":\"Custom\"},\"assessmentDefinitions\":[{\"id\":\"yeamcmhudf\"},{\"id\":\"cehokw\"},{\"id\":\"qtwloes\"}]},\"id\":\"rg\",\"name\":\"vrbnyrukoil\",\"type\":\"ciduwjle\"},{\"properties\":{\"displayName\":\"lh\",\"description\":\"xpzruzythqkk\",\"maxScore\":408154151,\"source\":{\"sourceType\":\"Custom\"},\"assessmentDefinitions\":[{\"id\":\"vulnxdmn\"}]},\"id\":\"tmujdtvmc\",\"name\":\"yymffhmjp\",\"type\":\"dnyxfzuvrz\"}],\"nextLink\":\"qmzjqrbrpvnmdy\"}")
            .toObject(SecureScoreControlDefinitionList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecureScoreControlDefinitionList model = new SecureScoreControlDefinitionList();
        model = BinaryData.fromObject(model).toObject(SecureScoreControlDefinitionList.class);
    }
}
