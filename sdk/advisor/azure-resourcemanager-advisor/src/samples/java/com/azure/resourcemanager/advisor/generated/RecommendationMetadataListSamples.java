// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

/** Samples for RecommendationMetadata List. */
public final class RecommendationMetadataListSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/stable/2020-01-01/examples/ListRecommendationMetadata.json
     */
    /**
     * Sample code: GetMetadata.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void getMetadata(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.recommendationMetadatas().list(com.azure.core.util.Context.NONE);
    }
}
