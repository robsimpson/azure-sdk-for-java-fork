// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** snooze scope. */
public final class SnoozeScope extends ExpandableStringEnum<SnoozeScope> {
    /** Static value Metric for SnoozeScope. */
    public static final SnoozeScope METRIC = fromString("Metric");

    /** Static value Series for SnoozeScope. */
    public static final SnoozeScope SERIES = fromString("Series");

    /**
     * Creates a new instance of SnoozeScope value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SnoozeScope() {}

    /**
     * Creates or finds a SnoozeScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SnoozeScope.
     */
    @JsonCreator
    public static SnoozeScope fromString(String name) {
        return fromString(name, SnoozeScope.class);
    }

    /**
     * Gets known SnoozeScope values.
     *
     * @return known SnoozeScope values.
     */
    public static Collection<SnoozeScope> values() {
        return values(SnoozeScope.class);
    }
}
