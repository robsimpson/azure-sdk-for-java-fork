// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The provisioning state of the cluster. */
public final class ClusterProvisioningState extends ExpandableStringEnum<ClusterProvisioningState> {
    /** Static value Succeeded for ClusterProvisioningState. */
    public static final ClusterProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ClusterProvisioningState. */
    public static final ClusterProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ClusterProvisioningState. */
    public static final ClusterProvisioningState CANCELED = fromString("Canceled");

    /** Static value Accepted for ClusterProvisioningState. */
    public static final ClusterProvisioningState ACCEPTED = fromString("Accepted");

    /** Static value Validating for ClusterProvisioningState. */
    public static final ClusterProvisioningState VALIDATING = fromString("Validating");

    /** Static value Updating for ClusterProvisioningState. */
    public static final ClusterProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of ClusterProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusterProvisioningState() {
    }

    /**
     * Creates or finds a ClusterProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ClusterProvisioningState.
     */
    @JsonCreator
    public static ClusterProvisioningState fromString(String name) {
        return fromString(name, ClusterProvisioningState.class);
    }

    /**
     * Gets known ClusterProvisioningState values.
     *
     * @return known ClusterProvisioningState values.
     */
    public static Collection<ClusterProvisioningState> values() {
        return values(ClusterProvisioningState.class);
    }
}
