// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicates the kind of algorithm used for partitioning. For MultiHash, multiple partition keys (upto three maximum)
 * are supported for container create.
 */
public final class PartitionKind extends ExpandableStringEnum<PartitionKind> {
    /** Static value Hash for PartitionKind. */
    public static final PartitionKind HASH = fromString("Hash");

    /** Static value Range for PartitionKind. */
    public static final PartitionKind RANGE = fromString("Range");

    /** Static value MultiHash for PartitionKind. */
    public static final PartitionKind MULTI_HASH = fromString("MultiHash");

    /**
     * Creates a new instance of PartitionKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PartitionKind() {
    }

    /**
     * Creates or finds a PartitionKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartitionKind.
     */
    @JsonCreator
    public static PartitionKind fromString(String name) {
        return fromString(name, PartitionKind.class);
    }

    /**
     * Gets known PartitionKind values.
     *
     * @return known PartitionKind values.
     */
    public static Collection<PartitionKind> values() {
        return values(PartitionKind.class);
    }
}
