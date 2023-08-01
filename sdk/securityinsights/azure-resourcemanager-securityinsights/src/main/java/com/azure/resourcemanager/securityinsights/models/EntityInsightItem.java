// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Entity insight Item. */
@Fluent
public final class EntityInsightItem {
    /*
     * The query id of the insight
     */
    @JsonProperty(value = "queryId")
    private String queryId;

    /*
     * The Time interval that the query actually executed on.
     */
    @JsonProperty(value = "queryTimeInterval")
    private EntityInsightItemQueryTimeInterval queryTimeInterval;

    /*
     * Query results for table insights query.
     */
    @JsonProperty(value = "tableQueryResults")
    private InsightsTableResult tableQueryResults;

    /*
     * Query results for table insights query.
     */
    @JsonProperty(value = "chartQueryResults")
    private List<InsightsTableResult> chartQueryResults;

    /**
     * Get the queryId property: The query id of the insight.
     *
     * @return the queryId value.
     */
    public String queryId() {
        return this.queryId;
    }

    /**
     * Set the queryId property: The query id of the insight.
     *
     * @param queryId the queryId value to set.
     * @return the EntityInsightItem object itself.
     */
    public EntityInsightItem withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * Get the queryTimeInterval property: The Time interval that the query actually executed on.
     *
     * @return the queryTimeInterval value.
     */
    public EntityInsightItemQueryTimeInterval queryTimeInterval() {
        return this.queryTimeInterval;
    }

    /**
     * Set the queryTimeInterval property: The Time interval that the query actually executed on.
     *
     * @param queryTimeInterval the queryTimeInterval value to set.
     * @return the EntityInsightItem object itself.
     */
    public EntityInsightItem withQueryTimeInterval(EntityInsightItemQueryTimeInterval queryTimeInterval) {
        this.queryTimeInterval = queryTimeInterval;
        return this;
    }

    /**
     * Get the tableQueryResults property: Query results for table insights query.
     *
     * @return the tableQueryResults value.
     */
    public InsightsTableResult tableQueryResults() {
        return this.tableQueryResults;
    }

    /**
     * Set the tableQueryResults property: Query results for table insights query.
     *
     * @param tableQueryResults the tableQueryResults value to set.
     * @return the EntityInsightItem object itself.
     */
    public EntityInsightItem withTableQueryResults(InsightsTableResult tableQueryResults) {
        this.tableQueryResults = tableQueryResults;
        return this;
    }

    /**
     * Get the chartQueryResults property: Query results for table insights query.
     *
     * @return the chartQueryResults value.
     */
    public List<InsightsTableResult> chartQueryResults() {
        return this.chartQueryResults;
    }

    /**
     * Set the chartQueryResults property: Query results for table insights query.
     *
     * @param chartQueryResults the chartQueryResults value to set.
     * @return the EntityInsightItem object itself.
     */
    public EntityInsightItem withChartQueryResults(List<InsightsTableResult> chartQueryResults) {
        this.chartQueryResults = chartQueryResults;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queryTimeInterval() != null) {
            queryTimeInterval().validate();
        }
        if (tableQueryResults() != null) {
            tableQueryResults().validate();
        }
        if (chartQueryResults() != null) {
            chartQueryResults().forEach(e -> e.validate());
        }
    }
}
