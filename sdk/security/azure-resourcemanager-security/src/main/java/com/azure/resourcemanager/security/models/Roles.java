// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** A possible role to configure sending security notification alerts to. */
public final class Roles extends ExpandableStringEnum<Roles> {
    /** Static value AccountAdmin for Roles. */
    public static final Roles ACCOUNT_ADMIN = fromString("AccountAdmin");

    /** Static value ServiceAdmin for Roles. */
    public static final Roles SERVICE_ADMIN = fromString("ServiceAdmin");

    /** Static value Owner for Roles. */
    public static final Roles OWNER = fromString("Owner");

    /** Static value Contributor for Roles. */
    public static final Roles CONTRIBUTOR = fromString("Contributor");

    /**
     * Creates a new instance of Roles value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Roles() {
    }

    /**
     * Creates or finds a Roles from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Roles.
     */
    @JsonCreator
    public static Roles fromString(String name) {
        return fromString(name, Roles.class);
    }

    /**
     * Gets known Roles values.
     *
     * @return known Roles values.
     */
    public static Collection<Roles> values() {
        return values(Roles.class);
    }
}
