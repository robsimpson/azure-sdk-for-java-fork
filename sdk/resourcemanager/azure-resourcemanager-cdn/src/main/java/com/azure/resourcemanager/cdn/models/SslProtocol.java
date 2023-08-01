// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The protocol of an established TLS connection. */
public final class SslProtocol extends ExpandableStringEnum<SslProtocol> {
    /** Static value TLSv1 for SslProtocol. */
    public static final SslProtocol TLSV1 = fromString("TLSv1");

    /** Static value TLSv1.1 for SslProtocol. */
    public static final SslProtocol TLSV1_1 = fromString("TLSv1.1");

    /** Static value TLSv1.2 for SslProtocol. */
    public static final SslProtocol TLSV1_2 = fromString("TLSv1.2");

    /**
     * Creates or finds a SslProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SslProtocol.
     */
    @JsonCreator
    public static SslProtocol fromString(String name) {
        return fromString(name, SslProtocol.class);
    }

    /**
     * Gets known SslProtocol values.
     *
     * @return known SslProtocol values.
     */
    public static Collection<SslProtocol> values() {
        return values(SslProtocol.class);
    }
}
