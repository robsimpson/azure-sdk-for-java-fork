// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.developer.devcenter.DevCenterServiceVersion;

/** Initializes a new instance of the DevCenterClient type. */
public final class DevCenterClientImpl {
    /** The DevCenter-specific URI to operate on. */
    private final String endpoint;

    /**
     * Gets The DevCenter-specific URI to operate on.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Service version. */
    private final DevCenterServiceVersion serviceVersion;

    /**
     * Gets Service version.
     *
     * @return the serviceVersion value.
     */
    public DevCenterServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The DevCentersImpl object to access its operations. */
    private final DevCentersImpl devCenters;

    /**
     * Gets the DevCentersImpl object to access its operations.
     *
     * @return the DevCentersImpl object.
     */
    public DevCentersImpl getDevCenters() {
        return this.devCenters;
    }

    /** The DevBoxesImpl object to access its operations. */
    private final DevBoxesImpl devBoxes;

    /**
     * Gets the DevBoxesImpl object to access its operations.
     *
     * @return the DevBoxesImpl object.
     */
    public DevBoxesImpl getDevBoxes() {
        return this.devBoxes;
    }

    /** The EnvironmentsImpl object to access its operations. */
    private final EnvironmentsImpl environments;

    /**
     * Gets the EnvironmentsImpl object to access its operations.
     *
     * @return the EnvironmentsImpl object.
     */
    public EnvironmentsImpl getEnvironments() {
        return this.environments;
    }

    /**
     * Initializes an instance of DevCenterClient client.
     *
     * @param endpoint The DevCenter-specific URI to operate on.
     * @param serviceVersion Service version.
     */
    public DevCenterClientImpl(String endpoint, DevCenterServiceVersion serviceVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                serviceVersion);
    }

    /**
     * Initializes an instance of DevCenterClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The DevCenter-specific URI to operate on.
     * @param serviceVersion Service version.
     */
    public DevCenterClientImpl(HttpPipeline httpPipeline, String endpoint, DevCenterServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of DevCenterClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The DevCenter-specific URI to operate on.
     * @param serviceVersion Service version.
     */
    public DevCenterClientImpl(
            HttpPipeline httpPipeline,
            SerializerAdapter serializerAdapter,
            String endpoint,
            DevCenterServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.devCenters = new DevCentersImpl(this);
        this.devBoxes = new DevBoxesImpl(this);
        this.environments = new EnvironmentsImpl(this);
    }
}
