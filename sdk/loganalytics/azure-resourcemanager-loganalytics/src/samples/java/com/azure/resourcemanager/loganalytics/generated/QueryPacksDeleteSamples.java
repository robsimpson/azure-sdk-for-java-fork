// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.Context;

/** Samples for QueryPacks Delete. */
public final class QueryPacksDeleteSamples {
    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2019-09-01/examples/QueryPacksDelete.json
     */
    /**
     * Sample code: QueryPacksDelete.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void queryPacksDelete(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager.queryPacks().deleteWithResponse("my-resource-group", "my-querypack", Context.NONE);
    }
}
