// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The name of the SKU. */
public final class IotHubSku extends ExpandableStringEnum<IotHubSku> {
    /** Static value F1 for IotHubSku. */
    public static final IotHubSku F1 = fromString("F1");

    /** Static value S1 for IotHubSku. */
    public static final IotHubSku S1 = fromString("S1");

    /** Static value S2 for IotHubSku. */
    public static final IotHubSku S2 = fromString("S2");

    /** Static value S3 for IotHubSku. */
    public static final IotHubSku S3 = fromString("S3");

    /** Static value B1 for IotHubSku. */
    public static final IotHubSku B1 = fromString("B1");

    /** Static value B2 for IotHubSku. */
    public static final IotHubSku B2 = fromString("B2");

    /** Static value B3 for IotHubSku. */
    public static final IotHubSku B3 = fromString("B3");

    /**
     * Creates a new instance of IotHubSku value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IotHubSku() {
    }

    /**
     * Creates or finds a IotHubSku from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IotHubSku.
     */
    @JsonCreator
    public static IotHubSku fromString(String name) {
        return fromString(name, IotHubSku.class);
    }

    /**
     * Gets known IotHubSku values.
     *
     * @return known IotHubSku values.
     */
    public static Collection<IotHubSku> values() {
        return values(IotHubSku.class);
    }
}
