// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.resourcemanager.logic.models.GetCallbackUrlParameters;
import com.azure.resourcemanager.logic.models.KeyType;
import java.time.OffsetDateTime;

/** Samples for IntegrationAccountMaps ListContentCallbackUrl. */
public final class IntegrationAccountMapsListContentCallbackUrlSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountMaps_ListContentCallbackUrl.json
     */
    /**
     * Sample code: Get the content callback url.
     *
     * @param manager Entry point to LogicManager.
     */
    public static void getTheContentCallbackUrl(com.azure.resourcemanager.logic.LogicManager manager) {
        manager
            .integrationAccountMaps()
            .listContentCallbackUrlWithResponse(
                "testResourceGroup",
                "testIntegrationAccount",
                "testMap",
                new GetCallbackUrlParameters()
                    .withNotAfter(OffsetDateTime.parse("2018-04-19T16:00:00Z"))
                    .withKeyType(KeyType.PRIMARY),
                com.azure.core.util.Context.NONE);
    }
}
