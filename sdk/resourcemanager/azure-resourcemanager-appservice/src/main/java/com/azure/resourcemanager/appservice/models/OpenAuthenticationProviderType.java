// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Open authentication policy provider type. */
public final class OpenAuthenticationProviderType extends ExpandableStringEnum<OpenAuthenticationProviderType> {
    /** Static value AAD for OpenAuthenticationProviderType. */
    public static final OpenAuthenticationProviderType AAD = fromString("AAD");

    /**
     * Creates a new instance of OpenAuthenticationProviderType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OpenAuthenticationProviderType() {
    }

    /**
     * Creates or finds a OpenAuthenticationProviderType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OpenAuthenticationProviderType.
     */
    @JsonCreator
    public static OpenAuthenticationProviderType fromString(String name) {
        return fromString(name, OpenAuthenticationProviderType.class);
    }

    /**
     * Gets known OpenAuthenticationProviderType values.
     *
     * @return known OpenAuthenticationProviderType values.
     */
    public static Collection<OpenAuthenticationProviderType> values() {
        return values(OpenAuthenticationProviderType.class);
    }
}
