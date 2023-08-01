// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.JobVersionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in JobVersionsClient. */
public interface JobVersionsClient {
    /**
     * Gets all versions of a job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all versions of a job as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<JobVersionInner> listByJobAsync(
        String resourceGroupName, String serverName, String jobAgentName, String jobName);

    /**
     * Gets all versions of a job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all versions of a job as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobVersionInner> listByJob(
        String resourceGroupName, String serverName, String jobAgentName, String jobName);

    /**
     * Gets all versions of a job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all versions of a job as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobVersionInner> listByJob(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, Context context);

    /**
     * Gets a job version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobVersion The version of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job version along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobVersionInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, int jobVersion);

    /**
     * Gets a job version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobVersion The version of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job version on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobVersionInner> getAsync(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, int jobVersion);

    /**
     * Gets a job version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobVersion The version of the job to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobVersionInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        int jobVersion,
        Context context);

    /**
     * Gets a job version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobVersion The version of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a job version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobVersionInner get(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, int jobVersion);
}
