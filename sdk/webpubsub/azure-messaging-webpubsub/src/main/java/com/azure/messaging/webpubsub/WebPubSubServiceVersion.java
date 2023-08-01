// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.webpubsub;

import com.azure.core.util.ServiceVersion;

/** Service version of WebPubSubService. */
public enum WebPubSubServiceVersion implements ServiceVersion {
    /** Enum value 2021-10-01. */
    V2021_10_01("2021-10-01"),

    /** Enum value 2022-11-01. */
    V2022_11_01("2022-11-01");

    private final String version;

    WebPubSubServiceVersion(String version) {
        this.version = version;
    }

    /** {@inheritDoc} */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link WebPubSubServiceVersion}.
     */
    public static WebPubSubServiceVersion getLatest() {
        return V2022_11_01;
    }
}
