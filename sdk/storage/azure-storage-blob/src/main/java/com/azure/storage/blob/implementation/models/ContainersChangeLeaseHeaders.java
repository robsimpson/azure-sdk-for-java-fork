// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The ContainersChangeLeaseHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class ContainersChangeLeaseHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-lease-id property.
     */
    @JsonProperty(value = "x-ms-lease-id")
    private String xMsLeaseId;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

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

    private static final HttpHeaderName X_MS_LEASE_ID = HttpHeaderName.fromString("x-ms-lease-id");

    private static final HttpHeaderName X_MS_REQUEST_ID = HttpHeaderName.fromString("x-ms-request-id");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of ContainersChangeLeaseHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public ContainersChangeLeaseHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        this.xMsLeaseId = rawHeaders.getValue(X_MS_LEASE_ID);
        String lastModified = rawHeaders.getValue(HttpHeaderName.LAST_MODIFIED);
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
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
     * @return the ContainersChangeLeaseHeaders object itself.
     */
    public ContainersChangeLeaseHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the ContainersChangeLeaseHeaders object itself.
     */
    public ContainersChangeLeaseHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsLeaseId property: The x-ms-lease-id property.
     *
     * @return the xMsLeaseId value.
     */
    public String getXMsLeaseId() {
        return this.xMsLeaseId;
    }

    /**
     * Set the xMsLeaseId property: The x-ms-lease-id property.
     *
     * @param xMsLeaseId the xMsLeaseId value to set.
     * @return the ContainersChangeLeaseHeaders object itself.
     */
    public ContainersChangeLeaseHeaders setXMsLeaseId(String xMsLeaseId) {
        this.xMsLeaseId = xMsLeaseId;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the ContainersChangeLeaseHeaders object itself.
     */
    public ContainersChangeLeaseHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
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
     * @return the ContainersChangeLeaseHeaders object itself.
     */
    public ContainersChangeLeaseHeaders setXMsRequestId(String xMsRequestId) {
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
     * @return the ContainersChangeLeaseHeaders object itself.
     */
    public ContainersChangeLeaseHeaders setXMsClientRequestId(String xMsClientRequestId) {
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
     * @return the ContainersChangeLeaseHeaders object itself.
     */
    public ContainersChangeLeaseHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }
}
