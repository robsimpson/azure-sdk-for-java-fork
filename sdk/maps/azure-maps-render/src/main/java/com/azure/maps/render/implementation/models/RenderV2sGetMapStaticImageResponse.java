// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getMapStaticImage operation. */
public final class RenderV2sGetMapStaticImageResponse extends ResponseBase<RenderV2sGetMapStaticImageHeaders, Void> {
    /**
     * Creates an instance of RenderV2sGetMapStaticImageResponse.
     *
     * @param request the request which resulted in this RenderV2sGetMapStaticImageResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public RenderV2sGetMapStaticImageResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            RenderV2sGetMapStaticImageHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
