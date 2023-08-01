// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.WorkspacePropertiesUpdateParameters;
import com.azure.resourcemanager.machinelearning.models.CosmosDbSettings;
import com.azure.resourcemanager.machinelearning.models.PublicNetworkAccess;
import com.azure.resourcemanager.machinelearning.models.ServiceManagedResourcesSettings;
import org.junit.jupiter.api.Assertions;

public final class WorkspacePropertiesUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspacePropertiesUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"description\":\"qfou\",\"friendlyName\":\"mmnkzsmodmgl\",\"imageBuildCompute\":\"gpbkwtmut\",\"serviceManagedResourcesSettings\":{\"cosmosDb\":{\"collectionsThroughput\":289494577}},\"primaryUserAssignedIdentity\":\"pspwgcuertu\",\"publicNetworkAccess\":\"Disabled\",\"applicationInsights\":\"svqwhbmdgbbjfd\",\"containerRegistry\":\"mbmbexppbh\"}")
                .toObject(WorkspacePropertiesUpdateParameters.class);
        Assertions.assertEquals("qfou", model.description());
        Assertions.assertEquals("mmnkzsmodmgl", model.friendlyName());
        Assertions.assertEquals("gpbkwtmut", model.imageBuildCompute());
        Assertions.assertEquals(289494577, model.serviceManagedResourcesSettings().cosmosDb().collectionsThroughput());
        Assertions.assertEquals("pspwgcuertu", model.primaryUserAssignedIdentity());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals("svqwhbmdgbbjfd", model.applicationInsights());
        Assertions.assertEquals("mbmbexppbh", model.containerRegistry());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspacePropertiesUpdateParameters model =
            new WorkspacePropertiesUpdateParameters()
                .withDescription("qfou")
                .withFriendlyName("mmnkzsmodmgl")
                .withImageBuildCompute("gpbkwtmut")
                .withServiceManagedResourcesSettings(
                    new ServiceManagedResourcesSettings()
                        .withCosmosDb(new CosmosDbSettings().withCollectionsThroughput(289494577)))
                .withPrimaryUserAssignedIdentity("pspwgcuertu")
                .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                .withApplicationInsights("svqwhbmdgbbjfd")
                .withContainerRegistry("mbmbexppbh");
        model = BinaryData.fromObject(model).toObject(WorkspacePropertiesUpdateParameters.class);
        Assertions.assertEquals("qfou", model.description());
        Assertions.assertEquals("mmnkzsmodmgl", model.friendlyName());
        Assertions.assertEquals("gpbkwtmut", model.imageBuildCompute());
        Assertions.assertEquals(289494577, model.serviceManagedResourcesSettings().cosmosDb().collectionsThroughput());
        Assertions.assertEquals("pspwgcuertu", model.primaryUserAssignedIdentity());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals("svqwhbmdgbbjfd", model.applicationInsights());
        Assertions.assertEquals("mbmbexppbh", model.containerRegistry());
    }
}
