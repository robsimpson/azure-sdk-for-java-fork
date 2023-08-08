// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Context;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

// This class manually copies the generated class of the same name, but also adds the property for timestamp
// since the swagger does not group it in with these options for us.

/**
 * The optional parameters for
 * {@link com.azure.digitaltwins.core.DigitalTwinsClient#publishComponentTelemetryWithResponse(String, String, String, Object, PublishComponentTelemetryOptions, Context)} and
 * {@link com.azure.digitaltwins.core.DigitalTwinsAsyncClient#publishComponentTelemetryWithResponse(String, String, String, Object, PublishComponentTelemetryOptions)}
 */
@Fluent
public final class PublishComponentTelemetryOptions {
    /**
     * An RFC 3339 timestamp that identifies the time the telemetry was measured.
     * It defaults to the current date/time UTC.
     */
    private OffsetDateTime timestamp = OffsetDateTime.now(ZoneOffset.UTC);

    /**
     * Gets the timestamp.
     * @return The timestamp that identifies the time the telemetry was measured.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp
     * @param timestamp The timestamp that identifies the time the telemetry was measured.
     * @return The PublishTelemetryRequestOptions object itself.
     */
    public PublishComponentTelemetryOptions setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
}
