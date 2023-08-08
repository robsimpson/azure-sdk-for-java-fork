// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Priority to be used for rehydration. Values High or Standard. */
public final class RehydrationPriority extends ExpandableStringEnum<RehydrationPriority> {
    /** Static value Invalid for RehydrationPriority. */
    public static final RehydrationPriority INVALID = fromString("Invalid");

    /** Static value High for RehydrationPriority. */
    public static final RehydrationPriority HIGH = fromString("High");

    /** Static value Standard for RehydrationPriority. */
    public static final RehydrationPriority STANDARD = fromString("Standard");

    /**
     * Creates a new instance of RehydrationPriority value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RehydrationPriority() {
    }

    /**
     * Creates or finds a RehydrationPriority from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RehydrationPriority.
     */
    @JsonCreator
    public static RehydrationPriority fromString(String name) {
        return fromString(name, RehydrationPriority.class);
    }

    /**
     * Gets known RehydrationPriority values.
     *
     * @return known RehydrationPriority values.
     */
    public static Collection<RehydrationPriority> values() {
        return values(RehydrationPriority.class);
    }
}
