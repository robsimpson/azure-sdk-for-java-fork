// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The TablesQueryEntitiesHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class TablesQueryEntitiesHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-continuation-NextPartitionKey property.
     */
    @JsonProperty(value = "x-ms-continuation-NextPartitionKey")
    private String xMsContinuationNextPartitionKey;

    /*
     * The x-ms-continuation-NextRowKey property.
     */
    @JsonProperty(value = "x-ms-continuation-NextRowKey")
    private String xMsContinuationNextRowKey;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-client-request-id property.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String xMsClientRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 date;

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    private static final HttpHeaderName X_MS_CONTINUATION_NEXT_PARTITION_KEY =
            HttpHeaderName.fromString("x-ms-continuation-NextPartitionKey");

    private static final HttpHeaderName X_MS_CONTINUATION_NEXT_ROW_KEY =
            HttpHeaderName.fromString("x-ms-continuation-NextRowKey");

    private static final HttpHeaderName X_MS_REQUEST_ID = HttpHeaderName.fromString("x-ms-request-id");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of TablesQueryEntitiesHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public TablesQueryEntitiesHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.xMsContinuationNextPartitionKey = rawHeaders.getValue(X_MS_CONTINUATION_NEXT_PARTITION_KEY);
        this.xMsContinuationNextRowKey = rawHeaders.getValue(X_MS_CONTINUATION_NEXT_ROW_KEY);
        this.xMsRequestId = rawHeaders.getValue(X_MS_REQUEST_ID);
        this.xMsClientRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_CLIENT_REQUEST_ID);
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the TablesQueryEntitiesHeaders object itself.
     */
    public TablesQueryEntitiesHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsContinuationNextPartitionKey property: The x-ms-continuation-NextPartitionKey property.
     *
     * @return the xMsContinuationNextPartitionKey value.
     */
    public String getXMsContinuationNextPartitionKey() {
        return this.xMsContinuationNextPartitionKey;
    }

    /**
     * Set the xMsContinuationNextPartitionKey property: The x-ms-continuation-NextPartitionKey property.
     *
     * @param xMsContinuationNextPartitionKey the xMsContinuationNextPartitionKey value to set.
     * @return the TablesQueryEntitiesHeaders object itself.
     */
    public TablesQueryEntitiesHeaders setXMsContinuationNextPartitionKey(String xMsContinuationNextPartitionKey) {
        this.xMsContinuationNextPartitionKey = xMsContinuationNextPartitionKey;
        return this;
    }

    /**
     * Get the xMsContinuationNextRowKey property: The x-ms-continuation-NextRowKey property.
     *
     * @return the xMsContinuationNextRowKey value.
     */
    public String getXMsContinuationNextRowKey() {
        return this.xMsContinuationNextRowKey;
    }

    /**
     * Set the xMsContinuationNextRowKey property: The x-ms-continuation-NextRowKey property.
     *
     * @param xMsContinuationNextRowKey the xMsContinuationNextRowKey value to set.
     * @return the TablesQueryEntitiesHeaders object itself.
     */
    public TablesQueryEntitiesHeaders setXMsContinuationNextRowKey(String xMsContinuationNextRowKey) {
        this.xMsContinuationNextRowKey = xMsContinuationNextRowKey;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the TablesQueryEntitiesHeaders object itself.
     */
    public TablesQueryEntitiesHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the TablesQueryEntitiesHeaders object itself.
     */
    public TablesQueryEntitiesHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the date property: The Date property.
     *
     * @return the date value.
     */
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     *
     * @param date the date value to set.
     * @return the TablesQueryEntitiesHeaders object itself.
     */
    public TablesQueryEntitiesHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }
}
