// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The field parity for de-interlacing, defaults to Auto. */
public final class DeinterlaceParity extends ExpandableStringEnum<DeinterlaceParity> {
    /** Static value Auto for DeinterlaceParity. */
    public static final DeinterlaceParity AUTO = fromString("Auto");

    /** Static value TopFieldFirst for DeinterlaceParity. */
    public static final DeinterlaceParity TOP_FIELD_FIRST = fromString("TopFieldFirst");

    /** Static value BottomFieldFirst for DeinterlaceParity. */
    public static final DeinterlaceParity BOTTOM_FIELD_FIRST = fromString("BottomFieldFirst");

    /**
     * Creates a new instance of DeinterlaceParity value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeinterlaceParity() {
    }

    /**
     * Creates or finds a DeinterlaceParity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeinterlaceParity.
     */
    @JsonCreator
    public static DeinterlaceParity fromString(String name) {
        return fromString(name, DeinterlaceParity.class);
    }

    /**
     * Gets known DeinterlaceParity values.
     *
     * @return known DeinterlaceParity values.
     */
    public static Collection<DeinterlaceParity> values() {
        return values(DeinterlaceParity.class);
    }
}
