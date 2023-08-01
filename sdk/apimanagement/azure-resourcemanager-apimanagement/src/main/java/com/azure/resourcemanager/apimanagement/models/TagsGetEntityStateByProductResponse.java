// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getEntityStateByProduct operation. */
public final class TagsGetEntityStateByProductResponse extends ResponseBase<TagsGetEntityStateByProductHeaders, Void> {
    /**
     * Creates an instance of TagsGetEntityStateByProductResponse.
     *
     * @param request the request which resulted in this TagsGetEntityStateByProductResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TagsGetEntityStateByProductResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        Void value,
        TagsGetEntityStateByProductHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
