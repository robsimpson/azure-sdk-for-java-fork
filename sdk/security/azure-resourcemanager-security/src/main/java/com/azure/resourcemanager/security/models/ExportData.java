// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExportData. */
public final class ExportData extends ExpandableStringEnum<ExportData> {
    /** Static value RawEvents for ExportData. */
    public static final ExportData RAW_EVENTS = fromString("RawEvents");

    /**
     * Creates a new instance of ExportData value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExportData() {
    }

    /**
     * Creates or finds a ExportData from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExportData.
     */
    @JsonCreator
    public static ExportData fromString(String name) {
        return fromString(name, ExportData.class);
    }

    /**
     * Gets known ExportData values.
     *
     * @return known ExportData values.
     */
    public static Collection<ExportData> values() {
        return values(ExportData.class);
    }
}
