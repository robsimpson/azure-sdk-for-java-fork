// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of source control service. */
public final class SourceControlType extends ExpandableStringEnum<SourceControlType> {
    /** Static value Github for SourceControlType. */
    public static final SourceControlType GITHUB = fromString("Github");

    /** Static value VisualStudioTeamService for SourceControlType. */
    public static final SourceControlType VISUAL_STUDIO_TEAM_SERVICE = fromString("VisualStudioTeamService");

    /**
     * Creates a new instance of SourceControlType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SourceControlType() {
    }

    /**
     * Creates or finds a SourceControlType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SourceControlType.
     */
    @JsonCreator
    public static SourceControlType fromString(String name) {
        return fromString(name, SourceControlType.class);
    }

    /**
     * Gets known SourceControlType values.
     *
     * @return known SourceControlType values.
     */
    public static Collection<SourceControlType> values() {
        return values(SourceControlType.class);
    }
}
