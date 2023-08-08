// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IncidentGeometryType. */
public final class IncidentGeometryType extends ExpandableStringEnum<IncidentGeometryType> {
    /** Static value original for IncidentGeometryType. */
    public static final IncidentGeometryType ORIGINAL = fromString("original");

    /** Static value shifted for IncidentGeometryType. */
    public static final IncidentGeometryType SHIFTED = fromString("shifted");

    /**
     * Creates or finds a IncidentGeometryType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IncidentGeometryType.
     */
    @JsonCreator
    public static IncidentGeometryType fromString(String name) {
        return fromString(name, IncidentGeometryType.class);
    }

    /**
     * Gets known IncidentGeometryType values.
     *
     * @return known IncidentGeometryType values.
     */
    public static Collection<IncidentGeometryType> values() {
        return values(IncidentGeometryType.class);
    }
}
