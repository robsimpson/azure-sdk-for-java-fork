// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** `GeoJSON` geometry type. */
public final class GeoJsonGeometryType extends ExpandableStringEnum<GeoJsonGeometryType> {
    /** Static value Point for GeoJsonGeometryType. */
    public static final GeoJsonGeometryType POINT = fromString("Point");

    /**
     * Creates a new instance of GeoJsonGeometryType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GeoJsonGeometryType() {}

    /**
     * Creates or finds a GeoJsonGeometryType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GeoJsonGeometryType.
     */
    @JsonCreator
    public static GeoJsonGeometryType fromString(String name) {
        return fromString(name, GeoJsonGeometryType.class);
    }

    /**
     * Gets known GeoJsonGeometryType values.
     *
     * @return known GeoJsonGeometryType values.
     */
    public static Collection<GeoJsonGeometryType> values() {
        return values(GeoJsonGeometryType.class);
    }
}
