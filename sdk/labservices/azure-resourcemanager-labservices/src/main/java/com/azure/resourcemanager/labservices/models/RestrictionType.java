// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of restriction. */
public final class RestrictionType extends ExpandableStringEnum<RestrictionType> {
    /** Static value Location for RestrictionType. */
    public static final RestrictionType LOCATION = fromString("Location");

    /**
     * Creates or finds a RestrictionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RestrictionType.
     */
    @JsonCreator
    public static RestrictionType fromString(String name) {
        return fromString(name, RestrictionType.class);
    }

    /**
     * Gets known RestrictionType values.
     *
     * @return known RestrictionType values.
     */
    public static Collection<RestrictionType> values() {
        return values(RestrictionType.class);
    }
}
