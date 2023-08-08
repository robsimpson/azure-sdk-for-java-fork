// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A2A provider specific recovery point details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
@Fluent
public final class A2ARecoveryPointDetails extends ProviderSpecificRecoveryPointDetails {
    /*
     * A value indicating whether the recovery point is multi VM consistent.
     */
    @JsonProperty(value = "recoveryPointSyncType")
    private RecoveryPointSyncType recoveryPointSyncType;

    /*
     * List of disk ids representing a recovery point.
     */
    @JsonProperty(value = "disks")
    private List<String> disks;

    /** Creates an instance of A2ARecoveryPointDetails class. */
    public A2ARecoveryPointDetails() {
    }

    /**
     * Get the recoveryPointSyncType property: A value indicating whether the recovery point is multi VM consistent.
     *
     * @return the recoveryPointSyncType value.
     */
    public RecoveryPointSyncType recoveryPointSyncType() {
        return this.recoveryPointSyncType;
    }

    /**
     * Set the recoveryPointSyncType property: A value indicating whether the recovery point is multi VM consistent.
     *
     * @param recoveryPointSyncType the recoveryPointSyncType value to set.
     * @return the A2ARecoveryPointDetails object itself.
     */
    public A2ARecoveryPointDetails withRecoveryPointSyncType(RecoveryPointSyncType recoveryPointSyncType) {
        this.recoveryPointSyncType = recoveryPointSyncType;
        return this;
    }

    /**
     * Get the disks property: List of disk ids representing a recovery point.
     *
     * @return the disks value.
     */
    public List<String> disks() {
        return this.disks;
    }

    /**
     * Set the disks property: List of disk ids representing a recovery point.
     *
     * @param disks the disks value to set.
     * @return the A2ARecoveryPointDetails object itself.
     */
    public A2ARecoveryPointDetails withDisks(List<String> disks) {
        this.disks = disks;
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
