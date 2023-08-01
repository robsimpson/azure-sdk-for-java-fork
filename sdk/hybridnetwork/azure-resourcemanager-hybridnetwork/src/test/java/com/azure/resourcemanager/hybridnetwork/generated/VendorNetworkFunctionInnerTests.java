// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorNetworkFunctionInner;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionVendorConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.VendorProvisioningState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VendorNetworkFunctionInnerTests {
    @Test
    public void testDeserialize() {
        VendorNetworkFunctionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Deleted\",\"vendorProvisioningState\":\"Provisioned\",\"skuName\":\"xjnspy\",\"skuType\":\"Unknown\",\"networkFunctionVendorConfigurations\":[{\"roleName\":\"nkoukn\",\"networkInterfaces\":[]},{\"roleName\":\"iukbldngkpoci\",\"networkInterfaces\":[]},{\"roleName\":\"o\",\"networkInterfaces\":[]},{\"roleName\":\"jnpiucgyg\",\"networkInterfaces\":[]}]},\"id\":\"typmrbpizcdrqjsd\",\"name\":\"ydnfyhxdeoejz\",\"type\":\"cwif\"}")
                .toObject(VendorNetworkFunctionInner.class);
        Assertions.assertEquals(VendorProvisioningState.PROVISIONED, model.vendorProvisioningState());
        Assertions.assertEquals("nkoukn", model.networkFunctionVendorConfigurations().get(0).roleName());
    }

    @Test
    public void testSerialize() {
        VendorNetworkFunctionInner model =
            new VendorNetworkFunctionInner()
                .withVendorProvisioningState(VendorProvisioningState.PROVISIONED)
                .withNetworkFunctionVendorConfigurations(
                    Arrays
                        .asList(
                            new NetworkFunctionVendorConfiguration()
                                .withRoleName("nkoukn")
                                .withNetworkInterfaces(Arrays.asList()),
                            new NetworkFunctionVendorConfiguration()
                                .withRoleName("iukbldngkpoci")
                                .withNetworkInterfaces(Arrays.asList()),
                            new NetworkFunctionVendorConfiguration()
                                .withRoleName("o")
                                .withNetworkInterfaces(Arrays.asList()),
                            new NetworkFunctionVendorConfiguration()
                                .withRoleName("jnpiucgyg")
                                .withNetworkInterfaces(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(VendorNetworkFunctionInner.class);
        Assertions.assertEquals(VendorProvisioningState.PROVISIONED, model.vendorProvisioningState());
        Assertions.assertEquals("nkoukn", model.networkFunctionVendorConfigurations().get(0).roleName());
    }
}
