// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestack.fluent.models.ExtendedProductProperties;

public final class ExtendedProductPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExtendedProductProperties model =
            BinaryData
                .fromString(
                    "{\"version\":\"efovgmk\",\"osDiskImage\":{\"operatingSystem\":\"Windows\",\"sourceBlobSasUri\":\"bvyvdcsity\"},\"dataDiskImages\":[{\"lun\":1611277697,\"sourceBlobSasUri\":\"ectehf\"},{\"lun\":1860942440,\"sourceBlobSasUri\":\"jeyp\"}],\"computeRole\":\"PaaS\",\"isSystemExtension\":true,\"sourceBlob\":{\"uri\":\"q\"},\"supportMultipleExtensions\":true,\"vmOsType\":\"Windows\",\"vmScaleSetEnabled\":true}")
                .toObject(ExtendedProductProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExtendedProductProperties model = new ExtendedProductProperties();
        model = BinaryData.fromObject(model).toObject(ExtendedProductProperties.class);
    }
}
