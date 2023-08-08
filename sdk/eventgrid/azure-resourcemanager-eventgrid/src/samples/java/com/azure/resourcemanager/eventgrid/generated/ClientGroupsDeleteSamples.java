// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/** Samples for ClientGroups Delete. */
public final class ClientGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-06-01-preview/examples/ClientGroups_Delete.json
     */
    /**
     * Sample code: ClientGroups_Delete.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void clientGroupsDelete(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .clientGroups()
            .delete("examplerg", "exampleNamespaceName1", "exampleClientGroupName1", com.azure.core.util.Context.NONE);
    }
}
