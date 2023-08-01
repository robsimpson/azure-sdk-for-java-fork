// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** PDU session type (IPv4/IPv6). */
public final class PduSessionType extends ExpandableStringEnum<PduSessionType> {
    /** Static value IPv4 for PduSessionType. */
    public static final PduSessionType IPV4 = fromString("IPv4");

    /** Static value IPv6 for PduSessionType. */
    public static final PduSessionType IPV6 = fromString("IPv6");

    /**
     * Creates a new instance of PduSessionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PduSessionType() {
    }

    /**
     * Creates or finds a PduSessionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PduSessionType.
     */
    @JsonCreator
    public static PduSessionType fromString(String name) {
        return fromString(name, PduSessionType.class);
    }

    /**
     * Gets known PduSessionType values.
     *
     * @return known PduSessionType values.
     */
    public static Collection<PduSessionType> values() {
        return values(PduSessionType.class);
    }
}
