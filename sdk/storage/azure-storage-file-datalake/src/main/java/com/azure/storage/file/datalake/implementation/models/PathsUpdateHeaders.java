// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The PathsUpdateHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class PathsUpdateHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The Content-Range property.
     */
    @JsonProperty(value = "Content-Range")
    private String contentRange;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-properties property.
     */
    @JsonProperty(value = "x-ms-properties")
    private String xMsProperties;

    /*
     * The x-ms-continuation property.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String xMsContinuation;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 date;

    /*
     * The Content-MD5 property.
     */
    @JsonProperty(value = "Content-MD5")
    private String contentMD5;

    /*
     * The Accept-Ranges property.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /*
     * The Cache-Control property.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The Content-Disposition property.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /*
     * The Content-Encoding property.
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /*
     * The Content-Length property.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The Content-Language property.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /*
     * The Content-Type property.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    private static final HttpHeaderName X_MS_PROPERTIES = HttpHeaderName.fromString("x-ms-properties");

    private static final HttpHeaderName X_MS_CONTINUATION = HttpHeaderName.fromString("x-ms-continuation");

    private static final HttpHeaderName X_MS_REQUEST_ID = HttpHeaderName.fromString("x-ms-request-id");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of PathsUpdateHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public PathsUpdateHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.contentRange = rawHeaders.getValue(HttpHeaderName.CONTENT_RANGE);
        String lastModified = rawHeaders.getValue(HttpHeaderName.LAST_MODIFIED);
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        this.xMsProperties = rawHeaders.getValue(X_MS_PROPERTIES);
        this.xMsContinuation = rawHeaders.getValue(X_MS_CONTINUATION);
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
        this.contentMD5 = rawHeaders.getValue(HttpHeaderName.CONTENT_MD5);
        this.acceptRanges = rawHeaders.getValue(HttpHeaderName.ACCEPT_RANGES);
        this.cacheControl = rawHeaders.getValue(HttpHeaderName.CACHE_CONTROL);
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        this.contentDisposition = rawHeaders.getValue(HttpHeaderName.CONTENT_DISPOSITION);
        this.contentEncoding = rawHeaders.getValue(HttpHeaderName.CONTENT_ENCODING);
        String contentLength = rawHeaders.getValue(HttpHeaderName.CONTENT_LENGTH);
        if (contentLength != null) {
            this.contentLength = Long.parseLong(contentLength);
        }
        this.xMsRequestId = rawHeaders.getValue(X_MS_REQUEST_ID);
        this.contentLanguage = rawHeaders.getValue(HttpHeaderName.CONTENT_LANGUAGE);
        this.contentType = rawHeaders.getValue(HttpHeaderName.CONTENT_TYPE);
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
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the contentRange property: The Content-Range property.
     *
     * @return the contentRange value.
     */
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: The Content-Range property.
     *
     * @param contentRange the contentRange value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
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
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsProperties property: The x-ms-properties property.
     *
     * @return the xMsProperties value.
     */
    public String getXMsProperties() {
        return this.xMsProperties;
    }

    /**
     * Set the xMsProperties property: The x-ms-properties property.
     *
     * @param xMsProperties the xMsProperties value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setXMsProperties(String xMsProperties) {
        this.xMsProperties = xMsProperties;
        return this;
    }

    /**
     * Get the xMsContinuation property: The x-ms-continuation property.
     *
     * @return the xMsContinuation value.
     */
    public String getXMsContinuation() {
        return this.xMsContinuation;
    }

    /**
     * Set the xMsContinuation property: The x-ms-continuation property.
     *
     * @param xMsContinuation the xMsContinuation value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setXMsContinuation(String xMsContinuation) {
        this.xMsContinuation = xMsContinuation;
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
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the contentMD5 property: The Content-MD5 property.
     *
     * @return the contentMD5 value.
     */
    public String getContentMD5() {
        return this.contentMD5;
    }

    /**
     * Set the contentMD5 property: The Content-MD5 property.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * Get the acceptRanges property: The Accept-Ranges property.
     *
     * @return the acceptRanges value.
     */
    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: The Accept-Ranges property.
     *
     * @param acceptRanges the acceptRanges value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the cacheControl property: The Cache-Control property.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: The Cache-Control property.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
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
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentDisposition property: The Content-Disposition property.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: The Content-Disposition property.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentEncoding property: The Content-Encoding property.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: The Content-Encoding property.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the contentLength property: The Content-Length property.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The Content-Length property.
     *
     * @param contentLength the contentLength value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
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
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the contentLanguage property: The Content-Language property.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: The Content-Language property.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the contentType property: The Content-Type property.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The Content-Type property.
     *
     * @param contentType the contentType value to set.
     * @return the PathsUpdateHeaders object itself.
     */
    public PathsUpdateHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
