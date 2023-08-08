// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Operating system type (Windows or Linux). */
public final class OperatingSystem extends ExpandableStringEnum<OperatingSystem> {
    /** Static value None for OperatingSystem. */
    public static final OperatingSystem NONE = fromString("None");

    /** Static value Windows for OperatingSystem. */
    public static final OperatingSystem WINDOWS = fromString("Windows");

    /** Static value Linux for OperatingSystem. */
    public static final OperatingSystem LINUX = fromString("Linux");

    /**
     * Creates a new instance of OperatingSystem value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OperatingSystem() {
    }

    /**
     * Creates or finds a OperatingSystem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperatingSystem.
     */
    @JsonCreator
    public static OperatingSystem fromString(String name) {
        return fromString(name, OperatingSystem.class);
    }

    /**
     * Gets known OperatingSystem values.
     *
     * @return known OperatingSystem values.
     */
    public static Collection<OperatingSystem> values() {
        return values(OperatingSystem.class);
    }
}
