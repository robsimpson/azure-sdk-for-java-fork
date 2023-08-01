// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The provisioning state of the cloud services network. */
public final class CloudServicesNetworkProvisioningState
    extends ExpandableStringEnum<CloudServicesNetworkProvisioningState> {
    /** Static value Succeeded for CloudServicesNetworkProvisioningState. */
    public static final CloudServicesNetworkProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for CloudServicesNetworkProvisioningState. */
    public static final CloudServicesNetworkProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for CloudServicesNetworkProvisioningState. */
    public static final CloudServicesNetworkProvisioningState CANCELED = fromString("Canceled");

    /** Static value Provisioning for CloudServicesNetworkProvisioningState. */
    public static final CloudServicesNetworkProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value Accepted for CloudServicesNetworkProvisioningState. */
    public static final CloudServicesNetworkProvisioningState ACCEPTED = fromString("Accepted");

    /**
     * Creates a new instance of CloudServicesNetworkProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CloudServicesNetworkProvisioningState() {
    }

    /**
     * Creates or finds a CloudServicesNetworkProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CloudServicesNetworkProvisioningState.
     */
    @JsonCreator
    public static CloudServicesNetworkProvisioningState fromString(String name) {
        return fromString(name, CloudServicesNetworkProvisioningState.class);
    }

    /**
     * Gets known CloudServicesNetworkProvisioningState values.
     *
     * @return known CloudServicesNetworkProvisioningState values.
     */
    public static Collection<CloudServicesNetworkProvisioningState> values() {
        return values(CloudServicesNetworkProvisioningState.class);
    }
}
