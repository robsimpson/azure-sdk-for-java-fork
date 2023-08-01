// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity source for an HTTP file. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HttpSource")
@Fluent
public final class HttpSource extends CopySource {
    /*
     * Specifies the timeout for a HTTP client to get HTTP response from HTTP server. The default value is equivalent
     * to System.Net.HttpWebRequest.Timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "httpRequestTimeout")
    private Object httpRequestTimeout;

    /** Creates an instance of HttpSource class. */
    public HttpSource() {}

    /**
     * Get the httpRequestTimeout property: Specifies the timeout for a HTTP client to get HTTP response from HTTP
     * server. The default value is equivalent to System.Net.HttpWebRequest.Timeout. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the httpRequestTimeout value.
     */
    public Object getHttpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    /**
     * Set the httpRequestTimeout property: Specifies the timeout for a HTTP client to get HTTP response from HTTP
     * server. The default value is equivalent to System.Net.HttpWebRequest.Timeout. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param httpRequestTimeout the httpRequestTimeout value to set.
     * @return the HttpSource object itself.
     */
    public HttpSource setHttpRequestTimeout(Object httpRequestTimeout) {
        this.httpRequestTimeout = httpRequestTimeout;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
