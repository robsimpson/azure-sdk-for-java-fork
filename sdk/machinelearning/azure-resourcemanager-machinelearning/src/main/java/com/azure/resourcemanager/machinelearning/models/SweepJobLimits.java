// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/** Sweep Job limit class. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobLimitsType")
@JsonTypeName("Sweep")
@Fluent
public final class SweepJobLimits extends JobLimits {
    /*
     * Sweep Job max concurrent trials.
     */
    @JsonProperty(value = "maxConcurrentTrials")
    private Integer maxConcurrentTrials;

    /*
     * Sweep Job max total trials.
     */
    @JsonProperty(value = "maxTotalTrials")
    private Integer maxTotalTrials;

    /*
     * Sweep Job Trial timeout value.
     */
    @JsonProperty(value = "trialTimeout")
    private Duration trialTimeout;

    /** Creates an instance of SweepJobLimits class. */
    public SweepJobLimits() {
    }

    /**
     * Get the maxConcurrentTrials property: Sweep Job max concurrent trials.
     *
     * @return the maxConcurrentTrials value.
     */
    public Integer maxConcurrentTrials() {
        return this.maxConcurrentTrials;
    }

    /**
     * Set the maxConcurrentTrials property: Sweep Job max concurrent trials.
     *
     * @param maxConcurrentTrials the maxConcurrentTrials value to set.
     * @return the SweepJobLimits object itself.
     */
    public SweepJobLimits withMaxConcurrentTrials(Integer maxConcurrentTrials) {
        this.maxConcurrentTrials = maxConcurrentTrials;
        return this;
    }

    /**
     * Get the maxTotalTrials property: Sweep Job max total trials.
     *
     * @return the maxTotalTrials value.
     */
    public Integer maxTotalTrials() {
        return this.maxTotalTrials;
    }

    /**
     * Set the maxTotalTrials property: Sweep Job max total trials.
     *
     * @param maxTotalTrials the maxTotalTrials value to set.
     * @return the SweepJobLimits object itself.
     */
    public SweepJobLimits withMaxTotalTrials(Integer maxTotalTrials) {
        this.maxTotalTrials = maxTotalTrials;
        return this;
    }

    /**
     * Get the trialTimeout property: Sweep Job Trial timeout value.
     *
     * @return the trialTimeout value.
     */
    public Duration trialTimeout() {
        return this.trialTimeout;
    }

    /**
     * Set the trialTimeout property: Sweep Job Trial timeout value.
     *
     * @param trialTimeout the trialTimeout value to set.
     * @return the SweepJobLimits object itself.
     */
    public SweepJobLimits withTrialTimeout(Duration trialTimeout) {
        this.trialTimeout = trialTimeout;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SweepJobLimits withTimeout(Duration timeout) {
        super.withTimeout(timeout);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
