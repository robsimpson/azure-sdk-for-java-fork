// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.WorkflowInner;

/** Resource collection API of Workflows. */
public interface Workflows {
    /**
     * Gets a list of workflows by subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflows by subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Workflow> list();

    /**
     * Gets a list of workflows by subscription.
     *
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: State, Trigger, and
     *     ReferencedResourceId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflows by subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Workflow> list(Integer top, String filter, Context context);

    /**
     * Gets a list of workflows by resource group.
     *
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflows by resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Workflow> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of workflows by resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: State, Trigger, and
     *     ReferencedResourceId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflows by resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Workflow> listByResourceGroup(String resourceGroupName, Integer top, String filter, Context context);

    /**
     * Gets a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow along with {@link Response}.
     */
    Response<Workflow> getByResourceGroupWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Gets a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow.
     */
    Workflow getByResourceGroup(String resourceGroupName, String workflowName);

    /**
     * Updates a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow type along with {@link Response}.
     */
    Response<Workflow> updateWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Updates a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow type.
     */
    Workflow update(String resourceGroupName, String workflowName);

    /**
     * Deletes a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Deletes a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String workflowName);

    /**
     * Disables a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> disableWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Disables a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disable(String resourceGroupName, String workflowName);

    /**
     * Enables a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> enableWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Enables a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enable(String resourceGroupName, String workflowName);

    /**
     * Generates the upgraded definition for a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param parameters Parameters for generating an upgraded definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object along with {@link Response}.
     */
    Response<Object> generateUpgradedDefinitionWithResponse(
        String resourceGroupName,
        String workflowName,
        GenerateUpgradedDefinitionParameters parameters,
        Context context);

    /**
     * Generates the upgraded definition for a workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param parameters Parameters for generating an upgraded definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object generateUpgradedDefinition(
        String resourceGroupName, String workflowName, GenerateUpgradedDefinitionParameters parameters);

    /**
     * Get the workflow callback Url.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param listCallbackUrl Which callback url to list.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow callback Url along with {@link Response}.
     */
    Response<WorkflowTriggerCallbackUrl> listCallbackUrlWithResponse(
        String resourceGroupName, String workflowName, GetCallbackUrlParameters listCallbackUrl, Context context);

    /**
     * Get the workflow callback Url.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param listCallbackUrl Which callback url to list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow callback Url.
     */
    WorkflowTriggerCallbackUrl listCallbackUrl(
        String resourceGroupName, String workflowName, GetCallbackUrlParameters listCallbackUrl);

    /**
     * Gets an OpenAPI definition for the workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an OpenAPI definition for the workflow along with {@link Response}.
     */
    Response<Object> listSwaggerWithResponse(String resourceGroupName, String workflowName, Context context);

    /**
     * Gets an OpenAPI definition for the workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an OpenAPI definition for the workflow.
     */
    Object listSwagger(String resourceGroupName, String workflowName);

    /**
     * Moves an existing workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param move The workflow to move.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void move(String resourceGroupName, String workflowName, WorkflowReference move);

    /**
     * Moves an existing workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param move The workflow to move.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void move(String resourceGroupName, String workflowName, WorkflowReference move, Context context);

    /**
     * Regenerates the callback URL access key for request triggers.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> regenerateAccessKeyWithResponse(
        String resourceGroupName, String workflowName, RegenerateActionParameter keyType, Context context);

    /**
     * Regenerates the callback URL access key for request triggers.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param keyType The access key type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateAccessKey(String resourceGroupName, String workflowName, RegenerateActionParameter keyType);

    /**
     * Validates the workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> validateByResourceGroupWithResponse(
        String resourceGroupName, String workflowName, WorkflowInner validate, Context context);

    /**
     * Validates the workflow.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateByResourceGroup(String resourceGroupName, String workflowName, WorkflowInner validate);

    /**
     * Validates the workflow definition.
     *
     * @param resourceGroupName The resource group name.
     * @param location The workflow location.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> validateByLocationWithResponse(
        String resourceGroupName, String location, String workflowName, WorkflowInner validate, Context context);

    /**
     * Validates the workflow definition.
     *
     * @param resourceGroupName The resource group name.
     * @param location The workflow location.
     * @param workflowName The workflow name.
     * @param validate The workflow.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateByLocation(String resourceGroupName, String location, String workflowName, WorkflowInner validate);

    /**
     * Gets a workflow.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow along with {@link Response}.
     */
    Workflow getById(String id);

    /**
     * Gets a workflow.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow along with {@link Response}.
     */
    Response<Workflow> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a workflow.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a workflow.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Workflow resource.
     *
     * @param name resource name.
     * @return the first stage of the new Workflow definition.
     */
    Workflow.DefinitionStages.Blank define(String name);
}
