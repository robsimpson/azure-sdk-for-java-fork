// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.videoanalyzer.models.PipelineJob;

/** Samples for PipelineJobs Update. */
public final class PipelineJobsUpdateSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/pipeline-job-patch.json
     */
    /**
     * Sample code: Updates a pipeline job.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void updatesAPipelineJob(com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        PipelineJob resource =
            manager.pipelineJobs().getWithResponse("testrg", "testaccount2", "pipelineJob1", Context.NONE).getValue();
        resource.update().withDescription("Pipeline Job 1 description").apply();
    }
}
