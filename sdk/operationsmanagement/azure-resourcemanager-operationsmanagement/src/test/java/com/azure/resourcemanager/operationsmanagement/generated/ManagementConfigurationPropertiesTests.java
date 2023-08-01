// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.operationsmanagement.models.ArmTemplateParameter;
import com.azure.resourcemanager.operationsmanagement.models.ManagementConfigurationProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ManagementConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagementConfigurationProperties model =
            BinaryData
                .fromString(
                    "{\"applicationId\":\"czdzev\",\"parentResourceType\":\"dhkrwpdappdsbdk\",\"parameters\":[{\"name\":\"wjfeusnhutjel\",\"value\":\"rl\"},{\"name\":\"ugjzzdatqxhocdge\",\"value\":\"lgphu\"}],\"provisioningState\":\"cndvkaozwyiftyhx\",\"template\":\"dataurokft\"}")
                .toObject(ManagementConfigurationProperties.class);
        Assertions.assertEquals("czdzev", model.applicationId());
        Assertions.assertEquals("dhkrwpdappdsbdk", model.parentResourceType());
        Assertions.assertEquals("wjfeusnhutjel", model.parameters().get(0).name());
        Assertions.assertEquals("rl", model.parameters().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagementConfigurationProperties model =
            new ManagementConfigurationProperties()
                .withApplicationId("czdzev")
                .withParentResourceType("dhkrwpdappdsbdk")
                .withParameters(
                    Arrays
                        .asList(
                            new ArmTemplateParameter().withName("wjfeusnhutjel").withValue("rl"),
                            new ArmTemplateParameter().withName("ugjzzdatqxhocdge").withValue("lgphu")))
                .withTemplate("dataurokft");
        model = BinaryData.fromObject(model).toObject(ManagementConfigurationProperties.class);
        Assertions.assertEquals("czdzev", model.applicationId());
        Assertions.assertEquals("dhkrwpdappdsbdk", model.parentResourceType());
        Assertions.assertEquals("wjfeusnhutjel", model.parameters().get(0).name());
        Assertions.assertEquals("rl", model.parameters().get(0).value());
    }
}
