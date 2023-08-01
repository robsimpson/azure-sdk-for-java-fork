// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The data format of the report. */
public final class CostDetailsDataFormat extends ExpandableStringEnum<CostDetailsDataFormat> {
    /** Static value Csv for CostDetailsDataFormat. */
    public static final CostDetailsDataFormat CSV = fromString("Csv");

    /**
     * Creates a new instance of CostDetailsDataFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CostDetailsDataFormat() {
    }

    /**
     * Creates or finds a CostDetailsDataFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CostDetailsDataFormat.
     */
    @JsonCreator
    public static CostDetailsDataFormat fromString(String name) {
        return fromString(name, CostDetailsDataFormat.class);
    }

    /**
     * Gets known CostDetailsDataFormat values.
     *
     * @return known CostDetailsDataFormat values.
     */
    public static Collection<CostDetailsDataFormat> values() {
        return values(CostDetailsDataFormat.class);
    }
}
