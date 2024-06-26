// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.AgentPoolInner;

/**
 * An instance of this class provides access to all the operations defined in AgentPoolsClient.
 */
public interface AgentPoolsClient {
    /**
     * Gets the specified agent pool in the provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified agent pool in the provisioned cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgentPoolInner> getWithResponse(String connectedClusterResourceUri, String agentPoolName, Context context);

    /**
     * Gets the specified agent pool in the provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified agent pool in the provisioned cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner get(String connectedClusterResourceUri, String agentPoolName);

    /**
     * Creates or updates the agent pool in the provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool Agent Pool resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AgentPoolInner>, AgentPoolInner> beginCreateOrUpdate(String connectedClusterResourceUri,
        String agentPoolName, AgentPoolInner agentPool);

    /**
     * Creates or updates the agent pool in the provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool Agent Pool resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AgentPoolInner>, AgentPoolInner> beginCreateOrUpdate(String connectedClusterResourceUri,
        String agentPoolName, AgentPoolInner agentPool, Context context);

    /**
     * Creates or updates the agent pool in the provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool Agent Pool resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner createOrUpdate(String connectedClusterResourceUri, String agentPoolName, AgentPoolInner agentPool);

    /**
     * Creates or updates the agent pool in the provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param agentPool Agent Pool resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentPool resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner createOrUpdate(String connectedClusterResourceUri, String agentPoolName, AgentPoolInner agentPool,
        Context context);

    /**
     * Deletes the specified agent pool in the provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String connectedClusterResourceUri, String agentPoolName);

    /**
     * Deletes the specified agent pool in the provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String connectedClusterResourceUri, String agentPoolName,
        Context context);

    /**
     * Deletes the specified agent pool in the provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String connectedClusterResourceUri, String agentPoolName);

    /**
     * Deletes the specified agent pool in the provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param agentPoolName Parameter for the name of the agent pool in the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String connectedClusterResourceUri, String agentPoolName, Context context);

    /**
     * Gets the list of agent pools in the specified provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of agent pools in the specified provisioned cluster as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AgentPoolInner> listByProvisionedCluster(String connectedClusterResourceUri);

    /**
     * Gets the list of agent pools in the specified provisioned cluster.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of agent pools in the specified provisioned cluster as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AgentPoolInner> listByProvisionedCluster(String connectedClusterResourceUri, Context context);
}
