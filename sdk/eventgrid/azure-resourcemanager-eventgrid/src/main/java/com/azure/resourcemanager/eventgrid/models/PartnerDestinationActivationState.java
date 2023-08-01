// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Activation state of the partner destination. */
public final class PartnerDestinationActivationState extends ExpandableStringEnum<PartnerDestinationActivationState> {
    /** Static value NeverActivated for PartnerDestinationActivationState. */
    public static final PartnerDestinationActivationState NEVER_ACTIVATED = fromString("NeverActivated");

    /** Static value Activated for PartnerDestinationActivationState. */
    public static final PartnerDestinationActivationState ACTIVATED = fromString("Activated");

    /**
     * Creates a new instance of PartnerDestinationActivationState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PartnerDestinationActivationState() {
    }

    /**
     * Creates or finds a PartnerDestinationActivationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartnerDestinationActivationState.
     */
    @JsonCreator
    public static PartnerDestinationActivationState fromString(String name) {
        return fromString(name, PartnerDestinationActivationState.class);
    }

    /**
     * Gets known PartnerDestinationActivationState values.
     *
     * @return known PartnerDestinationActivationState values.
     */
    public static Collection<PartnerDestinationActivationState> values() {
        return values(PartnerDestinationActivationState.class);
    }
}
