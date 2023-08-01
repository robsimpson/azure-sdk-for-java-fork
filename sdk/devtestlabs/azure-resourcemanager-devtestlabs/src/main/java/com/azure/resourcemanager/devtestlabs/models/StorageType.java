// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The storage type for the disk (i.e. Standard, Premium). */
public final class StorageType extends ExpandableStringEnum<StorageType> {
    /** Static value Standard for StorageType. */
    public static final StorageType STANDARD = fromString("Standard");

    /** Static value Premium for StorageType. */
    public static final StorageType PREMIUM = fromString("Premium");

    /** Static value StandardSSD for StorageType. */
    public static final StorageType STANDARD_SSD = fromString("StandardSSD");

    /**
     * Creates a new instance of StorageType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StorageType() {
    }

    /**
     * Creates or finds a StorageType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageType.
     */
    @JsonCreator
    public static StorageType fromString(String name) {
        return fromString(name, StorageType.class);
    }

    /**
     * Gets known StorageType values.
     *
     * @return known StorageType values.
     */
    public static Collection<StorageType> values() {
        return values(StorageType.class);
    }
}
