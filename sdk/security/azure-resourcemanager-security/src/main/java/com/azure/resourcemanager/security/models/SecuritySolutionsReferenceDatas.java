// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SecuritySolutionsReferenceDatas. */
public interface SecuritySolutionsReferenceDatas {
    /**
     * Gets a list of all supported Security Solutions for the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all supported Security Solutions for the subscription along with {@link Response}.
     */
    Response<SecuritySolutionsReferenceDataList> listWithResponse(Context context);

    /**
     * Gets a list of all supported Security Solutions for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all supported Security Solutions for the subscription.
     */
    SecuritySolutionsReferenceDataList list();

    /**
     * Gets list of all supported Security Solutions for subscription and location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all supported Security Solutions for subscription and location along with {@link Response}.
     */
    Response<SecuritySolutionsReferenceDataList> listByHomeRegionWithResponse(String ascLocation, Context context);

    /**
     * Gets list of all supported Security Solutions for subscription and location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all supported Security Solutions for subscription and location.
     */
    SecuritySolutionsReferenceDataList listByHomeRegion(String ascLocation);
}
