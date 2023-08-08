// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.fluent.models.BlobOutputDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes a blob output data source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Microsoft.Storage/Blob")
@Fluent
public final class BlobOutputDataSource extends OutputDataSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobOutputDataSource.class);

    /*
     * The properties that are associated with a blob output. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties")
    private BlobOutputDataSourceProperties innerProperties;

    /**
     * Get the innerProperties property: The properties that are associated with a blob output. Required on PUT
     * (CreateOrReplace) requests.
     *
     * @return the innerProperties value.
     */
    private BlobOutputDataSourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the authenticationMode property: Authentication Mode.
     *
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationMode();
    }

    /**
     * Set the authenticationMode property: Authentication Mode.
     *
     * @param authenticationMode the authenticationMode value to set.
     * @return the BlobOutputDataSource object itself.
     */
    public BlobOutputDataSource withAuthenticationMode(AuthenticationMode authenticationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BlobOutputDataSourceProperties();
        }
        this.innerProperties().withAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * Get the storageAccounts property: A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace)
     * requests.
     *
     * @return the storageAccounts value.
     */
    public List<StorageAccount> storageAccounts() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccounts();
    }

    /**
     * Set the storageAccounts property: A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace)
     * requests.
     *
     * @param storageAccounts the storageAccounts value to set.
     * @return the BlobOutputDataSource object itself.
     */
    public BlobOutputDataSource withStorageAccounts(List<StorageAccount> storageAccounts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BlobOutputDataSourceProperties();
        }
        this.innerProperties().withStorageAccounts(storageAccounts);
        return this;
    }

    /**
     * Get the container property: The name of a container within the associated Storage account. This container
     * contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     *
     * @return the container value.
     */
    public String container() {
        return this.innerProperties() == null ? null : this.innerProperties().container();
    }

    /**
     * Set the container property: The name of a container within the associated Storage account. This container
     * contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     *
     * @param container the container value to set.
     * @return the BlobOutputDataSource object itself.
     */
    public BlobOutputDataSource withContainer(String container) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BlobOutputDataSourceProperties();
        }
        this.innerProperties().withContainer(container);
        return this;
    }

    /**
     * Get the pathPattern property: The blob path pattern. Not a regular expression. It represents a pattern against
     * which blob names will be matched to determine whether or not they should be included as input or output to the
     * job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation
     * and example.
     *
     * @return the pathPattern value.
     */
    public String pathPattern() {
        return this.innerProperties() == null ? null : this.innerProperties().pathPattern();
    }

    /**
     * Set the pathPattern property: The blob path pattern. Not a regular expression. It represents a pattern against
     * which blob names will be matched to determine whether or not they should be included as input or output to the
     * job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation
     * and example.
     *
     * @param pathPattern the pathPattern value to set.
     * @return the BlobOutputDataSource object itself.
     */
    public BlobOutputDataSource withPathPattern(String pathPattern) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BlobOutputDataSourceProperties();
        }
        this.innerProperties().withPathPattern(pathPattern);
        return this;
    }

    /**
     * Get the dateFormat property: The date format. Wherever {date} appears in pathPattern, the value of this property
     * is used as the date format instead.
     *
     * @return the dateFormat value.
     */
    public String dateFormat() {
        return this.innerProperties() == null ? null : this.innerProperties().dateFormat();
    }

    /**
     * Set the dateFormat property: The date format. Wherever {date} appears in pathPattern, the value of this property
     * is used as the date format instead.
     *
     * @param dateFormat the dateFormat value to set.
     * @return the BlobOutputDataSource object itself.
     */
    public BlobOutputDataSource withDateFormat(String dateFormat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BlobOutputDataSourceProperties();
        }
        this.innerProperties().withDateFormat(dateFormat);
        return this;
    }

    /**
     * Get the timeFormat property: The time format. Wherever {time} appears in pathPattern, the value of this property
     * is used as the time format instead.
     *
     * @return the timeFormat value.
     */
    public String timeFormat() {
        return this.innerProperties() == null ? null : this.innerProperties().timeFormat();
    }

    /**
     * Set the timeFormat property: The time format. Wherever {time} appears in pathPattern, the value of this property
     * is used as the time format instead.
     *
     * @param timeFormat the timeFormat value to set.
     * @return the BlobOutputDataSource object itself.
     */
    public BlobOutputDataSource withTimeFormat(String timeFormat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BlobOutputDataSourceProperties();
        }
        this.innerProperties().withTimeFormat(timeFormat);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
