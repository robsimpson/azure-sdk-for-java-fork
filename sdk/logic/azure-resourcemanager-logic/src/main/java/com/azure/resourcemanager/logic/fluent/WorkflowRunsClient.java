// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.WorkflowRunInner;

/** An instance of this class provides access to all the operations defined in WorkflowRunsClient. */
public interface WorkflowRunsClient {
    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow runs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowRunInner> list(String resourceGroupName, String workflowName);

    /**
     * Gets a list of workflow runs.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and
     *     ClientTrackingId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow runs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkflowRunInner> list(
        String resourceGroupName, String workflowName, Integer top, String filter, Context context);

    /**
     * Gets a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowRunInner> getWithResponse(
        String resourceGroupName, String workflowName, String runName, Context context);

    /**
     * Gets a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow run.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowRunInner get(String resourceGroupName, String workflowName, String runName);

    /**
     * Cancels a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> cancelWithResponse(String resourceGroupName, String workflowName, String runName, Context context);

    /**
     * Cancels a workflow run.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param runName The workflow run name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(String resourceGroupName, String workflowName, String runName);
}
