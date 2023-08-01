// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.models.AuthenticationMode;
import com.azure.resourcemanager.streamanalytics.models.BlobDataSourceProperties;
import com.azure.resourcemanager.streamanalytics.models.StorageAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties that are associated with a blob output. */
@Fluent
public final class BlobOutputDataSourceProperties extends BlobDataSourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobOutputDataSourceProperties.class);

    /*
     * Authentication Mode.
     */
    @JsonProperty(value = "authenticationMode")
    private AuthenticationMode authenticationMode;

    /**
     * Get the authenticationMode property: Authentication Mode.
     *
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set the authenticationMode property: Authentication Mode.
     *
     * @param authenticationMode the authenticationMode value to set.
     * @return the BlobOutputDataSourceProperties object itself.
     */
    public BlobOutputDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlobOutputDataSourceProperties withStorageAccounts(List<StorageAccount> storageAccounts) {
        super.withStorageAccounts(storageAccounts);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlobOutputDataSourceProperties withContainer(String container) {
        super.withContainer(container);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlobOutputDataSourceProperties withPathPattern(String pathPattern) {
        super.withPathPattern(pathPattern);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlobOutputDataSourceProperties withDateFormat(String dateFormat) {
        super.withDateFormat(dateFormat);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlobOutputDataSourceProperties withTimeFormat(String timeFormat) {
        super.withTimeFormat(timeFormat);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
