// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Frequency of full backups. In both cases, full backups begin during the next scheduled time window. */
public final class FullBackupFrequencyType extends ExpandableStringEnum<FullBackupFrequencyType> {
    /** Static value Daily for FullBackupFrequencyType. */
    public static final FullBackupFrequencyType DAILY = fromString("Daily");

    /** Static value Weekly for FullBackupFrequencyType. */
    public static final FullBackupFrequencyType WEEKLY = fromString("Weekly");

    /**
     * Creates a new instance of FullBackupFrequencyType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FullBackupFrequencyType() {
    }

    /**
     * Creates or finds a FullBackupFrequencyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FullBackupFrequencyType.
     */
    @JsonCreator
    public static FullBackupFrequencyType fromString(String name) {
        return fromString(name, FullBackupFrequencyType.class);
    }

    /**
     * Gets known FullBackupFrequencyType values.
     *
     * @return known FullBackupFrequencyType values.
     */
    public static Collection<FullBackupFrequencyType> values() {
        return values(FullBackupFrequencyType.class);
    }
}
