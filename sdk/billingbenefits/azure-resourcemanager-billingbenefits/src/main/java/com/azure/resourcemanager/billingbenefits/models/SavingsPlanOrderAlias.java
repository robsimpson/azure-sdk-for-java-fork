// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderAliasModelInner;

/** Resource collection API of SavingsPlanOrderAlias. */
public interface SavingsPlanOrderAlias {
    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     *
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return savings plan order alias.
     */
    SavingsPlanOrderAliasModel create(String savingsPlanOrderAliasName, SavingsPlanOrderAliasModelInner body);

    /**
     * Create a savings plan. Learn more about permissions needed at https://go.microsoft.com/fwlink/?linkid=2215851.
     *
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param body Request body for creating a savings plan order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return savings plan order alias.
     */
    SavingsPlanOrderAliasModel create(
        String savingsPlanOrderAliasName, SavingsPlanOrderAliasModelInner body, Context context);

    /**
     * Get a savings plan.
     *
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a savings plan along with {@link Response}.
     */
    Response<SavingsPlanOrderAliasModel> getWithResponse(String savingsPlanOrderAliasName, Context context);

    /**
     * Get a savings plan.
     *
     * @param savingsPlanOrderAliasName Name of the savings plan order alias.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a savings plan.
     */
    SavingsPlanOrderAliasModel get(String savingsPlanOrderAliasName);
}
