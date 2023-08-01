// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.models.DeliveryRuleResponseHeaderAction;
import com.azure.resourcemanager.cdn.models.HeaderAction;
import com.azure.resourcemanager.cdn.models.HeaderActionParameters;
import com.azure.resourcemanager.cdn.models.RuleUpdateParameters;
import java.util.Arrays;

/** Samples for Rules Update. */
public final class RulesUpdateSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/Rules_Update.json
     */
    /**
     * Sample code: Rules_Update.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void rulesUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getRules()
            .update(
                "RG",
                "profile1",
                "ruleSet1",
                "rule1",
                new RuleUpdateParameters()
                    .withOrder(1)
                    .withActions(
                        Arrays
                            .asList(
                                new DeliveryRuleResponseHeaderAction()
                                    .withParameters(
                                        new HeaderActionParameters()
                                            .withHeaderAction(HeaderAction.OVERWRITE)
                                            .withHeaderName("X-CDN")
                                            .withValue("MSFT")))),
                Context.NONE);
    }
}
