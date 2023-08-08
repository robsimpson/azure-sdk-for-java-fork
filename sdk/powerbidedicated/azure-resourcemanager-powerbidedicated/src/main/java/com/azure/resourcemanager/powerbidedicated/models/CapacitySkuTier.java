// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The name of the Azure pricing tier to which the SKU applies. */
public final class CapacitySkuTier extends ExpandableStringEnum<CapacitySkuTier> {
    /** Static value PBIE_Azure for CapacitySkuTier. */
    public static final CapacitySkuTier PBIE_AZURE = fromString("PBIE_Azure");

    /** Static value Premium for CapacitySkuTier. */
    public static final CapacitySkuTier PREMIUM = fromString("Premium");

    /** Static value AutoPremiumHost for CapacitySkuTier. */
    public static final CapacitySkuTier AUTO_PREMIUM_HOST = fromString("AutoPremiumHost");

    /**
     * Creates a new instance of CapacitySkuTier value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CapacitySkuTier() {
    }

    /**
     * Creates or finds a CapacitySkuTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CapacitySkuTier.
     */
    @JsonCreator
    public static CapacitySkuTier fromString(String name) {
        return fromString(name, CapacitySkuTier.class);
    }

    /**
     * Gets known CapacitySkuTier values.
     *
     * @return known CapacitySkuTier values.
     */
    public static Collection<CapacitySkuTier> values() {
        return values(CapacitySkuTier.class);
    }
}
