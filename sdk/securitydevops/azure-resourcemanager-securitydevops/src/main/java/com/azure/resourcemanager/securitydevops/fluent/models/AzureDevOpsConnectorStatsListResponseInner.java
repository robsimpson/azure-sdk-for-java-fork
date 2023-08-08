// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsConnectorStats;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AzureDevOpsConnectorStatsListResponse model. */
@Fluent
public final class AzureDevOpsConnectorStatsListResponseInner {
    /*
     * Gets or sets list of resources.
     */
    @JsonProperty(value = "value")
    private List<AzureDevOpsConnectorStats> value;

    /*
     * Gets or sets next link to scroll over the results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of AzureDevOpsConnectorStatsListResponseInner class. */
    public AzureDevOpsConnectorStatsListResponseInner() {
    }

    /**
     * Get the value property: Gets or sets list of resources.
     *
     * @return the value value.
     */
    public List<AzureDevOpsConnectorStats> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets list of resources.
     *
     * @param value the value value to set.
     * @return the AzureDevOpsConnectorStatsListResponseInner object itself.
     */
    public AzureDevOpsConnectorStatsListResponseInner withValue(List<AzureDevOpsConnectorStats> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets next link to scroll over the results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets next link to scroll over the results.
     *
     * @param nextLink the nextLink value to set.
     * @return the AzureDevOpsConnectorStatsListResponseInner object itself.
     */
    public AzureDevOpsConnectorStatsListResponseInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
