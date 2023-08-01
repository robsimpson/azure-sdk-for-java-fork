// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Provisioning state of the topic. */
public final class TopicProvisioningState extends ExpandableStringEnum<TopicProvisioningState> {
    /** Static value Creating for TopicProvisioningState. */
    public static final TopicProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for TopicProvisioningState. */
    public static final TopicProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for TopicProvisioningState. */
    public static final TopicProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for TopicProvisioningState. */
    public static final TopicProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for TopicProvisioningState. */
    public static final TopicProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for TopicProvisioningState. */
    public static final TopicProvisioningState FAILED = fromString("Failed");

    /**
     * Creates a new instance of TopicProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TopicProvisioningState() {
    }

    /**
     * Creates or finds a TopicProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TopicProvisioningState.
     */
    @JsonCreator
    public static TopicProvisioningState fromString(String name) {
        return fromString(name, TopicProvisioningState.class);
    }

    /**
     * Gets known TopicProvisioningState values.
     *
     * @return known TopicProvisioningState values.
     */
    public static Collection<TopicProvisioningState> values() {
        return values(TopicProvisioningState.class);
    }
}
