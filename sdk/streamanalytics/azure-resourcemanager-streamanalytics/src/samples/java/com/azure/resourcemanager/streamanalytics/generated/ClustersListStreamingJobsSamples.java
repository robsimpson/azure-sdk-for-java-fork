// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.Context;

/** Samples for Clusters ListStreamingJobs. */
public final class ClustersListStreamingJobsSamples {
    /*
     * x-ms-original-file: specification/streamanalytics/resource-manager/Microsoft.StreamAnalytics/stable/2020-03-01/examples/Cluster_ListStreamingJobs.json
     */
    /**
     * Sample code: List all streaming jobs in cluster.
     *
     * @param manager Entry point to StreamAnalyticsManager.
     */
    public static void listAllStreamingJobsInCluster(
        com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager) {
        manager.clusters().listStreamingJobs("sjrg", "testcluster", Context.NONE);
    }
}
