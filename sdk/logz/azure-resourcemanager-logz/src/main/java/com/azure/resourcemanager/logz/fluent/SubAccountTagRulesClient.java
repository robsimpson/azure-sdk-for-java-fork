// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logz.fluent.models.MonitoringTagRulesInner;
import com.azure.resourcemanager.logz.models.SubAccountTagRulesDeleteResponse;

/** An instance of this class provides access to all the operations defined in SubAccountTagRulesClient. */
public interface SubAccountTagRulesClient {
    /**
     * List the tag rules for a given sub account resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param subAccountName Sub Account resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MonitoringTagRulesInner> list(String resourceGroupName, String monitorName, String subAccountName);

    /**
     * List the tag rules for a given sub account resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param subAccountName Sub Account resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MonitoringTagRulesInner> list(
        String resourceGroupName, String monitorName, String subAccountName, Context context);

    /**
     * Create or update a tag rule set for a given sub account resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param subAccountName Sub Account resource name.
     * @param ruleSetName The ruleSetName parameter.
     * @param body Capture logs and metrics of Azure resources based on ARM tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capture logs and metrics of Azure resources based on ARM tags along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MonitoringTagRulesInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String monitorName,
        String subAccountName,
        String ruleSetName,
        MonitoringTagRulesInner body,
        Context context);

    /**
     * Create or update a tag rule set for a given sub account resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param subAccountName Sub Account resource name.
     * @param ruleSetName The ruleSetName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capture logs and metrics of Azure resources based on ARM tags.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringTagRulesInner createOrUpdate(
        String resourceGroupName, String monitorName, String subAccountName, String ruleSetName);

    /**
     * Get a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param subAccountName Sub Account resource name.
     * @param ruleSetName The ruleSetName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a tag rule set for a given monitor resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MonitoringTagRulesInner> getWithResponse(
        String resourceGroupName, String monitorName, String subAccountName, String ruleSetName, Context context);

    /**
     * Get a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param subAccountName Sub Account resource name.
     * @param ruleSetName The ruleSetName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a tag rule set for a given monitor resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MonitoringTagRulesInner get(
        String resourceGroupName, String monitorName, String subAccountName, String ruleSetName);

    /**
     * Delete a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param subAccountName Sub Account resource name.
     * @param ruleSetName The ruleSetName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubAccountTagRulesDeleteResponse deleteWithResponse(
        String resourceGroupName, String monitorName, String subAccountName, String ruleSetName, Context context);

    /**
     * Delete a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param subAccountName Sub Account resource name.
     * @param ruleSetName The ruleSetName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String monitorName, String subAccountName, String ruleSetName);
}
