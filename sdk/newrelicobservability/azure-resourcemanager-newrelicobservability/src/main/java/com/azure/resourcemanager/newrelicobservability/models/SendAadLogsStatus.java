// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Indicates whether AAD logs are being sent. */
public final class SendAadLogsStatus extends ExpandableStringEnum<SendAadLogsStatus> {
    /** Static value Enabled for SendAadLogsStatus. */
    public static final SendAadLogsStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for SendAadLogsStatus. */
    public static final SendAadLogsStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of SendAadLogsStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SendAadLogsStatus() {
    }

    /**
     * Creates or finds a SendAadLogsStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SendAadLogsStatus.
     */
    @JsonCreator
    public static SendAadLogsStatus fromString(String name) {
        return fromString(name, SendAadLogsStatus.class);
    }

    /**
     * Gets known SendAadLogsStatus values.
     *
     * @return known SendAadLogsStatus values.
     */
    public static Collection<SendAadLogsStatus> values() {
        return values(SendAadLogsStatus.class);
    }
}
