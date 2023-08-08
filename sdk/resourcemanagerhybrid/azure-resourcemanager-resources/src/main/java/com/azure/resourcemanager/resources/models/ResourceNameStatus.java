// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceNameStatus. */
public final class ResourceNameStatus extends ExpandableStringEnum<ResourceNameStatus> {
    /** Static value Allowed for ResourceNameStatus. */
    public static final ResourceNameStatus ALLOWED = fromString("Allowed");

    /** Static value Reserved for ResourceNameStatus. */
    public static final ResourceNameStatus RESERVED = fromString("Reserved");

    /**
     * Creates or finds a ResourceNameStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceNameStatus.
     */
    @JsonCreator
    public static ResourceNameStatus fromString(String name) {
        return fromString(name, ResourceNameStatus.class);
    }

    /** @return known ResourceNameStatus values. */
    public static Collection<ResourceNameStatus> values() {
        return values(ResourceNameStatus.class);
    }
}
