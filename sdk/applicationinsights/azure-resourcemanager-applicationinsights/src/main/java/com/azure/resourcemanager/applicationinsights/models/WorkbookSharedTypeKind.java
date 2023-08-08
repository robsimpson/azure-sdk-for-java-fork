// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WorkbookSharedTypeKind. */
public final class WorkbookSharedTypeKind extends ExpandableStringEnum<WorkbookSharedTypeKind> {
    /** Static value shared for WorkbookSharedTypeKind. */
    public static final WorkbookSharedTypeKind SHARED = fromString("shared");

    /**
     * Creates or finds a WorkbookSharedTypeKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkbookSharedTypeKind.
     */
    @JsonCreator
    public static WorkbookSharedTypeKind fromString(String name) {
        return fromString(name, WorkbookSharedTypeKind.class);
    }

    /**
     * Gets known WorkbookSharedTypeKind values.
     *
     * @return known WorkbookSharedTypeKind values.
     */
    public static Collection<WorkbookSharedTypeKind> values() {
        return values(WorkbookSharedTypeKind.class);
    }
}
