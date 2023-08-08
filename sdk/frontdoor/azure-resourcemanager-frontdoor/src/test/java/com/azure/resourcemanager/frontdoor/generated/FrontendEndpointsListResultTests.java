// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.FrontendEndpointsListResult;
import org.junit.jupiter.api.Assertions;

public final class FrontendEndpointsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FrontendEndpointsListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"resourceState\":\"Migrated\",\"customHttpsProvisioningState\":\"Failed\",\"customHttpsProvisioningSubstate\":\"DomainControlValidationRequestTimedOut\",\"hostName\":\"gplsaknynf\",\"sessionAffinityEnabledState\":\"Enabled\",\"sessionAffinityTtlSeconds\":962840058},\"name\":\"uopxodlqiyntor\",\"type\":\"hleosjsw\",\"id\":\"mslyzrpzbchckqqz\"},{\"properties\":{\"resourceState\":\"Enabling\",\"customHttpsProvisioningState\":\"Failed\",\"customHttpsProvisioningSubstate\":\"DeployingCertificate\",\"hostName\":\"zynkedya\",\"sessionAffinityEnabledState\":\"Disabled\",\"sessionAffinityTtlSeconds\":613432064},\"name\":\"ibzyhwitsmyp\",\"type\":\"npcdpumnzgm\",\"id\":\"nmabik\"},{\"properties\":{\"resourceState\":\"Enabled\",\"customHttpsProvisioningState\":\"Disabled\",\"customHttpsProvisioningSubstate\":\"IssuingCertificate\",\"hostName\":\"dtlwwrlkd\",\"sessionAffinityEnabledState\":\"Disabled\",\"sessionAffinityTtlSeconds\":575537073},\"name\":\"otllxdyhgsyo\",\"type\":\"gjltdtbnnhado\",\"id\":\"rkvcikhnvpa\"},{\"properties\":{\"resourceState\":\"Creating\",\"customHttpsProvisioningState\":\"Disabling\",\"customHttpsProvisioningSubstate\":\"DomainControlValidationRequestTimedOut\",\"hostName\":\"kywggxkallatmel\",\"sessionAffinityEnabledState\":\"Enabled\",\"sessionAffinityTtlSeconds\":1750624466},\"name\":\"jzkzi\",\"type\":\"vvcnayr\",\"id\":\"rnxxmueed\"}],\"nextLink\":\"rdvstkwqqtch\"}")
                .toObject(FrontendEndpointsListResult.class);
        Assertions.assertEquals("rdvstkwqqtch", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FrontendEndpointsListResult model = new FrontendEndpointsListResult().withNextLink("rdvstkwqqtch");
        model = BinaryData.fromObject(model).toObject(FrontendEndpointsListResult.class);
        Assertions.assertEquals("rdvstkwqqtch", model.nextLink());
    }
}
