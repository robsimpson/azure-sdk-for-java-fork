// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import com.azure.resourcemanager.devcenter.models.ScheduleEnableStatus;
import com.azure.resourcemanager.devcenter.models.ScheduledFrequency;
import com.azure.resourcemanager.devcenter.models.ScheduledType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Schedule properties defining when and what to execute. */
@Fluent
public final class ScheduleProperties extends ScheduleUpdateProperties {
    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of ScheduleProperties class. */
    public ScheduleProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduleProperties withType(ScheduledType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduleProperties withFrequency(ScheduledFrequency frequency) {
        super.withFrequency(frequency);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduleProperties withTime(String time) {
        super.withTime(time);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduleProperties withTimeZone(String timeZone) {
        super.withTimeZone(timeZone);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduleProperties withState(ScheduleEnableStatus state) {
        super.withState(state);
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
