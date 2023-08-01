// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.generated;

import com.azure.resourcemanager.maps.models.KeyType;
import com.azure.resourcemanager.maps.models.MapsKeySpecification;

/** Samples for Accounts RegenerateKeys. */
public final class AccountsRegenerateKeysSamples {
    /*
     * x-ms-original-file: specification/maps/resource-manager/Microsoft.Maps/stable/2021-02-01/examples/RegenerateKey.json
     */
    /**
     * Sample code: Regenerate Key.
     *
     * @param manager Entry point to AzureMapsManager.
     */
    public static void regenerateKey(com.azure.resourcemanager.maps.AzureMapsManager manager) {
        manager
            .accounts()
            .regenerateKeysWithResponse(
                "myResourceGroup",
                "myMapsAccount",
                new MapsKeySpecification().withKeyType(KeyType.PRIMARY),
                com.azure.core.util.Context.NONE);
    }
}
