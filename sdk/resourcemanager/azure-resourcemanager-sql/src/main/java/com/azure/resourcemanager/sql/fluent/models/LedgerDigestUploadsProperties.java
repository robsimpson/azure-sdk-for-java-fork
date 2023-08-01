// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.LedgerDigestUploadsState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a database ledger digest upload settings. */
@Fluent
public final class LedgerDigestUploadsProperties {
    /*
     * The digest storage endpoint, which must be either an Azure blob storage endpoint or an URI for Azure
     * Confidential Ledger.
     */
    @JsonProperty(value = "digestStorageEndpoint")
    private String digestStorageEndpoint;

    /*
     * Specifies the state of ledger digest upload.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private LedgerDigestUploadsState state;

    /** Creates an instance of LedgerDigestUploadsProperties class. */
    public LedgerDigestUploadsProperties() {
    }

    /**
     * Get the digestStorageEndpoint property: The digest storage endpoint, which must be either an Azure blob storage
     * endpoint or an URI for Azure Confidential Ledger.
     *
     * @return the digestStorageEndpoint value.
     */
    public String digestStorageEndpoint() {
        return this.digestStorageEndpoint;
    }

    /**
     * Set the digestStorageEndpoint property: The digest storage endpoint, which must be either an Azure blob storage
     * endpoint or an URI for Azure Confidential Ledger.
     *
     * @param digestStorageEndpoint the digestStorageEndpoint value to set.
     * @return the LedgerDigestUploadsProperties object itself.
     */
    public LedgerDigestUploadsProperties withDigestStorageEndpoint(String digestStorageEndpoint) {
        this.digestStorageEndpoint = digestStorageEndpoint;
        return this;
    }

    /**
     * Get the state property: Specifies the state of ledger digest upload.
     *
     * @return the state value.
     */
    public LedgerDigestUploadsState state() {
        return this.state;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
