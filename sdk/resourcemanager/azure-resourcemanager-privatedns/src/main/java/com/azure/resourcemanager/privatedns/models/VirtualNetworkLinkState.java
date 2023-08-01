// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The status of the virtual network link to the Private DNS zone. Possible values are 'InProgress' and 'Done'. This is
 * a read-only property and any attempt to set this value will be ignored.
 */
public final class VirtualNetworkLinkState extends ExpandableStringEnum<VirtualNetworkLinkState> {
    /** Static value InProgress for VirtualNetworkLinkState. */
    public static final VirtualNetworkLinkState IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for VirtualNetworkLinkState. */
    public static final VirtualNetworkLinkState COMPLETED = fromString("Completed");

    /**
     * Creates a new instance of VirtualNetworkLinkState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualNetworkLinkState() {
    }

    /**
     * Creates or finds a VirtualNetworkLinkState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkLinkState.
     */
    @JsonCreator
    public static VirtualNetworkLinkState fromString(String name) {
        return fromString(name, VirtualNetworkLinkState.class);
    }

    /**
     * Gets known VirtualNetworkLinkState values.
     *
     * @return known VirtualNetworkLinkState values.
     */
    public static Collection<VirtualNetworkLinkState> values() {
        return values(VirtualNetworkLinkState.class);
    }
}
