// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Update classification included in the software update configuration. A comma separated string with required values.
 */
public final class WindowsUpdateClasses extends ExpandableStringEnum<WindowsUpdateClasses> {
    /** Static value Unclassified for WindowsUpdateClasses. */
    public static final WindowsUpdateClasses UNCLASSIFIED = fromString("Unclassified");

    /** Static value Critical for WindowsUpdateClasses. */
    public static final WindowsUpdateClasses CRITICAL = fromString("Critical");

    /** Static value Security for WindowsUpdateClasses. */
    public static final WindowsUpdateClasses SECURITY = fromString("Security");

    /** Static value UpdateRollup for WindowsUpdateClasses. */
    public static final WindowsUpdateClasses UPDATE_ROLLUP = fromString("UpdateRollup");

    /** Static value FeaturePack for WindowsUpdateClasses. */
    public static final WindowsUpdateClasses FEATURE_PACK = fromString("FeaturePack");

    /** Static value ServicePack for WindowsUpdateClasses. */
    public static final WindowsUpdateClasses SERVICE_PACK = fromString("ServicePack");

    /** Static value Definition for WindowsUpdateClasses. */
    public static final WindowsUpdateClasses DEFINITION = fromString("Definition");

    /** Static value Tools for WindowsUpdateClasses. */
    public static final WindowsUpdateClasses TOOLS = fromString("Tools");

    /** Static value Updates for WindowsUpdateClasses. */
    public static final WindowsUpdateClasses UPDATES = fromString("Updates");

    /**
     * Creates or finds a WindowsUpdateClasses from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WindowsUpdateClasses.
     */
    @JsonCreator
    public static WindowsUpdateClasses fromString(String name) {
        return fromString(name, WindowsUpdateClasses.class);
    }

    /**
     * Gets known WindowsUpdateClasses values.
     *
     * @return known WindowsUpdateClasses values.
     */
    public static Collection<WindowsUpdateClasses> values() {
        return values(WindowsUpdateClasses.class);
    }
}
