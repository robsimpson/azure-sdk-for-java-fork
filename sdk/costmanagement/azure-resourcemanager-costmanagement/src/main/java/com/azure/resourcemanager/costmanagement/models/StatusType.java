// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The status of the export's schedule. If 'Inactive', the export's schedule is paused. */
public final class StatusType extends ExpandableStringEnum<StatusType> {
    /** Static value Active for StatusType. */
    public static final StatusType ACTIVE = fromString("Active");

    /** Static value Inactive for StatusType. */
    public static final StatusType INACTIVE = fromString("Inactive");

    /**
     * Creates a new instance of StatusType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StatusType() {
    }

    /**
     * Creates or finds a StatusType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StatusType.
     */
    @JsonCreator
    public static StatusType fromString(String name) {
        return fromString(name, StatusType.class);
    }

    /**
     * Gets known StatusType values.
     *
     * @return known StatusType values.
     */
    public static Collection<StatusType> values() {
        return values(StatusType.class);
    }
}
