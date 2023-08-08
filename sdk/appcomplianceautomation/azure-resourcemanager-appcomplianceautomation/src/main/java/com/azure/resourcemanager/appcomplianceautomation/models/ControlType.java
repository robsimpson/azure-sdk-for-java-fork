// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Indicates the control type. */
public final class ControlType extends ExpandableStringEnum<ControlType> {
    /** Static value FullyAutomated for ControlType. */
    public static final ControlType FULLY_AUTOMATED = fromString("FullyAutomated");

    /** Static value PartiallyAutomated for ControlType. */
    public static final ControlType PARTIALLY_AUTOMATED = fromString("PartiallyAutomated");

    /** Static value Manual for ControlType. */
    public static final ControlType MANUAL = fromString("Manual");

    /**
     * Creates or finds a ControlType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ControlType.
     */
    @JsonCreator
    public static ControlType fromString(String name) {
        return fromString(name, ControlType.class);
    }

    /**
     * Gets known ControlType values.
     *
     * @return known ControlType values.
     */
    public static Collection<ControlType> values() {
        return values(ControlType.class);
    }
}
