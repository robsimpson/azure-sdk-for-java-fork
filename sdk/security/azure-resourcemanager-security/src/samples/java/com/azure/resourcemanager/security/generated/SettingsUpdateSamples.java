// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.resourcemanager.security.models.DataExportSettings;
import com.azure.resourcemanager.security.models.SettingName;

/** Samples for Settings Update. */
public final class SettingsUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2022-05-01/examples/Settings/UpdateSetting_example.json
     */
    /**
     * Sample code: Update a setting for subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void updateASettingForSubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .settings()
            .updateWithResponse(
                SettingName.WDATP, new DataExportSettings().withEnabled(true), com.azure.core.util.Context.NONE);
    }
}
