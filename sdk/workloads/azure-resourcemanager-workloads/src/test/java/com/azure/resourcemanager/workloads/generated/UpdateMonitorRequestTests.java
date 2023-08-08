// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.workloads.models.UpdateMonitorRequest;
import com.azure.resourcemanager.workloads.models.UserAssignedIdentity;
import com.azure.resourcemanager.workloads.models.UserAssignedServiceIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UpdateMonitorRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateMonitorRequest model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"hxsrzdzucersc\":\"lylpstdb\",\"iwjmygtdssls\":\"ntnev\",\"emwabnet\":\"tmweriofzpyq\"},\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"d\":{\"principalId\":\"ba4e8e39-4d8c-4df0-b474-6268ebc19ff0\",\"clientId\":\"50d09aa1-837a-439d-add4-f29214d450e6\"},\"wiwubm\":{\"principalId\":\"09559181-9d20-4838-9e28-54d4d59aee1e\",\"clientId\":\"01af568c-3304-49cf-85c1-074a846dc298\"},\"esl\":{\"principalId\":\"0c3d2754-8972-4cc2-89ba-d0e7e6ea1587\",\"clientId\":\"195f9248-d5fe-44c5-8b71-e48a9c776924\"}}}}")
                .toObject(UpdateMonitorRequest.class);
        Assertions.assertEquals("lylpstdb", model.tags().get("hxsrzdzucersc"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateMonitorRequest model =
            new UpdateMonitorRequest()
                .withTags(mapOf("hxsrzdzucersc", "lylpstdb", "iwjmygtdssls", "ntnev", "emwabnet", "tmweriofzpyq"))
                .withIdentity(
                    new UserAssignedServiceIdentity()
                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf(
                                "d",
                                new UserAssignedIdentity(),
                                "wiwubm",
                                new UserAssignedIdentity(),
                                "esl",
                                new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(UpdateMonitorRequest.class);
        Assertions.assertEquals("lylpstdb", model.tags().get("hxsrzdzucersc"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
