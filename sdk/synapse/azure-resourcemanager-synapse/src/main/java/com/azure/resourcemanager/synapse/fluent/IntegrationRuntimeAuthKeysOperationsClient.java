// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeAuthKeysInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeRegenerateKeyParameters;

/**
 * An instance of this class provides access to all the operations defined in
 * IntegrationRuntimeAuthKeysOperationsClient.
 */
public interface IntegrationRuntimeAuthKeysOperationsClient {
    /**
     * Regenerate integration runtime authentication key
     *
     * <p>Regenerate the authentication key for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param regenerateKeyParameters The parameters for regenerating integration runtime authentication key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationRuntimeAuthKeysInner> regenerateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters,
        Context context);

    /**
     * Regenerate integration runtime authentication key
     *
     * <p>Regenerate the authentication key for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param regenerateKeyParameters The parameters for regenerating integration runtime authentication key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeAuthKeysInner regenerate(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters);

    /**
     * List integration runtime authentication keys
     *
     * <p>List authentication keys in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IntegrationRuntimeAuthKeysInner> listWithResponse(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context);

    /**
     * List integration runtime authentication keys
     *
     * <p>List authentication keys in an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the integration runtime authentication keys.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntegrationRuntimeAuthKeysInner list(String resourceGroupName, String workspaceName, String integrationRuntimeName);
}
