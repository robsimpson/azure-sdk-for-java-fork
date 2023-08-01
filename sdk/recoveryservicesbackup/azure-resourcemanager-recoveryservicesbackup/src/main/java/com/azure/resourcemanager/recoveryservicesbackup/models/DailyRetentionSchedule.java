// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Daily retention schedule. */
@Fluent
public final class DailyRetentionSchedule {
    /*
     * Retention times of retention policy.
     */
    @JsonProperty(value = "retentionTimes")
    private List<OffsetDateTime> retentionTimes;

    /*
     * Retention duration of retention Policy.
     */
    @JsonProperty(value = "retentionDuration")
    private RetentionDuration retentionDuration;

    /** Creates an instance of DailyRetentionSchedule class. */
    public DailyRetentionSchedule() {
    }

    /**
     * Get the retentionTimes property: Retention times of retention policy.
     *
     * @return the retentionTimes value.
     */
    public List<OffsetDateTime> retentionTimes() {
        return this.retentionTimes;
    }

    /**
     * Set the retentionTimes property: Retention times of retention policy.
     *
     * @param retentionTimes the retentionTimes value to set.
     * @return the DailyRetentionSchedule object itself.
     */
    public DailyRetentionSchedule withRetentionTimes(List<OffsetDateTime> retentionTimes) {
        this.retentionTimes = retentionTimes;
        return this;
    }

    /**
     * Get the retentionDuration property: Retention duration of retention Policy.
     *
     * @return the retentionDuration value.
     */
    public RetentionDuration retentionDuration() {
        return this.retentionDuration;
    }

    /**
     * Set the retentionDuration property: Retention duration of retention Policy.
     *
     * @param retentionDuration the retentionDuration value to set.
     * @return the DailyRetentionSchedule object itself.
     */
    public DailyRetentionSchedule withRetentionDuration(RetentionDuration retentionDuration) {
        this.retentionDuration = retentionDuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (retentionDuration() != null) {
            retentionDuration().validate();
        }
    }
}
