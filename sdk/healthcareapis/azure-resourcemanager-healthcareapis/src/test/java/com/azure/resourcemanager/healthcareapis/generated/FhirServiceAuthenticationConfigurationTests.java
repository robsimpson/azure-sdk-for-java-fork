// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.FhirServiceAuthenticationConfiguration;
import com.azure.resourcemanager.healthcareapis.models.SmartDataActions;
import com.azure.resourcemanager.healthcareapis.models.SmartIdentityProviderApplication;
import com.azure.resourcemanager.healthcareapis.models.SmartIdentityProviderConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FhirServiceAuthenticationConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FhirServiceAuthenticationConfiguration model = BinaryData.fromString(
            "{\"authority\":\"i\",\"audience\":\"dggkzzlvmbmpa\",\"smartProxyEnabled\":true,\"smartIdentityProviders\":[{\"authority\":\"uefywsbpfvmwy\",\"applications\":[{\"clientId\":\"uyfta\",\"audience\":\"cpwi\",\"allowedDataActions\":[\"Read\",\"Read\"]},{\"clientId\":\"nubexk\",\"audience\":\"ksmond\",\"allowedDataActions\":[\"Read\",\"Read\",\"Read\"]}]}]}")
            .toObject(FhirServiceAuthenticationConfiguration.class);
        Assertions.assertEquals("i", model.authority());
        Assertions.assertEquals("dggkzzlvmbmpa", model.audience());
        Assertions.assertEquals(true, model.smartProxyEnabled());
        Assertions.assertEquals("uefywsbpfvmwy", model.smartIdentityProviders().get(0).authority());
        Assertions.assertEquals("uyfta", model.smartIdentityProviders().get(0).applications().get(0).clientId());
        Assertions.assertEquals("cpwi", model.smartIdentityProviders().get(0).applications().get(0).audience());
        Assertions.assertEquals(SmartDataActions.READ,
            model.smartIdentityProviders().get(0).applications().get(0).allowedDataActions().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FhirServiceAuthenticationConfiguration model
            = new FhirServiceAuthenticationConfiguration().withAuthority("i")
                .withAudience("dggkzzlvmbmpa")
                .withSmartProxyEnabled(true)
                .withSmartIdentityProviders(Arrays.asList(new SmartIdentityProviderConfiguration()
                    .withAuthority("uefywsbpfvmwy")
                    .withApplications(Arrays.asList(
                        new SmartIdentityProviderApplication().withClientId("uyfta")
                            .withAudience("cpwi")
                            .withAllowedDataActions(Arrays.asList(SmartDataActions.READ, SmartDataActions.READ)),
                        new SmartIdentityProviderApplication().withClientId("nubexk")
                            .withAudience("ksmond")
                            .withAllowedDataActions(
                                Arrays.asList(SmartDataActions.READ, SmartDataActions.READ, SmartDataActions.READ))))));
        model = BinaryData.fromObject(model).toObject(FhirServiceAuthenticationConfiguration.class);
        Assertions.assertEquals("i", model.authority());
        Assertions.assertEquals("dggkzzlvmbmpa", model.audience());
        Assertions.assertEquals(true, model.smartProxyEnabled());
        Assertions.assertEquals("uefywsbpfvmwy", model.smartIdentityProviders().get(0).authority());
        Assertions.assertEquals("uyfta", model.smartIdentityProviders().get(0).applications().get(0).clientId());
        Assertions.assertEquals("cpwi", model.smartIdentityProviders().get(0).applications().get(0).audience());
        Assertions.assertEquals(SmartDataActions.READ,
            model.smartIdentityProviders().get(0).applications().get(0).allowedDataActions().get(0));
    }
}
