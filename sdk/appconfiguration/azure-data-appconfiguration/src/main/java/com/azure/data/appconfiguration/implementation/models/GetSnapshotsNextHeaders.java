// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.appconfiguration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;

/** The GetSnapshotsNextHeaders model. */
@Fluent
public final class GetSnapshotsNextHeaders {
    /*
     * The Sync-Token property.
     */
    private String syncToken;

    private static final HttpHeaderName SYNC_TOKEN = HttpHeaderName.fromString("Sync-Token");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of GetSnapshotsNextHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public GetSnapshotsNextHeaders(HttpHeaders rawHeaders) {
        this.syncToken = rawHeaders.getValue(SYNC_TOKEN);
    }

    /**
     * Get the syncToken property: The Sync-Token property.
     *
     * @return the syncToken value.
     */
    public String getSyncToken() {
        return this.syncToken;
    }

    /**
     * Set the syncToken property: The Sync-Token property.
     *
     * @param syncToken the syncToken value to set.
     * @return the GetSnapshotsNextHeaders object itself.
     */
    public GetSnapshotsNextHeaders setSyncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }
}
