// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MonitorCondition. */
public final class MonitorCondition extends ExpandableStringEnum<MonitorCondition> {
    /** Static value Fired for MonitorCondition. */
    public static final MonitorCondition FIRED = fromString("Fired");

    /** Static value Resolved for MonitorCondition. */
    public static final MonitorCondition RESOLVED = fromString("Resolved");

    /**
     * Creates or finds a MonitorCondition from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MonitorCondition.
     */
    @JsonCreator
    public static MonitorCondition fromString(String name) {
        return fromString(name, MonitorCondition.class);
    }

    /**
     * Gets known MonitorCondition values.
     *
     * @return known MonitorCondition values.
     */
    public static Collection<MonitorCondition> values() {
        return values(MonitorCondition.class);
    }
}
