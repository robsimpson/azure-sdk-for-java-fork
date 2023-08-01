// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProvisioningState. */
public final class ProvisioningState extends ExpandableStringEnum<ProvisioningState> {
    /** Static value Succeeded for ProvisioningState. */
    public static final ProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ProvisioningState. */
    public static final ProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ProvisioningState. */
    public static final ProvisioningState CANCELED = fromString("Canceled");

    /** Static value Provisioning for ProvisioningState. */
    public static final ProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value Updating for ProvisioningState. */
    public static final ProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for ProvisioningState. */
    public static final ProvisioningState DELETING = fromString("Deleting");

    /** Static value Accepted for ProvisioningState. */
    public static final ProvisioningState ACCEPTED = fromString("Accepted");

    /** Static value Created for ProvisioningState. */
    public static final ProvisioningState CREATED = fromString("Created");

    /**
     * Creates or finds a ProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProvisioningState.
     */
    @JsonCreator
    public static ProvisioningState fromString(String name) {
        return fromString(name, ProvisioningState.class);
    }

    /**
     * Gets known ProvisioningState values.
     *
     * @return known ProvisioningState values.
     */
    public static Collection<ProvisioningState> values() {
        return values(ProvisioningState.class);
    }
}
