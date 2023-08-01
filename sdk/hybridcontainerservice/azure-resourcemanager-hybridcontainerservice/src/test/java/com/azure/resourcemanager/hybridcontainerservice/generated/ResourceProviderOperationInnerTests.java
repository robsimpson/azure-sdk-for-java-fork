// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ResourceProviderOperationInner;
import com.azure.resourcemanager.hybridcontainerservice.models.ResourceProviderOperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class ResourceProviderOperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceProviderOperationInner model =
            BinaryData
                .fromString(
                    "{\"isDataAction\":\"kpzksmondjmq\",\"name\":\"vypomgkopkwho\",\"display\":{\"provider\":\"ajqgxy\",\"resource\":\"ocmbqfqvmkcxoza\",\"operation\":\"helxprglya\",\"description\":\"dckcbc\"}}")
                .toObject(ResourceProviderOperationInner.class);
        Assertions.assertEquals("kpzksmondjmq", model.isDataAction());
        Assertions.assertEquals("vypomgkopkwho", model.name());
        Assertions.assertEquals("ajqgxy", model.display().provider());
        Assertions.assertEquals("ocmbqfqvmkcxoza", model.display().resource());
        Assertions.assertEquals("helxprglya", model.display().operation());
        Assertions.assertEquals("dckcbc", model.display().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceProviderOperationInner model =
            new ResourceProviderOperationInner()
                .withIsDataAction("kpzksmondjmq")
                .withName("vypomgkopkwho")
                .withDisplay(
                    new ResourceProviderOperationDisplay()
                        .withProvider("ajqgxy")
                        .withResource("ocmbqfqvmkcxoza")
                        .withOperation("helxprglya")
                        .withDescription("dckcbc"));
        model = BinaryData.fromObject(model).toObject(ResourceProviderOperationInner.class);
        Assertions.assertEquals("kpzksmondjmq", model.isDataAction());
        Assertions.assertEquals("vypomgkopkwho", model.name());
        Assertions.assertEquals("ajqgxy", model.display().provider());
        Assertions.assertEquals("ocmbqfqvmkcxoza", model.display().resource());
        Assertions.assertEquals("helxprglya", model.display().operation());
        Assertions.assertEquals("dckcbc", model.display().description());
    }
}
