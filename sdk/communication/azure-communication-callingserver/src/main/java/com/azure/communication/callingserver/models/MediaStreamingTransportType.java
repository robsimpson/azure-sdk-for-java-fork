// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MediaStreamingTransportType. */
public final class MediaStreamingTransportType extends ExpandableStringEnum<MediaStreamingTransportType> {
    /** Static value websocket for MediaStreamingTransportType. */
    public static final MediaStreamingTransportType WEBSOCKET = fromString("websocket");

    /**
     * Creates or finds a MediaStreamingTransportType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MediaStreamingTransportType.
     */
    @JsonCreator
    public static MediaStreamingTransportType fromString(String name) {
        return fromString(name, MediaStreamingTransportType.class);
    }

    /** @return known MediaStreamingTransportType values. */
    public static Collection<MediaStreamingTransportType> values() {
        return values(MediaStreamingTransportType.class);
    }
}
