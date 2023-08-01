// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The cloud connectivity status. */
public final class ConnectionStatus extends ExpandableStringEnum<ConnectionStatus> {
    /** Static value Connected for ConnectionStatus. */
    public static final ConnectionStatus CONNECTED = fromString("Connected");

    /** Static value Disconnected for ConnectionStatus. */
    public static final ConnectionStatus DISCONNECTED = fromString("Disconnected");

    /** Static value Unknown for ConnectionStatus. */
    public static final ConnectionStatus UNKNOWN = fromString("Unknown");

    /**
     * Creates a new instance of ConnectionStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConnectionStatus() {
    }

    /**
     * Creates or finds a ConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectionStatus.
     */
    @JsonCreator
    public static ConnectionStatus fromString(String name) {
        return fromString(name, ConnectionStatus.class);
    }

    /**
     * Gets known ConnectionStatus values.
     *
     * @return known ConnectionStatus values.
     */
    public static Collection<ConnectionStatus> values() {
        return values(ConnectionStatus.class);
    }
}
