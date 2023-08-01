// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The current status of trigger. */
public final class TriggerStatus extends ExpandableStringEnum<TriggerStatus> {
    /** Static value Disabled for TriggerStatus. */
    public static final TriggerStatus DISABLED = fromString("Disabled");

    /** Static value Enabled for TriggerStatus. */
    public static final TriggerStatus ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of TriggerStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TriggerStatus() {
    }

    /**
     * Creates or finds a TriggerStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TriggerStatus.
     */
    @JsonCreator
    public static TriggerStatus fromString(String name) {
        return fromString(name, TriggerStatus.class);
    }

    /**
     * Gets known TriggerStatus values.
     *
     * @return known TriggerStatus values.
     */
    public static Collection<TriggerStatus> values() {
        return values(TriggerStatus.class);
    }
}
