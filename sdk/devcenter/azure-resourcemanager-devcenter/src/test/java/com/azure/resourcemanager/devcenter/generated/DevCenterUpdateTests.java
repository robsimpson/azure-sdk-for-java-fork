// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.DevCenterUpdate;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devcenter.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DevCenterUpdateTests {
    @Test
    public void testDeserialize() {
        DevCenterUpdate model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"mdvpjhulsu\":{}}},\"tags\":{\"odjpslwejd\":\"kjozkrwfnd\",\"cctazakljlahbc\":\"vwryoqpso\",\"gexpaojakhmsbz\":\"yffdfdos\"},\"location\":\"crzevdphlx\"}")
                .toObject(DevCenterUpdate.class);
        Assertions.assertEquals("kjozkrwfnd", model.tags().get("odjpslwejd"));
        Assertions.assertEquals("crzevdphlx", model.location());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
    }

    @Test
    public void testSerialize() {
        DevCenterUpdate model =
            new DevCenterUpdate()
                .withTags(
                    mapOf("odjpslwejd", "kjozkrwfnd", "cctazakljlahbc", "vwryoqpso", "gexpaojakhmsbz", "yffdfdos"))
                .withLocation("crzevdphlx")
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                        .withUserAssignedIdentities(mapOf("mdvpjhulsu", new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(DevCenterUpdate.class);
        Assertions.assertEquals("kjozkrwfnd", model.tags().get("odjpslwejd"));
        Assertions.assertEquals("crzevdphlx", model.location());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
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