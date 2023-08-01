// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of Recovery Point. */
@Fluent
public final class RecoveryPointProperties {
    /*
     * Expiry time of Recovery Point in UTC.
     */
    @JsonProperty(value = "expiryTime")
    private String expiryTime;

    /*
     * Rule name tagged on Recovery Point that governs life cycle
     */
    @JsonProperty(value = "ruleName")
    private String ruleName;

    /*
     * Bool to indicate whether RP is in soft delete state or not
     */
    @JsonProperty(value = "isSoftDeleted")
    private Boolean isSoftDeleted;

    /** Creates an instance of RecoveryPointProperties class. */
    public RecoveryPointProperties() {
    }

    /**
     * Get the expiryTime property: Expiry time of Recovery Point in UTC.
     *
     * @return the expiryTime value.
     */
    public String expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the expiryTime property: Expiry time of Recovery Point in UTC.
     *
     * @param expiryTime the expiryTime value to set.
     * @return the RecoveryPointProperties object itself.
     */
    public RecoveryPointProperties withExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get the ruleName property: Rule name tagged on Recovery Point that governs life cycle.
     *
     * @return the ruleName value.
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set the ruleName property: Rule name tagged on Recovery Point that governs life cycle.
     *
     * @param ruleName the ruleName value to set.
     * @return the RecoveryPointProperties object itself.
     */
    public RecoveryPointProperties withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * Get the isSoftDeleted property: Bool to indicate whether RP is in soft delete state or not.
     *
     * @return the isSoftDeleted value.
     */
    public Boolean isSoftDeleted() {
        return this.isSoftDeleted;
    }

    /**
     * Set the isSoftDeleted property: Bool to indicate whether RP is in soft delete state or not.
     *
     * @param isSoftDeleted the isSoftDeleted value to set.
     * @return the RecoveryPointProperties object itself.
     */
    public RecoveryPointProperties withIsSoftDeleted(Boolean isSoftDeleted) {
        this.isSoftDeleted = isSoftDeleted;
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
