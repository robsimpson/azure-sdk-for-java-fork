// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OptInHeaderType. */
public final class OptInHeaderType extends ExpandableStringEnum<OptInHeaderType> {
    /** Static value NotSpecified for OptInHeaderType. */
    public static final OptInHeaderType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value SignedUserToken for OptInHeaderType. */
    public static final OptInHeaderType SIGNED_USER_TOKEN = fromString("SignedUserToken");

    /** Static value ClientGroupMembership for OptInHeaderType. */
    public static final OptInHeaderType CLIENT_GROUP_MEMBERSHIP = fromString("ClientGroupMembership");

    /** Static value SignedAuxiliaryTokens for OptInHeaderType. */
    public static final OptInHeaderType SIGNED_AUXILIARY_TOKENS = fromString("SignedAuxiliaryTokens");

    /** Static value UnboundedClientGroupMembership for OptInHeaderType. */
    public static final OptInHeaderType UNBOUNDED_CLIENT_GROUP_MEMBERSHIP =
        fromString("UnboundedClientGroupMembership");

    /**
     * Creates a new instance of OptInHeaderType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OptInHeaderType() {
    }

    /**
     * Creates or finds a OptInHeaderType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OptInHeaderType.
     */
    @JsonCreator
    public static OptInHeaderType fromString(String name) {
        return fromString(name, OptInHeaderType.class);
    }

    /**
     * Gets known OptInHeaderType values.
     *
     * @return known OptInHeaderType values.
     */
    public static Collection<OptInHeaderType> values() {
        return values(OptInHeaderType.class);
    }
}
