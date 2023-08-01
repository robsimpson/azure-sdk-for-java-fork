// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.resourcemanager.applicationinsights.models.Kind;

/** Samples for MyWorkbooks CreateOrUpdate. */
public final class MyWorkbooksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2021-03-08/examples/MyWorkbookAdd.json
     */
    /**
     * Sample code: WorkbookAdd.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void workbookAdd(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .myWorkbooks()
            .define("deadb33f-8bee-4d3b-a059-9be8dac93960")
            .withRegion("west us")
            .withExistingResourceGroup("my-resource-group")
            .withName("deadb33f-8bee-4d3b-a059-9be8dac93960")
            .withKind(Kind.USER)
            .withDisplayName("Blah Blah Blah")
            .withSerializedData(
                "{\"version\":\"Notebook/1.0\",\"items\":[{\"type\":1,\"content\":\"{\"json\":\"## New workbook\\r"
                    + "\\n"
                    + "---\\r"
                    + "\\n"
                    + "\\r"
                    + "\\n"
                    + "Welcome to your new workbook.  This area will display text formatted as markdown.\\r"
                    + "\\n"
                    + "\\r"
                    + "\\n"
                    + "\\r"
                    + "\\n"
                    + "We've included a basic analytics query to get you started. Use the `Edit` button below each"
                    + " section to configure it or add more"
                    + " sections.\"}\",\"halfWidth\":null,\"conditionalVisibility\":null},{\"type\":3,\"content\":\"{\"version\":\"KqlItem/1.0\",\"query\":\"union"
                    + " withsource=TableName *\\n"
                    + "| summarize Count=count() by TableName\\n"
                    + "| render"
                    + " barchart\",\"showQuery\":false,\"size\":1,\"aggregation\":0,\"showAnnotations\":false}\",\"halfWidth\":null,\"conditionalVisibility\":null}],\"isLocked\":false}")
            .withCategory("workbook")
            .withSourceId(
                "/subscriptions/00000000-0000-0000-0000-00000000/resourceGroups/MyGroup/providers/Microsoft.Web/sites/MyTestApp-CodeLens")
            .create();
    }
}
