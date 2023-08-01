// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schema for details of a delivery attempt. */
@Fluent
public final class AcsSmsDeliveryAttemptProperties {
    /*
     * TimeStamp when delivery was attempted
     */
    @JsonProperty(value = "timestamp")
    private OffsetDateTime timestamp;

    /*
     * Number of segments that were successfully delivered
     */
    @JsonProperty(value = "segmentsSucceeded")
    private Integer segmentsSucceeded;

    /*
     * Number of segments whose delivery failed
     */
    @JsonProperty(value = "segmentsFailed")
    private Integer segmentsFailed;

    /** Creates an instance of AcsSmsDeliveryAttemptProperties class. */
    public AcsSmsDeliveryAttemptProperties() {}

    /**
     * Get the timestamp property: TimeStamp when delivery was attempted.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: TimeStamp when delivery was attempted.
     *
     * @param timestamp the timestamp value to set.
     * @return the AcsSmsDeliveryAttemptProperties object itself.
     */
    public AcsSmsDeliveryAttemptProperties setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the segmentsSucceeded property: Number of segments that were successfully delivered.
     *
     * @return the segmentsSucceeded value.
     */
    public Integer getSegmentsSucceeded() {
        return this.segmentsSucceeded;
    }

    /**
     * Set the segmentsSucceeded property: Number of segments that were successfully delivered.
     *
     * @param segmentsSucceeded the segmentsSucceeded value to set.
     * @return the AcsSmsDeliveryAttemptProperties object itself.
     */
    public AcsSmsDeliveryAttemptProperties setSegmentsSucceeded(Integer segmentsSucceeded) {
        this.segmentsSucceeded = segmentsSucceeded;
        return this;
    }

    /**
     * Get the segmentsFailed property: Number of segments whose delivery failed.
     *
     * @return the segmentsFailed value.
     */
    public Integer getSegmentsFailed() {
        return this.segmentsFailed;
    }

    /**
     * Set the segmentsFailed property: Number of segments whose delivery failed.
     *
     * @param segmentsFailed the segmentsFailed value to set.
     * @return the AcsSmsDeliveryAttemptProperties object itself.
     */
    public AcsSmsDeliveryAttemptProperties setSegmentsFailed(Integer segmentsFailed) {
        this.segmentsFailed = segmentsFailed;
        return this;
    }
}
