// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Flag to show if Cross Region Restore is enabled on the Vault or not. */
public final class CrossRegionRestore extends ExpandableStringEnum<CrossRegionRestore> {
    /** Static value Enabled for CrossRegionRestore. */
    public static final CrossRegionRestore ENABLED = fromString("Enabled");

    /** Static value Disabled for CrossRegionRestore. */
    public static final CrossRegionRestore DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of CrossRegionRestore value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CrossRegionRestore() {
    }

    /**
     * Creates or finds a CrossRegionRestore from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CrossRegionRestore.
     */
    @JsonCreator
    public static CrossRegionRestore fromString(String name) {
        return fromString(name, CrossRegionRestore.class);
    }

    /**
     * Gets known CrossRegionRestore values.
     *
     * @return known CrossRegionRestore values.
     */
    public static Collection<CrossRegionRestore> values() {
        return values(CrossRegionRestore.class);
    }
}
