// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Severity of the route error. */
public final class RouteErrorSeverity extends ExpandableStringEnum<RouteErrorSeverity> {
    /** Static value error for RouteErrorSeverity. */
    public static final RouteErrorSeverity ERROR = fromString("error");

    /** Static value warning for RouteErrorSeverity. */
    public static final RouteErrorSeverity WARNING = fromString("warning");

    /**
     * Creates a new instance of RouteErrorSeverity value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RouteErrorSeverity() {
    }

    /**
     * Creates or finds a RouteErrorSeverity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouteErrorSeverity.
     */
    @JsonCreator
    public static RouteErrorSeverity fromString(String name) {
        return fromString(name, RouteErrorSeverity.class);
    }

    /**
     * Gets known RouteErrorSeverity values.
     *
     * @return known RouteErrorSeverity values.
     */
    public static Collection<RouteErrorSeverity> values() {
        return values(RouteErrorSeverity.class);
    }
}
