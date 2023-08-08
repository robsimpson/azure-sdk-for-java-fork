// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.containerservice.fluent.models.RunCommandResultInner;

/** Contains all response data for the getCommandResult operation. */
public final class ManagedClustersGetCommandResultResponse
    extends ResponseBase<ManagedClustersGetCommandResultHeaders, RunCommandResultInner> {
    /**
     * Creates an instance of ManagedClustersGetCommandResultResponse.
     *
     * @param request the request which resulted in this ManagedClustersGetCommandResultResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ManagedClustersGetCommandResultResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        RunCommandResultInner value,
        ManagedClustersGetCommandResultHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public RunCommandResultInner getValue() {
        return super.getValue();
    }
}
