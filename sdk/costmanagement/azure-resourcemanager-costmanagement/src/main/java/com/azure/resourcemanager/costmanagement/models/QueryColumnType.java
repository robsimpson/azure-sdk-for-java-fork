// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of the column in the report. */
public final class QueryColumnType extends ExpandableStringEnum<QueryColumnType> {
    /** Static value TagKey for QueryColumnType. */
    public static final QueryColumnType TAG_KEY = fromString("TagKey");

    /** Static value Dimension for QueryColumnType. */
    public static final QueryColumnType DIMENSION = fromString("Dimension");

    /**
     * Creates a new instance of QueryColumnType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public QueryColumnType() {
    }

    /**
     * Creates or finds a QueryColumnType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QueryColumnType.
     */
    @JsonCreator
    public static QueryColumnType fromString(String name) {
        return fromString(name, QueryColumnType.class);
    }

    /**
     * Gets known QueryColumnType values.
     *
     * @return known QueryColumnType values.
     */
    public static Collection<QueryColumnType> values() {
        return values(QueryColumnType.class);
    }
}
