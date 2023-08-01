// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.orbital.fluent.models.ContactProfileInner;
import com.azure.resourcemanager.orbital.models.AutoTrackingConfiguration;
import com.azure.resourcemanager.orbital.models.ContactProfileListResult;
import com.azure.resourcemanager.orbital.models.ContactProfilesPropertiesProvisioningState;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ContactProfileListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContactProfileListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"creating\",\"minimumViableContactDuration\":\"leggzfbu\",\"minimumElevationDegrees\":78.875084,\"autoTrackingConfiguration\":\"disabled\",\"eventHubUri\":\"x\",\"thirdPartyConfigurations\":[],\"links\":[]},\"location\":\"eiithlvmez\",\"tags\":{\"xwburvjxxjns\":\"hxmzsbbzoggig\",\"ou\":\"ydptkoen\",\"dng\":\"nvudwtiukb\",\"g\":\"pocipazyxoegu\"},\"id\":\"npiucgygevqznty\",\"name\":\"mrbpizcdrqj\",\"type\":\"dpydn\"},{\"properties\":{\"provisioningState\":\"updating\",\"minimumViableContactDuration\":\"de\",\"minimumElevationDegrees\":59.384357,\"autoTrackingConfiguration\":\"xBand\",\"eventHubUri\":\"w\",\"thirdPartyConfigurations\":[],\"links\":[]},\"location\":\"jttgzf\",\"tags\":{\"eamdp\":\"hcbkhajde\",\"wkgshwa\":\"agalpbuxwgipwhon\",\"bin\":\"kix\",\"iyqzrnk\":\"eputtmrywnuzoqf\"},\"id\":\"qvyxlwhzlsicoho\",\"name\":\"qnwvlrya\",\"type\":\"w\"}],\"nextLink\":\"eun\"}")
                .toObject(ContactProfileListResult.class);
        Assertions.assertEquals("eiithlvmez", model.value().get(0).location());
        Assertions.assertEquals("hxmzsbbzoggig", model.value().get(0).tags().get("xwburvjxxjns"));
        Assertions
            .assertEquals(
                ContactProfilesPropertiesProvisioningState.CREATING, model.value().get(0).provisioningState());
        Assertions.assertEquals("leggzfbu", model.value().get(0).minimumViableContactDuration());
        Assertions.assertEquals(78.875084F, model.value().get(0).minimumElevationDegrees());
        Assertions.assertEquals(AutoTrackingConfiguration.DISABLED, model.value().get(0).autoTrackingConfiguration());
        Assertions.assertEquals("x", model.value().get(0).eventHubUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContactProfileListResult model =
            new ContactProfileListResult()
                .withValue(
                    Arrays
                        .asList(
                            new ContactProfileInner()
                                .withLocation("eiithlvmez")
                                .withTags(
                                    mapOf(
                                        "xwburvjxxjns",
                                        "hxmzsbbzoggig",
                                        "ou",
                                        "ydptkoen",
                                        "dng",
                                        "nvudwtiukb",
                                        "g",
                                        "pocipazyxoegu"))
                                .withProvisioningState(ContactProfilesPropertiesProvisioningState.CREATING)
                                .withMinimumViableContactDuration("leggzfbu")
                                .withMinimumElevationDegrees(78.875084F)
                                .withAutoTrackingConfiguration(AutoTrackingConfiguration.DISABLED)
                                .withEventHubUri("x")
                                .withThirdPartyConfigurations(Arrays.asList())
                                .withLinks(Arrays.asList()),
                            new ContactProfileInner()
                                .withLocation("jttgzf")
                                .withTags(
                                    mapOf(
                                        "eamdp",
                                        "hcbkhajde",
                                        "wkgshwa",
                                        "agalpbuxwgipwhon",
                                        "bin",
                                        "kix",
                                        "iyqzrnk",
                                        "eputtmrywnuzoqf"))
                                .withProvisioningState(ContactProfilesPropertiesProvisioningState.UPDATING)
                                .withMinimumViableContactDuration("de")
                                .withMinimumElevationDegrees(59.384357F)
                                .withAutoTrackingConfiguration(AutoTrackingConfiguration.X_BAND)
                                .withEventHubUri("w")
                                .withThirdPartyConfigurations(Arrays.asList())
                                .withLinks(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(ContactProfileListResult.class);
        Assertions.assertEquals("eiithlvmez", model.value().get(0).location());
        Assertions.assertEquals("hxmzsbbzoggig", model.value().get(0).tags().get("xwburvjxxjns"));
        Assertions
            .assertEquals(
                ContactProfilesPropertiesProvisioningState.CREATING, model.value().get(0).provisioningState());
        Assertions.assertEquals("leggzfbu", model.value().get(0).minimumViableContactDuration());
        Assertions.assertEquals(78.875084F, model.value().get(0).minimumElevationDegrees());
        Assertions.assertEquals(AutoTrackingConfiguration.DISABLED, model.value().get(0).autoTrackingConfiguration());
        Assertions.assertEquals("x", model.value().get(0).eventHubUri());
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
