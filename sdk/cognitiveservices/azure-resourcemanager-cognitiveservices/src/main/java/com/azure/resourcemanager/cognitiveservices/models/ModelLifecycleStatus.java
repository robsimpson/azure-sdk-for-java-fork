// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Model lifecycle status. */
public final class ModelLifecycleStatus extends ExpandableStringEnum<ModelLifecycleStatus> {
    /** Static value GenerallyAvailable for ModelLifecycleStatus. */
    public static final ModelLifecycleStatus GENERALLY_AVAILABLE = fromString("GenerallyAvailable");

    /** Static value Preview for ModelLifecycleStatus. */
    public static final ModelLifecycleStatus PREVIEW = fromString("Preview");

    /**
     * Creates a new instance of ModelLifecycleStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ModelLifecycleStatus() {
    }

    /**
     * Creates or finds a ModelLifecycleStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ModelLifecycleStatus.
     */
    @JsonCreator
    public static ModelLifecycleStatus fromString(String name) {
        return fromString(name, ModelLifecycleStatus.class);
    }

    /**
     * Gets known ModelLifecycleStatus values.
     *
     * @return known ModelLifecycleStatus values.
     */
    public static Collection<ModelLifecycleStatus> values() {
        return values(ModelLifecycleStatus.class);
    }
}
