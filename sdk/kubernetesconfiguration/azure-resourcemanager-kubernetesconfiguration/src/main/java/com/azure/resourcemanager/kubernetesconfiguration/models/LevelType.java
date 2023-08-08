// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Level of the status. */
public final class LevelType extends ExpandableStringEnum<LevelType> {
    /** Static value Error for LevelType. */
    public static final LevelType ERROR = fromString("Error");

    /** Static value Warning for LevelType. */
    public static final LevelType WARNING = fromString("Warning");

    /** Static value Information for LevelType. */
    public static final LevelType INFORMATION = fromString("Information");

    /**
     * Creates a new instance of LevelType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LevelType() {
    }

    /**
     * Creates or finds a LevelType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LevelType.
     */
    @JsonCreator
    public static LevelType fromString(String name) {
        return fromString(name, LevelType.class);
    }

    /**
     * Gets known LevelType values.
     *
     * @return known LevelType values.
     */
    public static Collection<LevelType> values() {
        return values(LevelType.class);
    }
}
