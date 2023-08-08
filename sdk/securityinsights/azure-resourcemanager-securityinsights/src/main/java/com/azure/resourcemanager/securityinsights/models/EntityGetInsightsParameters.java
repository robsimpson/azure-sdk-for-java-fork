// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** The parameters required to execute insights operation on the given entity. */
@Fluent
public final class EntityGetInsightsParameters {
    /*
     * The start timeline date, so the results returned are after this date.
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * The end timeline date, so the results returned are before this date.
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /*
     * Indicates if query time range should be extended with default time range of the query. Default value is false
     */
    @JsonProperty(value = "addDefaultExtendedTimeRange")
    private Boolean addDefaultExtendedTimeRange;

    /*
     * List of Insights Query Id. If empty, default value is all insights of this entity
     */
    @JsonProperty(value = "insightQueryIds")
    private List<UUID> insightQueryIds;

    /**
     * Get the startTime property: The start timeline date, so the results returned are after this date.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start timeline date, so the results returned are after this date.
     *
     * @param startTime the startTime value to set.
     * @return the EntityGetInsightsParameters object itself.
     */
    public EntityGetInsightsParameters withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end timeline date, so the results returned are before this date.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end timeline date, so the results returned are before this date.
     *
     * @param endTime the endTime value to set.
     * @return the EntityGetInsightsParameters object itself.
     */
    public EntityGetInsightsParameters withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the addDefaultExtendedTimeRange property: Indicates if query time range should be extended with default time
     * range of the query. Default value is false.
     *
     * @return the addDefaultExtendedTimeRange value.
     */
    public Boolean addDefaultExtendedTimeRange() {
        return this.addDefaultExtendedTimeRange;
    }

    /**
     * Set the addDefaultExtendedTimeRange property: Indicates if query time range should be extended with default time
     * range of the query. Default value is false.
     *
     * @param addDefaultExtendedTimeRange the addDefaultExtendedTimeRange value to set.
     * @return the EntityGetInsightsParameters object itself.
     */
    public EntityGetInsightsParameters withAddDefaultExtendedTimeRange(Boolean addDefaultExtendedTimeRange) {
        this.addDefaultExtendedTimeRange = addDefaultExtendedTimeRange;
        return this;
    }

    /**
     * Get the insightQueryIds property: List of Insights Query Id. If empty, default value is all insights of this
     * entity.
     *
     * @return the insightQueryIds value.
     */
    public List<UUID> insightQueryIds() {
        return this.insightQueryIds;
    }

    /**
     * Set the insightQueryIds property: List of Insights Query Id. If empty, default value is all insights of this
     * entity.
     *
     * @param insightQueryIds the insightQueryIds value to set.
     * @return the EntityGetInsightsParameters object itself.
     */
    public EntityGetInsightsParameters withInsightQueryIds(List<UUID> insightQueryIds) {
        this.insightQueryIds = insightQueryIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property startTime in model EntityGetInsightsParameters"));
        }
        if (endTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property endTime in model EntityGetInsightsParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EntityGetInsightsParameters.class);
}
