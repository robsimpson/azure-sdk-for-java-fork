// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/** Number of device to cloud messages (AMQP protocol) is not in allowed range. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("AmqpD2CMessagesNotInAllowedRange")
@Fluent
public final class AmqpD2CMessagesNotInAllowedRange extends TimeWindowCustomAlertRule {
    /** Creates an instance of AmqpD2CMessagesNotInAllowedRange class. */
    public AmqpD2CMessagesNotInAllowedRange() {
    }

    /** {@inheritDoc} */
    @Override
    public AmqpD2CMessagesNotInAllowedRange withTimeWindowSize(Duration timeWindowSize) {
        super.withTimeWindowSize(timeWindowSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmqpD2CMessagesNotInAllowedRange withMinThreshold(int minThreshold) {
        super.withMinThreshold(minThreshold);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmqpD2CMessagesNotInAllowedRange withMaxThreshold(int maxThreshold) {
        super.withMaxThreshold(maxThreshold);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmqpD2CMessagesNotInAllowedRange withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
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
