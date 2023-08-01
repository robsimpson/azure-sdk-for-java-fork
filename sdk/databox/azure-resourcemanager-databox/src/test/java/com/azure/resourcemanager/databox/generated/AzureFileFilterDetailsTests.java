// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.AzureFileFilterDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureFileFilterDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileFilterDetails model =
            BinaryData
                .fromString(
                    "{\"filePrefixList\":[\"owgujjugwdkcglhs\"],\"filePathList\":[\"jdyggdtji\"],\"fileShareList\":[\"kuofqweykhme\"]}")
                .toObject(AzureFileFilterDetails.class);
        Assertions.assertEquals("owgujjugwdkcglhs", model.filePrefixList().get(0));
        Assertions.assertEquals("jdyggdtji", model.filePathList().get(0));
        Assertions.assertEquals("kuofqweykhme", model.fileShareList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileFilterDetails model =
            new AzureFileFilterDetails()
                .withFilePrefixList(Arrays.asList("owgujjugwdkcglhs"))
                .withFilePathList(Arrays.asList("jdyggdtji"))
                .withFileShareList(Arrays.asList("kuofqweykhme"));
        model = BinaryData.fromObject(model).toObject(AzureFileFilterDetails.class);
        Assertions.assertEquals("owgujjugwdkcglhs", model.filePrefixList().get(0));
        Assertions.assertEquals("jdyggdtji", model.filePathList().get(0));
        Assertions.assertEquals("kuofqweykhme", model.fileShareList().get(0));
    }
}
