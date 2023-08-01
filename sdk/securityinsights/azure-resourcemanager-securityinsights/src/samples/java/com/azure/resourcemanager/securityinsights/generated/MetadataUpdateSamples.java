// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.models.MetadataAuthor;
import com.azure.resourcemanager.securityinsights.models.MetadataModel;

/** Samples for Metadata Update. */
public final class MetadataUpdateSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-09-01-preview/examples/metadata/PatchMetadata.json
     */
    /**
     * Sample code: Update metadata.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void updateMetadata(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        MetadataModel resource =
            manager.metadatas().getWithResponse("myRg", "myWorkspace", "metadataName", Context.NONE).getValue();
        resource
            .update()
            .withAuthor(new MetadataAuthor().withName("User Name").withEmail("email@microsoft.com"))
            .apply();
    }
}
