// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.resourcemanager.security.models.SettingName;

/** Samples for Settings Get. */
public final class SettingsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2022-05-01/examples/Settings/GetSetting_example.json
     */
    /**
     * Sample code: Get a setting on subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getASettingOnSubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.settings().getWithResponse(SettingName.WDATP, com.azure.core.util.Context.NONE);
    }
}
