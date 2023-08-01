// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Identity type. */
public final class ManagedIdentityTypes extends ExpandableStringEnum<ManagedIdentityTypes> {
    /** Static value SystemAssigned for ManagedIdentityTypes. */
    public static final ManagedIdentityTypes SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value UserAssigned for ManagedIdentityTypes. */
    public static final ManagedIdentityTypes USER_ASSIGNED = fromString("UserAssigned");

    /**
     * Creates a new instance of ManagedIdentityTypes value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ManagedIdentityTypes() {
    }

    /**
     * Creates or finds a ManagedIdentityTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedIdentityTypes.
     */
    @JsonCreator
    public static ManagedIdentityTypes fromString(String name) {
        return fromString(name, ManagedIdentityTypes.class);
    }

    /**
     * Gets known ManagedIdentityTypes values.
     *
     * @return known ManagedIdentityTypes values.
     */
    public static Collection<ManagedIdentityTypes> values() {
        return values(ManagedIdentityTypes.class);
    }
}
