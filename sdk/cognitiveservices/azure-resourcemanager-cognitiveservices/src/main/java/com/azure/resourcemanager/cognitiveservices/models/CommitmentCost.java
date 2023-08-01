// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cognitive Services account commitment cost. */
@Fluent
public final class CommitmentCost {
    /*
     * Commitment meter Id.
     */
    @JsonProperty(value = "commitmentMeterId")
    private String commitmentMeterId;

    /*
     * Overage meter Id.
     */
    @JsonProperty(value = "overageMeterId")
    private String overageMeterId;

    /** Creates an instance of CommitmentCost class. */
    public CommitmentCost() {
    }

    /**
     * Get the commitmentMeterId property: Commitment meter Id.
     *
     * @return the commitmentMeterId value.
     */
    public String commitmentMeterId() {
        return this.commitmentMeterId;
    }

    /**
     * Set the commitmentMeterId property: Commitment meter Id.
     *
     * @param commitmentMeterId the commitmentMeterId value to set.
     * @return the CommitmentCost object itself.
     */
    public CommitmentCost withCommitmentMeterId(String commitmentMeterId) {
        this.commitmentMeterId = commitmentMeterId;
        return this;
    }

    /**
     * Get the overageMeterId property: Overage meter Id.
     *
     * @return the overageMeterId value.
     */
    public String overageMeterId() {
        return this.overageMeterId;
    }

    /**
     * Set the overageMeterId property: Overage meter Id.
     *
     * @param overageMeterId the overageMeterId value to set.
     * @return the CommitmentCost object itself.
     */
    public CommitmentCost withOverageMeterId(String overageMeterId) {
        this.overageMeterId = overageMeterId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
