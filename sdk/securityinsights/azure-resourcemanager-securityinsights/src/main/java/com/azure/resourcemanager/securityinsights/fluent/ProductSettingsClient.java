// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.SettingListInner;
import com.azure.resourcemanager.securityinsights.fluent.models.SettingsInner;

/** An instance of this class provides access to all the operations defined in ProductSettingsClient. */
public interface ProductSettingsClient {
    /**
     * List of all the settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SettingListInner list(String resourceGroupName, String workspaceName);

    /**
     * List of all the settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the settings along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SettingListInner> listWithResponse(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets a setting.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param settingsName The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SettingsInner get(String resourceGroupName, String workspaceName, String settingsName);

    /**
     * Gets a setting.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param settingsName The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a setting along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SettingsInner> getWithResponse(
        String resourceGroupName, String workspaceName, String settingsName, Context context);

    /**
     * Delete setting of the product.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param settingsName The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String settingsName);

    /**
     * Delete setting of the product.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param settingsName The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String settingsName, Context context);

    /**
     * Updates setting.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param settingsName The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba.
     * @param settings The setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Setting.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SettingsInner update(String resourceGroupName, String workspaceName, String settingsName, SettingsInner settings);

    /**
     * Updates setting.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param settingsName The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba.
     * @param settings The setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Setting along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SettingsInner> updateWithResponse(
        String resourceGroupName, String workspaceName, String settingsName, SettingsInner settings, Context context);
}
