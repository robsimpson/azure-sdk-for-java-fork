// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The status of the long running operation. */
public final class ReportOperationStatusType extends ExpandableStringEnum<ReportOperationStatusType> {
    /** Static value InProgress for ReportOperationStatusType. */
    public static final ReportOperationStatusType IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for ReportOperationStatusType. */
    public static final ReportOperationStatusType COMPLETED = fromString("Completed");

    /** Static value Failed for ReportOperationStatusType. */
    public static final ReportOperationStatusType FAILED = fromString("Failed");

    /** Static value Queued for ReportOperationStatusType. */
    public static final ReportOperationStatusType QUEUED = fromString("Queued");

    /** Static value NoDataFound for ReportOperationStatusType. */
    public static final ReportOperationStatusType NO_DATA_FOUND = fromString("NoDataFound");

    /** Static value ReadyToDownload for ReportOperationStatusType. */
    public static final ReportOperationStatusType READY_TO_DOWNLOAD = fromString("ReadyToDownload");

    /** Static value TimedOut for ReportOperationStatusType. */
    public static final ReportOperationStatusType TIMED_OUT = fromString("TimedOut");

    /**
     * Creates a new instance of ReportOperationStatusType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReportOperationStatusType() {
    }

    /**
     * Creates or finds a ReportOperationStatusType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReportOperationStatusType.
     */
    @JsonCreator
    public static ReportOperationStatusType fromString(String name) {
        return fromString(name, ReportOperationStatusType.class);
    }

    /**
     * Gets known ReportOperationStatusType values.
     *
     * @return known ReportOperationStatusType values.
     */
    public static Collection<ReportOperationStatusType> values() {
        return values(ReportOperationStatusType.class);
    }
}
