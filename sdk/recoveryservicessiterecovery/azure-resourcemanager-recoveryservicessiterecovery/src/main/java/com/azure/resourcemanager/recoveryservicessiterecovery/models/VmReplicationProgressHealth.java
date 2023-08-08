// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The initial replication progress health. */
public final class VmReplicationProgressHealth extends ExpandableStringEnum<VmReplicationProgressHealth> {
    /** Static value None for VmReplicationProgressHealth. */
    public static final VmReplicationProgressHealth NONE = fromString("None");

    /** Static value InProgress for VmReplicationProgressHealth. */
    public static final VmReplicationProgressHealth IN_PROGRESS = fromString("InProgress");

    /** Static value SlowProgress for VmReplicationProgressHealth. */
    public static final VmReplicationProgressHealth SLOW_PROGRESS = fromString("SlowProgress");

    /** Static value NoProgress for VmReplicationProgressHealth. */
    public static final VmReplicationProgressHealth NO_PROGRESS = fromString("NoProgress");

    /**
     * Creates a new instance of VmReplicationProgressHealth value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VmReplicationProgressHealth() {
    }

    /**
     * Creates or finds a VmReplicationProgressHealth from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VmReplicationProgressHealth.
     */
    @JsonCreator
    public static VmReplicationProgressHealth fromString(String name) {
        return fromString(name, VmReplicationProgressHealth.class);
    }

    /**
     * Gets known VmReplicationProgressHealth values.
     *
     * @return known VmReplicationProgressHealth values.
     */
    public static Collection<VmReplicationProgressHealth> values() {
        return values(VmReplicationProgressHealth.class);
    }
}
