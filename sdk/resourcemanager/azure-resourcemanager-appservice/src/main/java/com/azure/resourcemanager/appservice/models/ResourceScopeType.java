// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Name of a resource type this recommendation applies, e.g. Subscription, ServerFarm, Site. */
public final class ResourceScopeType extends ExpandableStringEnum<ResourceScopeType> {
    /** Static value ServerFarm for ResourceScopeType. */
    public static final ResourceScopeType SERVER_FARM = fromString("ServerFarm");

    /** Static value Subscription for ResourceScopeType. */
    public static final ResourceScopeType SUBSCRIPTION = fromString("Subscription");

    /** Static value WebSite for ResourceScopeType. */
    public static final ResourceScopeType WEB_SITE = fromString("WebSite");

    /**
     * Creates a new instance of ResourceScopeType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResourceScopeType() {
    }

    /**
     * Creates or finds a ResourceScopeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceScopeType.
     */
    @JsonCreator
    public static ResourceScopeType fromString(String name) {
        return fromString(name, ResourceScopeType.class);
    }

    /**
     * Gets known ResourceScopeType values.
     *
     * @return known ResourceScopeType values.
     */
    public static Collection<ResourceScopeType> values() {
        return values(ResourceScopeType.class);
    }
}
