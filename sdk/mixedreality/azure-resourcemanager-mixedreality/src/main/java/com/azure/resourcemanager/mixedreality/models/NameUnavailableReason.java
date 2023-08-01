// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** reason of name unavailable. */
public final class NameUnavailableReason extends ExpandableStringEnum<NameUnavailableReason> {
    /** Static value Invalid for NameUnavailableReason. */
    public static final NameUnavailableReason INVALID = fromString("Invalid");

    /** Static value AlreadyExists for NameUnavailableReason. */
    public static final NameUnavailableReason ALREADY_EXISTS = fromString("AlreadyExists");

    /**
     * Creates a new instance of NameUnavailableReason value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NameUnavailableReason() {
    }

    /**
     * Creates or finds a NameUnavailableReason from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NameUnavailableReason.
     */
    @JsonCreator
    public static NameUnavailableReason fromString(String name) {
        return fromString(name, NameUnavailableReason.class);
    }

    /**
     * Gets known NameUnavailableReason values.
     *
     * @return known NameUnavailableReason values.
     */
    public static Collection<NameUnavailableReason> values() {
        return values(NameUnavailableReason.class);
    }
}
