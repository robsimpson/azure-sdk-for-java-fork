// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The current deployment state of an auto scale v-core resource. The provisioningState is to indicate states for
 * resource provisioning.
 */
public final class VCoreProvisioningState extends ExpandableStringEnum<VCoreProvisioningState> {
    /** Static value Succeeded for VCoreProvisioningState. */
    public static final VCoreProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Creates a new instance of VCoreProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VCoreProvisioningState() {
    }

    /**
     * Creates or finds a VCoreProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VCoreProvisioningState.
     */
    @JsonCreator
    public static VCoreProvisioningState fromString(String name) {
        return fromString(name, VCoreProvisioningState.class);
    }

    /**
     * Gets known VCoreProvisioningState values.
     *
     * @return known VCoreProvisioningState values.
     */
    public static Collection<VCoreProvisioningState> values() {
        return values(VCoreProvisioningState.class);
    }
}
