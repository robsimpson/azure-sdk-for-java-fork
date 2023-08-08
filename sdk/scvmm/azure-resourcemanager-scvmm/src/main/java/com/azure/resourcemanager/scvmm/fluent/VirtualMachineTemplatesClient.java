// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.scvmm.fluent.models.VirtualMachineTemplateInner;
import com.azure.resourcemanager.scvmm.models.ResourcePatch;

/** An instance of this class provides access to all the operations defined in VirtualMachineTemplatesClient. */
public interface VirtualMachineTemplatesClient {
    /**
     * Implements VirtualMachineTemplate GET method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachineTemplates resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineTemplateInner getByResourceGroup(String resourceGroupName, String virtualMachineTemplateName);

    /**
     * Implements VirtualMachineTemplate GET method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachineTemplates resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineTemplateInner> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualMachineTemplateName, Context context);

    /**
     * Onboards the ScVmm VM Template as an Azure VM Template resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the VirtualMachineTemplates resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineTemplateInner>, VirtualMachineTemplateInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualMachineTemplateName, VirtualMachineTemplateInner body);

    /**
     * Onboards the ScVmm VM Template as an Azure VM Template resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the VirtualMachineTemplates resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineTemplateInner>, VirtualMachineTemplateInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualMachineTemplateName, VirtualMachineTemplateInner body, Context context);

    /**
     * Onboards the ScVmm VM Template as an Azure VM Template resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachineTemplates resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineTemplateInner createOrUpdate(
        String resourceGroupName, String virtualMachineTemplateName, VirtualMachineTemplateInner body);

    /**
     * Onboards the ScVmm VM Template as an Azure VM Template resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachineTemplates resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineTemplateInner createOrUpdate(
        String resourceGroupName, String virtualMachineTemplateName, VirtualMachineTemplateInner body, Context context);

    /**
     * Deregisters the ScVmm VM Template from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualMachineTemplateName, Boolean force);

    /**
     * Deregisters the ScVmm VM Template from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualMachineTemplateName, Boolean force, Context context);

    /**
     * Deregisters the ScVmm VM Template from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineTemplateName, Boolean force);

    /**
     * Deregisters the ScVmm VM Template from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineTemplateName);

    /**
     * Deregisters the ScVmm VM Template from Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param force Forces the resource to be deleted from azure. The corresponding CR would be attempted to be deleted
     *     too.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineTemplateName, Boolean force, Context context);

    /**
     * Updates the VirtualMachineTemplate resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param body VirtualMachineTemplates patch details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the VirtualMachineTemplates resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineTemplateInner>, VirtualMachineTemplateInner> beginUpdate(
        String resourceGroupName, String virtualMachineTemplateName, ResourcePatch body);

    /**
     * Updates the VirtualMachineTemplate resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param body VirtualMachineTemplates patch details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the VirtualMachineTemplates resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineTemplateInner>, VirtualMachineTemplateInner> beginUpdate(
        String resourceGroupName, String virtualMachineTemplateName, ResourcePatch body, Context context);

    /**
     * Updates the VirtualMachineTemplate resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param body VirtualMachineTemplates patch details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachineTemplates resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineTemplateInner update(String resourceGroupName, String virtualMachineTemplateName, ResourcePatch body);

    /**
     * Updates the VirtualMachineTemplate resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineTemplateName Name of the VirtualMachineTemplate.
     * @param body VirtualMachineTemplates patch details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the VirtualMachineTemplates resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineTemplateInner update(
        String resourceGroupName, String virtualMachineTemplateName, ResourcePatch body, Context context);

    /**
     * List of VirtualMachineTemplates in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachineTemplates as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineTemplateInner> listByResourceGroup(String resourceGroupName);

    /**
     * List of VirtualMachineTemplates in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachineTemplates as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineTemplateInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List of VirtualMachineTemplates in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachineTemplates as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineTemplateInner> list();

    /**
     * List of VirtualMachineTemplates in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachineTemplates as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineTemplateInner> list(Context context);
}
