// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.fluent.models.MetadataEntityProperties;
import com.azure.resourcemanager.resourcehealth.models.MetadataSupportedValueDetail;
import com.azure.resourcemanager.resourcehealth.models.Scenario;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MetadataEntityPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MetadataEntityProperties model =
            BinaryData
                .fromString(
                    "{\"displayName\":\"mi\",\"dependsOn\":[\"hzrvqd\"],\"applicableScenarios\":[\"Alerts\"],\"supportedValues\":[{\"id\":\"igeho\",\"displayName\":\"bowsk\",\"resourceTypes\":[\"ktzlcuiywg\"]}]}")
                .toObject(MetadataEntityProperties.class);
        Assertions.assertEquals("mi", model.displayName());
        Assertions.assertEquals("hzrvqd", model.dependsOn().get(0));
        Assertions.assertEquals(Scenario.ALERTS, model.applicableScenarios().get(0));
        Assertions.assertEquals("igeho", model.supportedValues().get(0).id());
        Assertions.assertEquals("bowsk", model.supportedValues().get(0).displayName());
        Assertions.assertEquals("ktzlcuiywg", model.supportedValues().get(0).resourceTypes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetadataEntityProperties model =
            new MetadataEntityProperties()
                .withDisplayName("mi")
                .withDependsOn(Arrays.asList("hzrvqd"))
                .withApplicableScenarios(Arrays.asList(Scenario.ALERTS))
                .withSupportedValues(
                    Arrays
                        .asList(
                            new MetadataSupportedValueDetail()
                                .withId("igeho")
                                .withDisplayName("bowsk")
                                .withResourceTypes(Arrays.asList("ktzlcuiywg"))));
        model = BinaryData.fromObject(model).toObject(MetadataEntityProperties.class);
        Assertions.assertEquals("mi", model.displayName());
        Assertions.assertEquals("hzrvqd", model.dependsOn().get(0));
        Assertions.assertEquals(Scenario.ALERTS, model.applicableScenarios().get(0));
        Assertions.assertEquals("igeho", model.supportedValues().get(0).id());
        Assertions.assertEquals("bowsk", model.supportedValues().get(0).displayName());
        Assertions.assertEquals("ktzlcuiywg", model.supportedValues().get(0).resourceTypes().get(0));
    }
}
