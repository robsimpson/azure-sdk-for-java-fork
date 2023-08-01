// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AutoProvisioningSettings. */
public interface AutoProvisioningSettings {
    /**
     * Exposes the auto provisioning settings of the subscriptions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the auto provisioning settings response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AutoProvisioningSetting> list();

    /**
     * Exposes the auto provisioning settings of the subscriptions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the auto provisioning settings response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AutoProvisioningSetting> list(Context context);

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting along with {@link Response}.
     */
    Response<AutoProvisioningSetting> getWithResponse(String settingName, Context context);

    /**
     * Details of a specific setting.
     *
     * @param settingName Auto provisioning setting key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting.
     */
    AutoProvisioningSetting get(String settingName);

    /**
     * Details of a specific setting.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting along with {@link Response}.
     */
    AutoProvisioningSetting getById(String id);

    /**
     * Details of a specific setting.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return auto provisioning setting along with {@link Response}.
     */
    Response<AutoProvisioningSetting> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AutoProvisioningSetting resource.
     *
     * @param name resource name.
     * @return the first stage of the new AutoProvisioningSetting definition.
     */
    AutoProvisioningSetting.DefinitionStages.Blank define(String name);
}
