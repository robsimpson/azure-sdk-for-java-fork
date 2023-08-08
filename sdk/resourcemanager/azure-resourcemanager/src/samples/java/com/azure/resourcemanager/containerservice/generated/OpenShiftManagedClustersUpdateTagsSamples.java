// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.resourcemanager.containerservice.models.TagsObject;
import java.util.HashMap;
import java.util.Map;

/** Samples for OpenShiftManagedClusters UpdateTags. */
public final class OpenShiftManagedClustersUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2019-04-30/examples/OpenShiftManagedClustersUpdateTags.json
     */
    /**
     * Sample code: Update OpenShift Managed Cluster Tags.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateOpenShiftManagedClusterTags(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getOpenShiftManagedClusters()
            .updateTags(
                "rg1",
                "clustername1",
                new TagsObject().withTags(mapOf("archv3", "", "tier", "testing")),
                com.azure.core.util.Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
