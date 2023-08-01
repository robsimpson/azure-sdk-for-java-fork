// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Schedule. */
public final class ReplicationSchedule extends ExpandableStringEnum<ReplicationSchedule> {
    /** Static value _10minutely for ReplicationSchedule. */
    public static final ReplicationSchedule ONE_ZEROMINUTELY = fromString("_10minutely");

    /** Static value hourly for ReplicationSchedule. */
    public static final ReplicationSchedule HOURLY = fromString("hourly");

    /** Static value daily for ReplicationSchedule. */
    public static final ReplicationSchedule DAILY = fromString("daily");

    /**
     * Creates a new instance of ReplicationSchedule value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReplicationSchedule() {
    }

    /**
     * Creates or finds a ReplicationSchedule from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicationSchedule.
     */
    @JsonCreator
    public static ReplicationSchedule fromString(String name) {
        return fromString(name, ReplicationSchedule.class);
    }

    /**
     * Gets known ReplicationSchedule values.
     *
     * @return known ReplicationSchedule values.
     */
    public static Collection<ReplicationSchedule> values() {
        return values(ReplicationSchedule.class);
    }
}
