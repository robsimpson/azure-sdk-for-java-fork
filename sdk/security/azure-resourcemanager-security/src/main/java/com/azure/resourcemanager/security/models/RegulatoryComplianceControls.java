// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of RegulatoryComplianceControls. */
public interface RegulatoryComplianceControls {
    /**
     * All supported regulatory compliance controls details and state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance controls response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RegulatoryComplianceControl> list(String regulatoryComplianceStandardName);

    /**
     * All supported regulatory compliance controls details and state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance controls response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RegulatoryComplianceControl> list(
        String regulatoryComplianceStandardName, String filter, Context context);

    /**
     * Selected regulatory compliance control details and state.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance control details and state along with {@link Response}.
     */
    Response<RegulatoryComplianceControl> getWithResponse(
        String regulatoryComplianceStandardName, String regulatoryComplianceControlName, Context context);

    /**
     * Selected regulatory compliance control details and state.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance control details and state.
     */
    RegulatoryComplianceControl get(String regulatoryComplianceStandardName, String regulatoryComplianceControlName);
}
