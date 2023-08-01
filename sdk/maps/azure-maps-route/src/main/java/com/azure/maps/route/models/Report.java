// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Report. */
public final class Report extends ExpandableStringEnum<Report> {
    /** Static value effectiveSettings for Report. */
    public static final Report EFFECTIVE_SETTINGS = fromString("effectiveSettings");

    /**
     * Creates or finds a Report from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Report.
     */
    @JsonCreator
    public static Report fromString(String name) {
        return fromString(name, Report.class);
    }

    /**
     * Gets known Report values.
     *
     * @return known Report values.
     */
    public static Collection<Report> values() {
        return values(Report.class);
    }
}
