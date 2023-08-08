// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** State of endpoint provisioning. */
public final class EndpointProvisioningState extends ExpandableStringEnum<EndpointProvisioningState> {
    /** Static value Creating for EndpointProvisioningState. */
    public static final EndpointProvisioningState CREATING = fromString("Creating");

    /** Static value Deleting for EndpointProvisioningState. */
    public static final EndpointProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for EndpointProvisioningState. */
    public static final EndpointProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for EndpointProvisioningState. */
    public static final EndpointProvisioningState FAILED = fromString("Failed");

    /** Static value Updating for EndpointProvisioningState. */
    public static final EndpointProvisioningState UPDATING = fromString("Updating");

    /** Static value Canceled for EndpointProvisioningState. */
    public static final EndpointProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of EndpointProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EndpointProvisioningState() {
    }

    /**
     * Creates or finds a EndpointProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EndpointProvisioningState.
     */
    @JsonCreator
    public static EndpointProvisioningState fromString(String name) {
        return fromString(name, EndpointProvisioningState.class);
    }

    /**
     * Gets known EndpointProvisioningState values.
     *
     * @return known EndpointProvisioningState values.
     */
    public static Collection<EndpointProvisioningState> values() {
        return values(EndpointProvisioningState.class);
    }
}
